TARGET = dbg.o
CC=gcc
CFLAGS = -c -g -Wall -DDBG_NO_DEBUG -ansi -pedantic
_OBJS = debug.o
OBJS = $(patsubst %, $(BUILD_DIR)/%, $(_OBJS))
INCLUDES = -I..
BUILD_DIR=../build

$(BUILD_DIR)/$(TARGET):$(OBJS)
	ld -r -o $@ $^
$(BUILD_DIR)/%.o: %.c
	$(CC) $(CFLAGS) $(INCLUDES) -o $@ $<
debug.o: debug.c ../MEM.h debug.h ../DBG.h
