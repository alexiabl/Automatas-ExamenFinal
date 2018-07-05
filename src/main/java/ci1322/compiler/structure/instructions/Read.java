package ci1322.compiler.structure.instructions;

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
}
