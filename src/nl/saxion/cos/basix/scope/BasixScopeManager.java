package nl.saxion.cos.basix.scope;

import nl.saxion.cos.basix.codegenerator.symbol.VariableSymbol;
import nl.saxion.cos.basix.scope.exception.BasixScopeException;

import java.util.ArrayList;

/**
 * @author jarnowitjes on 2019-06-03
 */
public class BasixScopeManager {

    private ArrayList<BasixScope> scopes;

    /* Constructor */

    public BasixScopeManager(BasixScope globalScope) {
        scopes = new ArrayList<>();
        scopes.add(globalScope);
    }

    /* Methods */

    public void addVariableSymbol(String name, String type, String value) {
        int nextIndex = scopes.get(currentScopeIndex()).nextTableIndex();
        VariableSymbol varSymbol = new VariableSymbol(nextIndex, name, type, value);
        scopes.get(currentScopeIndex()).addVariable(varSymbol);
    }

    public VariableSymbol searchVariableSymbol(String variableName) throws BasixScopeException {
        return scopes.get(currentScopeIndex()).searchVariableSymbol(variableName);
    }

    public void addScope() {
        scopes.add(new BasixScope(false, scopes.get(currentScopeIndex())));
    }

    public void removeScope() {
        scopes.remove(currentScopeIndex());
    }

    private int currentScopeIndex() {
        return (scopes.size() - 1);
    }
}
