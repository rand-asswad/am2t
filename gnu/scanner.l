%{
#include <iostream>
#include "parser.h"
using namespace std;
%}
%option noyywrap

NUMBER		    [0-9]+(.[0-9]*)?
LATIN_LETTER    [a-zA-Z]
GREEK_LETTER    alpha|beta|gamma|Gamma|delta|Delta|epsilon|varepsilon|zeta|eta|theta|Theta|vartheta|iota|kappa|lambda|Lambda|mu|nu|xi|Xi|pi|Pi|rho|sigma|Sigma|tau|upsilon|phi|Phi|varphi|chi|psi|Psi|omega|Omega
SIMPLE_SYM      "="|"+"|"-"
RELATION_SYM    "!="|"<"|"<="|">"|">="|"-<"|"-<="|">-"|"<-="|in|"!in"|sub|sup|sube|supe|"-="|"~="|"~~"|"prop"
ARROW           uarr|darr|rarr|"->"|">->"|"->>"|">->>"|"|->"|larr|harr|rArr|lArr|hArr|"=>"|"<=>"
LOGICAL         and|or|not|if|AA|EE|"_|_"|TT|"|--"|"|=="
OP_SYM          "*"|"**"|"***"|"//"|\\\\|xx|"-:"|"|><"|"><|"|"@"|"o+"|"ox"|"o."|"^^"|"^^^"|vv|vvv|nn|uu|oo|"O/"|"+-"|del|grad|aleph|"/_"|frown|\/_\\|diamond|square
DOTS            ":."|":'"|"..."|cdots|vdots|ddots
LARGE_OP        sum|prod|int|oint|nnn|uuu
NUM_SET         CC|RR|QQ|ZZ|NN
SINGLE_DLM      "|__"|"|~~"|"__|"|"~|"
SPACE           "\ "|quad
STANDARD_FUNC   sin|cos|tan|sec|csc|cot|arcsin|arccos|arctan|sinh|cosh|tanh|sech|csch|coth|exp|log|ln|det|dim|mod|gcd|lcm|lim|lub|glb|min|max
DIFF            dx|dy|dz|dt

UNARY_OP	    sqrt|abs|floor|ceil|norm|vec|hat|bar|ul|dot|ddot|cancel|ubrace|obrace
BINARY_OP	    root|overset|underset|frac|stackrel
WHITESPACE	    [ \t\n\t]
LEFT_DLM	    "("|"["|"{:"|"{"|"(:"|"<<"
RIGHT_DLM	    ")"|"]"|":}"|"}"|":)"|">>"

%%

{WHITESPACE}+		;

"_" {/*printf("token sub\n");*/ return SUB;}
"^" {/*printf("token super\n");*/ return SUPER;}
"/" {/*printf("token over\n");*/ return OVER;}

{LEFT_DLM} {
    yylval.str = strdup(yytext);
    //printf("token left<%s>\n", yytext);
    return LEFT;
}
{RIGHT_DLM}	{
    yylval.str = strdup(yytext);
    //printf("token right<%s>\n", yytext);
    return RIGHT;
}

{NUMBER}|{LATIN_LETTER}|{GREEK_LETTER}|{RELATION_SYM}|{ARROW}|{LOGICAL}|{OP_SYM}|{DOTS}|{LARGE_OP}|{NUM_SET}|{SINGLE_DLM}|{SPACE}|{STANDARD_FUNC}|{DIFF} {
    //printf("token const<%s>\n", yytext);
    yylval.str = strdup(yytext);
    return CONST;
}

{UNARY_OP} {
    yylval.str = strdup(yytext);
    //printf("token unary<%s>\n", yytext);
    return UNARY;
}

{BINARY_OP}	{
    yylval.str = strdup(yytext);
    //printf("token binary<%s>\n", yytext);
    return BINARY;
}

.	{
    //printf("token unrecognized, sending const<%s>\n", yytext);
    yylval.str = strdup(yytext);
    return CONST;
}

%%