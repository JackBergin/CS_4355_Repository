# symbol listfile
#
include(Symbol)

add_library(sym_lib OBJECT
  ${SYMBOL_SOURCES}
)
include_directories(sym_lib
  ${SYMBOL_INCLUDE}
)