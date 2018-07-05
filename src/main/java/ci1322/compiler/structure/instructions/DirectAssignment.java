package ci1322.compiler.structure.instructions;

import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class DirectAssignment extends Assignment {

    private int value;

    public DirectAssignment(int val, List<String> identifiers){
        super(identifiers);
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
