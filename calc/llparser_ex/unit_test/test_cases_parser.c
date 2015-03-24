#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

#include "../../../greatest/greatest.h"
#include "../token.h"
#include "../parser.h"

SUITE(test_cases2);

TEST test_parse_line1(void)
{
        ASSERT(1>0);
        PASS();
}

SUITE(test_cases2)
{
    RUN_TEST(test_parse_line1);
}
