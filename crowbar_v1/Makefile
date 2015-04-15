TARGET = crowbar
CC=gcc
BUILD_DIR=./build
_OBJS = \
  lex.yy.o\
  y.tab.o\
  main.o\
  interface.o\
  create.o\
  execute.o\
  eval.o\
  string.o\
  string_pool.o\
  util.o\
  native.o\
  error.o\
  error_message.o\
  mem.o\
  dbg.o
# % is the pattern, stands for all the file in _OBJS, for all elem in _OBJS, 
# add "./build/" to the front
OBJS = $(patsubst %, $(BUILD_DIR)/%, $(_OBJS))
CFLAGS = -c -g -Wall -Wswitch-enum -ansi -pedantic -DDEBUG
INCLUDES = \

$(TARGET):$(OBJS)
	cd ./memory; $(MAKE);
	cd ./debug; $(MAKE);
	$(CC) $(OBJS) -o $@ -lm
clean:
	rm -f $(TARGET) $(BUILD_DIR)/*.o lex.yy.c y.tab.c y.tab.h y.output *~
y.tab.h : crowbar.y
	bison --yacc -dv crowbar.y
y.tab.c : crowbar.y
	bison --yacc -dv crowbar.y
lex.yy.c : crowbar.l crowbar.y y.tab.h
	flex crowbar.l
$(BUILD_DIR)/y.tab.o: y.tab.c crowbar.h MEM.h
	$(CC) -c -g -o $@ $< $(INCLUDES)
$(BUILD_DIR)/lex.yy.o: lex.yy.c crowbar.h MEM.h
	$(CC) -c -g -o $@ $< $(INCLUDES)
#.c.o:
$(BUILD_DIR)/%.o: %.c
	$(CC) $(CFLAGS) -o $@ $< $(INCLUDES)
$(BUILD_DIR)/mem.o:
	cd ./memory; $(MAKE);
$(BUILD_DIR)/dbg.o:
	cd ./debug; $(MAKE);
############################################################
create.o: create.c MEM.h DBG.h crowbar.h CRB.h CRB_dev.h
error.o: error.c MEM.h crowbar.h CRB.h CRB_dev.h
error_message.o: error_message.c crowbar.h MEM.h CRB.h CRB_dev.h
eval.o: eval.c MEM.h DBG.h crowbar.h CRB.h CRB_dev.h
execute.o: execute.c MEM.h DBG.h crowbar.h CRB.h CRB_dev.h
interface.o: interface.c MEM.h DBG.h crowbar.h CRB.h CRB_dev.h
main.o: main.c CRB.h MEM.h
native.o: native.c MEM.h DBG.h crowbar.h CRB.h CRB_dev.h
string.o: string.c MEM.h crowbar.h CRB.h CRB_dev.h
string_pool.o: string_pool.c MEM.h DBG.h crowbar.h CRB.h CRB_dev.h
util.o: util.c MEM.h DBG.h crowbar.h CRB.h CRB_dev.h
