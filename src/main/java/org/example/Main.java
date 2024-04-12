package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.BitSet;


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            ANTLRFileStream input = new ANTLRFileStream(args[0]);

            BeguageLexer lexer = buildLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BeguageParser parser = new BeguageParser(tokens);

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.exit(-1);
            }
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new LLVMActions(), tree);
            System.exit(0);

        } catch (RecognitionException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(-1);
        }
    }


    private static BeguageLexer buildLexer(ANTLRFileStream input) {
        BeguageLexer lexer = new BeguageLexer(input);
        lexer.removeErrorListeners(); // Usunięcie domyślnych słuchaczy błędów
        lexer.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Lexer error at " + line + ":" + charPositionInLine + " - " + msg);
                System.exit(-1); // Zakończenie programu ze statusem -1
            }

            @Override
            public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
            }

            @Override
            public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
            }

            @Override
            public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
            }
        });
        return lexer;
    }


}