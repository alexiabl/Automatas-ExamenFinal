package ci1322.compiler.structure.instructions;

import ci1322.compiler.structure.Item;
import ci1322.compiler.structure.SymbolsTable;
import ci1322.compiler.structure.declaration.DeclVar;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Print implements Instruction {

    private Item item;

    public Print(){

    }

    public Print(Item i){
        this.item = i;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void checkSymbolTable(SymbolsTable symbolsTable) {
        symbolsTable.findVariableTable(this.item.getValue().toString());
    }
}
