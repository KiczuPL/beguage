// Generated from Beguage.g4 by ANTLR 4.9.2
package org.example;
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
		T__0=1, T__1=2, IF=3, REPEAT=4, EQUAL=5, GREATER=6, LESS=7, NOT_EQUAL=8, 
		LESS_EQUAL=9, GREATER_EQUAL=10, END_BLOCK=11, TYPE_AS=12, READ_TYPE=13, 
		PRE_ASSIGN=14, ASSIGN=15, WRITE=16, READ=17, SUB=18, ADD=19, MUL=20, DIV=21, 
		ID=22, INT=23, FLOAT32=24, FLOAT64=25, INT_KEYWORD=26, FLOAT32_KEYWORD=27, 
		FLOAT64_KEYWORD=28, CONV_INT=29, CONV_FLOAT32=30, CONV_FLOAT64=31, NEWLINE=32, 
		WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IF", "REPEAT", "EQUAL", "GREATER", "LESS", "NOT_EQUAL", 
			"LESS_EQUAL", "GREATER_EQUAL", "END_BLOCK", "TYPE_AS", "READ_TYPE", "PRE_ASSIGN", 
			"ASSIGN", "WRITE", "READ", "SUB", "ADD", "MUL", "DIV", "ID", "INT", "FLOAT32", 
			"FLOAT64", "INT_KEYWORD", "FLOAT32_KEYWORD", "FLOAT64_KEYWORD", "CONV_INT", 
			"CONV_FLOAT32", "CONV_FLOAT64", "NEWLINE", "WS"
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
		case 32:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16l\n\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u008b\n\27\r\27"+
		"\16\27\u008c\3\30\5\30\u0090\n\30\3\30\6\30\u0093\n\30\r\30\16\30\u0094"+
		"\3\31\5\31\u0098\n\31\3\31\6\31\u009b\n\31\r\31\16\31\u009c\3\31\3\31"+
		"\7\31\u00a1\n\31\f\31\16\31\u00a4\13\31\5\31\u00a6\n\31\3\31\3\31\5\31"+
		"\u00aa\n\31\3\31\3\31\3\31\6\31\u00af\n\31\r\31\16\31\u00b0\3\31\5\31"+
		"\u00b4\n\31\5\31\u00b6\n\31\3\32\5\32\u00b9\n\32\3\32\6\32\u00bc\n\32"+
		"\r\32\16\32\u00bd\3\32\3\32\6\32\u00c2\n\32\r\32\16\32\u00c3\3\32\3\32"+
		"\5\32\u00c8\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\5!\u00e9\n!\3!\3!\3\"\6\"\u00ee\n\"\r\"\16\"\u00ef\3"+
		"\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#\3\2\4\4\2C\\c|\4\2\13\13\"\"\2\u0105\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2"+
		"\tL\3\2\2\2\13O\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2"+
		"\25\\\3\2\2\2\27_\3\2\2\2\31c\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37q\3\2"+
		"\2\2!t\3\2\2\2#y\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2"+
		"+\u0087\3\2\2\2-\u008a\3\2\2\2/\u008f\3\2\2\2\61\u0097\3\2\2\2\63\u00b8"+
		"\3\2\2\2\65\u00c9\3\2\2\2\67\u00cd\3\2\2\29\u00d1\3\2\2\2;\u00d5\3\2\2"+
		"\2=\u00db\3\2\2\2?\u00e1\3\2\2\2A\u00e8\3\2\2\2C\u00ed\3\2\2\2EF\7*\2"+
		"\2F\4\3\2\2\2GH\7+\2\2H\6\3\2\2\2IJ\7k\2\2JK\7h\2\2K\b\3\2\2\2LM\7i\2"+
		"\2MN\7q\2\2N\n\3\2\2\2OP\7?\2\2PQ\7?\2\2Q\f\3\2\2\2RS\7@\2\2S\16\3\2\2"+
		"\2TU\7>\2\2U\20\3\2\2\2VW\7#\2\2WX\7?\2\2X\22\3\2\2\2YZ\7>\2\2Z[\7?\2"+
		"\2[\24\3\2\2\2\\]\7@\2\2]^\7?\2\2^\26\3\2\2\2_`\7g\2\2`a\7p\2\2ab\7f\2"+
		"\2b\30\3\2\2\2cd\7\"\2\2de\7c\2\2ef\7u\2\2fg\7\"\2\2g\32\3\2\2\2hl\5\65"+
		"\33\2il\5\67\34\2jl\59\35\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\34\3\2\2\2"+
		"mn\7n\2\2no\7g\2\2op\7v\2\2p\36\3\2\2\2qr\7d\2\2rs\7g\2\2s \3\2\2\2tu"+
		"\7u\2\2uv\7j\2\2vw\7q\2\2wx\7y\2\2x\"\3\2\2\2yz\7r\2\2z{\7t\2\2{|\7q\2"+
		"\2|}\7x\2\2}~\7k\2\2~\177\7f\2\2\177\u0080\7g\2\2\u0080$\3\2\2\2\u0081"+
		"\u0082\7/\2\2\u0082&\3\2\2\2\u0083\u0084\7-\2\2\u0084(\3\2\2\2\u0085\u0086"+
		"\7,\2\2\u0086*\3\2\2\2\u0087\u0088\7\61\2\2\u0088,\3\2\2\2\u0089\u008b"+
		"\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d.\3\2\2\2\u008e\u0090\7/\2\2\u008f\u008e\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\4\62;\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\60\3\2\2\2\u0096\u0098\7/\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u009a\3\2\2\2\u0099\u009b\4\62;\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00b5\3\2\2\2\u009e"+
		"\u00a2\7\60\2\2\u009f\u00a1\4\62;\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a8\7^\2\2\u00a8\u00aa\7\60\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b6\7h\2\2\u00ac\u00ae\7\60"+
		"\2\2\u00ad\u00af\4\62;\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b4\7h"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00a5\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b6\62\3\2\2\2\u00b7\u00b9\7/\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc"+
		"\4\62;\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c7\3\2\2\2\u00bf\u00c1\7\60\2\2\u00c0\u00c2\4"+
		"\62;\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\7f\2\2\u00c6\u00c8\7f\2"+
		"\2\u00c7\u00bf\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\64\3\2\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7\65\2\2\u00cb\u00cc\7\64\2\2\u00cc\66\3\2\2\2\u00cd"+
		"\u00ce\7h\2\2\u00ce\u00cf\7\65\2\2\u00cf\u00d0\7\64\2\2\u00d08\3\2\2\2"+
		"\u00d1\u00d2\7h\2\2\u00d2\u00d3\78\2\2\u00d3\u00d4\7\66\2\2\u00d4:\3\2"+
		"\2\2\u00d5\u00d6\7*\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7\65\2\2\u00d8"+
		"\u00d9\7\64\2\2\u00d9\u00da\7+\2\2\u00da<\3\2\2\2\u00db\u00dc\7*\2\2\u00dc"+
		"\u00dd\7h\2\2\u00dd\u00de\7\65\2\2\u00de\u00df\7\64\2\2\u00df\u00e0\7"+
		"+\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4"+
		"\78\2\2\u00e4\u00e5\7\66\2\2\u00e5\u00e6\7+\2\2\u00e6@\3\2\2\2\u00e7\u00e9"+
		"\7\17\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00eb\7\f\2\2\u00ebB\3\2\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\b\"\2\2\u00f2D\3\2\2\2\25\2k\u008c\u008f\u0094"+
		"\u0097\u009c\u00a2\u00a5\u00a9\u00b0\u00b3\u00b5\u00b8\u00bd\u00c3\u00c7"+
		"\u00e8\u00ef\3\3\"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}