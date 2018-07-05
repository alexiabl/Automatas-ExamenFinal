package ci1322.compiler.structure.function;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/5/18.
 */
public class FunctionList {

    private List<Function> functions = new LinkedList<Function>();

    public void addToList(Function f){
        this.functions.add(f);
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }
}
