package ci1322.compiler;

import ci1322.compiler.structure.Container;
import ci1322.compiler.structure.function.Function;

import java.io.File;
import java.io.FileReader;

/**
 * Created by alexiaborchgrevink on 7/4/18.
 */
public class Main {


    public static void main( String[] args )
    {
        try {
            File file = new File("/Users/alexiaborchgrevink/Desktop/Automatas/ExamenFinal/final-exam-b51162/src/main/java/ci1322/compiler/input.txt");
            parser parser = new parser(new Lexer(new FileReader(file)));
            LexerErrors lexerErrors = new LexerErrors(new FileReader(file));
            lexerErrors.yylex();
            Container container = (Container) parser.parse().value;
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(container);
            semanticAnalyzer.validateNumVariables();
            semanticAnalyzer.fillSymbolsTable();
            semanticAnalyzer.checkVariableAssignment();
            semanticAnalyzer.printGlobalSymbolsTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

