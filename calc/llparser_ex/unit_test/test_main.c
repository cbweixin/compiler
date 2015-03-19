#include <stdlib.h>
#include <stdio.h>
#include <assert.h>

#include "../../..//greatest/greatest.h"

extern SUITE(test_cases);
//extern SUITE(test_cases2);

GREATEST_MAIN_DEFS();

int main(int argc, char **argv)
{
    GREATEST_MAIN_BEGIN();

    RUN_SUITE(test_cases);

    GREATEST_MAIN_END();

    return 0;
}
