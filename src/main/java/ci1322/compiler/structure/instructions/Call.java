package ci1322.compiler.structure.instructions;

import ci1322.compiler.structure.SymbolsTable;

import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Call extends Assignment {

    private Integer param;
    private String name;

    public Call(String name, Integer param, List<String> identifiers){
        super(identifiers);
        this.name = name;
        this.param= param;
    }

    public Call(String name, Integer param){
        super();
        this.name = name;
        this.param = param;
    }

    public Call(String n){
        super(n);
    }

    public Call(){
        super();
    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkSymbolTable(SymbolsTable s) {
        s.findFunctionTable(this.name);
        for (String ids : this.getIdentifiers()) {
            s.findVariableTable(ids);
        }
    }
}
