# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.24

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/local/Cellar/cmake/3.24.1/bin/cmake

# The command to remove a file.
RM = /usr/local/Cellar/cmake/3.24.1/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build"

# Utility rule file for ContinuousTest.

# Include any custom commands dependencies for this target.
include test/CMakeFiles/ContinuousTest.dir/compiler_depend.make

# Include the progress variables for this target.
include test/CMakeFiles/ContinuousTest.dir/progress.make

test/CMakeFiles/ContinuousTest:
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/test" && /usr/local/Cellar/cmake/3.24.1/bin/ctest -D ContinuousTest

ContinuousTest: test/CMakeFiles/ContinuousTest
ContinuousTest: test/CMakeFiles/ContinuousTest.dir/build.make
.PHONY : ContinuousTest

# Rule to build all files generated by this target.
test/CMakeFiles/ContinuousTest.dir/build: ContinuousTest
.PHONY : test/CMakeFiles/ContinuousTest.dir/build

test/CMakeFiles/ContinuousTest.dir/clean:
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/test" && $(CMAKE_COMMAND) -P CMakeFiles/ContinuousTest.dir/cmake_clean.cmake
.PHONY : test/CMakeFiles/ContinuousTest.dir/clean

test/CMakeFiles/ContinuousTest.dir/depend:
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/test" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/test" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/test/CMakeFiles/ContinuousTest.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : test/CMakeFiles/ContinuousTest.dir/depend

