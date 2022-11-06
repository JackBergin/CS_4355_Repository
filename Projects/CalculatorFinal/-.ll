; ModuleID = 'calculator.ll'
source_filename = "calculator.ll"

@fmtStr = private unnamed_addr constant [31 x i8] c"Expression %s evaluates to %d\0A\00", align 1
@exprStr = private unnamed_addr constant [8 x i8] c"6*(2+3)\00", align 1
@fmtStr.1 = private unnamed_addr constant [31 x i8] c"Expression %s evaluates to %d\0A\00", align 1
@exprStr.2 = private unnamed_addr constant [6 x i8] c"a:=42\00", align 1
@fmtStr.3 = private unnamed_addr constant [31 x i8] c"Expression %s evaluates to %d\0A\00", align 1
@exprStr.4 = private unnamed_addr constant [12 x i8] c"5<10=~false\00", align 1

declare i8* @printf(...)

define i32 @main(i32 %0, i8** %1) {
entry:
  %2 = add nsw i32 2, 3
  %3 = mul nsw i32 6, %2
  %4 = call i8* (...) @printf(i8* getelementptr inbounds ([31 x i8], [31 x i8]* @fmtStr, i32 0, i32 0), i8* getelementptr inbounds ([8 x i8], [8 x i8]* @exprStr, i32 0, i32 0), i32 %3)
  %a = alloca i32, align 4
  store i32 42, i32* %a, align 4
  %5 = call i8* (...) @printf(i8* getelementptr inbounds ([31 x i8], [31 x i8]* @fmtStr.1, i32 0, i32 0), i8* getelementptr inbounds ([6 x i8], [6 x i8]* @exprStr.2, i32 0, i32 0), i32 42)
  %6 = icmp slt i32 5, 10
  %7 = zext i1 %6 to i32
  %8 = trunc i32 0 to i1
  %9 = xor i1 %8, i32 1
  %10 = zext i1 %9 to i32
  %11 = icmp eq i32 %7, %10
  %12 = zext i1 %11 to i32
  %13 = call i8* (...) @printf(i8* getelementptr inbounds ([31 x i8], [31 x i8]* @fmtStr.3, i32 0, i32 0), i8* getelementptr inbounds ([12 x i8], [12 x i8]* @exprStr.4, i32 0, i32 0), i32 %12)
  ret i32 0
}
