# Test CMakeLists.txt file
#
include(Testing)
include(ANTLR)

include(cmake/LexParseTests.cmake)

### Set up all tests to be run
add_executable(
  tests
  ${LEXPARSE_TESTS}
)
add_dependencies(tests parser_lib)
target_include_directories(tests PUBLIC ${ANTLR_INCLUDE} ${ANTLR_GENERATED_DIR})
target_link_libraries(tests 
      PRIVATE
      ${ANTLR_RUNTIME_LIB}
      lexparse_lib
      Catch2::Catch2WithMain)

# Get the tests registered with CTest
catch_discover_tests(tests)