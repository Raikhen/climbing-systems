// Generated from /Users/dylanfridman/climbing-systems/Lang/Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, CLASS=13, ROUTE_STYLES=14, ROPE_RATINGS=15, 
		ANCHOR_SYSTEMS=16, DRAW_TYPES=17, CARABINER_TYPES=18, PROPER_KNOTS=19, 
		BENDS=20, HITCHES=21, STRING=22, LENGTH=23, ID=24, YDS_GRADE=25, FRENCH_GRADE=26, 
		ANGLE=27, WEIGHT=28, CAM_SIZE=29, WS=30, COMMENT=31, BLOCKCOMMENT=32;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_statement = 2, RULE_func_def = 3, 
		RULE_func_call = 4, RULE_named_param_list = 5, RULE_param_list = 6, RULE_assignment = 7, 
		RULE_declaration = 8, RULE_attribute_list = 9, RULE_attribute_pair = 10, 
		RULE_expr = 11, RULE_list = 12, RULE_tuple = 13, RULE_expr_seq = 14, RULE_attribute = 15, 
		RULE_id = 16, RULE_grade = 17, RULE_constants = 18, RULE_knots = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "func_def", "func_call", "named_param_list", 
			"param_list", "assignment", "declaration", "attribute_list", "attribute_pair", 
			"expr", "list", "tuple", "expr_seq", "attribute", "id", "grade", "constants", 
			"knots"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'define'", "'('", "')'", "'{'", "'}'", "'set'", "','", "'='", 
			"':'", "'.'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CLASS", "ROUTE_STYLES", "ROPE_RATINGS", "ANCHOR_SYSTEMS", "DRAW_TYPES", 
			"CARABINER_TYPES", "PROPER_KNOTS", "BENDS", "HITCHES", "STRING", "LENGTH", 
			"ID", "YDS_GRADE", "FRENCH_GRADE", "ANGLE", "WEIGHT", "CAM_SIZE", "WS", 
			"COMMENT", "BLOCKCOMMENT"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LangParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			block();
			setState(41);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
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
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16785474L) != 0)) {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(48);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				declaration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				func_def();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				func_call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			match(ID);
			setState(57);
			match(T__1);
			setState(58);
			param_list();
			setState(59);
			match(T__2);
			setState(60);
			match(T__3);
			setState(61);
			block();
			setState(62);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public Named_param_listContext named_param_list() {
			return getRuleContext(Named_param_listContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__5);
			setState(65);
			match(ID);
			setState(66);
			match(T__1);
			setState(67);
			named_param_list();
			setState(68);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Named_param_listContext extends ParserRuleContext {
		public Attribute_pairContext attribute_pair() {
			return getRuleContext(Attribute_pairContext.class,0);
		}
		public Named_param_listContext named_param_list() {
			return getRuleContext(Named_param_listContext.class,0);
		}
		public Named_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNamed_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNamed_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNamed_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_param_listContext named_param_list() throws RecognitionException {
		Named_param_listContext _localctx = new Named_param_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_named_param_list);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				attribute_pair();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				attribute_pair();
				setState(72);
				match(T__6);
				setState(73);
				named_param_list();
				}
				break;
			case 3:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Param_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_list);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(ID);
				setState(80);
				match(T__6);
				setState(81);
				param_list();
				}
				break;
			case 3:
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			id();
			setState(86);
			match(T__7);
			setState(87);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(LangParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CLASS);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(90);
				match(ID);
				}
				break;
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(93);
				match(T__3);
				setState(94);
				attribute_list();
				setState(95);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_listContext extends ParserRuleContext {
		public List<Attribute_pairContext> attribute_pair() {
			return getRuleContexts(Attribute_pairContext.class);
		}
		public Attribute_pairContext attribute_pair(int i) {
			return getRuleContext(Attribute_pairContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(99);
				attribute_pair();
				}
				}
				setState(104);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_pairContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Attribute_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAttribute_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAttribute_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAttribute_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_pairContext attribute_pair() throws RecognitionException {
		Attribute_pairContext _localctx = new Attribute_pairContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			attribute();
			setState(106);
			match(T__8);
			setState(107);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public GradeContext grade() {
			return getRuleContext(GradeContext.class,0);
		}
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public TerminalNode LENGTH() { return getToken(LangParser.LENGTH, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode ANGLE() { return getToken(LangParser.ANGLE, 0); }
		public TerminalNode CAM_SIZE() { return getToken(LangParser.CAM_SIZE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(111);
				declaration();
				setState(112);
				match(T__9);
				setState(113);
				attribute();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				tuple();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				grade();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				constants();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(LENGTH);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				match(STRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				match(ANGLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(122);
				match(CAM_SIZE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__10);
			setState(126);
			expr_seq();
			setState(127);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__1);
			setState(130);
			expr_seq();
			setState(131);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_seqContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public Expr_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpr_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpr_seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpr_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_seqContext expr_seq() throws RecognitionException {
		Expr_seqContext _localctx = new Expr_seqContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_seq);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				expr();
				setState(135);
				match(T__6);
				setState(136);
				expr_seq();
				}
				break;
			case 3:
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_id);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__9);
				setState(146);
				id();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GradeContext extends ParserRuleContext {
		public TerminalNode YDS_GRADE() { return getToken(LangParser.YDS_GRADE, 0); }
		public TerminalNode FRENCH_GRADE() { return getToken(LangParser.FRENCH_GRADE, 0); }
		public GradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterGrade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitGrade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitGrade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GradeContext grade() throws RecognitionException {
		GradeContext _localctx = new GradeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_grade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==YDS_GRADE || _la==FRENCH_GRADE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantsContext extends ParserRuleContext {
		public TerminalNode ROUTE_STYLES() { return getToken(LangParser.ROUTE_STYLES, 0); }
		public TerminalNode ROPE_RATINGS() { return getToken(LangParser.ROPE_RATINGS, 0); }
		public TerminalNode ANCHOR_SYSTEMS() { return getToken(LangParser.ANCHOR_SYSTEMS, 0); }
		public TerminalNode DRAW_TYPES() { return getToken(LangParser.DRAW_TYPES, 0); }
		public TerminalNode CARABINER_TYPES() { return getToken(LangParser.CARABINER_TYPES, 0); }
		public KnotsContext knots() {
			return getRuleContext(KnotsContext.class,0);
		}
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constants);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROUTE_STYLES:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(ROUTE_STYLES);
				}
				break;
			case ROPE_RATINGS:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ROPE_RATINGS);
				}
				break;
			case ANCHOR_SYSTEMS:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(ANCHOR_SYSTEMS);
				}
				break;
			case DRAW_TYPES:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(DRAW_TYPES);
				}
				break;
			case CARABINER_TYPES:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(CARABINER_TYPES);
				}
				break;
			case PROPER_KNOTS:
			case BENDS:
			case HITCHES:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				knots();
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

	@SuppressWarnings("CheckReturnValue")
	public static class KnotsContext extends ParserRuleContext {
		public TerminalNode PROPER_KNOTS() { return getToken(LangParser.PROPER_KNOTS, 0); }
		public TerminalNode BENDS() { return getToken(LangParser.BENDS, 0); }
		public TerminalNode HITCHES() { return getToken(LangParser.HITCHES, 0); }
		public KnotsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knots; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterKnots(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitKnots(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitKnots(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnotsContext knots() throws RecognitionException {
		KnotsContext _localctx = new KnotsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_knots);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001 \u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\\\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bb\b\b\u0001\t\u0005\te\b\t\n\t\f\th\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b|\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u008c\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0094\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u009e\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&\u0000\u0002\u0001\u0000\u0019\u001a\u0001\u0000\u0013"+
		"\u0015\u00aa\u0000(\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000"+
		"\u00045\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b@\u0001"+
		"\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000"+
		"\u000eU\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012f"+
		"\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016{\u0001\u0000"+
		"\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0081\u0001\u0000\u0000"+
		"\u0000\u001c\u008b\u0001\u0000\u0000\u0000\u001e\u008d\u0001\u0000\u0000"+
		"\u0000 \u0093\u0001\u0000\u0000\u0000\"\u0095\u0001\u0000\u0000\u0000"+
		"$\u009d\u0001\u0000\u0000\u0000&\u009f\u0001\u0000\u0000\u0000()\u0003"+
		"\u0002\u0001\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000"+
		"\u0000+-\u0003\u0004\u0002\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0003"+
		"\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000016\u0003\u0010\b\u0000"+
		"26\u0003\u0006\u0003\u000036\u0003\b\u0004\u000046\u0003\u000e\u0007\u0000"+
		"51\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000054\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000078\u0005"+
		"\u0001\u0000\u000089\u0005\u0018\u0000\u00009:\u0005\u0002\u0000\u0000"+
		":;\u0003\f\u0006\u0000;<\u0005\u0003\u0000\u0000<=\u0005\u0004\u0000\u0000"+
		"=>\u0003\u0002\u0001\u0000>?\u0005\u0005\u0000\u0000?\u0007\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0006\u0000\u0000AB\u0005\u0018\u0000\u0000BC\u0005"+
		"\u0002\u0000\u0000CD\u0003\n\u0005\u0000DE\u0005\u0003\u0000\u0000E\t"+
		"\u0001\u0000\u0000\u0000FM\u0003\u0014\n\u0000GH\u0003\u0014\n\u0000H"+
		"I\u0005\u0007\u0000\u0000IJ\u0003\n\u0005\u0000JM\u0001\u0000\u0000\u0000"+
		"KM\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NT\u0005"+
		"\u0018\u0000\u0000OP\u0005\u0018\u0000\u0000PQ\u0005\u0007\u0000\u0000"+
		"QT\u0003\f\u0006\u0000RT\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000"+
		"SO\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\r\u0001\u0000\u0000"+
		"\u0000UV\u0003 \u0010\u0000VW\u0005\b\u0000\u0000WX\u0003\u0016\u000b"+
		"\u0000X\u000f\u0001\u0000\u0000\u0000Y[\u0005\r\u0000\u0000Z\\\u0005\u0018"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\a\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0004\u0000\u0000^_\u0003\u0012\t\u0000_`\u0005"+
		"\u0005\u0000\u0000`b\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000\u0000ce\u0003\u0014"+
		"\n\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0013\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ij\u0003\u001e\u000f\u0000jk\u0005\t\u0000\u0000"+
		"kl\u0003\u0016\u000b\u0000l\u0015\u0001\u0000\u0000\u0000m|\u0003 \u0010"+
		"\u0000n|\u0003\u0010\b\u0000op\u0003\u0010\b\u0000pq\u0005\n\u0000\u0000"+
		"qr\u0003\u001e\u000f\u0000r|\u0001\u0000\u0000\u0000s|\u0003\u0018\f\u0000"+
		"t|\u0003\u001a\r\u0000u|\u0003\"\u0011\u0000v|\u0003$\u0012\u0000w|\u0005"+
		"\u0017\u0000\u0000x|\u0005\u0016\u0000\u0000y|\u0005\u001b\u0000\u0000"+
		"z|\u0005\u001d\u0000\u0000{m\u0001\u0000\u0000\u0000{n\u0001\u0000\u0000"+
		"\u0000{o\u0001\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000{t\u0001\u0000"+
		"\u0000\u0000{u\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000{w\u0001"+
		"\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u0017\u0001\u0000\u0000\u0000}~\u0005\u000b"+
		"\u0000\u0000~\u007f\u0003\u001c\u000e\u0000\u007f\u0080\u0005\f\u0000"+
		"\u0000\u0080\u0019\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0002\u0000"+
		"\u0000\u0082\u0083\u0003\u001c\u000e\u0000\u0083\u0084\u0005\u0003\u0000"+
		"\u0000\u0084\u001b\u0001\u0000\u0000\u0000\u0085\u008c\u0003\u0016\u000b"+
		"\u0000\u0086\u0087\u0003\u0016\u000b\u0000\u0087\u0088\u0005\u0007\u0000"+
		"\u0000\u0088\u0089\u0003\u001c\u000e\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000"+
		"\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0018\u0000"+
		"\u0000\u008e\u001f\u0001\u0000\u0000\u0000\u008f\u0094\u0005\u0018\u0000"+
		"\u0000\u0090\u0091\u0005\u0018\u0000\u0000\u0091\u0092\u0005\n\u0000\u0000"+
		"\u0092\u0094\u0003 \u0010\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093"+
		"\u0090\u0001\u0000\u0000\u0000\u0094!\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0007\u0000\u0000\u0000\u0096#\u0001\u0000\u0000\u0000\u0097\u009e\u0005"+
		"\u000e\u0000\u0000\u0098\u009e\u0005\u000f\u0000\u0000\u0099\u009e\u0005"+
		"\u0010\u0000\u0000\u009a\u009e\u0005\u0011\u0000\u0000\u009b\u009e\u0005"+
		"\u0012\u0000\u0000\u009c\u009e\u0003&\u0013\u0000\u009d\u0097\u0001\u0000"+
		"\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000"+
		"\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e%\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0007\u0001\u0000\u0000\u00a0\'\u0001\u0000\u0000\u0000"+
		"\u000b.5LS[af{\u008b\u0093\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}