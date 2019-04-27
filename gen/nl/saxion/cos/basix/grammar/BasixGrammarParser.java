// Generated from /Users/jarnowitjes/stack/HBO-ICT/Compilers_and_OS/Basix/src/nl/saxion/cos/basix/grammar/BasixGrammar.g4 by ANTLR 4.7.2
package nl.saxion.cos.basix.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasixGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, OP=19, VALUE=20, TEXT=21, VARIABLE_NAME=22, BEGIN=23, END=24, 
		WS=25;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_print = 2, RULE_variable = 3, 
		RULE_when = 4, RULE_loopwhen = 5, RULE_bool_expr = 6, RULE_math_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "print", "variable", "when", "loopwhen", "bool_expr", 
			"math_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'::'", "'integer'", "'text'", "'<<'", "';'", "'make_known'", 
			"' ::'", "'remake_known'", "'get_known'", "'when'", "'('", "'AND'", "'OR'", 
			"')'", "'then'", "'otherwise'", "'loop_when'", null, null, null, null, 
			"'BASIX_BEGIN'", "'BASIX_END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "OP", "VALUE", "TEXT", "VARIABLE_NAME", 
			"BEGIN", "END", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BasixGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasixGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(BasixGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(BasixGrammarParser.END, 0); }
		public TerminalNode EOF() { return getToken(BasixGrammarParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(BEGIN);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__17))) != 0)) {
				{
				{
				setState(17);
				expression();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(END);
			setState(24);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public LoopwhenContext loopwhen() {
			return getRuleContext(LoopwhenContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				print();
				}
				break;
			case T__6:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				variable();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				when();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				loopwhen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public Token intT;
		public Token stringT;
		public Token intV;
		public Token stringV;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(BasixGrammarParser.VALUE, 0); }
		public TerminalNode TEXT() { return getToken(BasixGrammarParser.TEXT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(T__1);
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(34);
				((PrintContext)_localctx).intT = match(T__2);
				}
				break;
			case T__3:
				{
				setState(35);
				((PrintContext)_localctx).stringT = match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(38);
			match(T__4);
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(39);
				((PrintContext)_localctx).intV = match(VALUE);
				setState(40);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(41);
				((PrintContext)_localctx).stringV = match(TEXT);
				setState(42);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(43);
				variable();
				setState(44);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(46);
				math_expr();
				setState(47);
				match(T__5);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RDEFVARContext extends VariableContext {
		public Token stringV;
		public Token intV;
		public TerminalNode VARIABLE_NAME() { return getToken(BasixGrammarParser.VARIABLE_NAME, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(BasixGrammarParser.VALUE, 0); }
		public TerminalNode TEXT() { return getToken(BasixGrammarParser.TEXT, 0); }
		public RDEFVARContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitRDEFVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DEFVARContext extends VariableContext {
		public Token intT;
		public Token stringT;
		public Token intV;
		public Token stringV;
		public TerminalNode VARIABLE_NAME() { return getToken(BasixGrammarParser.VARIABLE_NAME, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(BasixGrammarParser.VALUE, 0); }
		public TerminalNode TEXT() { return getToken(BasixGrammarParser.TEXT, 0); }
		public DEFVARContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitDEFVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GETVARContext extends VariableContext {
		public TerminalNode VARIABLE_NAME() { return getToken(BasixGrammarParser.VARIABLE_NAME, 0); }
		public GETVARContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitGETVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new DEFVARContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__6);
				setState(52);
				match(T__7);
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(53);
					((DEFVARContext)_localctx).intT = match(T__2);
					}
					break;
				case T__3:
					{
					setState(54);
					((DEFVARContext)_localctx).stringT = match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57);
				match(T__1);
				setState(58);
				match(VARIABLE_NAME);
				setState(59);
				match(T__4);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(60);
					((DEFVARContext)_localctx).intV = match(VALUE);
					}
					break;
				case 2:
					{
					setState(61);
					((DEFVARContext)_localctx).stringV = match(TEXT);
					}
					break;
				case 3:
					{
					setState(62);
					math_expr();
					}
					break;
				}
				setState(65);
				match(T__5);
				}
				break;
			case T__8:
				_localctx = new RDEFVARContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__8);
				setState(67);
				match(T__1);
				setState(68);
				match(VARIABLE_NAME);
				setState(69);
				match(T__4);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(70);
					((RDEFVARContext)_localctx).stringV = match(VALUE);
					}
					break;
				case 2:
					{
					setState(71);
					((RDEFVARContext)_localctx).intV = match(TEXT);
					}
					break;
				case 3:
					{
					setState(72);
					math_expr();
					}
					break;
				}
				setState(75);
				match(T__5);
				}
				break;
			case T__9:
				_localctx = new GETVARContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__9);
				setState(77);
				match(T__1);
				setState(78);
				match(VARIABLE_NAME);
				setState(79);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenContext extends ParserRuleContext {
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__10);
			setState(83);
			match(T__11);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(84);
				bool_expr();
				}
				break;
			case 2:
				{
				setState(85);
				bool_expr();
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				bool_expr();
				}
				break;
			}
			setState(91);
			match(T__14);
			setState(92);
			match(T__5);
			setState(93);
			match(T__15);
			setState(94);
			match(T__11);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__17))) != 0)) {
				{
				{
				setState(95);
				expression();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__14);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(102);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(103);
				match(T__5);
				setState(104);
				match(T__16);
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(105);
					match(T__11);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__17))) != 0)) {
						{
						{
						setState(106);
						expression();
						}
						}
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(112);
					match(T__14);
					setState(113);
					match(T__5);
					}
					break;
				case T__10:
					{
					setState(114);
					when();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopwhenContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopwhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopwhen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitLoopwhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopwhenContext loopwhen() throws RecognitionException {
		LoopwhenContext _localctx = new LoopwhenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopwhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__17);
			setState(120);
			match(T__11);
			setState(121);
			bool_expr();
			setState(122);
			match(T__14);
			setState(123);
			match(T__5);
			setState(124);
			match(T__15);
			setState(125);
			match(T__11);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__17))) != 0)) {
				{
				{
				setState(126);
				expression();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(T__14);
			setState(133);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public Token lVal;
		public VariableContext lVar;
		public Token operator;
		public Token rVal;
		public VariableContext rVar;
		public TerminalNode OP() { return getToken(BasixGrammarParser.OP, 0); }
		public List<TerminalNode> VALUE() { return getTokens(BasixGrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(BasixGrammarParser.VALUE, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(135);
				((Bool_exprContext)_localctx).lVal = match(VALUE);
				}
				break;
			case T__6:
			case T__8:
			case T__9:
				{
				setState(136);
				((Bool_exprContext)_localctx).lVar = variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139);
			((Bool_exprContext)_localctx).operator = match(OP);
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(140);
				((Bool_exprContext)_localctx).rVal = match(VALUE);
				}
				break;
			case T__6:
			case T__8:
			case T__9:
				{
				setState(141);
				((Bool_exprContext)_localctx).rVar = variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_exprContext extends ParserRuleContext {
		public VariableContext lVar;
		public Token lVal;
		public Token operator;
		public VariableContext rVar;
		public Token rVal;
		public TerminalNode OP() { return getToken(BasixGrammarParser.OP, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> VALUE() { return getTokens(BasixGrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(BasixGrammarParser.VALUE, i);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		Math_exprContext _localctx = new Math_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_math_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__9:
				{
				setState(144);
				((Math_exprContext)_localctx).lVar = variable();
				}
				break;
			case VALUE:
				{
				setState(145);
				((Math_exprContext)_localctx).lVal = match(VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
			((Math_exprContext)_localctx).operator = match(OP);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(149);
				((Math_exprContext)_localctx).rVar = variable();
				}
				break;
			case 2:
				{
				setState(150);
				((Math_exprContext)_localctx).rVal = match(VALUE);
				}
				break;
			case 3:
				{
				setState(151);
				math_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4"+
		"\3\4\5\4\'\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4"+
		"\3\5\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\3\6\7\6c\n\6\f\6\16\6f\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\6\3\6\3\6\5\6v\n\6"+
		"\5\6x\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0082\n\7\f\7\16\7\u0085"+
		"\13\7\3\7\3\7\3\7\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\5\b\u0091\n\b\3\t"+
		"\3\t\5\t\u0095\n\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\t\2\2\n\2\4\6\b\n\f"+
		"\16\20\2\3\3\2\17\20\2\u00ae\2\22\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\bR\3"+
		"\2\2\2\nT\3\2\2\2\fy\3\2\2\2\16\u008b\3\2\2\2\20\u0094\3\2\2\2\22\26\7"+
		"\31\2\2\23\25\5\4\3\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\32\2\2\32\33\7\2\2\3\33\3"+
		"\3\2\2\2\34!\5\6\4\2\35!\5\b\5\2\36!\5\n\6\2\37!\5\f\7\2 \34\3\2\2\2 "+
		"\35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\"#\7\3\2\2#&\7\4\2\2$\'"+
		"\7\5\2\2%\'\7\6\2\2&$\3\2\2\2&%\3\2\2\2\'(\3\2\2\2(\63\7\7\2\2)*\7\26"+
		"\2\2*\64\7\b\2\2+,\7\27\2\2,\64\7\b\2\2-.\5\b\5\2./\7\b\2\2/\64\3\2\2"+
		"\2\60\61\5\20\t\2\61\62\7\b\2\2\62\64\3\2\2\2\63)\3\2\2\2\63+\3\2\2\2"+
		"\63-\3\2\2\2\63\60\3\2\2\2\64\7\3\2\2\2\65\66\7\t\2\2\669\7\n\2\2\67:"+
		"\7\5\2\28:\7\6\2\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;<\7\4\2\2<=\7\30\2"+
		"\2=A\7\7\2\2>B\7\26\2\2?B\7\27\2\2@B\5\20\t\2A>\3\2\2\2A?\3\2\2\2A@\3"+
		"\2\2\2BC\3\2\2\2CS\7\b\2\2DE\7\13\2\2EF\7\4\2\2FG\7\30\2\2GK\7\7\2\2H"+
		"L\7\26\2\2IL\7\27\2\2JL\5\20\t\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2"+
		"\2MS\7\b\2\2NO\7\f\2\2OP\7\4\2\2PQ\7\30\2\2QS\7\b\2\2R\65\3\2\2\2RD\3"+
		"\2\2\2RN\3\2\2\2S\t\3\2\2\2TU\7\r\2\2U[\7\16\2\2V\\\5\16\b\2WX\5\16\b"+
		"\2XY\t\2\2\2YZ\5\16\b\2Z\\\3\2\2\2[V\3\2\2\2[W\3\2\2\2\\]\3\2\2\2]^\7"+
		"\21\2\2^_\7\b\2\2_`\7\22\2\2`d\7\16\2\2ac\5\4\3\2ba\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gw\7\21\2\2hx\7\b\2\2ij\7\b\2"+
		"\2ju\7\23\2\2ko\7\16\2\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2pr\3\2\2\2qo\3\2\2\2rs\7\21\2\2sv\7\b\2\2tv\5\n\6\2uk\3\2\2\2ut\3"+
		"\2\2\2vx\3\2\2\2wh\3\2\2\2wi\3\2\2\2x\13\3\2\2\2yz\7\24\2\2z{\7\16\2\2"+
		"{|\5\16\b\2|}\7\21\2\2}~\7\b\2\2~\177\7\22\2\2\177\u0083\7\16\2\2\u0080"+
		"\u0082\5\4\3\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\7\21\2\2\u0087\u0088\7\b\2\2\u0088\r\3\2\2\2\u0089\u008c\7\26\2"+
		"\2\u008a\u008c\5\b\5\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u0090\7\25\2\2\u008e\u0091\7\26\2\2\u008f\u0091\5\b\5\2"+
		"\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\17\3\2\2\2\u0092\u0095"+
		"\5\b\5\2\u0093\u0095\7\26\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u009a\7\25\2\2\u0097\u009b\5\b\5\2\u0098\u009b"+
		"\7\26\2\2\u0099\u009b\5\20\t\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\21\3\2\2\2\24\26 &\639AKR[douw\u0083\u008b"+
		"\u0090\u0094\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}