#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

#include "../../../greatest/greatest.h"
#include "../token.h"
#include "../parser.h"

SUITE(test_cases2);

TEST test_parse_line1(void)
{
    char st_line[50] = "(1+2)*3+4\n";
    set_line(st_line);
    double value = parse_line();
    ASSERT_EQ(13, value);

    PASS();
}

SUITE(test_cases2)
{
    RUN_TEST(test_parse_line1);
}
