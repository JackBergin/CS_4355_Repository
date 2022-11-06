; ModuleID = 'WPLC.ll'
source_filename = "WPLC.ll"

declare i8* @printf(...)

define i32 @add(i32 %0, i32 %1) {
entry:
  %i = alloca i32, align 4
  store i32 %0, i32* %i, align 4
  %j = alloca i32, align 4
  store i32 %1, i32* %j, align 4
  %i1 = load i32, i32* %i, align 4
  %j2 = load i32, i32* %j, align 4
  %2 = add nsw i32 %i1, %j2
  ret i32 %2
}

define i32 @program() {
entry:
  %0 = call i32 @add(i32 5, i32 6, i32 7)
  ret i32 %0
}
