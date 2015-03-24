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
            if( i == 0 )
            {
                ASSERT_EQ(6,token.kind);
                ASSERT_STR_EQ("(",token.str);
            }
            else if( i== 1 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("1",token.str);
            }
            else if( i== 2 )
            {
                ASSERT_EQ(2,token.kind);
                ASSERT_STR_EQ("+",token.str);
            }
            else if( i== 3 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("2",token.str);
            }
            else if( i== 4 )
            {
                ASSERT_EQ(7,token.kind);
                ASSERT_STR_EQ(")",token.str);
            }
            else if( i== 5 )
            {
                ASSERT_EQ(4,token.kind);
                ASSERT_STR_EQ("*",token.str);
            }
            else if( i== 6 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("3",token.str);
            }
            else if( i== 7 )
            {
                ASSERT_EQ(2,token.kind);
                ASSERT_STR_EQ("+",token.str);
            }
            else if( i== 8 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("4",token.str);
            }

        }
        i++;
    }
    PASS();
}

TEST test_get_token2(void)
{
    Token token;
    char st_line[50] = "(1-2)*3+4/5\n";

    set_line(st_line);

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
            // printf("kind..%d, str..%s\n", token.kind, token.str);
            // why the '(' is always ignored?
            if( i == 0 )
            {
                ASSERT_EQ(6,token.kind);
                ASSERT_STR_EQ("(",token.str);
            }
            else if( i== 1 )
            {
        //        printf("kind..%d, str..%s\n", token.kind, token.str);
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("1",token.str);
            }
            else if( i== 2 )
            {
                // "- " is type '3'
                ASSERT_EQ(3,token.kind);
                ASSERT_STR_EQ("-",token.str);
            }
            else if( i== 3 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("2",token.str);
            }
            else if( i== 4 )
            {
                ASSERT_EQ(7,token.kind);
                ASSERT_STR_EQ(")",token.str);
            }
            else if( i== 5 )
            {
                ASSERT_EQ(4,token.kind);
                ASSERT_STR_EQ("*",token.str);
            }
            else if( i== 6 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("3",token.str);
            }
            else if( i== 7 )
            {
                ASSERT_EQ(2,token.kind);
                ASSERT_STR_EQ("+",token.str);
            }
            else if( i == 8 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("4",token.str);
            }
            else if( i == 9 )
            {
                ASSERT_EQ(5,token.kind);
                ASSERT_STR_EQ("/",token.str);
            }
            else if( i == 10 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("5",token.str);
            }
        }
        i++;
    }
    PASS();

}

TEST test_get_token3(void)
{
    Token token;
    char st_line[50] = "1.34+5.6*(3.4-2)\n";

    set_line(st_line);

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
            // printf("kind..%d, str..%s\n", token.kind, token.str);
            if( i == 0 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("1.34",token.str);
            }
            else if( i == 1 )
            {
                ASSERT_EQ(2,token.kind);
                ASSERT_STR_EQ("+",token.str);
            }
            else if( i == 2 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("5.6",token.str);
            }
            else if( i == 3 )
            {
                ASSERT_EQ(4,token.kind);
                ASSERT_STR_EQ("*",token.str);
            }
            else if( i == 4 )
            {
                ASSERT_EQ(6,token.kind);
                ASSERT_STR_EQ("(",token.str);
            }
            else if( i == 5 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("3.4",token.str);
            }
            else if( i == 6 )
            {
                ASSERT_EQ(3,token.kind);
                ASSERT_STR_EQ("-",token.str);
            }
            else if( i == 7 )
            {
                ASSERT_EQ(1,token.kind);
                ASSERT_STR_EQ("2",token.str);
            }
            else if( i == 8 )
            {
                ASSERT_EQ(7,token.kind);
                ASSERT_STR_EQ(")",token.str);
            }
        }
        i++;
    }
    PASS();
}

TEST test_get_token4(void)
{
    Token token;
//    char st_line[50] = "1.a + 2\n";
    //char st_line[50] = "a + 2\n";
    char st_line[50] = "1...3 +2\n";

    set_line(st_line);

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
             printf("kind..%d, str..%s\n", token.kind, token.str);
        }

            i++;
    }
    ASSERT(1>0);
    PASS();
}

TEST test_get_token5(void)
{
    Token token;
    char st_line[50] = "1.a + 2\n";
    //char st_line[50] = "a + 2\n";

    set_line(st_line);

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
             printf("kind..%d, str..%s\n", token.kind, token.str);
        }

            i++;
    }
    ASSERTm("if you saw this test passed, it is wrong, the code has error", 1<0);
    PASS();
}

TEST test_get_token6(void)
{
    Token token;
    char st_line[50] = "a + 2\n";

    set_line(st_line);

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
             printf("kind..%d, str..%s\n", token.kind, token.str);
        }

            i++;
    }
    ASSERTm("if you saw this test passed, it is wrong, the code has error", 1<0);
    PASS();
}

SUITE(test_cases)
{
    RUN_TEST(test_get_token1);
    RUN_TEST(test_get_token2);
    RUN_TEST(test_get_token3);
    RUN_TEST(test_get_token5);
    RUN_TEST(test_get_token6);
    RUN_TEST(test_get_token4);
}
