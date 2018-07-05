package ci1322.compiler;

import ci1322.compiler.structure.Container;
import ci1322.compiler.structure.Item;
import ci1322.compiler.structure.Symbols;
import ci1322.compiler.structure.SymbolsTable;
import ci1322.compiler.structure.declaration.DeclVar;
import ci1322.compiler.structure.function.Function;
import ci1322.compiler.structure.instructions.Call;
import ci1322.compiler.structure.instructions.Instruction;
import ci1322.compiler.structure.instructions.Print;
import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/5/18.
 */
public class SemanticAnalyzer {

    private Container container;
    private SymbolsTable symbolsTable;

    public SemanticAnalyzer(Container cont) {
        this.container = cont;
        this.symbolsTable = new SymbolsTable();
    }

    public void fillSymbolsTable() {
        for (Function func : this.container.getFunctions()) {
            this.symbolsTable.addtoSymbolsTable(func);
        }
    }

    public void printGlobalSymbolsTable() {
        System.out.println("GLOBAL SYMBOLS TABLE");
        for (Symbols s : this.symbolsTable.getSymbols()) {
            Function f = (Function) s;
            if (f.getReturnType() == null) {
                System.out.println("FUNCTION RETURN TYPE: void, FUNCTION NAME: " + f.getName());
            } else {
                System.out.println("FUNCTION RETURN TYPE: " + f.getReturnType().name() + " FUNCTION NAME: " + f.getName());
            }
        }
    }

    public void fillLocalSymbolsTable(Function f) {
        for (DeclVar decl : f.getDeclarations()) {
            symbolsTable.localSymbolsTable.add(decl);
        }
    }

    public void checkVariableAssignment() {
        for (Function f : this.container.getFunctions()) {
            fillLocalSymbolsTable(f);
            for (Instruction instruction : f.getInstructions()) {
                instruction.checkSymbolTable(this.symbolsTable);
            }
            this.symbolsTable.localSymbolsTable.clear();
        }
    }


    public void validateNumVariables() {
        for (Function func : this.container.getFunctions()) {
            for (Instruction ins : func.getInstructions()) {
                if (ins instanceof Call) {
                    int size = ((Call) ins).getIdentifiers().size();
                    if (size != ((Call) ins).getParam()) {
                        System.out.println("Semantic error - variables to print different than variables requested in " +
                                "" + func.getName());
                    }
                }
            }
        }
    }

}
