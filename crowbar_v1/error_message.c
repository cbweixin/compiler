#include <string.h>
#include "crowbar.h"

MessageFormat crb_compile_error_message_format[] = {
    {"dummy"},
    {"syntax error happens around ($(token))"},
    {"incorrect character ($(bad_char))"},
    {"function name duplication ($(name))"},
    {"dummy"},
};

MessageFormat crb_runtime_error_message_format[] = {
    {"dummy"},
    {"can not find variable ($(name))"},
    {"can not find function ($(name))"},
    {"passed in parameters are more than expected"},
    {"passed in parameters are less than expected"},
    {"boolean expression must have a bool type"},
    {"the operator of minus must be numerical"},
    {"the type of binocular operator is incorrect $(operator)"},
    {"$(operator) can not be applied to boolean"},
    {"please pass path and operator type of file which need fopen()"},
    {"fclose() need to pass in file pointer"},
    {"fgets() need to pass in file pointer"},
    {"fputs() need to pass in file pointer"},
    {"nul can only be applicable for == and !=, can not be applicable for ($(operator))"},
    {"can not divide by 0"},
    {"global variable $(name) doesn't exist"},
    {"can not use global out side of function"},
    {"operator $(operator) can not apply to string"},
    {"dummy"},
};
