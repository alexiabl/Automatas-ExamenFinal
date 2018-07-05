package ci1322.compiler.structure.instructions;

import ci1322.compiler.structure.Item;

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
}
