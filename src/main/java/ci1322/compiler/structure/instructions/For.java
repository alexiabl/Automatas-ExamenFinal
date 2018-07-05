package ci1322.compiler.structure.instructions;

import ci1322.compiler.structure.Item;
import ci1322.compiler.structure.SymbolsTable;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class For implements Instruction {

    private Item min;
    private Item max;
    private List<Instruction> instructions;

    public For(){
        this.instructions = new LinkedList<Instruction>();
    }

    public For(Item min, Item max,List<Instruction>ins){
        this.min = min;
        this.max =max;
        this.instructions = ins;
    }

    public Item getMin() {
        return min;
    }

    public void setMin(Item min) {
        this.min = min;
    }

    public Item getMax() {
        return max;
    }

    public void setMax(Item max) {
        this.max = max;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public void checkSymbolTable(SymbolsTable s) {
        s.findVariableTable(this.min.getValue().toString());
        for (Instruction i : this.instructions) {
            i.checkSymbolTable(s);
        }
    }
}
