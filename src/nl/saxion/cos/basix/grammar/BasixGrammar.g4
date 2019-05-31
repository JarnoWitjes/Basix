grammar BasixGrammar;

program : BEGIN expression* END EOF ;

expression : print
           | variable
           | when
           | loopwhen
           ;

print : 'print' '::' (type='integer' | type='text') '<<' (value=VALUE | value=TEXT | variable | math_expr) ';'
      ;

variable : 'make_known' '::' (type='integer' | type='text') '::' VARIABLE_NAME
           '<<' (value=VALUE | value=TEXT | math_expr) ';' #DEFVAR
         | 'remake_known' '::' VARIABLE_NAME '<<' (varValue=TEXT | varValue=VALUE | math_expr) ';' #RDEFVAR
         | 'get_known' '::' VARIABLE_NAME ';' #GETVAR
         ;

when : 'when' '(' (condition_single=bool_expr| condition_left=bool_expr (and='AND' | or='OR') condition_right=bool_expr)
       ')'
       'then'  if_body=block (('otherwise' else_body=block) | ('test' nested_when=when))*
     ;

block : '(' expression* ')' ';'
      ;

loopwhen : 'loop_when' '(' bool_expr ')' ';' 'then' '(' expression* ')' ';'
         ;

bool_expr : ( lVal=VALUE | lVar=variable) operator=OP ( rVal=VALUE | rVar=variable) ;

math_expr : (lVar=variable | lVal=VALUE) operator=OP (rVar=variable | rVal=VALUE | math_expr) ;

OP : ('gr' | 'ls' | 'eq' | 'greq' | 'lseq' | 'nteq' )
   | ('+' | '-' | '/' | '*' )
   ;

VALUE : [0-9]+ ;
TEXT : '"' ~('"')+ '"';
VARIABLE_NAME : [a-z]+ ;

BEGIN : 'BASIX_BEGIN' ;
END : 'BASIX_END' ;

WS : [ \t\r\n] -> skip;
