package ci1322.compiler;

import java_cup.runtime.*;


%%

%class Lexer
%line
%column
%cup
%{

    private Symbol symbols(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Also creates a new java_cup.runtime.application.symboltable.application.symboltable.Symbols with information
       about the current token, but this object has a value. */
     private Symbol symbols(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    //public static java.util.LinkedList<TError> lexicalErrors = new java.util.LinkedList<TError>();



%}


NUM =	-?[0-9]+
N_VAR = ([a-z]|[A-Z])+((\_)*([a-z]|[A-Z]|[0-9])+)*
LESS_THAN = ("<")
COMMA = (",")
EQUALS = ("=")
LEFTPAR = ("(")
RIGHTPAR = (")")
LEFTSQ = ("[")
RIGHTSQ = ("]")
LEFTBRACKET= ("{")
RIGHTBRACKET= ("}")
FUNCTION="function"
EOS = (";")
FOR = "for"
READ = "read"
ARRAY = "Array"
INT_TYPE = "int"
RETURN = "return"
PRINT = "print"
LINES  = \r|\n|\r\n
WHITESPACE = {LINES} | [ \t\f]
CLASS_BLOCK = "class"


%%
<YYINITIAL>{

{COMMA} {
     System.out.println("Found match COMMA "+yytext()+" at line "+yyline+", column"+yycolumn);
     	return symbols(sym.COMMA);
    }

{EQUALS} {
    System.out.println("Found match EQUALS "+yytext()+" at line "+yyline+", column"+yycolumn);
          	return symbols(sym.EQUALS);
    }

{LEFTPAR} {
    System.out.println("Found match LEFTPAR "+yytext()+" at line "+yyline+", column"+yycolumn);
     	return symbols(sym.LEFTPAR);
    }

{RIGHTPAR} {
    System.out.println("Found match RIGHTPAR "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.RIGHTPAR);
    }

{LEFTSQ} {
    System.out.println("Found match LEFTSQ "+yytext()+" at line "+yyline+", column"+yycolumn);
     	return symbols(sym.LEFTSQ);
    }

{RIGHTSQ} {
    System.out.println("Found match RIGHTSQ "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.RIGHTSQ);
    }

{LEFTBRACKET} {
    System.out.println("Found match LEFTBRACKET "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.LEFTBRACKET);
    }

{RIGHTBRACKET} {
    System.out.println("Found match RIGHTBRACKET "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.RIGHTBRACKET);
    }

{LESS_THAN} {
        System.out.println("Found match LESS_THAN "+yytext()+" at line "+yyline+", column"+yycolumn);
          return symbols(sym.LESS_THAN);
    }

{CLASS_BLOCK} {
    System.out.println("Found match CLASS_BLOCK "+yytext()+" at line "+yyline+", column"+yycolumn);
              return symbols(sym.CLASS_BLOCK);
    }

{PRINT} {
        System.out.println("Found match PRINT "+yytext()+" at line "+yyline+", column"+yycolumn);
          return symbols(sym.PRINT);
    }

{READ} {
        System.out.println("Found match READ "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.READ);
    }

{RETURN} {
    System.out.println("Found match RETURN "+yytext()+" at line "+yyline+", column"+yycolumn);
            return symbols(sym.RETURN);
    }

{INT_TYPE} {
    System.out.println("Found match INT_TYPE "+yytext()+" at line "+yyline+", column"+yycolumn);
                return symbols(sym.INT_TYPE);

    }

{FUNCTION} {
            System.out.println("Found match FUNCTION "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.FUNCTION);
   }

{FOR} {
     	System.out.println("Found match FOR "+yytext()+" at line "+yyline+", column"+yycolumn);
       return symbols(sym.FOR);
   }

{ARRAY} {
     	System.out.println("Found match ARRAY "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.ARRAY);
    }

{NUM} {
 		System.out.println("Found match NUM "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.NUM, new Integer(yytext()));
	 	}


{N_VAR} {
 		System.out.println("Found match N_VAR "+yytext()+" at line "+yyline+", column"+yycolumn);
        return symbols(sym.N_VAR, new String(yytext()));
	 	}

{EOS} {
    System.out.println("Found match END_OF_STATEMENT "+yytext()+" at line "+yyline+", column"+yycolumn);
            return symbols(sym.EOS, new String(yytext()));
    }

{LINES} { }

{WHITESPACE} {}

}

