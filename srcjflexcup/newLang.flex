
package esercitazione5;
import java_cup.runtime.Symbol; //This is how we pass tokens to the parser

%%
// Declarations for JFlex
%unicode // We wish to read text files

%cup // Declare that we expect to use Java CUP

%{

StringBuffer string = new StringBuffer();
%}

// Abbreviations for regular expressions

 /* comments */

LineTerminator = \r|\n|\r\n
 InputCharacter = [^\r\n]
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "|*" [^*] ~"|" | "|*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "||" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

whitespace = [ \r\n\t\f]

symbol = [$_A-Za-z]
all_symbol = [$_A-Za-z0-9]
digit =[0-9]
integer = {digit}+
real = {digit}+("."{digit}+)?
id = {symbol}({all_symbol})*

%state STRING
%state COMMENTS
%state CHAR
%%
<YYINITIAL>{
// Now for the actual tokens and assocated actions
"start:" { return new Symbol(sym.MAIN) ; }
";" { return new Symbol(sym.SEMI); }
","  { return new Symbol(sym.COMMA); }
"|"  { return new Symbol(sym.PIPE); }
"var" { return new Symbol(sym.VAR);}
"integer" { return new Symbol(sym.INTEGER);}
"real" { return new Symbol(sym.REAL);}
"string" { return new Symbol(sym.STRING);}
"boolean" { return new Symbol(sym.BOOL);}
"char" { return new Symbol(sym.CHAR);}
"void"  { return new Symbol(sym.VOID);}

"let"  { return new Symbol(sym.LET);}
"end"  { return new Symbol(sym.END);}
"in"  { return new Symbol(sym.IN);}



"def"  { return new Symbol(sym.DEF);}
"out"   { return new Symbol(sym.OUT);}
"for"  { return new Symbol(sym.FOR);}
"if"  { return new Symbol(sym.IF);}
"then"  { return new Symbol(sym.THEN);}
"else"  { return new Symbol(sym.ELSE);}
"while" { return new Symbol(sym.WHILE);}
"to"  { return new Symbol(sym.TO);}
"loop" { return new Symbol(sym.LOOP);}
"<--"  { return new Symbol(sym.READ);}
"-->"  { return new Symbol(sym.WRITE);}
"-->!"  { return new Symbol(sym.WRITELN);}

"("  { return new Symbol(sym.LPAR);}
")"  { return new Symbol(sym.RPAR);}
"{"  { return new Symbol(sym.LBRACK);}
"}"  { return new Symbol(sym.RBRACK);}
":"  { return new Symbol(sym.COLON);}
"<<"  { return new Symbol(sym.ASSIGN);}
"return" { return new Symbol(sym.RETURN);}


"true" { return new Symbol(sym.TRUE);}
"false" { return new Symbol(sym.FALSE);}
"+"  { return new Symbol(sym.PLUS);}
"-"  { return new Symbol(sym.MINUS);}
"*"  { return new Symbol(sym.TIMES);}
"/"  { return new Symbol(sym.DIV);}
"^"  { return new Symbol(sym.POW);}
"&"  { return new Symbol(sym.STR_CONCAT);}
"="  { return new Symbol(sym.EQ);}
"<>" { return new Symbol(sym.NE);}
"!="  { return new Symbol(sym.NE);}
"<"  { return new Symbol(sym.LT);}
"<=" { return new Symbol(sym.LE);}
">"  { return new Symbol(sym.GT);}
">=" { return new Symbol(sym.GE);}
"and" { return new Symbol(sym.AND);}
"or"  { return new Symbol(sym.OR);}
"not"  { return new Symbol(sym.NOT);}

 {id} { return new Symbol(sym.ID,yytext()); }

 \" {string.setLength(0); yybegin(STRING);}
 \' {string.setLength(0); yybegin(CHAR);}

 {integer} {return new Symbol(sym.INTEGER_CONST, Integer.parseInt(yytext().toString()));}
 {real} {return new Symbol(sym.REAL_CONST, Float.parseFloat(yytext().toString()));}
 {Comment}   { /* ignore */ }
 {whitespace} { /* ignore */ }
 }
<STRING> {
        \" { yybegin(YYINITIAL);
            return new Symbol( sym.STRING_CONST, string.toString()); }
        [^\n\r\"\\]+ { string.append( yytext() ); }
        \\t { string.append('\t'); }
        \\n { string.append('\n'); }
        \\r { string.append('\r'); }
        \\\" { string.append('\"'); }
        \\ { string.append('\\'); }
        <<EOF>>                         { throw new Error("Stringa non chiusa"); }
}
<CHAR> {
  \' { yybegin(YYINITIAL);
            return new Symbol( sym.CHAR_CONST, string.toString()); }
        [^\n\r\'\\]+ { string.append( yytext() ); }
        \\t { string.append('\t'); }
        \\n { string.append('\n'); }
        \\r { string.append('\r'); }
        \\\' { string.append('\''); }
        \\ { string.append('\\'); }
        <<EOF>>

                               { throw new Error("char non chiusa"); }
}




 [^]   { throw new Error("\n\nIllegal character < "+ yytext()+" >\n"); }

// End of file
<<EOF>> {return new Symbol(sym.EOF);}
