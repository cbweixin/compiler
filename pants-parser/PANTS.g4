grammar PANTS;

pants: stmt_list;
stmt_list: (stmt)*;
stmt: java_lib_stmt | jvm_lib_stmt | jar_lib_stmt;

java_lib_stmt: JAVA_LIBRARY '(' lib_item_list ')';
jar_lib_stmt: JAR_LIBRARY '(' lib_item_list ')';
jvm_lib_stmt: JVM_LIBRARY '(' lib_item_list ')';

lib_item_list: (lib_item NEWLINE?)*;
lib_item:
	name_item
	| dependencies_item
	| sources_item
	| main_item;

name_item: NAME '=' STRING ',';
dependencies_item:
	DEPENDENCIES '=' '[' dependent_list ']' ','? NEWLINE?;
dependent_list: (dependent_entry)*;
dependent_entry: STRING ','? NEWLINE?;
sources_item: SOURCES '=' GLOBS '(' STRING ')' ','?;
main_item: MAIN '=' STRING2 ','?;

JAVA_LIBRARY: 'java_library';
JAR_LIBRARY: 'jar_library';
JVM_LIBRARY: 'jvm_binary';
NAME: 'name';
DEPENDENCIES: 'dependencies';
SOURCES: 'sources';
GLOBS: 'globs';
MAIN: 'main';
STRING: '\'' (ESC | ~["\\])*? '\'';
NEWLINE:
	'\r'? '\n'; // return newlines to parser (end-statement signal)
STRING2: '"' (ESC | ~["\\]) .*? '"';

fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];

WS: [ \t\r\n]+ -> skip; // Define whitespace rule, toss it out

