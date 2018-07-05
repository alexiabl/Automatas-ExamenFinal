package ci1322.compiler;

import java_cup.runtime.*;


%%
%standalone
%class LexerErrors
%line
%column
%{

    public static java.util.LinkedList<TError> lexicalErrors = new java.util.LinkedList<TError>();



%}

ERROR_1 = \p{Alpha}\{Digit}+(\@)*



%%
<YYINITIAL>{

{ERROR_1} {
    System.out.println("Lexical error on "+yytext()+" at line "+yyline+", column"+yycolumn+", invalid caracter");
    }

. {}

}

