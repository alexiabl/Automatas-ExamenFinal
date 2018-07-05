import java_cup.runtime.*;
%%
%class Lexer
%{
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

%eofval{
    return sym.EOF;
    %eofval}

SPACE_CHAR = [\ \t]+
VARIABLE = [a-z]+[0-9a-zA-Z]*

%%
<YYINITIAL>{
    ","					{System.out.println(yytext());return symbol(COMMA);}
    "("					{System.out.println(yytext());return symbol(LPAREN);}
    ")"					{System.out.println(yytext());return symbol(RPAREN);}
    "{"					{System.out.println(yytext());return symbol(sym.OPENBRACKET);}
    "}"					{System.out.println(yytext());return symbol(sym.CLOSEBRACKET);}
    "["					{System.out.println(yytext());return symbol(sym.LEFTSQ);}
    "]"					{System.out.println(yytext());return symbol(sym.RIGHTSQ);}
    "="					{System.out.println(yytext());return symbol(sym.EQUALS);}
    ";"					{System.out.println(yytext());return symbol(sym.SEMICOLON);}
    "metodo"            {System.out.println(yytext());return symbol(sym.ACTION);}
    "print"             {System.out.println(yytext());return symbol(sym.PRINT,yytext());}
    {VARIABLE}			{System.out.println(yytext());return symbol(sym.VAR,yytext());}
    {SPACE_CHAR} 		{ }
    .					{System.out.println("Unknown symbol");}
}