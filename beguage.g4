grammar Beguage;

program: block
;

block: ( statement? NEWLINE )*
 ;

statement: IF condition blockIf END_BLOCK 	#if
    | WRITE ID 		                        #write
	| PRE_ASSIGN ID ASSIGN expression0		#assign
	| ID ASSIGN expression0		            #reassign
	| READ ID TYPE_AS READ_TYPE    	        #read
    ;

blockIf: block
;

condition: '(' expression0 EQUAL expression0 ')'   #equal
    ;

IF: 'if';
EQUAL: '==';
END_BLOCK: 'end';

TYPE_AS: ' as ';
READ_TYPE: INT_KEYWORD | FLOAT32_KEYWORD | FLOAT64_KEYWORD;

expression0:
       expression0 SUB expression1	#sub
      | expression0 ADD expression1	#add
      |  expression1			#single0
      ;

expression1:  expression2			    #single1
      | expression1 MUL expression2	    #mul
      | expression1 DIV expression2	    #div
      ;

expression2: ID				                    #id
      | FLOAT64			                        #float64
      | FLOAT32			                        #float32
      | INT			                            #int
      | CONV_INT  expression2  			        #to_int
      | CONV_FLOAT64  expression2  			    #to_float64
      | CONV_FLOAT32  expression2  			    #to_float32
      | '(' expression0 ')'		                #par
      ;

PRE_ASSIGN: 'let';

ASSIGN: 'be';

WRITE:	'show';

READ:	'provide';

SUB: '-';
ADD: '+';
MUL: '*';
DIV: '/';


ID:   ('a'..'z'|'A'..'Z')+;

INT:  '-'? '0'..'9'+;

FLOAT32:  '-'? '0'..'9'+ ((('.' '0'..'9'*)? '\\.'? 'f') | (('.' '0'..'9'+) 'f'?));
FLOAT64:  '-'? '0'..'9'+ (('.' '0'..'9'+ 'd') | 'd');

INT_KEYWORD: 'i32';
FLOAT32_KEYWORD: 'f32';
FLOAT64_KEYWORD: 'f64';

CONV_INT: '(i32)';
CONV_FLOAT32: '(f32)';
CONV_FLOAT64: '(f64)';

NEWLINE:	'\r'? '\n'
    ;




WS:   (' '|'\t')+ { skip(); };
