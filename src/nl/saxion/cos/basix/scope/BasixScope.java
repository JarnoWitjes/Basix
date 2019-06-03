package nl.saxion.cos.basix.scope;

import nl.saxion.cos.basix.scope.exception.BasixScopeException;
import nl.saxion.cos.basix.codegenerator.symbol.VariableSymbol;
import nl.saxion.cos.basix.codegenerator.symbol.table.SymbolTable;
import nl.saxion.cos.basix.codegenerator.symbol.table.exception.SymbolTableException;

/**
 * @author jarnowitjes on 2019-05-31
 */
public class BasixScope {

    private boolean isGlobalScope;
    private BasixScope upperScope;
    private SymbolTable symbolTable;

    /* Constructor */

    public BasixScope(boolean isGlobalScope, BasixScope upperScope) {
        if (isGlobalScope) {
            this.upperScope = null;
            this.isGlobalScope = true;
        } else {
            this.upperScope = upperScope;
            this.isGlobalScope = false;
        }

        this.symbolTable = new SymbolTable();
    }

    /* Methods */

    public void addVariable(VariableSymbol varSymbol) {
        symbolTable.put(varSymbol);
    }

    public VariableSymbol searchVariableSymbol(String variableName) throws BasixScopeException {
        try {
            return  (VariableSymbol) symbolTable.getSymbol(variableName); // Try find variable in current scope
        } catch (SymbolTableException e) { // Exception thrown when variable could not be found
            if (isGlobalScope) { // Global scope reached; no other scopes to search symbol for
                throw new BasixScopeException();
            } else {
                return upperScope.searchVariableSymbol(variableName); // Try find variable in upper scope
            }
        }
    }

    public int nextTableIndex() {
        return symbolTable.nextIndex();
    }
}
