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
@globalnazmienna = global i32 0
%point = type { float, float }
define i32 @sth(float* %x, float* %y) nounwind {
%lokalnazmienna = alloca i32
store i32 3, i32* %lokalnazmienna
%1 = load i32, i32* @globalnazmienna
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %1)
%3 = load float, float* %x
%4 = load float, float* %y
%5 = fmul float %4, %3
%6 = fptosi float %5 to i32
ret i32 %6
}
define i32 @main() nounwind{
store i32 5, i32* @globalnazmienna
%a = alloca %point
%fielda01 = getelementptr %point, %point* %a, i32 0, i32 0
store float 0x4008000000000000, float* %fielda01
%fielda11 = getelementptr %point, %point* %a, i32 0, i32 1
store float 0x4010000000000000, float* %fielda11
%1 = load i32, i32* @globalnazmienna
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %1)
%localnazmienna = alloca i32
store i32 777, i32* %localnazmienna
%3 = load i32, i32* %localnazmienna
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %3)
%5 = getelementptr %point, %point* %a, i32 0, i32 0
%6 = load float, float* %5
%7 = getelementptr %point, %point* %a, i32 0, i32 1
%8 = load float, float* %7
%ptr_sth_0 = alloca float
store float %8, float* %ptr_sth_0
%ptr_sth_1 = alloca float
store float %6, float* %ptr_sth_1
%9 = call i32 @sth(float* %ptr_sth_0, float* %ptr_sth_1)
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %9)
%11 = load i32, i32* %localnazmienna
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %11)
%iter = alloca i32
store i32 5, i32* %iter
br label %loop1
loop1:
%13 = load i32, i32* %iter
%14 = icmp sge i32 %13, 0
br i1 %14, label %body1, label %exit1
body1:
%15 = load i32, i32* %iter
%16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %15)
%17 = load i32, i32* %iter
%18 = icmp eq i32 %17, 0
br i1 %18, label %true2, label %false2
true2:
%19 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @printf_str_float64, i32 0, i32 0), double 0x4160F44700000000)
br label %false2
false2:
%20 = load i32, i32* %iter
%21 = sub i32 %20, 1
store i32 %21, i32* %iter
br label %loop1
exit1:
ret i32 0 }

