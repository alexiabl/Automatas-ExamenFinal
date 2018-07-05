package ci1322.compiler.structure.function;

import ci1322.compiler.structure.Symbols;
import ci1322.compiler.structure.SymbolsTable;
import ci1322.compiler.structure.declaration.DeclVar;
import ci1322.compiler.structure.declaration.TypesEnum;
import ci1322.compiler.structure.instructions.Instruction;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Function implements Symbols{

    private List<DeclVar> declarations;
    private List<Instruction> instructions;
    private String name;
    private int param;
    private TypesEnum returnType;
    private SymbolsTable localSymbols;

    public Function(){
        this.localSymbols = new SymbolsTable();
    }

    public Function(TypesEnum returnType, String name, int param, List<DeclVar> decls, List<Instruction> ins) {
        this.returnType = returnType;
        this.name = name;
        this.param=param;
        this.declarations=decls;
        this.instructions=ins;
        this.localSymbols = new SymbolsTable();
    }

    public Function(String name, List<DeclVar>decls, List<Instruction>ins){
        this.name=name;
        this.declarations = decls;
        this.instructions=ins;
        this.localSymbols = new SymbolsTable();
    }

    public List<DeclVar> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<DeclVar> declarations) {
        this.declarations = declarations;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    public TypesEnum getReturnType() {
        return returnType;
    }

    public void setReturnType(TypesEnum returnType) {
        this.returnType = returnType;
    }

    public SymbolsTable getLocalSymbols() {
        return localSymbols;
    }

    public void setLocalSymbols(SymbolsTable localSymbols) {
        this.localSymbols = localSymbols;
    }



}
