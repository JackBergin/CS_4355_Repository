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

# Include any dependencies generated for this target.
include bin/utility/CMakeFiles/utility_lib.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include bin/utility/CMakeFiles/utility_lib.dir/compiler_depend.make

# Include the progress variables for this target.
include bin/utility/CMakeFiles/utility_lib.dir/progress.make

# Include the compile flags for this target's objects.
include bin/utility/CMakeFiles/utility_lib.dir/flags.make

bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o: bin/utility/CMakeFiles/utility_lib.dir/flags.make
bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o: /Users/berginjack/Desktop/Github_Work/College\ Projects/CS_4355_Repository/Projects/calculator-example-complete/src/utility/CalcErrorHandler.cpp
bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o: bin/utility/CMakeFiles/utility_lib.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/bin/utility" && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o -MF CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o.d -o CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o -c "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/src/utility/CalcErrorHandler.cpp"

bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.i"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/bin/utility" && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/src/utility/CalcErrorHandler.cpp" > CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.i

bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.s"
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/bin/utility" && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/src/utility/CalcErrorHandler.cpp" -o CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.s

utility_lib: bin/utility/CMakeFiles/utility_lib.dir/CalcErrorHandler.cpp.o
utility_lib: bin/utility/CMakeFiles/utility_lib.dir/build.make
.PHONY : utility_lib

# Rule to build all files generated by this target.
bin/utility/CMakeFiles/utility_lib.dir/build: utility_lib
.PHONY : bin/utility/CMakeFiles/utility_lib.dir/build

bin/utility/CMakeFiles/utility_lib.dir/clean:
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/bin/utility" && $(CMAKE_COMMAND) -P CMakeFiles/utility_lib.dir/cmake_clean.cmake
.PHONY : bin/utility/CMakeFiles/utility_lib.dir/clean

bin/utility/CMakeFiles/utility_lib.dir/depend:
	cd "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/src/utility" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/bin/utility" "/Users/berginjack/Desktop/Github_Work/College Projects/CS_4355_Repository/Projects/calculator-example-complete/build/bin/utility/CMakeFiles/utility_lib.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : bin/utility/CMakeFiles/utility_lib.dir/depend

