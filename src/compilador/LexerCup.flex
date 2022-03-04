package compilador;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
%column
L=[a-zA-Z]+
D=[0-9]+
C=[,]

cadena_texto = (\')~(\')

LineTerminator = \r|\n|\r\n
espacio = {LineTerminator} | [ \t\f]

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

({cadena_texto}) {return new Symbol(sym.Cadena_texto, yychar, yyline, yytext());}

/*Palabras reservadas*/
("catch") {return new Symbol(sym.PR_Catch, yychar, yyline, yytext());}
("class") {return new Symbol(sym.PR_Class, yychar, yyline, yytext());}
("def") {return new Symbol(sym.PR_Def, yychar, yyline, yytext());}
("default") {return new Symbol(sym.PR_Default, yychar, yyline, yytext());}
("else") {return new Symbol(sym.PR_Else, yychar, yyline, yytext());}
("exact") {return new Symbol(sym.PR_Exact, yychar, yyline, yytext());}
("exception") {return new Symbol(sym.PR_Exeption, yychar, yyline, yytext());}
("flag") {return new Symbol(sym.PR_Flag, yychar, yyline, yytext());}
("for") {return new Symbol(sym.PR_For, yychar, yyline, yytext());}
("if") {return new Symbol(sym.PR_If, yychar, yyline, yytext());}
("ing") {return new Symbol(sym.PR_Ing, yychar, yyline, yytext());}
("interruption") {return new Symbol(sym.PR_Interruption, yychar, yyline, yytext());}
("imp") {return new Symbol(sym.PR_Imp, yychar, yyline, yytext());}
("main") {return new Symbol(sym.PR_Main, yychar, yyline, yytext());}
("option") {return new Symbol(sym.PR_Option, yychar, yyline, yytext());}
("part") {return new Symbol(sym.PR_Part, yychar, yyline, yytext());}
("try") {return new Symbol(sym.PR_Try, yychar, yyline, yytext());}
("switch") {return new Symbol(sym.PR_Switch, yychar, yyline, yytext());}
("void") {return new Symbol(sym.PR_Void, yychar, yyline, yytext());}
("while") {return new Symbol(sym.PR_While, yychar, yyline, yytext());}
("word") {return new Symbol(sym.PR_Word, yychar, yyline, yytext());}
("return") {return new Symbol(sym.PR_Return, yychar, yyline, yytext());}

/* Coma */
{C} {return new Symbol(sym.SimbEsp_Coma, yychar, yyline, yytext());}

/*Operadores lógicos*/
"&&" {return new Symbol(sym.OpLog_And, yychar, yyline, yytext());}
"||" {return new Symbol(sym.OpLog_Or, yychar, yyline, yytext());}
"!" {return new Symbol(sym.OpLog_Not, yychar, yyline, yytext());}

/* Espacios en blanco */
{espacio} {/*Ignore*/}


/* Salto de linea */
( "\n" ) {/*Ignore*/}


/*Operadores aritméticos*/
"+" {return new Symbol(sym.OpAritm_Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.OpAritm_Resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.OpAritm_Mult, yychar, yyline, yytext());}
"/" {return new Symbol(sym.OpAritm_Div, yychar, yyline, yytext());}
"%" {return new Symbol(sym.OpAritm_Resto, yychar, yyline, yytext());}

/*Operadores relacionales*/
"<" {return new Symbol(sym.OpRel_Menor, yychar, yyline, yytext());}
">" {return new Symbol(sym.OpRel_Mayor, yychar, yyline, yytext());}
"==" {return new Symbol(sym.OpRel_Igual, yychar, yyline, yytext());}
"<=" {return new Symbol(sym.OpRel_MenorIgual, yychar, yyline, yytext());}
">=" {return new Symbol(sym.OpRel_MayorIgual, yychar, yyline, yytext());}
"!=" {return new Symbol(sym.OpRel_Diferente, yychar, yyline, yytext());}

/*Operadores incrementales*/
"++" {return new Symbol(sym.Op_Incremento, yychar, yyline, yytext());}
"--" {return new Symbol(sym.Op_Decremento, yychar, yyline, yytext());}

/*Operadores de agrupación*/
"(" {return new Symbol(sym.OpAgrup_ParApert, yychar, yyline, yytext());}
")" {return new Symbol(sym.OpAgrup_ParCierre, yychar, yyline, yytext());}
"[" {return new Symbol(sym.OpAgrup_CorchApert, yychar, yyline, yytext());}
"]" {return new Symbol(sym.OpAgrup_CorchCierre, yychar, yyline, yytext());}
"{" {return new Symbol(sym.OpAgrup_LlaveApert, yychar, yyline, yytext());}
"}" {return new Symbol(sym.OpAgrup_LlaveCierre, yychar, yyline, yytext());}

/*Valores flag*/
("true") {return new Symbol(sym.PR_True, yychar, yyline, yytext());}
("false") {return new Symbol(sym.PR_False, yychar, yyline, yytext());}

/*Operador asignación*/
"=" {return new Symbol(sym.OpAsig, yychar, yyline, yytext());}

/* Comentarios */
"**".* {/*Ignore*/}
"*-" ( [^*] | \*+ [^*-] )* "-*" {/*Ignore*/}

/* Punto y coma */
";" {return new Symbol(sym.PuntoComa, yychar, yyline, yytext());}

/* Punto */
"." {return new Symbol(sym.SimbEsp_Punto, yychar, yyline, yytext());}
":" {return new Symbol(sym.SimbEsp_DosPuntos, yychar, yyline, yytext());}

/* Comillas */
"'" {return new Symbol(sym.SimbEsp_Comilla, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D}|_)* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numeros */
("+"|"-")? {D}+ (("e"|"E")("+"|"-")?{D}+)? {return new Symbol(sym.Numero_Exact, yychar, yyline, yytext());}

("+"|"-")? {D}+ ("." {D}+)? (("e"|"E")("+"|"-")?{D}+)? {return new Symbol(sym.Numero_Part, yychar, yyline, yytext()) ;}

/*Errores léxicos*/
("+"|"-")*({D}+|{D}+ "." {D}+) (("e"|"E")("+"|"-")*{D}+)? {return new Symbol(sym.ERROR1, yychar, yyline, yytext());} /*NUMERO_ERRONEO*/

("+"|"-")? (({D}+(".")+ {D}+(".")*){D}*)+ {return new Symbol(sym.ERROR3, yychar, yyline, yytext());} /*NUMERO_ERRONEO*/


("+"|"-")? ({D}(".")) (("e"|"E")("+"|"-")?{D}+)? {return new Symbol(sym.ERROR2, yychar, yyline, yytext());} /*NUMERO_ERRONEO*/


({D}+{L}+({D}*|{L}*)*)+ {return new Symbol(sym.ERROR5, yychar, yyline, yytext());} /*MAL_NOMBRE_PARA_IDENTIFICADOR*/

("+"|"-")?{D}+ ("." {D}*)? (("e"|"E")+("+"|"-")*({D}*((("e"|"E")("+"|"-")?{D}*)?)*)+)?  {return new Symbol(sym.ERROR4, yychar, yyline, yytext());}


/*(("+"|"-")?{L}+|("+"|"-")?{D}+ "." {D}+)("."|{D}|{L})+ {return new Symbol(sym.ERROR3, yychar, yyline, yytext()) ;} /*MAL_NOMBRE_PARA_IDENTIFICADOR*/*/
/* Error de analisis */

 . {return new Symbol(sym.Simbolo_Especial, yychar, yyline, yytext());}
