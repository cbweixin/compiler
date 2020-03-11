grammar PANTS;
import CommonLexerRules;

// parser rule
pants:
	stmt_list;
stmt_list: (stmt NEWLINE?)*;
stmt:
	java_lib_stmt
	| scala_lib_stmt
	| jvm_lib_stmt
	;

java_lib_stmt:
	JAVA_LIBRARY '(' lib_item_list ')';
scala_lib_stmt:
	SCALA_LIBRARY '(' lib_item_list ')';
jvm_lib_stmt:
	JVM_LIBRARY '(' lib_item_list ')';

lib_item_list: (lib_item NEWLINE?)*;
lib_item:
	name_item
	| dependencies_item
	| sources_item
	| strict_deps
	| main_item
	| tags
	;



name_item:
	NAME '=' SINGLE_QUOTED_STRING ',';
dependencies_item:
	DEPENDENCIES '=' '[' dependent_list ']' ','? NEWLINE?;
dependent_list: (dependent_entry)*;
dependent_entry:
	SINGLE_QUOTED_STRING ','? NEWLINE?;
sources_item:
	SOURCES '=' GLOBS '(' SINGLE_QUOTED_STRING ')' ','?;
strict_deps:
  STRICTDEPS '=' BOOL_VALUE ','?;
tags:
  TAGS '=' '{' SINGLE_QUOTED_STRING '}' ',' ?;
main_item:
	MAIN '=' (DOUBLE_QUOTED_STRING | SINGLE_QUOTED_STRING) ','?;

// lexer

JAVA_LIBRARY:
	'java_library';
SCALA_LIBRARY:
	'scala_library';
JVM_LIBRARY:
	'jvm_binary';
SOURCES:
	'sources';
GLOBS:
	'globs';
MAIN:
	'main';
STRICTDEPS:
	'strict_deps';
TAGS:
  'tags';
DOUBLE_QUOTED_STRING:
	'"' (ESC | ~["\\]) .*? '"';
