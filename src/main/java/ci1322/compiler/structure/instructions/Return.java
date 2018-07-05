package ci1322.compiler.structure.instructions;

import ci1322.compiler.structure.Item;
import ci1322.compiler.structure.SymbolsTable;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Return implements Instruction {

    private Item item;

    public Return(Item i){
        this.item = i;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void checkSymbolTable(SymbolsTable s) {
        s.findVariableTable(this.item.getValue().toString());
    }
}
