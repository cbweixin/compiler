CFLAGS += -Wimplicit-function-declaration

CC = clang

build: clean lex parse
		${CC} ${CFLAGS} -o mycalc y.tab.c lex.yy.c

parse: 
		yacc -dv mycalc.y

lex:
		lex mycalc.l

		

clean:
		rm -f y.tab.c y.tab.h lex.yy.c y.output mycalc



