package ci1322.compiler.structure;

import ci1322.compiler.structure.function.Function;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Container {

    private List<Function> functions;

    public Container(){
        this.functions = new LinkedList<Function>();
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public void addToFunctions(Function f){
        this.functions.add(f);
    }
}
