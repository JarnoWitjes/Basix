grammar BasixGrammar;

program : BEGIN expression* END EOF ;

expression : print
           | variable
           | when
           | loopwhen
           ;

print : 'print' '::' (intT='integer' | stringT='text') '<<' (intV=VALUE ';' | stringV=TEXT ';' | variable ';' | math_expr ';')
      ;

variable : 'make_known'' ::' (intT='integer' | stringT='text') '::' VARIABLE_NAME
           '<<' (intV=VALUE | stringV=TEXT | math_expr) ';' #DEFVAR
         | 'remake_known' '::' VARIABLE_NAME '<<' (stringV=VALUE | intV=TEXT | math_expr) ';' #RDEFVAR
         | 'get_known' '::' VARIABLE_NAME ';' #GETVAR
         ;

when : 'when' '(' (bool_expr | bool_expr ('AND' | 'OR') bool_expr) ')' ';'
       'then' '(' expression* ')' (';' | ';' 'otherwise' ('(' expression* ')' ';' | when))
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
