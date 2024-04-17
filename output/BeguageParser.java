// Generated from Beguage.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, IF=3, EQUAL=4, END_BLOCK=5, TYPE_AS=6, READ_TYPE=7, PRE_ASSIGN=8, 
		ASSIGN=9, WRITE=10, READ=11, ID=12, INT=13, FLOAT32=14, FLOAT64=15, INT_KEYWORD=16, 
		FLOAT32_KEYWORD=17, FLOAT64_KEYWORD=18, CONV_INT=19, CONV_FLOAT32=20, 
		CONV_FLOAT64=21, NEWLINE=22, ADD=23, SUB=24, MUL=25, DIV=26, WS=27;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_blockIf = 3, 
		RULE_condition = 4, RULE_expression0 = 5, RULE_expression1 = 6, RULE_expression2 = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "blockIf", "condition", "expression0", 
			"expression1", "expression2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'=='", "'end'", "' as '", null, "'let'", 
			"'be'", "'show'", "'provide'", null, null, null, null, "'i32'", "'f32'", 
			"'f64'", "'(i32)'", "'(f32)'", "'(f64)'", null, "'+'", "'-'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IF", "EQUAL", "END_BLOCK", "TYPE_AS", "READ_TYPE", 
			"PRE_ASSIGN", "ASSIGN", "WRITE", "READ", "ID", "INT", "FLOAT32", "FLOAT64", 
			"INT_KEYWORD", "FLOAT32_KEYWORD", "FLOAT64_KEYWORD", "CONV_INT", "CONV_FLOAT32", 
			"CONV_FLOAT64", "NEWLINE", "ADD", "SUB", "MUL", "DIV", "WS"
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
			setState(16);
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
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID))) != 0)) {
					{
					setState(18);
					statement();
					}
				}

				setState(21);
				match(NEWLINE);
				}
				}
				setState(26);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(IF);
				setState(28);
				condition();
				setState(29);
				blockIf();
				setState(30);
				match(END_BLOCK);
				}
				break;
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(WRITE);
				setState(33);
				match(ID);
				}
				break;
			case PRE_ASSIGN:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(PRE_ASSIGN);
				setState(35);
				match(ID);
				setState(36);
				match(ASSIGN);
				setState(37);
				expression0();
				}
				break;
			case ID:
				_localctx = new ReassignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(ID);
				setState(39);
				match(ASSIGN);
				setState(40);
				expression0();
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(READ);
				setState(42);
				match(ID);
				setState(43);
				match(TYPE_AS);
				setState(44);
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
			setState(47);
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
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends ConditionContext {
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public TerminalNode EQUAL() { return getToken(BeguageParser.EQUAL, 0); }
		public EqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitEqual(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			_localctx = new EqualContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			expression0();
			setState(51);
			match(EQUAL);
			setState(52);
			expression0();
			setState(53);
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
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode ADD() { return getToken(BeguageParser.ADD, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
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
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode SUB() { return getToken(BeguageParser.SUB, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
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
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression0);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				expression1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				expression1();
				setState(57);
				match(ADD);
				setState(58);
				expression0();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				expression1();
				setState(61);
				match(SUB);
				setState(62);
				expression0();
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
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode DIV() { return getToken(BeguageParser.DIV, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
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
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode MUL() { return getToken(BeguageParser.MUL, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
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
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression1);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				expression2();
				}
				break;
			case 2:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				expression2();
				setState(68);
				match(MUL);
				setState(69);
				expression1();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				expression2();
				setState(72);
				match(DIV);
				setState(73);
				expression1();
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
		enterRule(_localctx, 14, RULE_expression2);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				}
				break;
			case FLOAT64:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(FLOAT64);
				}
				break;
			case FLOAT32:
				_localctx = new Float32Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(FLOAT32);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(INT);
				}
				break;
			case CONV_INT:
				_localctx = new To_intContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(CONV_INT);
				setState(82);
				expression2();
				}
				break;
			case CONV_FLOAT64:
				_localctx = new To_float64Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(CONV_FLOAT64);
				setState(84);
				expression2();
				}
				break;
			case CONV_FLOAT32:
				_localctx = new To_float32Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				match(CONV_FLOAT32);
				setState(86);
				expression2();
				}
				break;
			case T__0:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(T__0);
				setState(88);
				expression0();
				setState(89);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\5\3\26"+
		"\n\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7C\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2h\2\22"+
		"\3\2\2\2\4\32\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\n\63\3\2\2\2\fB\3\2\2\2"+
		"\16M\3\2\2\2\20]\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\26\5\6\4\2\25\24"+
		"\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\31\7\30\2\2\30\25\3\2\2\2\31\34"+
		"\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\36"+
		"\7\5\2\2\36\37\5\n\6\2\37 \5\b\5\2 !\7\7\2\2!\60\3\2\2\2\"#\7\f\2\2#\60"+
		"\7\16\2\2$%\7\n\2\2%&\7\16\2\2&\'\7\13\2\2\'\60\5\f\7\2()\7\16\2\2)*\7"+
		"\13\2\2*\60\5\f\7\2+,\7\r\2\2,-\7\16\2\2-.\7\b\2\2.\60\7\t\2\2/\35\3\2"+
		"\2\2/\"\3\2\2\2/$\3\2\2\2/(\3\2\2\2/+\3\2\2\2\60\7\3\2\2\2\61\62\5\4\3"+
		"\2\62\t\3\2\2\2\63\64\7\3\2\2\64\65\5\f\7\2\65\66\7\6\2\2\66\67\5\f\7"+
		"\2\678\7\4\2\28\13\3\2\2\29C\5\16\b\2:;\5\16\b\2;<\7\31\2\2<=\5\f\7\2"+
		"=C\3\2\2\2>?\5\16\b\2?@\7\32\2\2@A\5\f\7\2AC\3\2\2\2B9\3\2\2\2B:\3\2\2"+
		"\2B>\3\2\2\2C\r\3\2\2\2DN\5\20\t\2EF\5\20\t\2FG\7\33\2\2GH\5\16\b\2HN"+
		"\3\2\2\2IJ\5\20\t\2JK\7\34\2\2KL\5\16\b\2LN\3\2\2\2MD\3\2\2\2ME\3\2\2"+
		"\2MI\3\2\2\2N\17\3\2\2\2O^\7\16\2\2P^\7\21\2\2Q^\7\20\2\2R^\7\17\2\2S"+
		"T\7\25\2\2T^\5\20\t\2UV\7\27\2\2V^\5\20\t\2WX\7\26\2\2X^\5\20\t\2YZ\7"+
		"\3\2\2Z[\5\f\7\2[\\\7\4\2\2\\^\3\2\2\2]O\3\2\2\2]P\3\2\2\2]Q\3\2\2\2]"+
		"R\3\2\2\2]S\3\2\2\2]U\3\2\2\2]W\3\2\2\2]Y\3\2\2\2^\21\3\2\2\2\b\25\32"+
		"/BM]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}