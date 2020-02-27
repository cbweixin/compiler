grammar JarsLib;
import CommonLexerRules;

// parser
jarslib:
	stmt_list;

stmt_list: (stmt NEWLINE?)*;
stmt:
	var_declare
	| jar_lib_stmt;

var_declare:
	IDENTIFIER '=' SINGLE_QUOTED_STRING NEWLINE?;

jar_lib_stmt:
	JAR_LIBRARY '(' jars_item_list ')';
jars_item_list: (jars_item NEWLINE?)*;
jars_item:
	name_item
	| dependencies_item
	| jar_list;

jar_list:
	JARS '=' '[' jar_entries ']' ','? NEWLINE?;
jar_entries: (jar_entry)*;
jar_entry:
	java_jar_entry
	| scala_jar_entry;
java_jar_entry:
	JAR '(' jar_coordinates ')' ','? NEWLINE?;
scala_jar_entry:
	SCALA_JAR '(' jar_coordinates ')' ','? NEWLINE?;

jar_coordinates: (jar_coordinate)*;
jar_coordinate:
	ORG '=' SINGLE_QUOTED_STRING ','?					# groupid
	| NAME '=' SINGLE_QUOTED_STRING ','?				# artifactid
	| REV '=' (SINGLE_QUOTED_STRING | IDENTIFIER) ','?	# version
	| INTRANSITIVE '=' BOOL_VALUE ','?					# intransitive
	| FORCE '=' BOOL_VALUE ','?							# forceable
	| excludes_list ','?								# exclude_jars_list;

excludes_list:
	EXCLUDES '=' '[' exclude_entries ']' ','? NEWLINE?;
exclude_entries: (exclude_entry)*;
exclude_entry:
	EXCLUDE '(' exclude_coordinates ')' ','? NEWLINE?;
exclude_coordinates: (exclude_coordinate)*;
exclude_coordinate:
	ORG '=' SINGLE_QUOTED_STRING ','?					# exclude_groupid
	| NAME '=' SINGLE_QUOTED_STRING ','?				# exclude_artifactid
	| REV '=' (SINGLE_QUOTED_STRING | IDENTIFIER) ','?	# exclude_version;

name_item:
	NAME '=' SINGLE_QUOTED_STRING ',';

dependencies_item:
	DEPENDENCIES '=' '[' dependent_list ']' ','? NEWLINE?;
dependent_list: (dependent_entry)*;
dependent_entry:
	SINGLE_QUOTED_STRING ','? NEWLINE?;

