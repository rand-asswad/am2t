// Generated from /mnt/data/projects/am2t/grammar/AM.g4 by ANTLR 4.7.2
package AsciiMath.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code append}
	 * labeled alternative in {@link AMParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(AMParser.AppendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code super}
	 * labeled alternative in {@link AMParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper(AMParser.SuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link AMParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(AMParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subSup}
	 * labeled alternative in {@link AMParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSup(AMParser.SubSupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple}
	 * labeled alternative in {@link AMParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple(AMParser.SimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code frac}
	 * labeled alternative in {@link AMParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrac(AMParser.FracContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constParse}
	 * labeled alternative in {@link AMParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstParse(AMParser.ConstParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AMParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(AMParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link AMParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(AMParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link AMParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(AMParser.BinaryContext ctx);
}