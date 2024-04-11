package beguage;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);

        BeguageLexer lexer = new beguageLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BeguageParser parser = new beguageParser(tokens);

        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}