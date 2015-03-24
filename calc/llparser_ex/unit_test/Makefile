CFLAGS += -Wall -Werror -Wextra -pedantic
CFLAGS += -Wmissing-prototypes
CFLAGS += -Wstrict-prototypes
CFLAGS += -Wmissing-declarations
#LDFLAGS = -lm

CC = clang

#HEADER_PATH = -I ~/Desktop/github/compiler/greatest
HEADER_PATH = -I ../../../compiler/greatest

LINKED_OBJECTS = test_cases_token.o fileToTest.o parser.o

all: clean test.run

test: clean test.run
		./test.run -v | ~/Desktop/github/compiler/greatest/greenest

test.run: test_main.c ${LINKED_OBJECTS}
		${CC} ${HEADER_PATH} ${CFLAGS} ${LDFLAGS} -g -o $@ test_main.c ${LINKED_OBJECTS}

clean:
		rm -f *.o *.core *.out *.run

test_cases_token.o:
		${CC} ${HEADER_PATH} ${CFLAGS} ${LDFLAGS} -g -o $@ -c test_cases_token.c

fileToTest.o:
		${CC} ${HEADER_PATH} ${CFLAGS} ${LDFLAGS} -pthread -g -o $@ -c ../lexicalanalyzer.c

parser.o:
		${CC} ${HEADER_PATH} ${CFLAGS} ${LDFLAGS} -pthread -g -o $@ -c ../parser.c
