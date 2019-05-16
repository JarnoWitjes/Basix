package nl.saxion.cos.basix.codegenerator.symbol.table;

import nl.saxion.cos.basix.codegenerator.symbol.Symbol;
import nl.saxion.cos.basix.codegenerator.symbol.table.exception.SymbolTableException;

import java.util.ArrayList;

/**
 * @author jarnowitjes on 2019-05-13
 */
public class SymbolTable {

    private static SymbolTable instance;

    private ArrayList<Symbol> symbols;

    /* Constructors */

    private SymbolTable(){
        symbols = new ArrayList<>();
    }

    /* Methods */

    public void put(Symbol symbol) {
        symbols.add(symbol);
    }

    public Symbol getSymbol(int index) throws SymbolTableException {
        if (index < symbols.size() && index > 0) {
            return symbols.get(index);
        } else {
            throw new SymbolTableException("Index \'" + index + "\' is out of bounds.");
        }
    }

    public Symbol getSymbol(String name) throws SymbolTableException {
        for (Symbol s : symbols) {
            if (s.getName().equals(name)) {
                return s;
            }
        }

        throw new SymbolTableException();
    }

    public int nextIndex() {
        return symbols.size();
    }

    /* Getters */

    public static SymbolTable getInstance() {
        if (instance != null) {
            return instance;
        } else {
            instance = new SymbolTable();
            return instance;
        }
    }
}
