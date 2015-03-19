#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

#include "../../..//greatest/greatest.h"
#include "../token.h"

SUITE(test_cases);

TEST test_get_token1(void)
{
    Token token;
    char st_line[50] = "(1+2)*3+4\n";

    set_line(st_line);
    get_token(&token);

		int i = 0;
    for (;;)
    {
        get_token(&token);
        if (token.kind == END_OF_LINE_TOKEN)
        {
            break;
        }
        else
        {
//            printf("kind..%d, str..%s\n", token.kind, token.str);
            if( i== 0 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("1",token.str);
            }
						else if( i== 1 )
            {
                ASSERT_EQ(2,token.kind);
                ASSERT_STR_EQ("+",token.str);
            }
						else if( i== 2 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("2",token.str);
            }
						else if( i== 3 )
            {
                ASSERT_EQ(7,token.kind);
                ASSERT_STR_EQ(")",token.str);
            }
						else if( i== 4 )
            {
                ASSERT_EQ(4,token.kind);
                ASSERT_STR_EQ("*",token.str);
            }
						else if( i== 5 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("3",token.str);
            }
						else if( i== 6 )
            {
                ASSERT_EQ(2,token.kind);
                ASSERT_STR_EQ("+",token.str);
            }
						else if( i== 7 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("4",token.str);
            }

        }
				i++;
    }
    PASS();
}


SUITE(test_cases)
{
    RUN_TEST(test_get_token1);
}
