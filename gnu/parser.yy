%{
    #include <iostream>
    #include <cstdio>
    #include <cstdarg>
    #include "dictionary.h"
    using namespace std;
    using namespace dictionary;

    extern FILE *yyin;
    extern int yylex();
    extern int yyparse();

    void yyerror(const char *msg);
    char* concatf(const char* fmt, ...);
%}

%define parse.lac full
%define parse.error verbose

%union {
    char *str;
}

%left SUB SUPER OVER
%left <str> LEFT RIGHT UNARY BINARY
%token <str> CONST

%type  <str> S I E

%destructor { free($$); } <str>

%start expr

%% /*** GRAMMAR ***/

expr : E {
    cout << $1 << endl;
};

E   : I E {
        $$ = concatf("%s %s", $1, $2);
    }
    | I {
        $$ = $1;
    }
    ;

I   : S SUB S {
        $$ = concatf("%s_%s", $1, $3);
    }
    | S SUPER S {
        $$ = concatf("%s^%s", $1, $3);
    }
    | S SUB S SUPER S {
        $$ = concatf("%s_%s^%s", $1, $3, $5);
    }
    | S {
        $$ = $1;
    }
    | I OVER I {
        $$ = concatf("\\frac{%s}{%s}", $1, $3);
    }
    ;

S   : LEFT E RIGHT {
        $$ = concatf("%s%s%s", getLeft($1), $2, getRight($3));
    }
    | UNARY S {
        $$ = concatf("%s{%s}", getConst($1), $2);
    }
    | BINARY S S {
        $$ = concatf("%s{%s}{%s}", getConst($1), $2, $3);
    }
    | CONST {
        $$ = getConst($1);
    }
    ;

%% /*** EXTRA ***/

int main(int args, char* argv[]) {
    /* initialize input */
    FILE *f;
    if (args > 1) f = fopen(argv[1], "r");
    else f = fopen("example.input", "r");
    
    if (!f) {
        cout << "Error openning file." << endl;
        return 1;
    }
    yyin = f;

    /* initialize dictionary */
    init_dictionary("../grammar/dictionary.csv");
    yyparse();
}

void yyerror(const char *msg) {
    cout << msg << endl;
}

char* concatf(const char* fmt, ...) {
  va_list args;
  char* buf = NULL;
  va_start(args, fmt);
  int n = vasprintf(&buf, fmt, args);
  va_end(args);
  if (n < 0) { free(buf); buf = NULL; }
  return buf;
}