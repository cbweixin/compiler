grammar PANTS;

pants: stmt_list;
stmt_list: (stmt NEWLINE?)*;
stmt: java_lib_stmt | jvm_lib_stmt | jar_lib_stmt | var_declare;

var_declare: IDENTIFIER '=' SINGLE_QUOTED_STRING NEWLINE?;

java_lib_stmt: JAVA_LIBRARY '(' lib_item_list ')';
jar_lib_stmt: JAR_LIBRARY '(' jars_item_list ')';
jvm_lib_stmt: JVM_LIBRARY '(' lib_item_list ')';

lib_item_list: (lib_item NEWLINE?)*;
lib_item:
	name_item
	| dependencies_item
	| sources_item
	| main_item;

jars_item_list: (jars_item NEWLINE?)*;
jars_item: name_item | dependencies_item | jar_list;

jar_list: JARS '=' '[' jar_entries ']' ','? NEWLINE?;
jar_entries: (jar_entry)*;
jar_entry: java_jar_entry | scala_jar_entry;
java_jar_entry: JAR '(' jar_coordinates ')' ','? NEWLINE?;
scala_jar_entry:
	SCALA_JAR '(' jar_coordinates ')' ','? NEWLINE?;

jar_coordinate:
	ORG '=' SINGLE_QUOTED_STRING ','?
	| NAME '=' SINGLE_QUOTED_STRING ','?
	// | INTRANSITIVE '=' ('True' | 'False') ','?
	| INTRANSITIVE '=' BOOL_VALUE ','?
	| REV '=' (SINGLE_QUOTED_STRING | IDENTIFIER) ','?;

jar_coordinates: (jar_coordinate)*;

name_item: NAME '=' SINGLE_QUOTED_STRING ',';
dependencies_item:
	DEPENDENCIES '=' '[' dependent_list ']' ','? NEWLINE?;
dependent_list: (dependent_entry)*;
dependent_entry: SINGLE_QUOTED_STRING ','? NEWLINE?;
sources_item:
	SOURCES '=' GLOBS '(' SINGLE_QUOTED_STRING ')' ','?;
main_item: MAIN '=' DOUBLE_QUOTED_STRING ','?;

JAVA_LIBRARY: 'java_library';
JAR_LIBRARY: 'jar_library';
JVM_LIBRARY: 'jvm_binary';
JARS: 'jars';
JAR: 'jar';
SCALA_JAR: 'scala_jar';
NAME: 'name';
ORG: 'org';
REV: 'rev';
INTRANSITIVE: 'intransitive';
DEPENDENCIES: 'dependencies';
SOURCES: 'sources';
GLOBS: 'globs';
MAIN: 'main';
BOOL_VALUE: 'True' | 'False';

SINGLE_QUOTED_STRING: '\'' (ESC | ~["\\])*? '\'';
NEWLINE:
	'\r'? '\n'; // return newlines to parser (end-statement signal)
DOUBLE_QUOTED_STRING: '"' (ESC | ~["\\]) .*? '"';
IDENTIFIER:
	Letter LetterOrDigit*; // variable must start with letter

fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];
fragment LetterOrDigit: Letter | [0-9];

fragment Letter: [a-zA-Z$_];

WS: [ \t\r\n]+ -> skip; // Define whitespace rule, toss it out

