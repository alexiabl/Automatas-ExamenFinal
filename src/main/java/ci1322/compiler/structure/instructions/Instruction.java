package ci1322.compiler.structure.instructions;

import ci1322.compiler.structure.SymbolsTable;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public interface Instruction {

    public void checkSymbolTable(SymbolsTable s);
}
