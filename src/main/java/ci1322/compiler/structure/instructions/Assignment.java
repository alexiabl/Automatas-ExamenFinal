package ci1322.compiler.structure.instructions;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public abstract class Assignment implements Instruction{

    private List<String> identifiers = new LinkedList<String>();

    public Assignment(String n){
        this.identifiers.add(n);
    }

    public Assignment(List<String> ids){
        this.identifiers = ids;
    }

    public Assignment(){

    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public void addToIdentifiers(String n){
        this.identifiers.add(n);
    }
}
