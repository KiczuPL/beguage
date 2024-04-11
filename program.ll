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
@printf_str_float64 = constant [5 x i8] c"%lf
\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%liczbai = alloca i32
store i32 2, i32* %liczbai
%liczbaf = alloca float, align 4
store float 1.100000e+00, float* %liczbaf, align 4
%liczbad = alloca double
store double 3.700000e+00, double* %liczbad
%1 = load i32, i32* %liczbai
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %1)
%3 = load float, float* %liczbaf
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_float32, i32 0, i32 0), float %3)
%5 = load double, double* %liczbad
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @printf_str_float64, i32 0, i32 0), double %5)
ret i32 0 }

