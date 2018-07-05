package ci1322.compiler.structure.declaration;

import ci1322.compiler.structure.Symbols;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class DeclVar implements Symbols{

    private TypesEnum type;
    private String name;
    private int size;

    public DeclVar(TypesEnum type, String name, int size){
        this.type = type;
        this.name = name;
        this.size = size; //for arrays
    }

    public DeclVar(TypesEnum type, String name){
        this.type=type;
        this.name=name;
    }

    public TypesEnum getType() {
        return type;
    }

    public void setType(TypesEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
