lexer grammar CommonLexerRules;

JAR_LIBRARY:
	'jar_library';

JARS:
	'jars';
JAR:
	'jar';
SCALA_JAR:
	'scala_jar';
NAME:
	'name';
ORG:
	'org';
REV:
	'rev';
INTRANSITIVE:
	'intransitive';
EXCLUDES:
	'excludes';
EXCLUDE:
	'exclude';
FORCE:
	'force';
DEPENDENCIES:
	'dependencies';

BOOL_VALUE:
	'True'
	| 'False';

SINGLE_QUOTED_STRING:
	'\'' (ESC | ~["\\])*? '\'';
NEWLINE:
	'\r'? '\n'; // return newlines to parser (end-statement signal)
IDENTIFIER:
	Letter LetterOrDigit*; // variable must start with letter

fragment ESC:
	'\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE:
	'u' HEX HEX HEX HEX;
fragment HEX:
	[0-9a-fA-F];
fragment LetterOrDigit:
	Letter
	| [0-9];
fragment Letter:
	[a-zA-Z$_];

WS:
	[ \t\r\n]+ -> skip; // Define whitespace rule, toss it out
LINE_COMMENT:   '#' .*? '\r'? '\n' -> skip ;

