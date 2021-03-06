// Generated from E:/MyGit/workspace/model-slicing/src/grammar\IMCL.g4 by ANTLR 4.7
package ntesec.juli.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class IMCLLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5,
			T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11,
			T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16,
			T__16 = 17, T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21,
			T__21 = 22, T__22 = 23, T__23 = 24, T__24 = 25, T__25 = 26,
			T__26 = 27, T__27 = 28, T__28 = 29, ID = 30, VALUE = 31,
			BOOLEAN = 32, STRING = 33, CALC = 34, RELATION = 35, INVOKE = 36,
			WS = 37;
	public static String[] channelNames = { "DEFAULT_TOKEN_CHANNEL", "HIDDEN" };

	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3",
			"T__4", "T__5", "T__6", "T__7", "T__8", "T__9", "T__10", "T__11",
			"T__12", "T__13", "T__14", "T__15", "T__16", "T__17", "T__18",
			"T__19", "T__20", "T__21", "T__22", "T__23", "T__24", "T__25",
			"T__26", "T__27", "T__28", "ID", "VALUE", "BOOLEAN", "STRING",
			"CALC", "RELATION", "INVOKE", "WS" };

	private static final String[] _LITERAL_NAMES = { null, "'SENSOR'",
			"'DEVICE'", "':'", "','", "';'", "'program'", "'function'", "'('",
			"')'", "'['", "']'", "'{'", "'}'", "'TRIGGER'", "'WHILE'", "'IF'",
			"'ELSIF'", "'ELSE'", "':='", "'RETURN'", "'STOP'", "'PARAM'",
			"'VAR'", "'CHANNEL.DD.'", "'!'", "'?'", "'CHANNEL.CD.'",
			"'DATA.SYNC.'", "'constraint'" };
	private static final String[] _SYMBOLIC_NAMES = { null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, "ID", "VALUE", "BOOLEAN", "STRING", "CALC",
			"RELATION", "INVOKE", "WS" };
	public static final Vocabulary VOCABULARY = new VocabularyImpl(
			_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

	public IMCLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "IMCL.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u012b\b\1\4\2\t"
			+ "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"
			+ "\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"
			+ "\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"
			+ "\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"
			+ "\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"
			+ "\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"
			+ "\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"
			+ "\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"
			+ "\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"
			+ "\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"
			+ "\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u00e8"
			+ "\n\37\f\37\16\37\u00eb\13\37\3 \5 \u00ee\n \3 \6 \u00f1\n \r \16 \u00f2"
			+ "\3 \5 \u00f6\n \3 \6 \u00f9\n \r \16 \u00fa\3!\3!\3!\3!\3!\3!\3!\3!\3"
			+ "!\5!\u0106\n!\3\"\3\"\7\"\u010a\n\"\f\"\16\"\u010d\13\"\3\"\3\"\3#\3#"
			+ "\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u011c\n$\3%\3%\3%\3%\5%\u0122\n%\3&\7&"
			+ "\u0125\n&\f&\16&\u0128\13&\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"
			+ "\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"
			+ "/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\13\5\2C\\a"
			+ "ac|\5\2\62;C\\c|\3\2//\3\2\62;\3\2\60\60\3\2))\6\2\'\',-//\61\61\4\2>"
			+ ">@@\5\2\13\f\17\17\"\"\2\u0137\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"
			+ "\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"
			+ "\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"
			+ "\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"
			+ "+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"
			+ "\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"
			+ "C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5T\3"
			+ "\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17i\3\2\2\2\21r\3"
			+ "\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33|\3\2\2\2\35"
			+ "~\3\2\2\2\37\u0086\3\2\2\2!\u008c\3\2\2\2#\u008f\3\2\2\2%\u0095\3\2\2"
			+ "\2\'\u009a\3\2\2\2)\u009d\3\2\2\2+\u00a4\3\2\2\2-\u00a9\3\2\2\2/\u00af"
			+ "\3\2\2\2\61\u00b3\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2\2\2\67\u00c3\3"
			+ "\2\2\29\u00cf\3\2\2\2;\u00da\3\2\2\2=\u00e5\3\2\2\2?\u00ed\3\2\2\2A\u0105"
			+ "\3\2\2\2C\u0107\3\2\2\2E\u0110\3\2\2\2G\u011b\3\2\2\2I\u0121\3\2\2\2K"
			+ "\u0126\3\2\2\2MN\7U\2\2NO\7G\2\2OP\7P\2\2PQ\7U\2\2QR\7Q\2\2RS\7T\2\2S"
			+ "\4\3\2\2\2TU\7F\2\2UV\7G\2\2VW\7X\2\2WX\7K\2\2XY\7E\2\2YZ\7G\2\2Z\6\3"
			+ "\2\2\2[\\\7<\2\2\\\b\3\2\2\2]^\7.\2\2^\n\3\2\2\2_`\7=\2\2`\f\3\2\2\2a"
			+ "b\7r\2\2bc\7t\2\2cd\7q\2\2de\7i\2\2ef\7t\2\2fg\7c\2\2gh\7o\2\2h\16\3\2"
			+ "\2\2ij\7h\2\2jk\7w\2\2kl\7p\2\2lm\7e\2\2mn\7v\2\2no\7k\2\2op\7q\2\2pq"
			+ "\7p\2\2q\20\3\2\2\2rs\7*\2\2s\22\3\2\2\2tu\7+\2\2u\24\3\2\2\2vw\7]\2\2"
			+ "w\26\3\2\2\2xy\7_\2\2y\30\3\2\2\2z{\7}\2\2{\32\3\2\2\2|}\7\177\2\2}\34"
			+ "\3\2\2\2~\177\7V\2\2\177\u0080\7T\2\2\u0080\u0081\7K\2\2\u0081\u0082\7"
			+ "I\2\2\u0082\u0083\7I\2\2\u0083\u0084\7G\2\2\u0084\u0085\7T\2\2\u0085\36"
			+ "\3\2\2\2\u0086\u0087\7Y\2\2\u0087\u0088\7J\2\2\u0088\u0089\7K\2\2\u0089"
			+ "\u008a\7N\2\2\u008a\u008b\7G\2\2\u008b \3\2\2\2\u008c\u008d\7K\2\2\u008d"
			+ "\u008e\7H\2\2\u008e\"\3\2\2\2\u008f\u0090\7G\2\2\u0090\u0091\7N\2\2\u0091"
			+ "\u0092\7U\2\2\u0092\u0093\7K\2\2\u0093\u0094\7H\2\2\u0094$\3\2\2\2\u0095"
			+ "\u0096\7G\2\2\u0096\u0097\7N\2\2\u0097\u0098\7U\2\2\u0098\u0099\7G\2\2"
			+ "\u0099&\3\2\2\2\u009a\u009b\7<\2\2\u009b\u009c\7?\2\2\u009c(\3\2\2\2\u009d"
			+ "\u009e\7T\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7V\2\2\u00a0\u00a1\7W\2\2"
			+ "\u00a1\u00a2\7T\2\2\u00a2\u00a3\7P\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7U\2"
			+ "\2\u00a5\u00a6\7V\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7R\2\2\u00a8,\3\2"
			+ "\2\2\u00a9\u00aa\7R\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad"
			+ "\7C\2\2\u00ad\u00ae\7O\2\2\u00ae.\3\2\2\2\u00af\u00b0\7X\2\2\u00b0\u00b1"
			+ "\7C\2\2\u00b1\u00b2\7T\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7E\2\2\u00b4\u00b5"
			+ "\7J\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8\7P\2\2\u00b8"
			+ "\u00b9\7G\2\2\u00b9\u00ba\7N\2\2\u00ba\u00bb\7\60\2\2\u00bb\u00bc\7F\2"
			+ "\2\u00bc\u00bd\7F\2\2\u00bd\u00be\7\60\2\2\u00be\62\3\2\2\2\u00bf\u00c0"
			+ "\7#\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7A\2\2\u00c2\66\3\2\2\2\u00c3\u00c4"
			+ "\7E\2\2\u00c4\u00c5\7J\2\2\u00c5\u00c6\7C\2\2\u00c6\u00c7\7P\2\2\u00c7"
			+ "\u00c8\7P\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7N\2\2\u00ca\u00cb\7\60\2"
			+ "\2\u00cb\u00cc\7E\2\2\u00cc\u00cd\7F\2\2\u00cd\u00ce\7\60\2\2\u00ce8\3"
			+ "\2\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7V\2\2\u00d2"
			+ "\u00d3\7C\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7U\2\2\u00d5\u00d6\7[\2"
			+ "\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7E\2\2\u00d8\u00d9\7\60\2\2\u00d9:\3"
			+ "\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7p\2\2\u00dd"
			+ "\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7c\2\2"
			+ "\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4<\3\2\2"
			+ "\2\u00e5\u00e9\t\2\2\2\u00e6\u00e8\t\3\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb"
			+ "\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea>\3\2\2\2\u00eb"
			+ "\u00e9\3\2\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2"
			+ "\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00ef\3\2\2\2\u00f1"
			+ "\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"
			+ "\2\2\u00f4\u00f6\t\6\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"
			+ "\u00f8\3\2\2\2\u00f7\u00f9\t\5\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2"
			+ "\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb@\3\2\2\2\u00fc\u00fd"
			+ "\7V\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7W\2\2\u00ff\u0106\7G\2\2\u0100"
			+ "\u0101\7H\2\2\u0101\u0102\7C\2\2\u0102\u0103\7N\2\2\u0103\u0104\7U\2\2"
			+ "\u0104\u0106\7G\2\2\u0105\u00fc\3\2\2\2\u0105\u0100\3\2\2\2\u0106B\3\2"
			+ "\2\2\u0107\u010b\7)\2\2\u0108\u010a\n\7\2\2\u0109\u0108\3\2\2\2\u010a"
			+ "\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"
			+ "\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7)\2\2\u010fD\3\2\2\2\u0110\u0111"
			+ "\t\b\2\2\u0111F\3\2\2\2\u0112\u011c\t\t\2\2\u0113\u0114\7>\2\2\u0114\u011c"
			+ "\7?\2\2\u0115\u0116\7@\2\2\u0116\u011c\7?\2\2\u0117\u0118\7?\2\2\u0118"
			+ "\u011c\7?\2\2\u0119\u011a\7#\2\2\u011a\u011c\7?\2\2\u011b\u0112\3\2\2"
			+ "\2\u011b\u0113\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0119"
			+ "\3\2\2\2\u011cH\3\2\2\2\u011d\u011e\7>\2\2\u011e\u0122\7>\2\2\u011f\u0120"
			+ "\7@\2\2\u0120\u0122\7@\2\2\u0121\u011d\3\2\2\2\u0121\u011f\3\2\2\2\u0122"
			+ "J\3\2\2\2\u0123\u0125\t\n\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2"
			+ "\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126"
			+ "\3\2\2\2\u0129\u012a\b&\2\2\u012aL\3\2\2\2\r\2\u00e9\u00ed\u00f2\u00f5"
			+ "\u00fa\u0105\u010b\u011b\u0121\u0126\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}