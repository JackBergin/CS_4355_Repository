# Distributed under the OSI-approved BSD 3-Clause License.  See accompanying
# file Copyright.txt or https://cmake.org/licensing for details.

cmake_minimum_required(VERSION 3.5)

file(MAKE_DIRECTORY
  "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-src"
  "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-build"
  "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-subbuild/catch2-populate-prefix"
  "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-subbuild/catch2-populate-prefix/tmp"
  "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-subbuild/catch2-populate-prefix/src/catch2-populate-stamp"
  "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-subbuild/catch2-populate-prefix/src"
  "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-subbuild/catch2-populate-prefix/src/catch2-populate-stamp"
)

set(configSubDirs )
foreach(subDir IN LISTS configSubDirs)
    file(MAKE_DIRECTORY "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-subbuild/catch2-populate-prefix/src/catch2-populate-stamp/${subDir}")
endforeach()
if(cfgdir)
  file(MAKE_DIRECTORY "/Users/berginjack/Desktop/College Work/Senior Year/Term 1/CS 4533/CalculatorProject/PROJECT_ROOT/build/_deps/catch2-subbuild/catch2-populate-prefix/src/catch2-populate-stamp${cfgdir}") # cfgdir has leading slash
endif()
