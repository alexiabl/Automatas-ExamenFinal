package ci1322.compiler;



%%
%standalone
%class LexerErrors
%line
%column


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
ERROR = [0-9|A-Z|a-z]*([\!-\&]|\:|\?|\@|\^|\.)+[0-9|A-Z|a-z]*



%%
<YYINITIAL>{

{COMMA} {

    }

{EQUALS} {

    }

{LEFTPAR} {

    }

{RIGHTPAR} {

    }

{LEFTSQ} {

    }

{RIGHTSQ} {

    }

{LEFTBRACKET} {

    }

{RIGHTBRACKET} {

    }

{LESS_THAN} {

    }

{CLASS_BLOCK} {

    }

{PRINT} {

    }

{READ} {

    }

{RETURN} {

    }

{INT_TYPE} {


    }

{FUNCTION} {

   }

{FOR} {

   }

{ARRAY} {

    }

{NUM} {

	 	}


{N_VAR} {

	 	}

{EOS} {

    }

{LINES} { }

{WHITESPACE} { }

{ERROR} {
    System.out.println("Lexical error on "+yytext() + " line: "+yyline + " column: "+yycolumn);
    }

}

