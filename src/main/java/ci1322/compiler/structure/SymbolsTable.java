package ci1322.compiler.structure;

import ci1322.compiler.structure.declaration.DeclVar;
import ci1322.compiler.structure.function.Function;
import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class SymbolsTable {

    private List<Symbols> symbols;
    public List<Symbols> localSymbolsTable;

    public SymbolsTable(){
        this.symbols = new LinkedList<Symbols>();
        this.localSymbolsTable = new LinkedList<Symbols>();
    }

    public void addtoSymbolsTable(Symbols s){
        this.symbols.add(s);
    }

    public List<Symbols> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbols> symbols) {
        this.symbols = symbols;
    }

    public List<Symbols> getLocalSymbolsTable() {
        return localSymbolsTable;
    }

    public void setLocalSymbolsTable(List<Symbols> localSymbolsTable) {
        this.localSymbolsTable = localSymbolsTable;
    }

    public void findVariableTable(String name) {
        boolean found = false;
        for (int i = 0; i < this.localSymbolsTable.size(); i++) {
            Symbols s = localSymbolsTable.get(i);
            if (s instanceof DeclVar) {
                if ((name.equals(((DeclVar) s).getName()))) {
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Semantic error - Variable " + name + " not found");

        }
    }

    public void findFunctionTable(String name) {
        boolean found = false;
        for (int i = 0; i < this.symbols.size(); i++) {
            Function f = (Function) this.symbols.get(i);
            if (name.equals(f.getName())) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Semantic error - Function " + name + " not found");
        }
    }

}
