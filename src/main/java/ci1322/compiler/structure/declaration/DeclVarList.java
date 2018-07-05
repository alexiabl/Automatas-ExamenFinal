package ci1322.compiler.structure.declaration;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/5/18.
 */
public class DeclVarList {

    private List<DeclVar> declarationList = new LinkedList<DeclVar>();

    public void addToList(DeclVar d){
        this.declarationList.add(d);
    }

    public List<DeclVar> getDeclarationList() {
        return declarationList;
    }

    public void setDeclarationList(List<DeclVar> declarationList) {
        this.declarationList = declarationList;
    }
}
