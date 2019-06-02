package nl.saxion.cos.basix.checker;

import nl.saxion.cos.basix.grammar.BasixGrammarBaseVisitor;
import nl.saxion.cos.basix.grammar.BasixGrammarParser;

import java.util.ArrayList;

/**
 * @author jarnowitjes on 2019-05-31
 */
public class BasixCodeChecker extends BasixGrammarBaseVisitor<ArrayList<String>> {
    public ArrayList<String> errors;
    public boolean isClean = true;

    public BasixCodeChecker(){
        errors = new ArrayList<>();
    }

    @Override
    public ArrayList<String> visitProgram(BasixGrammarParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public ArrayList<String> visitExpression(BasixGrammarParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public ArrayList<String> visitPrint(BasixGrammarParser.PrintContext ctx) {

        if (ctx.type.getText().equals("integer")) {
            try {
                int value = Integer.parseInt(ctx.value.getText());
            } catch (Exception e) {
                isClean = false;
                errors.add("Input mismatch: Print method expecting integer");
            }
        }

        return super.visitPrint(ctx);
    }

    @Override
    public ArrayList<String> visitDEFVAR(BasixGrammarParser.DEFVARContext ctx) {

        if (ctx.type.getText().equals("integer")) {
            try {
                int value = Integer.parseInt(ctx.value.getText());
            } catch (Exception e) {
                isClean = false;
                errors.add("Input mismatch: Cannot store text in integer variable");
            }
        }

        return super.visitDEFVAR(ctx);
    }

    @Override
    public ArrayList<String> visitRDEFVAR(BasixGrammarParser.RDEFVARContext ctx) {
        return super.visitRDEFVAR(ctx);
    }

    @Override
    public ArrayList<String> visitGETVAR(BasixGrammarParser.GETVARContext ctx) {
        return super.visitGETVAR(ctx);
    }

    @Override
    public ArrayList<String> visitWhen(BasixGrammarParser.WhenContext ctx) {
        return super.visitWhen(ctx);
    }

    @Override
    public ArrayList<String> visitBlock(BasixGrammarParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public ArrayList<String> visitLoopwhen(BasixGrammarParser.LoopwhenContext ctx) {
        return super.visitLoopwhen(ctx);
    }

    @Override
    public ArrayList<String> visitBool_expr(BasixGrammarParser.Bool_exprContext ctx) {
        return super.visitBool_expr(ctx);
    }

    @Override
    public ArrayList<String> visitMath_expr(BasixGrammarParser.Math_exprContext ctx) {
        return super.visitMath_expr(ctx);
    }

    /* Getters */

    public ArrayList<String> getErrors() {
        return errors;
    }
}
