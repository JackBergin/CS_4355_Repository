# Distributed under the OSI-approved BSD 3-Clause License.  See accompanying
# file Copyright.txt or https://cmake.org/licensing for details.

cmake_minimum_required(VERSION 3.5)

file(MAKE_DIRECTORY
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-src"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-build"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-subbuild/catch2-populate-prefix"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-subbuild/catch2-populate-prefix/tmp"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-subbuild/catch2-populate-prefix/src/catch2-populate-stamp"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-subbuild/catch2-populate-prefix/src"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-subbuild/catch2-populate-prefix/src/catch2-populate-stamp"
)

set(configSubDirs )
foreach(subDir IN LISTS configSubDirs)
    file(MAKE_DIRECTORY "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/cmake-build-debug/_deps/catch2-subbuild/catch2-populate-prefix/src/catch2-populate-stamp/${subDir}")
endforeach()
