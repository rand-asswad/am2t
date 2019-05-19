package AsciiMath.tex;

import AsciiMath.antlr.AMBaseVisitor;
import AsciiMath.antlr.AMParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends AMBaseVisitor<String> {
    Dictionary dictionary;

    public Visitor(String dictionaryPath) {
        super();
        this.dictionary = new Dictionary(dictionaryPath);
    }

    @Override
    public String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;

        return aggregate + " " + nextResult;
    }

    @Override
    public String visitConstParse(AMParser.ConstParseContext ctx) {
        return dictionary.getConst(ctx.C().getText());
    }

    @Override
    public String visitParens(AMParser.ParensContext ctx) {
        String left = dictionary.getLeft(ctx.L().getText());
        String right = dictionary.getRight(ctx.R().getText());

        ParserRuleContext parent = ctx.getParent();
        RuleContext parentCtx = parent.getRuleContext();

        if ((parentCtx.getParent().getRuleContext() instanceof AMParser.FracContext)
            ||(parentCtx instanceof AMParser.UnaryContext)
            ||(parentCtx instanceof AMParser.BinaryContext)) {
            return visit(ctx.e());
        }

        if (parentCtx instanceof AMParser.IContext) {
            if ((parentCtx instanceof AMParser.SimpleContext)
                ||(parent.getChild(0).equals(ctx))) {
                return left + visit(ctx.e()) + right;
            }
        }
        return "{" + visit(ctx.e()) + "}";
    }

    @Override
    public String visitUnary(AMParser.UnaryContext ctx) {
        return dictionary.getConst(ctx.U().getText()) + "{" + visit(ctx.s()) + "}";
    }

    @Override
    public String visitBinary(AMParser.BinaryContext ctx) {
        if (ctx.B().getText().equals("root"))
            return "\\sqrt[" + visit(ctx.s(0)) + "]{" + visit(ctx.s(1)) + "}";
        return dictionary.getConst(ctx.B().getText()) + "{" + visit(ctx.s(0))
                + "}{" + visit(ctx.s(1)) + "}";
    }

    @Override
    public String visitFrac(AMParser.FracContext ctx) {
        return "\\frac{" + visit(ctx.i(0)) + "}{" + visit(ctx.i(1)) + "}";
    }

    @Override
    public String visitSub(AMParser.SubContext ctx) {
        return visit(ctx.s(0)) + "_" + visit(ctx.s(1));
    }

    @Override
    public String visitSuper(AMParser.SuperContext ctx) {
        return visit(ctx.s(0)) + "^" + visit(ctx.s(1));
    }

    @Override
    public String visitSubSup(AMParser.SubSupContext ctx) {
        return visit(ctx.s(0)) + "_" + visit(ctx.s(1)) + "^" + visit(ctx.s(2));
    }
}
