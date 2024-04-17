// Generated from Beguage.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BeguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IF=3, EQUAL=4, END_BLOCK=5, TYPE_AS=6, READ_TYPE=7, PRE_ASSIGN=8, 
		ASSIGN=9, WRITE=10, READ=11, ID=12, INT=13, FLOAT32=14, FLOAT64=15, INT_KEYWORD=16, 
		FLOAT32_KEYWORD=17, FLOAT64_KEYWORD=18, CONV_INT=19, CONV_FLOAT32=20, 
		CONV_FLOAT64=21, NEWLINE=22, ADD=23, SUB=24, MUL=25, DIV=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IF", "EQUAL", "END_BLOCK", "TYPE_AS", "READ_TYPE", "PRE_ASSIGN", 
			"ASSIGN", "WRITE", "READ", "ID", "INT", "FLOAT32", "FLOAT64", "INT_KEYWORD", 
			"FLOAT32_KEYWORD", "FLOAT64_KEYWORD", "CONV_INT", "CONV_FLOAT32", "CONV_FLOAT64", 
			"NEWLINE", "ADD", "SUB", "MUL", "DIV", "WS"
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


	public BeguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Beguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bP\n\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\6\rg\n\r\r\r\16\rh\3\16\5\16l\n\16\3\16\6\16o\n\16\r\16"+
		"\16\16p\3\17\5\17t\n\17\3\17\6\17w\n\17\r\17\16\17x\3\17\3\17\7\17}\n"+
		"\17\f\17\16\17\u0080\13\17\5\17\u0082\n\17\3\17\3\17\5\17\u0086\n\17\3"+
		"\17\3\17\3\17\6\17\u008b\n\17\r\17\16\17\u008c\3\17\5\17\u0090\n\17\5"+
		"\17\u0092\n\17\3\20\5\20\u0095\n\20\3\20\6\20\u0098\n\20\r\20\16\20\u0099"+
		"\3\20\3\20\6\20\u009e\n\20\r\20\16\20\u009f\3\20\3\20\5\20\u00a4\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\5\27\u00c5\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\6\34\u00d2\n\34\r\34\16\34\u00d3\3\34\3\34\2\2\35\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\4\4\2C\\"+
		"c|\4\2\13\13\"\"\2\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t@\3\2\2\2\13C\3\2\2\2\rG\3\2"+
		"\2\2\17O\3\2\2\2\21Q\3\2\2\2\23U\3\2\2\2\25X\3\2\2\2\27]\3\2\2\2\31f\3"+
		"\2\2\2\33k\3\2\2\2\35s\3\2\2\2\37\u0094\3\2\2\2!\u00a5\3\2\2\2#\u00a9"+
		"\3\2\2\2%\u00ad\3\2\2\2\'\u00b1\3\2\2\2)\u00b7\3\2\2\2+\u00bd\3\2\2\2"+
		"-\u00c4\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce"+
		"\3\2\2\2\67\u00d1\3\2\2\29:\7*\2\2:\4\3\2\2\2;<\7+\2\2<\6\3\2\2\2=>\7"+
		"k\2\2>?\7h\2\2?\b\3\2\2\2@A\7?\2\2AB\7?\2\2B\n\3\2\2\2CD\7g\2\2DE\7p\2"+
		"\2EF\7f\2\2F\f\3\2\2\2GH\7\"\2\2HI\7c\2\2IJ\7u\2\2JK\7\"\2\2K\16\3\2\2"+
		"\2LP\5!\21\2MP\5#\22\2NP\5%\23\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\20\3\2"+
		"\2\2QR\7n\2\2RS\7g\2\2ST\7v\2\2T\22\3\2\2\2UV\7d\2\2VW\7g\2\2W\24\3\2"+
		"\2\2XY\7u\2\2YZ\7j\2\2Z[\7q\2\2[\\\7y\2\2\\\26\3\2\2\2]^\7r\2\2^_\7t\2"+
		"\2_`\7q\2\2`a\7x\2\2ab\7k\2\2bc\7f\2\2cd\7g\2\2d\30\3\2\2\2eg\t\2\2\2"+
		"fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\32\3\2\2\2jl\7/\2\2kj\3\2\2"+
		"\2kl\3\2\2\2ln\3\2\2\2mo\4\62;\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2q\34\3\2\2\2rt\7/\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\4\62;\2vu\3\2"+
		"\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u0091\3\2\2\2z~\7\60\2\2{}\4\62;\2"+
		"|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081z\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0084\7^\2\2\u0084\u0086\7\60\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0092\7h\2\2\u0088\u008a\7\60\2\2\u0089"+
		"\u008b\4\62;\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\7h\2\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0081\3\2"+
		"\2\2\u0091\u0088\3\2\2\2\u0092\36\3\2\2\2\u0093\u0095\7/\2\2\u0094\u0093"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\4\62;\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u00a3\3\2\2\2\u009b\u009d\7\60\2\2\u009c\u009e\4\62;\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\7f\2\2\u00a2\u00a4\7f\2\2\u00a3\u009b"+
		"\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7\65\2\2\u00a7\u00a8\7\64\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa"+
		"\u00ab\7\65\2\2\u00ab\u00ac\7\64\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7h\2\2"+
		"\u00ae\u00af\78\2\2\u00af\u00b0\7\66\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7"+
		"*\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00b5\7\64\2\2\u00b5"+
		"\u00b6\7+\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9\7h\2\2\u00b9"+
		"\u00ba\7\65\2\2\u00ba\u00bb\7\64\2\2\u00bb\u00bc\7+\2\2\u00bc*\3\2\2\2"+
		"\u00bd\u00be\7*\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\78\2\2\u00c0\u00c1"+
		"\7\66\2\2\u00c1\u00c2\7+\2\2\u00c2,\3\2\2\2\u00c3\u00c5\7\17\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\f"+
		"\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7"+
		"/\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd\64\3\2\2\2\u00ce\u00cf"+
		"\7\61\2\2\u00cf\66\3\2\2\2\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\b\34\2\2\u00d68\3\2\2\2\25\2Ohkpsx~\u0081\u0085\u008c"+
		"\u008f\u0091\u0094\u0099\u009f\u00a3\u00c4\u00d3\3\3\34\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}