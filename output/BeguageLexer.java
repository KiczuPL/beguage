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
		T__0=1, T__1=2, TYPE_AS=3, READ_TYPE=4, PRE_ASSIGN=5, ASSIGN=6, WRITE=7, 
		READ=8, ID=9, INT=10, FLOAT32=11, FLOAT64=12, INT_KEYWORD=13, FLOAT32_KEYWORD=14, 
		FLOAT64_KEYWORD=15, NEWLINE=16, WS=17, ADD=18, SUB=19, MUL=20, DIV=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE_AS", "READ_TYPE", "PRE_ASSIGN", "ASSIGN", "WRITE", 
			"READ", "ID", "INT", "FLOAT32", "FLOAT64", "INT_KEYWORD", "FLOAT32_KEYWORD", 
			"FLOAT64_KEYWORD", "NEWLINE", "WS", "ADD", "SUB", "MUL", "DIV"
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\nO\n\n\r\n\16\nP\3\13\5\13"+
		"T\n\13\3\13\6\13W\n\13\r\13\16\13X\3\f\5\f\\\n\f\3\f\6\f_\n\f\r\f\16\f"+
		"`\3\f\3\f\6\fe\n\f\r\f\16\ff\5\fi\n\f\3\f\5\fl\n\f\3\r\5\ro\n\r\3\r\6"+
		"\rr\n\r\r\r\16\rs\3\r\3\r\6\rx\n\r\r\r\16\ry\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\5\21\u008b\n\21\3\21"+
		"\3\21\3\22\6\22\u0090\n\22\r\22\16\22\u0091\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\4\4\2"+
		"C\\c|\4\2\13\13\"\"\2\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r="+
		"\3\2\2\2\17@\3\2\2\2\21E\3\2\2\2\23N\3\2\2\2\25S\3\2\2\2\27[\3\2\2\2\31"+
		"n\3\2\2\2\33}\3\2\2\2\35\u0081\3\2\2\2\37\u0085\3\2\2\2!\u008a\3\2\2\2"+
		"#\u008f\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u009b\3"+
		"\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62\7c\2\2\62\63"+
		"\7u\2\2\63\b\3\2\2\2\648\5\33\16\2\658\5\35\17\2\668\5\37\20\2\67\64\3"+
		"\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\n\3\2\2\29:\7n\2\2:;\7g\2\2;<\7v\2"+
		"\2<\f\3\2\2\2=>\7d\2\2>?\7g\2\2?\16\3\2\2\2@A\7u\2\2AB\7j\2\2BC\7q\2\2"+
		"CD\7y\2\2D\20\3\2\2\2EF\7r\2\2FG\7t\2\2GH\7q\2\2HI\7x\2\2IJ\7k\2\2JK\7"+
		"f\2\2KL\7g\2\2L\22\3\2\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\24\3\2\2\2RT\7/\2\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\4\62;\2VU"+
		"\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\26\3\2\2\2Z\\\7/\2\2[Z\3\2\2\2"+
		"[\\\3\2\2\2\\^\3\2\2\2]_\4\62;\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2ab\3\2\2\2bh\7\60\2\2ce\4\62;\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gi\3\2\2\2hd\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\7h\2\2kj\3\2\2\2kl\3\2"+
		"\2\2l\30\3\2\2\2mo\7/\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\4\62;\2qp\3"+
		"\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\60\2\2vx\4\62;\2wv"+
		"\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7f\2\2|\32\3\2\2\2"+
		"}~\7k\2\2~\177\7\65\2\2\177\u0080\7\64\2\2\u0080\34\3\2\2\2\u0081\u0082"+
		"\7h\2\2\u0082\u0083\7\65\2\2\u0083\u0084\7\64\2\2\u0084\36\3\2\2\2\u0085"+
		"\u0086\7h\2\2\u0086\u0087\78\2\2\u0087\u0088\7\66\2\2\u0088 \3\2\2\2\u0089"+
		"\u008b\7\17\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\7\f\2\2\u008d\"\3\2\2\2\u008e\u0090\t\3\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\b\22\2\2\u0094$\3\2\2\2\u0095\u0096\7-\2\2"+
		"\u0096&\3\2\2\2\u0097\u0098\7/\2\2\u0098(\3\2\2\2\u0099\u009a\7,\2\2\u009a"+
		"*\3\2\2\2\u009b\u009c\7\61\2\2\u009c,\3\2\2\2\21\2\67PSX[`fhknsy\u008a"+
		"\u0091\3\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}