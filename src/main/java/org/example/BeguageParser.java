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
		T__0=1, T__1=2, T__2=3, T__3=4, STRUCTURE=5, FUNCTION=6, RETURN=7, IF=8, 
		REPEAT=9, EQUAL=10, GREATER=11, LESS=12, NOT_EQUAL=13, LESS_EQUAL=14, 
		GREATER_EQUAL=15, END_BLOCK=16, TYPE_AS=17, READ_TYPE=18, PRE_ASSIGN=19, 
		ASSIGN=20, WRITE=21, READ=22, SUB=23, ADD=24, MUL=25, DIV=26, ID=27, INT=28, 
		FLOAT32=29, FLOAT64=30, INT_KEYWORD=31, FLOAT32_KEYWORD=32, FLOAT64_KEYWORD=33, 
		CONV_INT=34, CONV_FLOAT32=35, CONV_FLOAT64=36, NEWLINE=37, WS=38;
	public static final int
		RULE_program = 0, RULE_structure = 1, RULE_sName = 2, RULE_sBlock = 3, 
		RULE_sField = 4, RULE_block = 5, RULE_function = 6, RULE_fParameters = 7, 
		RULE_fParameter = 8, RULE_fName = 9, RULE_fReturnType = 10, RULE_fBlock = 11, 
		RULE_statement = 12, RULE_blockIf = 13, RULE_blockRepeat = 14, RULE_condition = 15, 
		RULE_conditionalExpression = 16, RULE_expression0 = 17, RULE_expression1 = 18, 
		RULE_expression2 = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "structure", "sName", "sBlock", "sField", "block", "function", 
			"fParameters", "fParameter", "fName", "fReturnType", "fBlock", "statement", 
			"blockIf", "blockRepeat", "condition", "conditionalExpression", "expression0", 
			"expression1", "expression2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'('", "','", "')'", "'struct'", "'fn'", "'return'", "'if'", 
			"'go'", "'=='", "'>'", "'<'", "'!='", "'<='", "'>='", "'end'", "' as '", 
			null, "'let'", "'be'", "'show'", "'provide'", "'-'", "'+'", "'*'", "'/'", 
			null, null, null, null, "'i32'", "'f32'", "'f64'", "'(i32)'", "'(f32)'", 
			"'(f64)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STRUCTURE", "FUNCTION", "RETURN", "IF", 
			"REPEAT", "EQUAL", "GREATER", "LESS", "NOT_EQUAL", "LESS_EQUAL", "GREATER_EQUAL", 
			"END_BLOCK", "TYPE_AS", "READ_TYPE", "PRE_ASSIGN", "ASSIGN", "WRITE", 
			"READ", "SUB", "ADD", "MUL", "DIV", "ID", "INT", "FLOAT32", "FLOAT64", 
			"INT_KEYWORD", "FLOAT32_KEYWORD", "FLOAT64_KEYWORD", "CONV_INT", "CONV_FLOAT32", 
			"CONV_FLOAT64", "NEWLINE", "WS"
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
		public List<StructureContext> structure() {
			return getRuleContexts(StructureContext.class);
		}
		public StructureContext structure(int i) {
			return getRuleContext(StructureContext.class,i);
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCTURE) | (1L << FUNCTION) | (1L << RETURN) | (1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					structure();
					}
					break;
				case 2:
					{
					setState(41);
					statement();
					}
					break;
				case 3:
					{
					setState(42);
					function();
					}
					break;
				case 4:
					{
					}
					break;
				}
				setState(46);
				match(NEWLINE);
				}
				}
				setState(51);
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

	public static class StructureContext extends ParserRuleContext {
		public TerminalNode STRUCTURE() { return getToken(BeguageParser.STRUCTURE, 0); }
		public SNameContext sName() {
			return getRuleContext(SNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BeguageParser.NEWLINE, 0); }
		public SBlockContext sBlock() {
			return getRuleContext(SBlockContext.class,0);
		}
		public TerminalNode END_BLOCK() { return getToken(BeguageParser.END_BLOCK, 0); }
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitStructure(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(STRUCTURE);
			setState(53);
			sName();
			setState(54);
			match(NEWLINE);
			setState(55);
			sBlock();
			setState(56);
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

	public static class SNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public SNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterSName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitSName(this);
		}
	}

	public final SNameContext sName() throws RecognitionException {
		SNameContext _localctx = new SNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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

	public static class SBlockContext extends ParserRuleContext {
		public List<SFieldContext> sField() {
			return getRuleContexts(SFieldContext.class);
		}
		public SFieldContext sField(int i) {
			return getRuleContext(SFieldContext.class,i);
		}
		public SBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterSBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitSBlock(this);
		}
	}

	public final SBlockContext sBlock() throws RecognitionException {
		SBlockContext _localctx = new SBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				sField();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==READ_TYPE );
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

	public static class SFieldContext extends ParserRuleContext {
		public TerminalNode READ_TYPE() { return getToken(BeguageParser.READ_TYPE, 0); }
		public TerminalNode ID() { return getToken(BeguageParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(BeguageParser.NEWLINE, 0); }
		public SFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterSField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitSField(this);
		}
	}

	public final SFieldContext sField() throws RecognitionException {
		SFieldContext _localctx = new SFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(READ_TYPE);
			setState(66);
			match(T__0);
			setState(67);
			match(ID);
			setState(68);
			match(NEWLINE);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << REPEAT) | (1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID))) != 0)) {
					{
					setState(70);
					statement();
					}
				}

				setState(73);
				match(NEWLINE);
				}
				}
				setState(78);
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
		enterRule(_localctx, 12, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(FUNCTION);
			setState(80);
			fName();
			setState(81);
			fParameters();
			setState(82);
			match(T__0);
			setState(83);
			fReturnType();
			setState(84);
			fBlock();
			setState(85);
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
		enterRule(_localctx, 14, RULE_fParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READ_TYPE) {
				{
				setState(88);
				fParameter();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(91);
				match(T__2);
				setState(92);
				fParameter();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
		enterRule(_localctx, 16, RULE_fParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(READ_TYPE);
			setState(101);
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
		enterRule(_localctx, 18, RULE_fName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		enterRule(_localctx, 20, RULE_fReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 22, RULE_fBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
	public static class DeclareStructContext extends StatementContext {
		public TerminalNode PRE_ASSIGN() { return getToken(BeguageParser.PRE_ASSIGN, 0); }
		public TerminalNode STRUCTURE() { return getToken(BeguageParser.STRUCTURE, 0); }
		public List<TerminalNode> ID() { return getTokens(BeguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BeguageParser.ID, i);
		}
		public DeclareStructContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterDeclareStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitDeclareStruct(this);
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
	public static class ReassignStructFieldContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(BeguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BeguageParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(BeguageParser.ASSIGN, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ReassignStructFieldContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterReassignStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitReassignStructField(this);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(IF);
				setState(110);
				condition();
				setState(111);
				blockIf();
				setState(112);
				match(END_BLOCK);
				}
				break;
			case 2:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(REPEAT);
				setState(115);
				condition();
				setState(116);
				blockRepeat();
				setState(117);
				match(END_BLOCK);
				}
				break;
			case 3:
				_localctx = new DeclareStructContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(PRE_ASSIGN);
				setState(120);
				match(STRUCTURE);
				setState(121);
				match(ID);
				setState(122);
				match(ID);
				}
				break;
			case 4:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(WRITE);
				setState(124);
				expression0(0);
				}
				break;
			case 5:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(PRE_ASSIGN);
				setState(126);
				match(ID);
				setState(127);
				match(ASSIGN);
				setState(128);
				expression0(0);
				}
				break;
			case 6:
				_localctx = new ReassignStructFieldContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(ID);
				setState(130);
				match(T__0);
				setState(131);
				match(ID);
				setState(132);
				match(ASSIGN);
				setState(133);
				expression0(0);
				}
				break;
			case 7:
				_localctx = new ReassignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				match(ID);
				setState(135);
				match(ASSIGN);
				setState(136);
				expression0(0);
				}
				break;
			case 8:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				match(READ);
				setState(138);
				match(ID);
				setState(139);
				match(TYPE_AS);
				setState(140);
				match(READ_TYPE);
				}
				break;
			case 9:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				match(RETURN);
				setState(142);
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
		enterRule(_localctx, 26, RULE_blockIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		enterRule(_localctx, 28, RULE_blockRepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__1);
			setState(150);
			conditionalExpression();
			setState(151);
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
		enterRule(_localctx, 32, RULE_conditionalExpression);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expression0(0);
				setState(154);
				match(EQUAL);
				setState(155);
				expression0(0);
				}
				break;
			case 2:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				expression0(0);
				setState(158);
				match(NOT_EQUAL);
				setState(159);
				expression0(0);
				}
				break;
			case 3:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				expression0(0);
				setState(162);
				match(GREATER);
				setState(163);
				expression0(0);
				}
				break;
			case 4:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				expression0(0);
				setState(166);
				match(LESS);
				setState(167);
				expression0(0);
				}
				break;
			case 5:
				_localctx = new LessEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				expression0(0);
				setState(170);
				match(LESS_EQUAL);
				setState(171);
				expression0(0);
				}
				break;
			case 6:
				_localctx = new GreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				expression0(0);
				setState(174);
				match(GREATER_EQUAL);
				setState(175);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single0Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(180);
			expression1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new SubContext(new Expression0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression0);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						match(SUB);
						setState(184);
						expression1(0);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new Expression0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression0);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(ADD);
						setState(187);
						expression1(0);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(194);
			expression2();
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(MUL);
						setState(198);
						expression2();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expression1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression1);
						setState(199);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(200);
						match(DIV);
						setState(201);
						expression2();
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class StructFieldValueContext extends Expression2Context {
		public List<TerminalNode> ID() { return getTokens(BeguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BeguageParser.ID, i);
		}
		public StructFieldValueContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).enterStructFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeguageListener ) ((BeguageListener)listener).exitStructFieldValue(this);
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
		enterRule(_localctx, 38, RULE_expression2);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ID);
				}
				break;
			case 2:
				_localctx = new StructFieldValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(ID);
				setState(209);
				match(T__0);
				setState(210);
				match(ID);
				}
				break;
			case 3:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(211);
				match(ID);
				setState(212);
				match(T__1);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << ID) | (1L << INT) | (1L << FLOAT32) | (1L << FLOAT64) | (1L << CONV_INT) | (1L << CONV_FLOAT32) | (1L << CONV_FLOAT64))) != 0)) {
					{
					{
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(213);
						match(T__2);
						}
					}

					setState(216);
					expression0(0);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(222);
				match(T__3);
				}
				}
				break;
			case 4:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(FLOAT64);
				}
				break;
			case 5:
				_localctx = new Float32Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(FLOAT32);
				}
				break;
			case 6:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(INT);
				}
				break;
			case 7:
				_localctx = new To_intContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				match(CONV_INT);
				setState(227);
				expression2();
				}
				break;
			case 8:
				_localctx = new To_float64Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				match(CONV_FLOAT64);
				setState(229);
				expression2();
				}
				break;
			case 9:
				_localctx = new To_float32Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
				match(CONV_FLOAT32);
				setState(231);
				expression2();
				}
				break;
			case 10:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(232);
				match(T__1);
				setState(233);
				expression0(0);
				setState(234);
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
		case 17:
			return expression0_sempred((Expression0Context)_localctx, predIndex);
		case 18:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\5\2/\n\2\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\6\5@\n\5\r\5\16"+
		"\5A\3\6\3\6\3\6\3\6\3\6\3\7\5\7J\n\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\\\n\t\3\t\3\t\7\t`\n\t\f\t\16\t"+
		"c\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0092\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b4\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00bf\n\23\f\23\16\23\u00c2"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00cd\n\24\f"+
		"\24\16\24\u00d0\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d9\n"+
		"\25\3\25\7\25\u00dc\n\25\f\25\16\25\u00df\13\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ef\n\25\3\25"+
		"\2\4$&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u0102\2\63"+
		"\3\2\2\2\4\66\3\2\2\2\6<\3\2\2\2\b?\3\2\2\2\nC\3\2\2\2\fN\3\2\2\2\16Q"+
		"\3\2\2\2\20Y\3\2\2\2\22f\3\2\2\2\24i\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2\32"+
		"\u0091\3\2\2\2\34\u0093\3\2\2\2\36\u0095\3\2\2\2 \u0097\3\2\2\2\"\u00b3"+
		"\3\2\2\2$\u00b5\3\2\2\2&\u00c3\3\2\2\2(\u00ee\3\2\2\2*/\5\4\3\2+/\5\32"+
		"\16\2,/\5\16\b\2-/\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2./\3"+
		"\2\2\2/\60\3\2\2\2\60\62\7\'\2\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2"+
		"\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\7\7\2\2\678\5\6\4\2"+
		"89\7\'\2\29:\5\b\5\2:;\7\22\2\2;\5\3\2\2\2<=\7\35\2\2=\7\3\2\2\2>@\5\n"+
		"\6\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CD\7\24\2\2DE\7"+
		"\3\2\2EF\7\35\2\2FG\7\'\2\2G\13\3\2\2\2HJ\5\32\16\2IH\3\2\2\2IJ\3\2\2"+
		"\2JK\3\2\2\2KM\7\'\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\r\3\2"+
		"\2\2PN\3\2\2\2QR\7\b\2\2RS\5\24\13\2ST\5\20\t\2TU\7\3\2\2UV\5\26\f\2V"+
		"W\5\30\r\2WX\7\22\2\2X\17\3\2\2\2Y[\7\4\2\2Z\\\5\22\n\2[Z\3\2\2\2[\\\3"+
		"\2\2\2\\a\3\2\2\2]^\7\5\2\2^`\5\22\n\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\6\2\2e\21\3\2\2\2fg\7\24\2\2gh\7\35"+
		"\2\2h\23\3\2\2\2ij\7\35\2\2j\25\3\2\2\2kl\7\24\2\2l\27\3\2\2\2mn\5\f\7"+
		"\2n\31\3\2\2\2op\7\n\2\2pq\5 \21\2qr\5\34\17\2rs\7\22\2\2s\u0092\3\2\2"+
		"\2tu\7\13\2\2uv\5 \21\2vw\5\36\20\2wx\7\22\2\2x\u0092\3\2\2\2yz\7\25\2"+
		"\2z{\7\7\2\2{|\7\35\2\2|\u0092\7\35\2\2}~\7\27\2\2~\u0092\5$\23\2\177"+
		"\u0080\7\25\2\2\u0080\u0081\7\35\2\2\u0081\u0082\7\26\2\2\u0082\u0092"+
		"\5$\23\2\u0083\u0084\7\35\2\2\u0084\u0085\7\3\2\2\u0085\u0086\7\35\2\2"+
		"\u0086\u0087\7\26\2\2\u0087\u0092\5$\23\2\u0088\u0089\7\35\2\2\u0089\u008a"+
		"\7\26\2\2\u008a\u0092\5$\23\2\u008b\u008c\7\30\2\2\u008c\u008d\7\35\2"+
		"\2\u008d\u008e\7\23\2\2\u008e\u0092\7\24\2\2\u008f\u0090\7\t\2\2\u0090"+
		"\u0092\5$\23\2\u0091o\3\2\2\2\u0091t\3\2\2\2\u0091y\3\2\2\2\u0091}\3\2"+
		"\2\2\u0091\177\3\2\2\2\u0091\u0083\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u008b"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094\5\f\7\2\u0094"+
		"\35\3\2\2\2\u0095\u0096\5\f\7\2\u0096\37\3\2\2\2\u0097\u0098\7\4\2\2\u0098"+
		"\u0099\5\"\22\2\u0099\u009a\7\6\2\2\u009a!\3\2\2\2\u009b\u009c\5$\23\2"+
		"\u009c\u009d\7\f\2\2\u009d\u009e\5$\23\2\u009e\u00b4\3\2\2\2\u009f\u00a0"+
		"\5$\23\2\u00a0\u00a1\7\17\2\2\u00a1\u00a2\5$\23\2\u00a2\u00b4\3\2\2\2"+
		"\u00a3\u00a4\5$\23\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\5$\23\2\u00a6\u00b4"+
		"\3\2\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\5$\23\2"+
		"\u00aa\u00b4\3\2\2\2\u00ab\u00ac\5$\23\2\u00ac\u00ad\7\20\2\2\u00ad\u00ae"+
		"\5$\23\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\5$\23\2\u00b0\u00b1\7\21\2\2"+
		"\u00b1\u00b2\5$\23\2\u00b2\u00b4\3\2\2\2\u00b3\u009b\3\2\2\2\u00b3\u009f"+
		"\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3"+
		"\u00af\3\2\2\2\u00b4#\3\2\2\2\u00b5\u00b6\b\23\1\2\u00b6\u00b7\5&\24\2"+
		"\u00b7\u00c0\3\2\2\2\u00b8\u00b9\f\5\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bf"+
		"\5&\24\2\u00bb\u00bc\f\4\2\2\u00bc\u00bd\7\32\2\2\u00bd\u00bf\5&\24\2"+
		"\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\b\24\1\2\u00c4\u00c5\5(\25\2\u00c5\u00ce\3\2\2\2\u00c6\u00c7\f"+
		"\4\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00cd\5(\25\2\u00c9\u00ca\f\3\2\2\u00ca"+
		"\u00cb\7\34\2\2\u00cb\u00cd\5(\25\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\'\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00ef\7\35\2\2\u00d2\u00d3\7\35\2"+
		"\2\u00d3\u00d4\7\3\2\2\u00d4\u00ef\7\35\2\2\u00d5\u00d6\7\35\2\2\u00d6"+
		"\u00dd\7\4\2\2\u00d7\u00d9\7\5\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\5$\23\2\u00db\u00d8\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00e0\u00ef\7\6\2\2\u00e1\u00ef\7 \2\2\u00e2"+
		"\u00ef\7\37\2\2\u00e3\u00ef\7\36\2\2\u00e4\u00e5\7$\2\2\u00e5\u00ef\5"+
		"(\25\2\u00e6\u00e7\7&\2\2\u00e7\u00ef\5(\25\2\u00e8\u00e9\7%\2\2\u00e9"+
		"\u00ef\5(\25\2\u00ea\u00eb\7\4\2\2\u00eb\u00ec\5$\23\2\u00ec\u00ed\7\6"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00d1\3\2\2\2\u00ee\u00d2\3\2\2\2\u00ee"+
		"\u00d5\3\2\2\2\u00ee\u00e1\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e3\3\2"+
		"\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee"+
		"\u00ea\3\2\2\2\u00ef)\3\2\2\2\22.\63AIN[a\u0091\u00b3\u00be\u00c0\u00cc"+
		"\u00ce\u00d8\u00dd\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}