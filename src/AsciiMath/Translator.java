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
import java.io.*;
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

    private static void exportTex(String fileName, String tex) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(tex);
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        // parse args
        CharStream input;
        String output = null;
        String treeImg = null;
        if (args.length > 0) {
            input = CharStreams.fromFileName(args[0]);
            if (args.length > 1) {
                output = args[1];
                if (args.length > 2) treeImg = args[2];
            }
        } else {
            input = CharStreams.fromStream(System.in);
        }

        // run
        Translator t = new Translator(input);
        Visitor texifier = new Visitor("grammar/dictionary.csv");
        String tex = texifier.visit(t.tree);

        if (output == null) System.out.println(tex);
        else exportTex(output, tex);
        
        if (treeImg != null) t.exportTree(treeImg);
    }
}
