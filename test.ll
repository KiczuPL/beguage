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
%liczba = alloca i32
store i32 3, i32* %liczba
%1 = load i32, i32* %3
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %1)
ret i32 0 }

