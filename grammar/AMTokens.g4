lexer grammar AMTokens;

/* main tokens */

U	   : 'sqrt'|'abs'|'floor'|'ceil'|'norm'|'vec'|'hat'|'bar'|'ul'|'dot'|'ddot'|'cancel'|'ubrace'|'obrace';
B	   : 'root'|'overset'|'underset'|'frac';
L	   : '('|'['|'{:'|'{'|'(:'|'<<';
R	   : ')'|']'|':}'|'}'|':)'|'>>';

WS	   : [ \t\n] -> skip;

/* constant tokens */

C : INT | LATIN | GREEK | SIMPLE_SYM | RELATION_SYM | ARROW | LOGICAL | OP_SYM | DOTS | LARGE_OP | NUM_SET | SINGLE_DLM | SPACE | STANDARD_FUNC ;

INT            : [0-9]+;
LATIN          : [a-zA-Z];
GREEK          : 'alpha'|'beta'|'gamma'|'Gamma'|'delta'|'Delta'|'epsilon'|'varepsilon'|'zeta'|'eta'|'theta'|'Theta'|'vartheta'|'iota'|'kappa'|'lambda'|'Lambda'|'mu'|'nu'|'xi'|'Xi'|'pi'|'Pi'|'rho'|'sigma'|'Sigma'|'tau'|'upsilon'|'phi'|'Phi'|'varphi'|'chi'|'psi'|'Psi'|'omega'|'Omega';
SIMPLE_SYM     : '='|'+'|'-';
RELATION_SYM   : '!='|'<'|'<='|'>'|'>='|'-<'|'-<='|'>-'|'<-='|'in'|'!in'|'sub'|'sup'|'sube'|'supe'|'-='|'~='|'~~'|'prop';
ARROW          : 'uarr'|'darr'|'rarr'|'->'|'>->'|'->>'|'>->>'|'|->'|'larr'|'harr'|'rArr'|'lArr'|'hArr'|'=>'|'<=>';
LOGICAL        : 'and'|'or'|'not'|'if'|'AA'|'EE'|'_|_'|'TT'|'|--'|'|==';
OP_SYM         : '*'|'**'|'***'|'\\'|'xx'|'-:'|'|><'|'><|'|'@'|'o+'|'ox'|'o.'|'^^'|'^^^'|'vv'|'vvv'|'nn'|'uu'|'oo'|'O/'|'+-'|'del'|'grad'|'aleph'|'/_'|'frown'|'/_\\'|'diamond'|'square';
DOTS           : ':.'|':\''|'...'|'cdots'|'vdots'|'ddots';
LARGE_OP       : 'sum'|'prod'|'int'|'oint'|'nnn'|'uuu';
NUM_SET        : 'CC'|'RR'|'QQ'|'ZZ'|'NN';
SINGLE_DLM     : '|__'|'|~~'|'__|'|'~|';
SPACE          : 'quad';
STANDARD_FUNC  : 'sin'|'cos'|'tan'|'sec'|'csc'|'cot'|'arcsin'|'arccos'|'arctan'|'sinh'|'cosh'|'tanh'|'sech'|'csch'|'coth'|'exp'|'log'|'ln'|'det'|'dim'|'mod'|'gcd'|'lcm'|'lim'|'lub'|'glb'|'min'|'max';
