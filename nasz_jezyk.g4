grammar nasz_jezyk;

program: stmt* EOF;

stmt: print_f EOL | input_int EOL | input_real EOL | eq EOL;

print_f: PRINT ID;

input_int: INPUT INT ID;

input_real: INPUT REAL ID;

eq: ID ASSIGN expr;

expr: expr ADD expr | expr SUB expr | expr MUL expr | expr SUB expr | expr DIV expr | expr MOD expr | num | ID;

num: INT | FLOAT32 | FLOAT64;





x = 3.5f
x = 1
x = "str"
x = {asd: "asd"}
FLOAT32: [0-9]+ '.' [0-9]+ 'f';
FLOAT64: [0-9]+ '.' [0-9]+ 'd';


ID: [a-zA-Z_]+;
INT: 'int';
REAL: 'real';

12
12.0f
12.0d
"str"
PRINT: 'print';
INPUT: 'input';

ASSIGN: '=';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';

EOL: ';';