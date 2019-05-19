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
		OVER=1, SUB=2, SUPER=3, U=4, B=5, L=6, R=7, WS=8, NEWLINE=9, C=10, NUMBER=11, 
		DECIMAL=12, INT=13, DIGIT=14, LETTER=15, LATIN=16, GREEK=17, SYMBOL=18, 
		SIMPLE_SYM=19, RELATION_SYM=20, ARROW=21, LOGICAL=22, OP_SYM=23, DOTS=24, 
		LARGE_OP=25, NUM_SET=26, SINGLE_DLM=27, SPACE=28, STANDARD_FUNC=29, DIFF=30;
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'quad'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OVER", "SUB", "SUPER", "U", "B", "L", "R", "WS", "NEWLINE", "C", 
			"NUMBER", "DECIMAL", "INT", "DIGIT", "LETTER", "LATIN", "GREEK", "SYMBOL", 
			"SIMPLE_SYM", "RELATION_SYM", "ARROW", "LOGICAL", "OP_SYM", "DOTS", "LARGE_OP", 
			"NUM_SET", "SINGLE_DLM", "SPACE", "STANDARD_FUNC", "DIFF"
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

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_e);
		int _la;
		try {
			_localctx = new AppendContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			i(0);
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << U) | (1L << B) | (1L << L) | (1L << C))) != 0)) {
				{
				setState(7);
				e();
				}
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
	public static class FracContext extends IContext {
		public List<IContext> i() {
			return getRuleContexts(IContext.class);
		}
		public IContext i(int i) {
			return getRuleContext(IContext.class,i);
		}
		public TerminalNode OVER() { return getToken(AMParser.OVER, 0); }
		public FracContext(IContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AMVisitor ) return ((AMVisitor<? extends T>)visitor).visitFrac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IContext i() throws RecognitionException {
		return i(0);
	}

	private IContext i(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IContext _localctx = new IContext(_ctx, _parentState);
		IContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_i, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(11);
				s();
				}
				break;
			case 2:
				{
				_localctx = new SubContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				s();
				setState(13);
				match(SUB);
				setState(14);
				s();
				}
				break;
			case 3:
				{
				_localctx = new SuperContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				s();
				setState(17);
				match(SUPER);
				setState(18);
				s();
				}
				break;
			case 4:
				{
				_localctx = new SubSupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				s();
				setState(21);
				match(SUB);
				setState(22);
				s();
				setState(23);
				match(SUPER);
				setState(24);
				s();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FracContext(new IContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_i);
					setState(28);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(29);
					match(OVER);
					setState(30);
					i(2);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				_localctx = new ConstParseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(C);
				}
				break;
			case L:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(L);
				setState(38);
				e();
				setState(39);
				match(R);
				}
				break;
			case U:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(U);
				setState(42);
				s();
				}
				break;
			case B:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(B);
				setState(44);
				s();
				setState(45);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return i_sempred((IContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean i_sempred(IContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \64\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\2\3\4\5"+
		"\2\4\6\2\2\28\2\b\3\2\2\2\4\34\3\2\2\2\6\61\3\2\2\2\b\n\5\4\3\2\t\13\5"+
		"\2\2\2\n\t\3\2\2\2\n\13\3\2\2\2\13\3\3\2\2\2\f\r\b\3\1\2\r\35\5\6\4\2"+
		"\16\17\5\6\4\2\17\20\7\4\2\2\20\21\5\6\4\2\21\35\3\2\2\2\22\23\5\6\4\2"+
		"\23\24\7\5\2\2\24\25\5\6\4\2\25\35\3\2\2\2\26\27\5\6\4\2\27\30\7\4\2\2"+
		"\30\31\5\6\4\2\31\32\7\5\2\2\32\33\5\6\4\2\33\35\3\2\2\2\34\f\3\2\2\2"+
		"\34\16\3\2\2\2\34\22\3\2\2\2\34\26\3\2\2\2\35#\3\2\2\2\36\37\f\3\2\2\37"+
		" \7\3\2\2 \"\5\4\3\4!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2"+
		"\2\2%#\3\2\2\2&\62\7\f\2\2\'(\7\b\2\2()\5\2\2\2)*\7\t\2\2*\62\3\2\2\2"+
		"+,\7\6\2\2,\62\5\6\4\2-.\7\7\2\2./\5\6\4\2/\60\5\6\4\2\60\62\3\2\2\2\61"+
		"&\3\2\2\2\61\'\3\2\2\2\61+\3\2\2\2\61-\3\2\2\2\62\7\3\2\2\2\6\n\34#\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}