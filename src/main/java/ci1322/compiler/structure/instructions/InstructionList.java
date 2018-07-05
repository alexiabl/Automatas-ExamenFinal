package ci1322.compiler.structure.instructions;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/5/18.
 */
public class InstructionList {

    private List<Instruction> instructionsList = new LinkedList<Instruction>();

    public void addToList(Instruction i){
        this.instructionsList.add(i);
    }

}
