grammar CSV;

file : hdr row+ ;
hdr : row ; // head row, need to handle specially

row : field (',' field)* '\r'? '\n' ;

field
    :   TEXT    # text
    |   STRING  # string
    |           # empty
    ;

TEXT : ~[,\n\r"]+ ;
STRING : '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote
