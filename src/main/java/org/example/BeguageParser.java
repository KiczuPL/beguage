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
		T__0=1, T__1=2, T__2=3, T__3=4, FUNCTION=5, RETURN=6, IF=7, REPEAT=8, 
		EQUAL=9, GREATER=10, LESS=11, NOT_EQUAL=12, LESS_EQUAL=13, GREATER_EQUAL=14, 
		END_BLOCK=15, TYPE_AS=16, READ_TYPE=17, PRE_ASSIGN=18, ASSIGN=19, WRITE=20, 
		READ=21, SUB=22, ADD=23, MUL=24, DIV=25, ID=26, INT=27, FLOAT32=28, FLOAT64=29, 
		INT_KEYWORD=30, FLOAT32_KEYWORD=31, FLOAT64_KEYWORD=32, CONV_INT=33, CONV_FLOAT32=34, 
		CONV_FLOAT64=35, NEWLINE=36, WS=37;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_function = 2, RULE_fParameters = 3, 
		RULE_fParameter = 4, RULE_fName = 5, RULE_fReturnType = 6, RULE_fBlock = 7, 
		RULE_statement = 8, RULE_blockIf = 9, RULE_blockRepeat = 10, RULE_condition = 11, 
		RULE_conditionalExpression = 12, RULE_expression0 = 13, RULE_expression1 = 14, 
		RULE_expression2 = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "function", "fParameters", "fParameter", "fName", 
			"fReturnType", "fBlock", "statement", "blockIf", "blockRepeat", "condition", 
			"conditionalExpression", "expression0", "expression1", "expression2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'('", "','", "')'", "'fn'", "'return'", "'if'", "'go'", 
			"'=='", "'>'", "'<'", "'!='", "'<='", "'>='", "'end'", "' as '", null, 
			"'let'", "'be'", "'show'", "'provide'", "'-'", "'+'", "'*'", "'/'", null, 
			null, null, null, "'i32'", "'f32'", "'f64'", "'(i32)'", "'(f32)'", "'(f64)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FUNCTION", "RETURN", "IF", "REPEAT", "EQUAL", 
			"GREATER", "LESS", "NOT_EQUAL", "LESS_EQUAL", "GREATER_EQUAL", "END_BLOCK", 
			"TYPE_AS", "READ_TYPE", "PRE_ASSIGN", "ASSIGN", "WRITE", "READ", "SUB", 
			"ADD", "MUL", "DIV", "ID", "INT", "FLOAT32", "FLOAT64", "INT_KEYWORD", 
			"FLOAT32_KEYWORD", "FLOAT64_KEYWORD", "CONV_INT", "CONV_FLOAT32", "CONV_FLOAT64", 
			"NEWLINE", "WS"
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << RETURN) | (1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
				case IF:
				case REPEAT:
				case PRE_ASSIGN:
				case WRITE:
				case READ:
				case ID:
					{
					setState(32);
					statement();
					}
					break;
				case FUNCTION:
					{
					setState(33);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(36);
				match(NEWLINE);
				}
				}
				setState(41);
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID))) != 0)) {
					{
					setState(42);
					statement();
					}
				}

				setState(45);
				match(NEWLINE);
				}
				}
				setState(50);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(BeguageParser.FUNCTION, 0); }
		public FNameContext fName() {
			return getRuleContext(FNameContext.class,0);
		}
		public FParametersContext fParameters() {
			return getRuleContext(FParametersContext.class,0);
		}
		public FReturnTypeContext fReturnType() {
			return getRuleContext(FReturnTypeContext.class,0);
		}
		public FBlockContext fBlock() {
			return getRuleContext(FBlockContext.class,0);
		}
		public TerminalNode END_BLOCK() { return getToken(BeguageParser.END_BLOCK, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(FUNCTION);
			setState(52);
			fName();
			setState(53);
			fParameters();
			setState(54);
			match(T__0);
			setState(55);
			fReturnType();
			setState(56);
			fBlock();
			setState(57);
			match(END_BLOCK);
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

	public static class FParametersContext extends ParserRuleContext {
		public List<FParameterContext> fParameter() {
			return getRuleContexts(FParameterContext.class);
		}
		public FParameterContext fParameter(int i) {
			return getRuleContext(FParameterContext.class,i);
		}
		public FParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFParameters(this);
		}
	}

	public final FParametersContext fParameters() throws RecognitionException {
		FParametersContext _localctx = new FParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__1);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READ_TYPE) {
				{
				setState(60);
				fParameter();
				}
			}

			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(63);
				match(T__2);
				setState(64);
				fParameter();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__3);
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

	public static class FParameterContext extends ParserRuleContext {
		public TerminalNode READ_TYPE() { return getToken(BeguageParser.READ_TYPE, 0); }
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public FParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFParameter(this);
		}
	}

	public final FParameterContext fParameter() throws RecognitionException {
		FParameterContext _localctx = new FParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(READ_TYPE);
			setState(73);
			match(ID);
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

	public static class FNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public FNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFName(this);
		}
	}

	public final FNameContext fName() throws RecognitionException {
		FNameContext _localctx = new FNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
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

	public static class FReturnTypeContext extends ParserRuleContext {
		public TerminalNode READ_TYPE() { return getToken(BeguageParser.READ_TYPE, 0); }
		public FReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFReturnType(this);
		}
	}

	public final FReturnTypeContext fReturnType() throws RecognitionException {
		FReturnTypeContext _localctx = new FReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(READ_TYPE);
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

	public static class FBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterFBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitFBlock(this);
		}
	}

	public final FBlockContext fBlock() throws RecognitionException {
		FBlockContext _localctx = new FBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
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
	public static class ReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(BeguageParser.RETURN, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitReturn(this);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(IF);
				setState(82);
				condition();
				setState(83);
				blockIf();
				setState(84);
				match(END_BLOCK);
				}
				break;
			case REPEAT:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(REPEAT);
				setState(87);
				condition();
				setState(88);
				blockRepeat();
				setState(89);
				match(END_BLOCK);
				}
				break;
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(WRITE);
				setState(92);
				expression0(0);
				}
				break;
			case PRE_ASSIGN:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(PRE_ASSIGN);
				setState(94);
				match(ID);
				setState(95);
				match(ASSIGN);
				setState(96);
				expression0(0);
				}
				break;
			case ID:
				_localctx = new ReassignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(ID);
				setState(98);
				match(ASSIGN);
				setState(99);
				expression0(0);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(READ);
				setState(101);
				match(ID);
				setState(102);
				match(TYPE_AS);
				setState(103);
				match(READ_TYPE);
				}
				break;
			case RETURN:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				match(RETURN);
				setState(105);
				expression0(0);
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
		enterRule(_localctx, 18, RULE_blockIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		enterRule(_localctx, 20, RULE_blockRepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__1);
			setState(113);
			conditionalExpression();
			setState(114);
			match(T__3);
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
		enterRule(_localctx, 24, RULE_conditionalExpression);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				expression0(0);
				setState(117);
				match(EQUAL);
				setState(118);
				expression0(0);
				}
				break;
			case 2:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				expression0(0);
				setState(121);
				match(NOT_EQUAL);
				setState(122);
				expression0(0);
				}
				break;
			case 3:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				expression0(0);
				setState(125);
				match(GREATER);
				setState(126);
				expression0(0);
				}
				break;
			case 4:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				expression0(0);
				setState(129);
				match(LESS);
				setState(130);
				expression0(0);
				}
				break;
			case 5:
				_localctx = new LessEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				expression0(0);
				setState(133);
				match(LESS_EQUAL);
				setState(134);
				expression0(0);
				}
				break;
			case 6:
				_localctx = new GreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				expression0(0);
				setState(137);
				match(GREATER_EQUAL);
				setState(138);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single0Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(143);
			expression1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new SubContext(new Expression0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression0);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						match(SUB);
						setState(147);
						expression1(0);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new Expression0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression0);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(ADD);
						setState(150);
						expression1(0);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(157);
			expression2();
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(160);
						match(MUL);
						setState(161);
						expression2();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(162);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(163);
						match(DIV);
						setState(164);
						expression2();
						}
						break;
					}
					} 
				}
				setState(169);
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
	public static class CallContext extends Expression2Context {
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public List<Expression0Context> expression0() {
			return getRuleContexts(Expression0Context.class);
		}
		public Expression0Context expression0(int i) {
			return getRuleContext(Expression0Context.class,i);
		}
		public CallContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitCall(this);
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
		enterRule(_localctx, 30, RULE_expression2);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				}
				break;
			case 2:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__1);
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << ID) | (1L << INT) | (1L << FLOAT32) | (1L << FLOAT64) | (1L << CONV_INT) | (1L << CONV_FLOAT32) | (1L << CONV_FLOAT64))) != 0)) {
					{
					{
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(173);
						match(T__2);
						}
					}

					setState(176);
					expression0(0);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(182);
				match(T__3);
				}
				}
				break;
			case 3:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(FLOAT64);
				}
				break;
			case 4:
				_localctx = new Float32Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(FLOAT32);
				}
				break;
			case 5:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(INT);
				}
				break;
			case 6:
				_localctx = new To_intContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(CONV_INT);
				setState(187);
				expression2();
				}
				break;
			case 7:
				_localctx = new To_float64Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				match(CONV_FLOAT64);
				setState(189);
				expression2();
				}
				break;
			case 8:
				_localctx = new To_float32Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(CONV_FLOAT32);
				setState(191);
				expression2();
				}
				break;
			case 9:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				match(T__1);
				setState(193);
				expression0(0);
				setState(194);
				match(T__3);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression0_sempred((Expression0Context)_localctx, predIndex);
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\5"+
		"\2%\n\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\5\3.\n\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5@\n\5\3\5\3\5\7"+
		"\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a8\n\20\f"+
		"\20\16\20\u00ab\13\20\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\21\7\21\u00b4"+
		"\n\21\f\21\16\21\u00b7\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\21\2\4\34\36\22\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00d8\2)\3\2\2\2\4\62\3\2\2\2\6"+
		"\65\3\2\2\2\b=\3\2\2\2\nJ\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20Q\3\2\2\2\22"+
		"l\3\2\2\2\24n\3\2\2\2\26p\3\2\2\2\30r\3\2\2\2\32\u008e\3\2\2\2\34\u0090"+
		"\3\2\2\2\36\u009e\3\2\2\2 \u00c6\3\2\2\2\"%\5\22\n\2#%\5\6\4\2$\"\3\2"+
		"\2\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&(\7&\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,.\5\22\n\2-,\3\2\2\2-.\3\2\2\2."+
		"/\3\2\2\2/\61\7&\2\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2"+
		"\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\7\7\2\2\66\67\5\f\7\2\678\5\b\5"+
		"\289\7\3\2\29:\5\16\b\2:;\5\20\t\2;<\7\21\2\2<\7\3\2\2\2=?\7\4\2\2>@\5"+
		"\n\6\2?>\3\2\2\2?@\3\2\2\2@E\3\2\2\2AB\7\5\2\2BD\5\n\6\2CA\3\2\2\2DG\3"+
		"\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\6\2\2I\t\3\2\2\2JK"+
		"\7\23\2\2KL\7\34\2\2L\13\3\2\2\2MN\7\34\2\2N\r\3\2\2\2OP\7\23\2\2P\17"+
		"\3\2\2\2QR\5\4\3\2R\21\3\2\2\2ST\7\t\2\2TU\5\30\r\2UV\5\24\13\2VW\7\21"+
		"\2\2Wm\3\2\2\2XY\7\n\2\2YZ\5\30\r\2Z[\5\26\f\2[\\\7\21\2\2\\m\3\2\2\2"+
		"]^\7\26\2\2^m\5\34\17\2_`\7\24\2\2`a\7\34\2\2ab\7\25\2\2bm\5\34\17\2c"+
		"d\7\34\2\2de\7\25\2\2em\5\34\17\2fg\7\27\2\2gh\7\34\2\2hi\7\22\2\2im\7"+
		"\23\2\2jk\7\b\2\2km\5\34\17\2lS\3\2\2\2lX\3\2\2\2l]\3\2\2\2l_\3\2\2\2"+
		"lc\3\2\2\2lf\3\2\2\2lj\3\2\2\2m\23\3\2\2\2no\5\4\3\2o\25\3\2\2\2pq\5\4"+
		"\3\2q\27\3\2\2\2rs\7\4\2\2st\5\32\16\2tu\7\6\2\2u\31\3\2\2\2vw\5\34\17"+
		"\2wx\7\13\2\2xy\5\34\17\2y\u008f\3\2\2\2z{\5\34\17\2{|\7\16\2\2|}\5\34"+
		"\17\2}\u008f\3\2\2\2~\177\5\34\17\2\177\u0080\7\f\2\2\u0080\u0081\5\34"+
		"\17\2\u0081\u008f\3\2\2\2\u0082\u0083\5\34\17\2\u0083\u0084\7\r\2\2\u0084"+
		"\u0085\5\34\17\2\u0085\u008f\3\2\2\2\u0086\u0087\5\34\17\2\u0087\u0088"+
		"\7\17\2\2\u0088\u0089\5\34\17\2\u0089\u008f\3\2\2\2\u008a\u008b\5\34\17"+
		"\2\u008b\u008c\7\20\2\2\u008c\u008d\5\34\17\2\u008d\u008f\3\2\2\2\u008e"+
		"v\3\2\2\2\u008ez\3\2\2\2\u008e~\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0086"+
		"\3\2\2\2\u008e\u008a\3\2\2\2\u008f\33\3\2\2\2\u0090\u0091\b\17\1\2\u0091"+
		"\u0092\5\36\20\2\u0092\u009b\3\2\2\2\u0093\u0094\f\5\2\2\u0094\u0095\7"+
		"\30\2\2\u0095\u009a\5\36\20\2\u0096\u0097\f\4\2\2\u0097\u0098\7\31\2\2"+
		"\u0098\u009a\5\36\20\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\35\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\b\20\1\2\u009f\u00a0\5 \21\2\u00a0\u00a9\3"+
		"\2\2\2\u00a1\u00a2\f\4\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a8\5 \21\2\u00a4"+
		"\u00a5\f\3\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a8\5 \21\2\u00a7\u00a1\3"+
		"\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\37\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00c7\7\34\2"+
		"\2\u00ad\u00ae\7\34\2\2\u00ae\u00b5\7\4\2\2\u00af\u00b1\7\5\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5\34"+
		"\17\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00c7\7\6"+
		"\2\2\u00b9\u00c7\7\37\2\2\u00ba\u00c7\7\36\2\2\u00bb\u00c7\7\35\2\2\u00bc"+
		"\u00bd\7#\2\2\u00bd\u00c7\5 \21\2\u00be\u00bf\7%\2\2\u00bf\u00c7\5 \21"+
		"\2\u00c0\u00c1\7$\2\2\u00c1\u00c7\5 \21\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4"+
		"\5\34\17\2\u00c4\u00c5\7\6\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00ac\3\2\2\2"+
		"\u00c6\u00ad\3\2\2\2\u00c6\u00b9\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bb"+
		"\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c7!\3\2\2\2\21$)-\62?El\u008e\u0099\u009b\u00a7\u00a9"+
		"\u00b0\u00b5\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}