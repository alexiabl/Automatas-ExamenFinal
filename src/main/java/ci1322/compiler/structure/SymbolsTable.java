package ci1322.compiler.structure;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class SymbolsTable {

    private List<Symbols> symbols;

    public SymbolsTable(){
        this.symbols = new LinkedList<Symbols>();
    }

    public void addtoSymbolsTable(Symbols s){
        this.symbols.add(s);
    }

    public List<Symbols> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbols> symbols) {
        this.symbols = symbols;
    }
}
