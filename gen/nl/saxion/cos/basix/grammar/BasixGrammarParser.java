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
		RULE_when = 4, RULE_block = 5, RULE_loopwhen = 6, RULE_bool_expr = 7, 
		RULE_math_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "print", "variable", "when", "block", "loopwhen", 
			"bool_expr", "math_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'::'", "'integer'", "'text'", "'<<'", "';'", "'make_known'", 
			"'remake_known'", "'get_known'", "'when'", "'('", "'AND'", "'OR'", "')'", 
			"'then'", "'otherwise'", "'test'", "'loop_when'", null, null, null, null, 
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
			setState(18);
			match(BEGIN);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__17))) != 0)) {
				{
				{
				setState(19);
				expression();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(END);
			setState(26);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				print();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				variable();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				when();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
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
		public Token type;
		public Token value;
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
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(36);
				((PrintContext)_localctx).type = match(T__2);
				}
				break;
			case T__3:
				{
				setState(37);
				((PrintContext)_localctx).type = match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(40);
			match(T__4);
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(41);
				((PrintContext)_localctx).value = match(VALUE);
				}
				break;
			case 2:
				{
				setState(42);
				((PrintContext)_localctx).value = match(TEXT);
				}
				break;
			case 3:
				{
				setState(43);
				variable();
				}
				break;
			case 4:
				{
				setState(44);
				math_expr();
				}
				break;
			}
			setState(47);
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
		public Token varValue;
		public TerminalNode VARIABLE_NAME() { return getToken(BasixGrammarParser.VARIABLE_NAME, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(BasixGrammarParser.TEXT, 0); }
		public TerminalNode VALUE() { return getToken(BasixGrammarParser.VALUE, 0); }
		public RDEFVARContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitRDEFVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DEFVARContext extends VariableContext {
		public Token type;
		public Token value;
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new DEFVARContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__6);
				setState(50);
				match(T__1);
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(51);
					((DEFVARContext)_localctx).type = match(T__2);
					}
					break;
				case T__3:
					{
					setState(52);
					((DEFVARContext)_localctx).type = match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55);
				match(T__1);
				setState(56);
				match(VARIABLE_NAME);
				setState(57);
				match(T__4);
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(58);
					((DEFVARContext)_localctx).value = match(VALUE);
					}
					break;
				case 2:
					{
					setState(59);
					((DEFVARContext)_localctx).value = match(TEXT);
					}
					break;
				case 3:
					{
					setState(60);
					math_expr();
					}
					break;
				}
				setState(63);
				match(T__5);
				}
				break;
			case T__7:
				_localctx = new RDEFVARContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__7);
				setState(65);
				match(T__1);
				setState(66);
				match(VARIABLE_NAME);
				setState(67);
				match(T__4);
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(68);
					((RDEFVARContext)_localctx).varValue = match(TEXT);
					}
					break;
				case 2:
					{
					setState(69);
					((RDEFVARContext)_localctx).varValue = match(VALUE);
					}
					break;
				case 3:
					{
					setState(70);
					math_expr();
					}
					break;
				}
				setState(73);
				match(T__5);
				}
				break;
			case T__8:
				_localctx = new GETVARContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__8);
				setState(75);
				match(T__1);
				setState(76);
				match(VARIABLE_NAME);
				setState(77);
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
		public Bool_exprContext condition_single;
		public Bool_exprContext condition_left;
		public Token and;
		public Token or;
		public Bool_exprContext condition_right;
		public BlockContext if_body;
		public BlockContext else_body;
		public WhenContext nested_when;
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<WhenContext> when() {
			return getRuleContexts(WhenContext.class);
		}
		public WhenContext when(int i) {
			return getRuleContext(WhenContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__9);
			setState(81);
			match(T__10);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(82);
				((WhenContext)_localctx).condition_single = bool_expr();
				}
				break;
			case 2:
				{
				setState(83);
				((WhenContext)_localctx).condition_left = bool_expr();
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(84);
					((WhenContext)_localctx).and = match(T__11);
					}
					break;
				case T__12:
					{
					setState(85);
					((WhenContext)_localctx).or = match(T__12);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88);
				((WhenContext)_localctx).condition_right = bool_expr();
				}
				break;
			}
			setState(92);
			match(T__13);
			setState(93);
			match(T__14);
			setState(94);
			((WhenContext)_localctx).if_body = block();
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(99);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__15:
						{
						{
						setState(95);
						match(T__15);
						setState(96);
						((WhenContext)_localctx).else_body = block();
						}
						}
						break;
					case T__16:
						{
						{
						setState(97);
						match(T__16);
						setState(98);
						((WhenContext)_localctx).nested_when = when();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasixGrammarVisitor ) return ((BasixGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__10);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__17))) != 0)) {
				{
				{
				setState(105);
				expression();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__13);
			setState(112);
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

	public static class LoopwhenContext extends ParserRuleContext {
		public Bool_exprContext condition;
		public BlockContext loop_body;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 12, RULE_loopwhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__17);
			setState(115);
			match(T__10);
			setState(116);
			((LoopwhenContext)_localctx).condition = bool_expr();
			setState(117);
			match(T__13);
			setState(118);
			match(T__14);
			setState(119);
			((LoopwhenContext)_localctx).loop_body = block();
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
		enterRule(_localctx, 14, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(121);
				((Bool_exprContext)_localctx).lVal = match(VALUE);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				{
				setState(122);
				((Bool_exprContext)_localctx).lVar = variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			((Bool_exprContext)_localctx).operator = match(OP);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(126);
				((Bool_exprContext)_localctx).rVal = match(VALUE);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				{
				setState(127);
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
		enterRule(_localctx, 16, RULE_math_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
				{
				setState(130);
				((Math_exprContext)_localctx).lVar = variable();
				}
				break;
			case VALUE:
				{
				setState(131);
				((Math_exprContext)_localctx).lVal = match(VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			((Math_exprContext)_localctx).operator = match(OP);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(135);
				((Math_exprContext)_localctx).rVar = variable();
				}
				break;
			case 2:
				{
				setState(136);
				((Math_exprContext)_localctx).rVal = match(VALUE);
				}
				break;
			case 3:
				{
				setState(137);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3#\n\3\3"+
		"\4\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6Y\n\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f"+
		"\6\16\6i\13\6\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\5"+
		"\n\u0087\n\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\2\2\u009e\2\24\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\bP\3\2\2\2\nR\3\2"+
		"\2\2\fj\3\2\2\2\16t\3\2\2\2\20}\3\2\2\2\22\u0086\3\2\2\2\24\30\7\31\2"+
		"\2\25\27\5\4\3\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2"+
		"\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\32\2\2\34\35\7\2\2\3\35\3\3\2\2"+
		"\2\36#\5\6\4\2\37#\5\b\5\2 #\5\n\6\2!#\5\16\b\2\"\36\3\2\2\2\"\37\3\2"+
		"\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%(\7\4\2\2&)\7\5\2\2\'"+
		")\7\6\2\2(&\3\2\2\2(\'\3\2\2\2)*\3\2\2\2*/\7\7\2\2+\60\7\26\2\2,\60\7"+
		"\27\2\2-\60\5\b\5\2.\60\5\22\n\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\7\b\2\2\62\7\3\2\2\2\63\64\7\t\2\2\64\67\7\4\2"+
		"\2\658\7\5\2\2\668\7\6\2\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29:\7\4"+
		"\2\2:;\7\30\2\2;?\7\7\2\2<@\7\26\2\2=@\7\27\2\2>@\5\22\n\2?<\3\2\2\2?"+
		"=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AQ\7\b\2\2BC\7\n\2\2CD\7\4\2\2DE\7\30\2\2"+
		"EI\7\7\2\2FJ\7\27\2\2GJ\7\26\2\2HJ\5\22\n\2IF\3\2\2\2IG\3\2\2\2IH\3\2"+
		"\2\2JK\3\2\2\2KQ\7\b\2\2LM\7\13\2\2MN\7\4\2\2NO\7\30\2\2OQ\7\b\2\2P\63"+
		"\3\2\2\2PB\3\2\2\2PL\3\2\2\2Q\t\3\2\2\2RS\7\f\2\2S\\\7\r\2\2T]\5\20\t"+
		"\2UX\5\20\t\2VY\7\16\2\2WY\7\17\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Z[\5"+
		"\20\t\2[]\3\2\2\2\\T\3\2\2\2\\U\3\2\2\2]^\3\2\2\2^_\7\20\2\2_`\7\21\2"+
		"\2`g\5\f\7\2ab\7\22\2\2bf\5\f\7\2cd\7\23\2\2df\5\n\6\2ea\3\2\2\2ec\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\13\3\2\2\2ig\3\2\2\2jn\7\r\2\2km\5"+
		"\4\3\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7"+
		"\20\2\2rs\7\b\2\2s\r\3\2\2\2tu\7\24\2\2uv\7\r\2\2vw\5\20\t\2wx\7\20\2"+
		"\2xy\7\21\2\2yz\5\f\7\2z\17\3\2\2\2{~\7\26\2\2|~\5\b\5\2}{\3\2\2\2}|\3"+
		"\2\2\2~\177\3\2\2\2\177\u0082\7\25\2\2\u0080\u0083\7\26\2\2\u0081\u0083"+
		"\5\b\5\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\21\3\2\2\2\u0084"+
		"\u0087\5\b\5\2\u0085\u0087\7\26\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\7\25\2\2\u0089\u008d\5\b\5\2\u008a"+
		"\u008d\7\26\2\2\u008b\u008d\5\22\n\2\u008c\u0089\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d\23\3\2\2\2\23\30\"(/\67?IPX\\egn}\u0082"+
		"\u0086\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}