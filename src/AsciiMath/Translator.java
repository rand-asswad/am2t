package AsciiMath;

/* local imports */
import AsciiMath.antlr.AMLexer;
import AsciiMath.antlr.AMParser;
import AsciiMath.tex.Visitor;

/* antlr4 imports */
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/* java imports */
import java.util.Arrays;
import java.util.List;

public class Translator {
    private AMLexer lexer;
    private CommonTokenStream tokens;
    private AMParser parser;
    private ParseTree tree;

    private Translator(CharStream input) {
        lexer = new AMLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new AMParser(tokens);
        tree = parser.e();
    }

    private void exportTree(String fileName) {
        List<String> rules = Arrays.asList(parser.getRuleNames());
        TreeViewer viewer = new TreeViewer(rules, tree);
        IO.saveTreeImg(viewer, fileName);
    }

    public static void main(String[] args) throws Exception {
        // parse args
        CharStream input;
        String treeImg = null;
        if (args.length > 0) {
            input = CharStreams.fromFileName(args[0]);
            if (args.length > 1) treeImg = args[1];
            else treeImg = args[0].substring(0, args[0].lastIndexOf('.')) + ".png";
        } else {
            input = CharStreams.fromStream(System.in);
        }

        // run
        Translator t = new Translator(input);
        Visitor texifier = new Visitor("grammar/dictionary.csv");
        String tex = texifier.visit(t.tree);
        System.out.println(tex);

        if (treeImg != null) t.exportTree(treeImg);
    }
}
