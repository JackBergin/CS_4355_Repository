# Distributed under the OSI-approved BSD 3-Clause License.  See accompanying
# file Copyright.txt or https://cmake.org/licensing for details.

cmake_minimum_required(VERSION 3.5)

file(MAKE_DIRECTORY
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-src"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-build"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-subbuild/googletest-populate-prefix"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-subbuild/googletest-populate-prefix/tmp"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-subbuild/googletest-populate-prefix/src/googletest-populate-stamp"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-subbuild/googletest-populate-prefix/src"
  "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-subbuild/googletest-populate-prefix/src/googletest-populate-stamp"
)

set(configSubDirs )
foreach(subDir IN LISTS configSubDirs)
    file(MAKE_DIRECTORY "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-subbuild/googletest-populate-prefix/src/googletest-populate-stamp/${subDir}")
endforeach()
if(cfgdir)
  file(MAKE_DIRECTORY "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/build/_deps/googletest-subbuild/googletest-populate-prefix/src/googletest-populate-stamp${cfgdir}") # cfgdir has leading slash
endif()
