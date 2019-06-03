package nl.saxion.cos.basix.checker;

import nl.saxion.cos.basix.codegenerator.symbol.VariableSymbol;
import nl.saxion.cos.basix.grammar.BasixGrammarBaseVisitor;
import nl.saxion.cos.basix.grammar.BasixGrammarParser;
import nl.saxion.cos.basix.scope.BasixScope;
import nl.saxion.cos.basix.scope.BasixScopeManager;
import nl.saxion.cos.basix.scope.exception.BasixScopeException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * @author jarnowitjes on 2019-05-31
 */
public class BasixCodeChecker extends BasixGrammarBaseVisitor<ArrayList<String>> {

    private BasixScopeManager scopeManager;
    private ArrayList<String> errors;
    private boolean isClean = true;

    public BasixCodeChecker() {
        errors = new ArrayList<>();
        scopeManager = new BasixScopeManager(new BasixScope(true, null));
    }

    @Override
    public ArrayList<String> visitPrint(BasixGrammarParser.PrintContext ctx) {

        // Test for correct type
        if (ctx.type.getText().equals("integer")) {
            try {
                if (ctx.variable() == null) {
                    int value = Integer.parseInt(ctx.value.getText());
                }
            } catch (Exception e) {
                addError("Mismatch: Print statement expecting integer");
            }
        }

        // Test if variable exists
        if (ctx.variable() != null) {
            visit(ctx.variable());
        }

        return null;
    }

    @Override
    public ArrayList<String> visitDEFVAR(BasixGrammarParser.DEFVARContext ctx) {

        // Check if integer value is put in a integer variable
        if (ctx.type.getText().equals("integer")) {
            try {
                int value = Integer.parseInt(ctx.value.getText());

            } catch (Exception e) {
                addError("Mismatch: Cannot put text into integer variable");
            }
        }

        // Add variable to the scope
        String varType = ctx.type.getText();
        String varName = ctx.VARIABLE_NAME().getText();
        String varValue = ctx.value.getText();

        scopeManager.addVariableSymbol(varName, varType, varValue);

        return null;
    }

    @Override
    public ArrayList<String> visitRDEFVAR(BasixGrammarParser.RDEFVARContext ctx) {

        // Check if variable exists
        String varName = ctx.VARIABLE_NAME().getText();
        VariableSymbol varSymbol = null;

        try {
            varSymbol = scopeManager.searchVariableSymbol(varName);
        } catch (BasixScopeException e) {
            addError("Could not find variable \'" + varName + "\'");
        }

        // Check if variable is of right type
        if (varSymbol != null) {
            String varType = varSymbol.getType();

            if (varType.equals("integer")) {

                try {
                    int value = Integer.parseInt(ctx.varValue.getText());
                } catch (Exception e) {
                    addError("Can't update variable \'" + varName
                            + "\'\n\tCan't change variable type after original assignment");
                }
            }
        }

        return null;
    }

    @Override
    public ArrayList<String> visitGETVAR(BasixGrammarParser.GETVARContext ctx) {

        String varName = ctx.VARIABLE_NAME().getText();

        try {
            scopeManager.searchVariableSymbol(varName);
        } catch (BasixScopeException e) {
            addError("Could not find variable \'" + varName + "\'");
        }

        return null;
    }

    @Override
    public ArrayList<String> visitWhen(BasixGrammarParser.WhenContext ctx) {
        // New scope available
        scopeManager.addScope();

        // Visit all the children for checking...
        visit(ctx.if_body);

        if (ctx.else_body != null) {
            visit(ctx.else_body);
        }

        // When scope exited; remove from manager
        scopeManager.removeScope();

        return null;
    }

    /* Methods */

    private void addError(String msg) {
        errors.add(msg);
        isClean = false;
    }

    /* Getters */

    public ArrayList<String> getErrors() {
        return errors;
    }

    public boolean isClean() {
        return isClean;
    }
}
