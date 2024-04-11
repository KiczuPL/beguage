grammar Beguage;

program: ( (statement)? NEWLINE )*
;


statement:	WRITE ID 		                #write
	| PRE_ASSIGN ID ASSIGN expression0		#assign
	| ID ASSIGN expression0		            #reassign
	| READ ID TYPE_AS READ_TYPE    	        #read
    ;

TYPE_AS: 'as';
READ_TYPE: INT_KEYWORD | FLOAT32_KEYWORD | FLOAT64_KEYWORD;

expression0:  expression1			#single0
      | expression1 ADD expression0	#add
      | expression1 SUB expression0	#sub
      ;

expression1:  expression2			    #single1
      | expression2 MUL expression1	    #mul
      | expression2 DIV expression1	    #div
      ;

expression2: ID				    #id
      | FLOAT64			        #float64
      | FLOAT32			        #float32
      | INT			            #int
      | '(' expression0 ')'		#par
      ;

PRE_ASSIGN: 'let';

ASSIGN: 'be';

WRITE:	'show';

READ:	'provide';

ID:   ('a'..'z'|'A'..'Z')+;

INT:  '-'? '0'..'9'+;

FLOAT32:  '-'? '0'..'9'+ ((('.' '0'..'9'+)? 'f') | 'f'?);
FLOAT64:  '-'? '0'..'9'+ (('.' '0'..'9'+ 'd') | 'd');

INT_KEYWORD: 'i32';
FLOAT32_KEYWORD: 'f32';
FLOAT64_KEYWORD: 'f64';

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';