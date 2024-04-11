declare i32 @printf(i8*, ...)
declare i32 @getchar()
declare i32 @__isoc99_scanf(i8*, ...)
@scanf_str_int = constant [3 x i8] c"%d\00"
@scanf_str_float32 = constant [3 x i8] c"%f\00"
@scanf_str_float64 = constant [4 x i8] c"%lf\00"
@printf_str_int = constant [4 x i8] c"%d
\00"
@printf_str_float32 = constant [4 x i8] c"%f
\00"
@printf_str_float64 = constant [5 x i8] c"%fd
\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%c = alloca i32
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @scanf_str_int, i32 0, i32 0), i32* %c)
%2 = call i32 @getchar()
%a = alloca i32
store i32 5, i32* %a
%b = alloca i32
store i32 2, i32* %b
%3 = load i32, i32* %c
%4 = sitofp i32 %3 to float
%5 = fadd float 0x4000000000000000, %4
%liczbai = alloca float, align 4
store float %5, float* %liczbai
%6 = load float, float* %liczbai
%7 = fpext float %6 to double
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_float32, i32 0, i32 0), double %7)
%9 = load i32, i32* %c
%10 = fptosi double 0x400C000000000000 to i32
%11 = add i32 %9, %10
%12 = sitofp i32 %11 to float
store float %12, float* %liczbai
%13 = load float, float* %liczbai
%14 = fpext float %13 to double
%15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_float32, i32 0, i32 0), double %14)
ret i32 0 }

