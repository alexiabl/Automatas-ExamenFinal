package ci1322.compiler.structure.instructions;

import ci1322.compiler.structure.SymbolsTable;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Read implements Instruction{

    private String variable;

    public Read(){

    }

    public Read(String var){
        this.variable = var;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public void checkSymbolTable(SymbolsTable s) {
        s.findVariableTable(variable);
    }
}
