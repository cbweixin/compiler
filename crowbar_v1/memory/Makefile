TARGET = mem.o
CC=gcc
CFLAGS = -c -g -DDEBUG -Wall -ansi -pedantic
_OBJS = memory.o storage.o
OBJS = $(patsubst %, $(BUILD_DIR)/%, $(_OBJS))
INCLUDES = -I..
BUILD_DIR=../build

$(BUILD_DIR)/$(TARGET):$(OBJS)
	#ld -r -o $@ $(OBJS)
	ld -r -o $@ $^
testp : $(OBJS) $(BUILD_DIR)/main.o
	$(CC) -o $@ $^
$(BUILD_DIR)/%.o: %.c
	$(CC) $(CFLAGS) $(INCLUDES) -o $@ $<
#.c.o:
#	$(CC) $(CFLAGS) -I.. $*.c
main.o: main.c ../MEM.h
memory.o: memory.c memory.h ../MEM.h
storage.o: storage.c memory.h ../MEM.h
