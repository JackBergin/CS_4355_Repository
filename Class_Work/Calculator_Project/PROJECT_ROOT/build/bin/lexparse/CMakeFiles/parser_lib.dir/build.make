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
CMAKE_SOURCE_DIR = "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build"

# Include any dependencies generated for this target.
include bin/lexparse/CMakeFiles/parser_lib.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include bin/lexparse/CMakeFiles/parser_lib.dir/compiler_depend.make

# Include the progress variables for this target.
include bin/lexparse/CMakeFiles/parser_lib.dir/progress.make

# Include the compile flags for this target's objects.
include bin/lexparse/CMakeFiles/parser_lib.dir/flags.make

bin/lexparse/(:
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir="/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Generating (, /Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/lexparse/parser_sources.h, )"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/lexparse" && /bin/sh generate.sh Calculator

/Users/berginjack/Desktop/Github_Work/College\ Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/lexparse/parser_sources.h: bin/lexparse/(
	@$(CMAKE_COMMAND) -E touch_nocreate "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/lexparse/parser_sources.h"

bin/lexparse/): bin/lexparse/(
	@$(CMAKE_COMMAND) -E touch_nocreate "bin/lexparse/)"

bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o: bin/lexparse/CMakeFiles/parser_lib.dir/flags.make
bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o: /Users/berginjack/Desktop/Github_Work/College\ Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorLexer.cpp
bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o: bin/lexparse/CMakeFiles/parser_lib.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o -MF CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o.d -o CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o -c "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorLexer.cpp"

bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.i"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorLexer.cpp" > CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.i

bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.s"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorLexer.cpp" -o CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.s

bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o: bin/lexparse/CMakeFiles/parser_lib.dir/flags.make
bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o: /Users/berginjack/Desktop/Github_Work/College\ Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorParser.cpp
bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o: bin/lexparse/CMakeFiles/parser_lib.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o -MF CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o.d -o CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o -c "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorParser.cpp"

bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.i"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorParser.cpp" > CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.i

bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.s"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" && /Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/generated/CalculatorParser.cpp" -o CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.s

parser_lib: bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorLexer.cpp.o
parser_lib: bin/lexparse/CMakeFiles/parser_lib.dir/__/generated/CalculatorParser.cpp.o
parser_lib: bin/lexparse/CMakeFiles/parser_lib.dir/build.make
.PHONY : parser_lib

# Rule to build all files generated by this target.
bin/lexparse/CMakeFiles/parser_lib.dir/build: parser_lib
.PHONY : bin/lexparse/CMakeFiles/parser_lib.dir/build

bin/lexparse/CMakeFiles/parser_lib.dir/clean:
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" && $(CMAKE_COMMAND) -P CMakeFiles/parser_lib.dir/cmake_clean.cmake
.PHONY : bin/lexparse/CMakeFiles/parser_lib.dir/clean

bin/lexparse/CMakeFiles/parser_lib.dir/depend: bin/lexparse/(
bin/lexparse/CMakeFiles/parser_lib.dir/depend: bin/lexparse/)
bin/lexparse/CMakeFiles/parser_lib.dir/depend: /Users/berginjack/Desktop/Github_Work/College\ Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/lexparse/parser_sources.h
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/src/lexparse" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Class_Work/Calculator_Project/PROJECT_ROOT/build/bin/lexparse/CMakeFiles/parser_lib.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : bin/lexparse/CMakeFiles/parser_lib.dir/depend

