/**
 * @file scanner_tests.cpp
 * @author gpollice
 * @brief basic scanner tests
 * @version 0.1
 * @date 2022-07-04
 * @see https://stackoverflow.com/questions/44515370/how-to-override-error-reporting-in-c-target-of-antlr4
 * @see https://github.com/catchorg/Catch2/blob/devel/docs/tutorial.md#test-cases-and-sections
 * @see https://github.com/catchorg/Catch2/blob/devel/docs/test-cases-and-sections.md
 * @see https://github.com/catchorg/Catch2/blob/devel/docs/assertions.md
 */
#include <catch2/catch_test_macros.hpp>
#include "antlr4-runtime.h"
#include "CalculatorLexer.h"
#include "test_error_handlers.h"