package ci1322.compiler.structure.function;

import ci1322.compiler.structure.declaration.DeclVar;
import ci1322.compiler.structure.instructions.Instruction;

import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class FunctionBlock {

    private List<DeclVar> declarations;
    private List<Instruction> instructions;

    public FunctionBlock(List<DeclVar> declarations, List<Instruction> instructions) {
        this.declarations = declarations;
        this.instructions = instructions;
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
}
