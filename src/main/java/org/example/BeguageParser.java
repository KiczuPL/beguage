// Generated from Beguage.g4 by ANTLR 4.9.2
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BeguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IF=3, REPEAT=4, EQUAL=5, GREATER=6, LESS=7, NOT_EQUAL=8, 
		LESS_EQUAL=9, GREATER_EQUAL=10, END_BLOCK=11, TYPE_AS=12, READ_TYPE=13, 
		PRE_ASSIGN=14, ASSIGN=15, WRITE=16, READ=17, SUB=18, ADD=19, MUL=20, DIV=21, 
		ID=22, INT=23, FLOAT32=24, FLOAT64=25, INT_KEYWORD=26, FLOAT32_KEYWORD=27, 
		FLOAT64_KEYWORD=28, CONV_INT=29, CONV_FLOAT32=30, CONV_FLOAT64=31, NEWLINE=32, 
		WS=33;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_blockIf = 3, 
		RULE_blockRepeat = 4, RULE_condition = 5, RULE_conditionalExpression = 6, 
		RULE_expression0 = 7, RULE_expression1 = 8, RULE_expression2 = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "blockIf", "blockRepeat", "condition", 
			"conditionalExpression", "expression0", "expression1", "expression2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'go'", "'=='", "'>'", "'<'", "'!='", "'<='", 
			"'>='", "'end'", "' as '", null, "'let'", "'be'", "'show'", "'provide'", 
			"'-'", "'+'", "'*'", "'/'", null, null, null, null, "'i32'", "'f32'", 
			"'f64'", "'(i32)'", "'(f32)'", "'(f64)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IF", "REPEAT", "EQUAL", "GREATER", "LESS", "NOT_EQUAL", 
			"LESS_EQUAL", "GREATER_EQUAL", "END_BLOCK", "TYPE_AS", "READ_TYPE", "PRE_ASSIGN", 
			"ASSIGN", "WRITE", "READ", "SUB", "ADD", "MUL", "DIV", "ID", "INT", "FLOAT32", 
			"FLOAT64", "INT_KEYWORD", "FLOAT32_KEYWORD", "FLOAT64_KEYWORD", "CONV_INT", 
			"CONV_FLOAT32", "CONV_FLOAT64", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Beguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BeguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			block();
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
		public List<TerminalNode> NEWLINE() { return getTokens(BeguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BeguageParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID))) != 0)) {
					{
					setState(22);
					statement();
					}
				}

				setState(25);
				match(NEWLINE);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadContext extends StatementContext {
		public TerminalNode READ() { return getToken(BeguageParser.READ, 0); }
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public TerminalNode TYPE_AS() { return getToken(BeguageParser.TYPE_AS, 0); }
		public TerminalNode READ_TYPE() { return getToken(BeguageParser.READ_TYPE, 0); }
		public ReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitRead(this);
		}
	}
	public static class RepeatContext extends StatementContext {
		public TerminalNode REPEAT() { return getToken(BeguageParser.REPEAT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockRepeatContext blockRepeat() {
			return getRuleContext(BlockRepeatContext.class,0);
		}
		public TerminalNode END_BLOCK() { return getToken(BeguageParser.END_BLOCK, 0); }
		public RepeatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitRepeat(this);
		}
	}
	public static class ReassignContext extends StatementContext {
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BeguageParser.ASSIGN, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ReassignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterReassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitReassign(this);
		}
	}
	public static class IfContext extends StatementContext {
		public TerminalNode IF() { return getToken(BeguageParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockIfContext blockIf() {
			return getRuleContext(BlockIfContext.class,0);
		}
		public TerminalNode END_BLOCK() { return getToken(BeguageParser.END_BLOCK, 0); }
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitIf(this);
		}
	}
	public static class WriteContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(BeguageParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public WriteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitWrite(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public TerminalNode PRE_ASSIGN() { return getToken(BeguageParser.PRE_ASSIGN, 0); }
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(BeguageParser.ASSIGN, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitAssign(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(IF);
				setState(32);
				condition();
				setState(33);
				blockIf();
				setState(34);
				match(END_BLOCK);
				}
				break;
			case REPEAT:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(REPEAT);
				setState(37);
				condition();
				setState(38);
				blockRepeat();
				setState(39);
				match(END_BLOCK);
				}
				break;
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(WRITE);
				setState(42);
				match(ID);
				}
				break;
			case PRE_ASSIGN:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(PRE_ASSIGN);
				setState(44);
				match(ID);
				setState(45);
				match(ASSIGN);
				setState(46);
				expression0(0);
				}
				break;
			case ID:
				_localctx = new ReassignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(ID);
				setState(48);
				match(ASSIGN);
				setState(49);
				expression0(0);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(READ);
				setState(51);
				match(ID);
				setState(52);
				match(TYPE_AS);
				setState(53);
				match(READ_TYPE);
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

	public static class BlockIfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitBlockIf(this);
		}
	}

	public final BlockIfContext blockIf() throws RecognitionException {
		BlockIfContext _localctx = new BlockIfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			block();
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

	public static class BlockRepeatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockRepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockRepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterBlockRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitBlockRepeat(this);
		}
	}

	public final BlockRepeatContext blockRepeat() throws RecognitionException {
		BlockRepeatContext _localctx = new BlockRepeatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockRepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			block();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			conditionalExpression();
			setState(62);
			match(T__1);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends ConditionalExpressionContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public TerminalNode EQUAL() { return getToken(BeguageParser.EQUAL, 0); }
		public EqualContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitEqual(this);
		}
	}
	public static class NotEqualContext extends ConditionalExpressionContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(BeguageParser.NOT_EQUAL, 0); }
		public NotEqualContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitNotEqual(this);
		}
	}
	public static class GreaterEqualContext extends ConditionalExpressionContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(BeguageParser.GREATER_EQUAL, 0); }
		public GreaterEqualContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitGreaterEqual(this);
		}
	}
	public static class LessContext extends ConditionalExpressionContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public TerminalNode LESS() { return getToken(BeguageParser.LESS, 0); }
		public LessContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitLess(this);
		}
	}
	public static class LessEqualContext extends ConditionalExpressionContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(BeguageParser.LESS_EQUAL, 0); }
		public LessEqualContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitLessEqual(this);
		}
	}
	public static class GreaterContext extends ConditionalExpressionContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public TerminalNode GREATER() { return getToken(BeguageParser.GREATER, 0); }
		public GreaterContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitGreater(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalExpression);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				expression0(0);
				setState(65);
				match(EQUAL);
				setState(66);
				expression0(0);
				}
				break;
			case 2:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				expression0(0);
				setState(69);
				match(NOT_EQUAL);
				setState(70);
				expression0(0);
				}
				break;
			case 3:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				expression0(0);
				setState(73);
				match(GREATER);
				setState(74);
				expression0(0);
				}
				break;
			case 4:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				expression0(0);
				setState(77);
				match(LESS);
				setState(78);
				expression0(0);
				}
				break;
			case 5:
				_localctx = new LessEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				expression0(0);
				setState(81);
				match(LESS_EQUAL);
				setState(82);
				expression0(0);
				}
				break;
			case 6:
				_localctx = new GreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				expression0(0);
				setState(85);
				match(GREATER_EQUAL);
				setState(86);
				expression0(0);
				}
				break;
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

	public static class Expression0Context extends ParserRuleContext {
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
	 
		public Expression0Context() { }
		public void copyFrom(Expression0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single0Context extends Expression0Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Single0Context(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitSingle0(this);
		}
	}
	public static class AddContext extends Expression0Context {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public TerminalNode ADD() { return getToken(BeguageParser.ADD, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public AddContext(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends Expression0Context {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public TerminalNode SUB() { return getToken(BeguageParser.SUB, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public SubContext(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitSub(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		return expression0(0);
	}

	private Expression0Context expression0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression0Context _localctx = new Expression0Context(_ctx, _parentState);
		Expression0Context _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single0Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(91);
			expression1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new SubContext(new Expression0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression0);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(SUB);
						setState(95);
						expression1(0);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new Expression0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression0);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						match(ADD);
						setState(98);
						expression1(0);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression1Context extends ParserRuleContext {
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
	 
		public Expression1Context() { }
		public void copyFrom(Expression1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends Expression1Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode DIV() { return getToken(BeguageParser.DIV, 0); }
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public DivContext(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitDiv(this);
		}
	}
	public static class Single1Context extends Expression1Context {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Single1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitSingle1(this);
		}
	}
	public static class MulContext extends Expression1Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode MUL() { return getToken(BeguageParser.MUL, 0); }
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public MulContext(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitMul(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		return expression1(0);
	}

	private Expression1Context expression1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression1Context _localctx = new Expression1Context(_ctx, _parentState);
		Expression1Context _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(105);
			expression2();
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						match(MUL);
						setState(109);
						expression2();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(110);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(111);
						match(DIV);
						setState(112);
						expression2();
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression2Context extends ParserRuleContext {
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	 
		public Expression2Context() { }
		public void copyFrom(Expression2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class To_intContext extends Expression2Context {
		public TerminalNode CONV_INT() { return getToken(BeguageParser.CONV_INT, 0); }
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public To_intContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterTo_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitTo_int(this);
		}
	}
	public static class ParContext extends Expression2Context {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ParContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitPar(this);
		}
	}
	public static class To_float64Context extends Expression2Context {
		public TerminalNode CONV_FLOAT64() { return getToken(BeguageParser.CONV_FLOAT64, 0); }
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public To_float64Context(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterTo_float64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitTo_float64(this);
		}
	}
	public static class To_float32Context extends Expression2Context {
		public TerminalNode CONV_FLOAT32() { return getToken(BeguageParser.CONV_FLOAT32, 0); }
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public To_float32Context(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterTo_float32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitTo_float32(this);
		}
	}
	public static class Float32Context extends Expression2Context {
		public TerminalNode FLOAT32() { return getToken(BeguageParser.FLOAT32, 0); }
		public Float32Context(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFloat32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFloat32(this);
		}
	}
	public static class IdContext extends Expression2Context {
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public IdContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitId(this);
		}
	}
	public static class Float64Context extends Expression2Context {
		public TerminalNode FLOAT64() { return getToken(BeguageParser.FLOAT64, 0); }
		public Float64Context(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFloat64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFloat64(this);
		}
	}
	public static class IntContext extends Expression2Context {
		public TerminalNode INT() { return getToken(BeguageParser.INT, 0); }
		public IntContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitInt(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression2);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				}
				break;
			case FLOAT64:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(FLOAT64);
				}
				break;
			case FLOAT32:
				_localctx = new Float32Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(FLOAT32);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(INT);
				}
				break;
			case CONV_INT:
				_localctx = new To_intContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(CONV_INT);
				setState(123);
				expression2();
				}
				break;
			case CONV_FLOAT64:
				_localctx = new To_float64Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(CONV_FLOAT64);
				setState(125);
				expression2();
				}
				break;
			case CONV_FLOAT32:
				_localctx = new To_float32Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				match(CONV_FLOAT32);
				setState(127);
				expression2();
				}
				break;
			case T__0:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(T__0);
				setState(129);
				expression0(0);
				setState(130);
				match(T__1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression0_sempred((Expression0Context)_localctx, predIndex);
		case 8:
			return expression1_sempred((Expression1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression0_sempred(Expression0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\5\3\32\n\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\49\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tf\n\t\f\t\16\t"+
		"i\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nt\n\n\f\n\16\nw\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0087\n\13\3\13\2\4\20\22\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u0095\2\26"+
		"\3\2\2\2\4\36\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16Z"+
		"\3\2\2\2\20\\\3\2\2\2\22j\3\2\2\2\24\u0086\3\2\2\2\26\27\5\4\3\2\27\3"+
		"\3\2\2\2\30\32\5\6\4\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\35"+
		"\7\"\2\2\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3"+
		"\2\2\2 \36\3\2\2\2!\"\7\5\2\2\"#\5\f\7\2#$\5\b\5\2$%\7\r\2\2%9\3\2\2\2"+
		"&\'\7\6\2\2\'(\5\f\7\2()\5\n\6\2)*\7\r\2\2*9\3\2\2\2+,\7\22\2\2,9\7\30"+
		"\2\2-.\7\20\2\2./\7\30\2\2/\60\7\21\2\2\609\5\20\t\2\61\62\7\30\2\2\62"+
		"\63\7\21\2\2\639\5\20\t\2\64\65\7\23\2\2\65\66\7\30\2\2\66\67\7\16\2\2"+
		"\679\7\17\2\28!\3\2\2\28&\3\2\2\28+\3\2\2\28-\3\2\2\28\61\3\2\2\28\64"+
		"\3\2\2\29\7\3\2\2\2:;\5\4\3\2;\t\3\2\2\2<=\5\4\3\2=\13\3\2\2\2>?\7\3\2"+
		"\2?@\5\16\b\2@A\7\4\2\2A\r\3\2\2\2BC\5\20\t\2CD\7\7\2\2DE\5\20\t\2E[\3"+
		"\2\2\2FG\5\20\t\2GH\7\n\2\2HI\5\20\t\2I[\3\2\2\2JK\5\20\t\2KL\7\b\2\2"+
		"LM\5\20\t\2M[\3\2\2\2NO\5\20\t\2OP\7\t\2\2PQ\5\20\t\2Q[\3\2\2\2RS\5\20"+
		"\t\2ST\7\13\2\2TU\5\20\t\2U[\3\2\2\2VW\5\20\t\2WX\7\f\2\2XY\5\20\t\2Y"+
		"[\3\2\2\2ZB\3\2\2\2ZF\3\2\2\2ZJ\3\2\2\2ZN\3\2\2\2ZR\3\2\2\2ZV\3\2\2\2"+
		"[\17\3\2\2\2\\]\b\t\1\2]^\5\22\n\2^g\3\2\2\2_`\f\5\2\2`a\7\24\2\2af\5"+
		"\22\n\2bc\f\4\2\2cd\7\25\2\2df\5\22\n\2e_\3\2\2\2eb\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2h\21\3\2\2\2ig\3\2\2\2jk\b\n\1\2kl\5\24\13\2lu\3\2"+
		"\2\2mn\f\4\2\2no\7\26\2\2ot\5\24\13\2pq\f\3\2\2qr\7\27\2\2rt\5\24\13\2"+
		"sm\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\23\3\2\2\2wu\3\2\2"+
		"\2x\u0087\7\30\2\2y\u0087\7\33\2\2z\u0087\7\32\2\2{\u0087\7\31\2\2|}\7"+
		"\37\2\2}\u0087\5\24\13\2~\177\7!\2\2\177\u0087\5\24\13\2\u0080\u0081\7"+
		" \2\2\u0081\u0087\5\24\13\2\u0082\u0083\7\3\2\2\u0083\u0084\5\20\t\2\u0084"+
		"\u0085\7\4\2\2\u0085\u0087\3\2\2\2\u0086x\3\2\2\2\u0086y\3\2\2\2\u0086"+
		"z\3\2\2\2\u0086{\3\2\2\2\u0086|\3\2\2\2\u0086~\3\2\2\2\u0086\u0080\3\2"+
		"\2\2\u0086\u0082\3\2\2\2\u0087\25\3\2\2\2\13\31\368Zegsu\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}