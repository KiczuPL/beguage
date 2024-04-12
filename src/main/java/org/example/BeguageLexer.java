package org.example;// Generated from Beguage.g4 by ANTLR 4.9.2
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
		FLOAT64_KEYWORD=15, CONV_INT=16, CONV_FLOAT32=17, CONV_FLOAT64=18, NEWLINE=19, 
		ADD=20, SUB=21, MUL=22, DIV=23, WS=24;
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
			"FLOAT64_KEYWORD", "CONV_INT", "CONV_FLOAT32", "CONV_FLOAT64", "NEWLINE", 
			"ADD", "SUB", "MUL", "DIV", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "' as '", null, "'let'", "'be'", "'show'", "'provide'", 
			null, null, null, null, "'i32'", "'f32'", "'f64'", "'(i32)'", "'(f32)'", 
			"'(f64)'", null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE_AS", "READ_TYPE", "PRE_ASSIGN", "ASSIGN", "WRITE", 
			"READ", "ID", "INT", "FLOAT32", "FLOAT64", "INT_KEYWORD", "FLOAT32_KEYWORD", 
			"FLOAT64_KEYWORD", "CONV_INT", "CONV_FLOAT32", "CONV_FLOAT64", "NEWLINE", 
			"ADD", "SUB", "MUL", "DIV", "WS"
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
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5@\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\6\nW\n\n\r\n\16\nX\3\13\5\13\\\n\13\3\13\6\13_\n\13\r\13\16\13"+
		"`\3\f\5\fd\n\f\3\f\6\fg\n\f\r\f\16\fh\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f"+
		"\5\fr\n\f\3\f\3\f\5\fv\n\f\3\f\3\f\3\f\6\f{\n\f\r\f\16\f|\3\f\5\f\u0080"+
		"\n\f\5\f\u0082\n\f\3\r\5\r\u0085\n\r\3\r\6\r\u0088\n\r\r\r\16\r\u0089"+
		"\3\r\3\r\6\r\u008e\n\r\r\r\16\r\u008f\3\r\3\r\5\r\u0094\n\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\5\24\u00b5\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\6\31\u00c2\n\31\r\31\16\31\u00c3\3\31\3\31\2\2\32\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\3\2\4\4\2C\\c|\4\2\13\13\"\"\2\u00d9\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t?\3\2\2\2\13A\3"+
		"\2\2\2\rE\3\2\2\2\17H\3\2\2\2\21M\3\2\2\2\23V\3\2\2\2\25[\3\2\2\2\27c"+
		"\3\2\2\2\31\u0084\3\2\2\2\33\u0095\3\2\2\2\35\u0099\3\2\2\2\37\u009d\3"+
		"\2\2\2!\u00a1\3\2\2\2#\u00a7\3\2\2\2%\u00ad\3\2\2\2\'\u00b4\3\2\2\2)\u00b8"+
		"\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c1\3\2\2\2"+
		"\63\64\7*\2\2\64\4\3\2\2\2\65\66\7+\2\2\66\6\3\2\2\2\678\7\"\2\289\7c"+
		"\2\29:\7u\2\2:;\7\"\2\2;\b\3\2\2\2<@\5\33\16\2=@\5\35\17\2>@\5\37\20\2"+
		"?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\n\3\2\2\2AB\7n\2\2BC\7g\2\2CD\7v\2\2D"+
		"\f\3\2\2\2EF\7d\2\2FG\7g\2\2G\16\3\2\2\2HI\7u\2\2IJ\7j\2\2JK\7q\2\2KL"+
		"\7y\2\2L\20\3\2\2\2MN\7r\2\2NO\7t\2\2OP\7q\2\2PQ\7x\2\2QR\7k\2\2RS\7f"+
		"\2\2ST\7g\2\2T\22\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\24\3\2\2\2Z\\\7/\2\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\4\62;\2"+
		"^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\26\3\2\2\2bd\7/\2\2cb\3\2\2"+
		"\2cd\3\2\2\2df\3\2\2\2eg\4\62;\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2i\u0081\3\2\2\2jn\7\60\2\2km\4\62;\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2n"+
		"o\3\2\2\2or\3\2\2\2pn\3\2\2\2qj\3\2\2\2qr\3\2\2\2ru\3\2\2\2st\7^\2\2t"+
		"v\7\60\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2w\u0082\7h\2\2xz\7\60\2\2y{\4"+
		"\62;\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\7h"+
		"\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081q\3\2\2\2"+
		"\u0081x\3\2\2\2\u0082\30\3\2\2\2\u0083\u0085\7/\2\2\u0084\u0083\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\4\62;\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0093\3\2\2\2\u008b\u008d\7\60\2\2\u008c\u008e\4\62;\2\u008d\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0094\7f\2\2\u0092\u0094\7f\2\2\u0093\u008b\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\32\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097"+
		"\7\65\2\2\u0097\u0098\7\64\2\2\u0098\34\3\2\2\2\u0099\u009a\7h\2\2\u009a"+
		"\u009b\7\65\2\2\u009b\u009c\7\64\2\2\u009c\36\3\2\2\2\u009d\u009e\7h\2"+
		"\2\u009e\u009f\78\2\2\u009f\u00a0\7\66\2\2\u00a0 \3\2\2\2\u00a1\u00a2"+
		"\7*\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7\65\2\2\u00a4\u00a5\7\64\2\2\u00a5"+
		"\u00a6\7+\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\u00aa\7\65\2\2\u00aa\u00ab\7\64\2\2\u00ab\u00ac\7+\2\2\u00ac$\3\2\2\2"+
		"\u00ad\u00ae\7*\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\78\2\2\u00b0\u00b1"+
		"\7\66\2\2\u00b1\u00b2\7+\2\2\u00b2&\3\2\2\2\u00b3\u00b5\7\17\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\f"+
		"\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7/\2"+
		"\2\u00bb,\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd.\3\2\2\2\u00be\u00bf\7\61\2"+
		"\2\u00bf\60\3\2\2\2\u00c0\u00c2\t\3\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\b\31\2\2\u00c6\62\3\2\2\2\25\2?X[`chnqu|\177\u0081\u0084\u0089"+
		"\u008f\u0093\u00b4\u00c3\3\3\31\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}