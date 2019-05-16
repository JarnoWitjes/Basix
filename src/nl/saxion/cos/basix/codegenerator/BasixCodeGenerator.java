package nl.saxion.cos.basix.codegenerator;

import nl.saxion.cos.basix.codegenerator.symbol.VariableSymbol;
import nl.saxion.cos.basix.codegenerator.symbol.table.SymbolTable;
import nl.saxion.cos.basix.codegenerator.symbol.table.exception.SymbolTableException;
import nl.saxion.cos.basix.grammar.BasixGrammarBaseVisitor;
import nl.saxion.cos.basix.grammar.BasixGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * @author jarnowitjes on 2019-04-17
 */
public class BasixCodeGenerator extends BasixGrammarBaseVisitor<ArrayList<String>> {

    private SymbolTable symbolTable;

    public BasixCodeGenerator() {
        symbolTable = SymbolTable.getInstance();
    }

    @Override
    public ArrayList<String> visitProgram(BasixGrammarParser.ProgramContext ctx) {
        ArrayList<String> code = new ArrayList<>(); // List containing all generated code from the children

        for (ParseTree t : ctx.children) { // Visit all the children
            ArrayList<String> result = visit(t);

            // If the child has any code, add it to the list
            if (result != null) {
                code.addAll(result);
            }
        }
        return code; // Return the generated code
    }

    @Override
    public ArrayList<String> visitExpression(BasixGrammarParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public ArrayList<String> visitPrint(BasixGrammarParser.PrintContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        if (ctx.variable() != null) { // Print statement has a variable

            code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            code.addAll(visit(ctx.variable())); // Add code from the variable

            if (ctx.type.getText().equals("text")) { // Print statement expects a string behind the variable
                code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            } else { // Print statement expects an integer behind the variable
                code.add("invokevirtual java/io/PrintStream/println(I)V");
            }

        } else if (ctx.math_expr() != null) { // Print statement has a math expression
            code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
            code.addAll(visit(ctx.math_expr()));
            code.add("invokevirtual java/io/PrintStream/println(I)V");
        } else {
            if (ctx.type.getText().equals("integer")) { // Literal is an integer
                if (ctx.math_expr() != null) { // Print statement has a math expression
                    code.addAll(visit(ctx.math_expr()));
                    code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
                    code.add("invokevirtual java/io/PrintStream/println(I)V");
                } else {
                    code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
                    code.add("ldc " + Integer.parseInt(ctx.value.getText()));
                    code.add("invokevirtual java/io/PrintStream/println(I)V");
                }
            } else { // Literal is a String
                code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
                code.add("ldc " + ctx.value.getText());
                code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            }
        }

        return code;
    }

    @Override
    public ArrayList<String> visitDEFVAR(BasixGrammarParser.DEFVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        // Get the data of the variable and create a symbol for it then put it in the table
        int varIndex = symbolTable.nextIndex();
        String varName = ctx.VARIABLE_NAME().getText();
        String varType = ctx.type.getText();
        String varValue = ctx.value.getText();

        VariableSymbol varSymbol = new VariableSymbol(varIndex, varName, varType, varValue);
        symbolTable.put(varSymbol);

        // Generate the code for the variable

        if (varType.equals("integer")) { // If variable type is of integer
            code.add("ldc " + varValue); // Put the value on the stack
            code.add("istore " + varIndex); // Store the variable
        } else if (varType.equals("text")) { // If the variable if of type (text)String
            code.add("ldc " + varValue); // Put the string on the stack
            code.add("astore " + varIndex); // Store the object (String) as variable
        }

        return code;
    }

    @Override
    public ArrayList<String> visitRDEFVAR(BasixGrammarParser.RDEFVARContext ctx) {
        /* Redefining a variable by reassigning a new value to an existing spot in the locals table */
        ArrayList<String> code = new ArrayList<>();

        String varName = ctx.VARIABLE_NAME().getText();

        // Try to reassign a new value to an existing variable, if it cannot be found; there is no point to continue
        try {

            // Find the symbol in the table; retrieve its table index and type
            VariableSymbol varSymbol = (VariableSymbol) symbolTable.getSymbol(varName);
            int tableIndex = varSymbol.getIndex();
            String varType = varSymbol.getType();

            // Retrieve the new value and push the new value on the stack and table
            String nwVarValue = ctx.varValue.getText();

            if (varType.equals("integer")) {
                code.add("ldc " + nwVarValue);
                code.add("istore " + tableIndex);
            } else if (varType.equals("text")) {
                code.add("ldc " + nwVarValue);
                code.add("astore " + tableIndex);
            }

        } catch (SymbolTableException e) {
            System.err.println("Error while finding variable: \'" + varName + "\'");
        }

        return code;
    }

    @Override
    public ArrayList<String> visitGETVAR(BasixGrammarParser.GETVARContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        try {
            // Try to find the variable by its name
            VariableSymbol symbol = (VariableSymbol) symbolTable.getSymbol(ctx.VARIABLE_NAME().getText());

            if (symbol.getType().equals("integer")) { // If the variable type is an integer
                code.add("iload " + symbol.getIndex()); // Push the 'iload' call on the stack
            } else if (symbol.getType().equals("text")) { // If the variable type is a String
                code.add("aload " + symbol.getIndex()); // Push the 'aload' call on the stack
            }

        } catch (SymbolTableException e) {
            System.err.println("Error while finding variable \'" + ctx.VARIABLE_NAME().getText() + "\'");
        }

        return code;
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
        /* FIXME: Fixing the math expression code generation...
         *        The code generator does not take in account the rules on how math is done.
         *        It begins at the end of the expression and works its way back. This results
         *        in incorrect solutions.
         */

        ArrayList<String> code = new ArrayList<>();

        /*
         * Math works by pushing 2 values on the stack and then calling a math call. The math call takes the 2
         * values and returns the new value after the math expression. This new value is also pushed on the stack.
         */

        // If the context contains another math expression, visit that one first
        if (ctx.math_expr() != null) {
            code.addAll(visit(ctx.math_expr()));
        }

        if (ctx.lVar != null) { // Left value is hidden behind a variable
            code.addAll(visit(ctx.lVar));
        } else if (ctx.lVal != null) { // Left value is a literal
            code.add("ldc " + ctx.lVal.getText());
        }

        if (ctx.rVar != null) { // Right value is hidden behind a variable
            code.addAll(visit(ctx.rVar));
        } else if (ctx.rVal != null) { // Right value is a literal
            code.add("ldc " + ctx.rVal.getText());
        }

        String operator = ctx.operator.getText();

        switch (operator) { // Lookup the right mathematical call
            case "+":
                // Push add function to the stack
                code.add("iadd");
                break;
            case "-":
                // Push the subtract function to the stack
                code.add("isub");
                break;
            case "*":
                // Push the multiply function to the stack
                code.add("imul");
                break;
            case "/":
                // Push the divide function to the stack
                code.add("idiv");
                break;
            default:
                // If, somehow, the operator is not recognized, print an error
                System.err.println("Unknown operator used: \'" + operator + "\'");
                break;
        }

        return code;
    }
}
