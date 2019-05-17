// Generated from /mnt/data/projects/am2t/grammar/AM.g4 by ANTLR 4.7.2
package AsciiMath.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OVER=1, SUB=2, SUPER=3, U=4, B=5, L=6, R=7, WS=8, C=9, INT=10, LATIN=11, 
		GREEK=12, SIMPLE_SYM=13, RELATION_SYM=14, ARROW=15, LOGICAL=16, OP_SYM=17, 
		DOTS=18, LARGE_OP=19, NUM_SET=20, SINGLE_DLM=21, SPACE=22, STANDARD_FUNC=23;
	public static final int
		RULE_e = 0, RULE_i = 1, RULE_s = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"e", "i", "s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'_'", "'^'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'quad'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OVER", "SUB", "SUPER", "U", "B", "L", "R", "WS", "C", "INT", "LATIN", 
			"GREEK", "SIMPLE_SYM", "RELATION_SYM", "ARROW", "LOGICAL", "OP_SYM", 
			"DOTS", "LARGE_OP", "NUM_SET", "SINGLE_DLM", "SPACE", "STANDARD_FUNC"
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
	public String getGrammarFileName() { return "AM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AppendContext extends EContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public AppendContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FracContext extends EContext {
		public List<IContext> i() {
			return getRuleContexts(IContext.class);
		}
		public IContext i(int i) {
			return getRuleContext(IContext.class,i);
		}
		public TerminalNode OVER() { return getToken(AMParser.OVER, 0); }
		public FracContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitFrac(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyContext extends EContext {
		public EmptyContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_e);
		try {
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AppendContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				i();
				setState(7);
				e();
				}
				break;
			case 2:
				_localctx = new FracContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				i();
				setState(10);
				match(OVER);
				setState(11);
				i();
				}
				break;
			case 3:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class IContext extends ParserRuleContext {
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
	 
		public IContext() { }
		public void copyFrom(IContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SuperContext extends IContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode SUPER() { return getToken(AMParser.SUPER, 0); }
		public SuperContext(IContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitSuper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends IContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode SUB() { return getToken(AMParser.SUB, 0); }
		public SubContext(IContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubSupContext extends IContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode SUB() { return getToken(AMParser.SUB, 0); }
		public TerminalNode SUPER() { return getToken(AMParser.SUPER, 0); }
		public SubSupContext(IContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitSubSup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleContext extends IContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public SimpleContext(IContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_i);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				s();
				}
				break;
			case 2:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				s();
				setState(18);
				match(SUB);
				setState(19);
				s();
				}
				break;
			case 3:
				_localctx = new SuperContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				s();
				setState(22);
				match(SUPER);
				setState(23);
				s();
				}
				break;
			case 4:
				_localctx = new SubSupContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				s();
				setState(26);
				match(SUB);
				setState(27);
				s();
				setState(28);
				match(SUPER);
				setState(29);
				s();
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

	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	 
		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends SContext {
		public TerminalNode L() { return getToken(AMParser.L, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode R() { return getToken(AMParser.R, 0); }
		public ParensContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryContext extends SContext {
		public TerminalNode B() { return getToken(AMParser.B, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public BinaryContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstParseContext extends SContext {
		public TerminalNode C() { return getToken(AMParser.C, 0); }
		public ConstParseContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitConstParse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends SContext {
		public TerminalNode U() { return getToken(AMParser.U, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public UnaryContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				_localctx = new ConstParseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(C);
				}
				break;
			case L:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(L);
				setState(35);
				e();
				setState(36);
				match(R);
				}
				break;
			case U:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(U);
				setState(39);
				s();
				}
				break;
			case B:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(B);
				setState(41);
				s();
				setState(42);
				s();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\2\2\5\2\4\6\2\2\2\65\2\20"+
		"\3\2\2\2\4!\3\2\2\2\6.\3\2\2\2\b\t\5\4\3\2\t\n\5\2\2\2\n\21\3\2\2\2\13"+
		"\f\5\4\3\2\f\r\7\3\2\2\r\16\5\4\3\2\16\21\3\2\2\2\17\21\3\2\2\2\20\b\3"+
		"\2\2\2\20\13\3\2\2\2\20\17\3\2\2\2\21\3\3\2\2\2\22\"\5\6\4\2\23\24\5\6"+
		"\4\2\24\25\7\4\2\2\25\26\5\6\4\2\26\"\3\2\2\2\27\30\5\6\4\2\30\31\7\5"+
		"\2\2\31\32\5\6\4\2\32\"\3\2\2\2\33\34\5\6\4\2\34\35\7\4\2\2\35\36\5\6"+
		"\4\2\36\37\7\5\2\2\37 \5\6\4\2 \"\3\2\2\2!\22\3\2\2\2!\23\3\2\2\2!\27"+
		"\3\2\2\2!\33\3\2\2\2\"\5\3\2\2\2#/\7\13\2\2$%\7\b\2\2%&\5\2\2\2&\'\7\t"+
		"\2\2\'/\3\2\2\2()\7\6\2\2)/\5\6\4\2*+\7\7\2\2+,\5\6\4\2,-\5\6\4\2-/\3"+
		"\2\2\2.#\3\2\2\2.$\3\2\2\2.(\3\2\2\2.*\3\2\2\2/\7\3\2\2\2\5\20!.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}