grammar PropertyFile;
file : prop+;
prop : ID '=' STRING '\n';
ID : [a-z]+;
STRING : '"' .*? '"' ;
LINE_COMMENT:   '#' .*? '\r'? '\n' -> skip ;
