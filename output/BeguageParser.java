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
		T__0=1, T__1=2, TYPE_AS=3, READ_TYPE=4, PRE_ASSIGN=5, ASSIGN=6, WRITE=7, 
		READ=8, ID=9, INT=10, FLOAT32=11, FLOAT64=12, INT_KEYWORD=13, FLOAT32_KEYWORD=14, 
		FLOAT64_KEYWORD=15, NEWLINE=16, WS=17, ADD=18, SUB=19, MUL=20, DIV=21;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression0 = 2, RULE_expression1 = 3, 
		RULE_expression2 = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression0", "expression1", "expression2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'as'", null, "'let'", "'be'", "'show'", "'provide'", 
			null, null, null, null, "'i32'", "'f32'", "'f64'", null, null, "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE_AS", "READ_TYPE", "PRE_ASSIGN", "ASSIGN", "WRITE", 
			"READ", "ID", "INT", "FLOAT32", "FLOAT64", "INT_KEYWORD", "FLOAT32_KEYWORD", 
			"FLOAT64_KEYWORD", "NEWLINE", "WS", "ADD", "SUB", "MUL", "DIV"
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRE_ASSIGN) | (1L << WRITE) | (1L << READ) | (1L << ID))) != 0)) {
					{
					setState(10);
					statement();
					}
				}

				setState(13);
				match(NEWLINE);
				}
				}
				setState(18);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(WRITE);
				setState(20);
				match(ID);
				}
				break;
			case PRE_ASSIGN:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(PRE_ASSIGN);
				setState(22);
				match(ID);
				setState(23);
				match(ASSIGN);
				setState(24);
				expression0();
				}
				break;
			case ID:
				_localctx = new ReassignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(ID);
				setState(26);
				match(ASSIGN);
				setState(27);
				expression0();
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(READ);
				setState(29);
				match(ID);
				setState(30);
				match(TYPE_AS);
				setState(31);
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
		enterRule(_localctx, 4, RULE_expression0);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				expression1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				expression1();
				setState(36);
				match(ADD);
				setState(37);
				expression0();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				expression1();
				setState(40);
				match(SUB);
				setState(41);
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
		enterRule(_localctx, 6, RULE_expression1);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				expression2();
				}
				break;
			case 2:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				expression2();
				setState(47);
				match(MUL);
				setState(48);
				expression1();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				expression2();
				setState(51);
				match(DIV);
				setState(52);
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
		enterRule(_localctx, 8, RULE_expression2);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(ID);
				}
				break;
			case FLOAT64:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(FLOAT64);
				}
				break;
			case FLOAT32:
				_localctx = new Float32Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(FLOAT32);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(INT);
				}
				break;
			case T__0:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(T__0);
				setState(61);
				expression0();
				setState(62);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\5\2\16\n\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\2\2L\2\22\3\2\2\2\4\"\3\2\2\2\6-\3\2\2\2\b8\3\2\2\2\nB\3\2\2"+
		"\2\f\16\5\4\3\2\r\f\3\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17\21\7\22\2\2"+
		"\20\r\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2\2\24"+
		"\22\3\2\2\2\25\26\7\t\2\2\26#\7\13\2\2\27\30\7\7\2\2\30\31\7\13\2\2\31"+
		"\32\7\b\2\2\32#\5\6\4\2\33\34\7\13\2\2\34\35\7\b\2\2\35#\5\6\4\2\36\37"+
		"\7\n\2\2\37 \7\13\2\2 !\7\5\2\2!#\7\6\2\2\"\25\3\2\2\2\"\27\3\2\2\2\""+
		"\33\3\2\2\2\"\36\3\2\2\2#\5\3\2\2\2$.\5\b\5\2%&\5\b\5\2&\'\7\24\2\2\'"+
		"(\5\6\4\2(.\3\2\2\2)*\5\b\5\2*+\7\25\2\2+,\5\6\4\2,.\3\2\2\2-$\3\2\2\2"+
		"-%\3\2\2\2-)\3\2\2\2.\7\3\2\2\2/9\5\n\6\2\60\61\5\n\6\2\61\62\7\26\2\2"+
		"\62\63\5\b\5\2\639\3\2\2\2\64\65\5\n\6\2\65\66\7\27\2\2\66\67\5\b\5\2"+
		"\679\3\2\2\28/\3\2\2\28\60\3\2\2\28\64\3\2\2\29\t\3\2\2\2:C\7\13\2\2;"+
		"C\7\16\2\2<C\7\r\2\2=C\7\f\2\2>?\7\3\2\2?@\5\6\4\2@A\7\4\2\2AC\3\2\2\2"+
		"B:\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2C\13\3\2\2\2\b\r\22"+
		"\"-8B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}