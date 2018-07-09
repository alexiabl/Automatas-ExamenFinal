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
            String directory = System.getProperty("user.dir");
            String path = directory + "/" + args[0];
            File file = new File(path);
            LexerErrors lexerErrors = new LexerErrors(new FileReader(file.getPath()));
            lexerErrors.yylex();
            parser parser = new parser(new Lexer(new FileReader(file.getPath())));
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

