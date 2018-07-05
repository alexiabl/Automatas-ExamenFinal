package ci1322.compiler.structure;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Item<T> {

    private T value;

    public Item(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
