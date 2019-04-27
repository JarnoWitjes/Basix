package nl.saxion.cos.basix.codegenerator;

import nl.saxion.cos.basix.grammar.BasixGrammarBaseVisitor;
import nl.saxion.cos.basix.grammar.BasixGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * @author jarnowitjes on 2019-04-17
 */
public class BasixCodeGenerator extends BasixGrammarBaseVisitor<ArrayList<String>> {

    @Override
    public ArrayList<String> visitProgram(BasixGrammarParser.ProgramContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        for (ParseTree t : ctx.children) {
            ArrayList<String> result = visit(t);

            if (result != null) {
                code.addAll(result);
            }
        }
        return code;
    }

    @Override
    public ArrayList<String> visitExpression(BasixGrammarParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public ArrayList<String> visitPrint(BasixGrammarParser.PrintContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");

        if (ctx.stringT != null) { // Value is a string
            code.add("ldc " + ctx.stringV.getText());
            code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        } else { // Value is an integer
            code.add("ldc " + ctx.intV.getText());
            code.add("invokevirtual java/io/PrintStream/println(I)V");
        }

        return code;
    }

    @Override
    public ArrayList<String> visitDEFVAR(BasixGrammarParser.DEFVARContext ctx) {
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
}
