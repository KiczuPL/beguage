package org.example;


import static org.example.VarType.*;

class LLVMGenerator {

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;


///////////////////////////////TYPE CONVERSION////////////////////////////////////////

    static void matchTypes(Value left, Value right) {

        if (left.type == right.type) {
            return;
        } else if (left.type == INT && right.type == FLOAT32) {
            f32_to_i32(right.getValueStr());
        } else if (left.type == INT && right.type == FLOAT64) {
            f64_to_i32(right.getValueStr());
        } else if (left.type == FLOAT32 && right.type == INT) {
            i32_to_f32(right.getValueStr());
        } else if (left.type == FLOAT32 && right.type == FLOAT64) {
            f64_to_f32(right.getValueStr());
        } else if (left.type == FLOAT64 && right.type == INT) {
            i32_to_f64(right.getValueStr());
        } else if (left.type == FLOAT64 && right.type == FLOAT32) {
            f32_to_f64(right.getValueStr());
        }

    }

    static void f64_to_i32(String id) {
        main_text += "%" + reg + " = fptosi double " + id + " to i32\n";
        reg++;
    }

    static void i32_to_f64(String id) {
        main_text += "%" + reg + " = sitofp i32 " + id + " to double\n";
        reg++;
    }

    static void f64_to_f32(String id) {
        main_text += "%" + reg + " = fptrunc double " + id + " to float\n";
        reg++;
    }

    static void f32_to_f64(String id) {
        main_text += "%" + reg + " = fext float " + id + " to double\n";
        reg++;
    }

    static void i32_to_f32(String id) {
        main_text += "%" + reg + " = sitofp i32 " + id + " to float\n";
        reg++;
    }

    static void f32_to_i32(String id) {
        main_text += "%" + reg + " = fptosi float " + id + " to i32\n";
        reg++;
    }


///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////

    /////////////////////ARITHMETIC OPERATIONS////////////////////////////////////////
    //ADD
    static void add_i32(String val1, String val2) {
        main_text += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void add_f32(String val1, String val2) {
        main_text += "%" + reg + " = fadd float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void add_f64(String val1, String val2) {
        main_text += "%" + reg + " = fadd double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    //SUB
    static void sub_i32(String val1, String val2) {
        main_text += "%" + reg + " = sub i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sub_f32(String val1, String val2) {
        main_text += "%" + reg + " = fsub float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sub_f64(String val1, String val2) {
        main_text += "%" + reg + " = fsub double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    //MUL
    static void mul_i32(String val1, String val2) {
        main_text += "%" + reg + " = mul i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void mul_f32(String val1, String val2) {
        main_text += "%" + reg + " = fmul float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void mul_f64(String val1, String val2) {
        main_text += "%" + reg + " = fmul double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    //DIV
    static void div_i32(String val1, String val2) {
        main_text += "%" + reg + " = sdiv i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void div_f32(String val1, String val2) {
        main_text += "%" + reg + " = fdiv float " + val1.replace("f", "") + ", " + val2.replace("f", "") + "\n";
        reg++;
    }

    static void div_f64(String val1, String val2) {
        main_text += "%" + reg + " = fdiv double " + val1 + ", " + val2 + "\n";
        reg++;
    }
/////////////////////ARITHMETIC OPERATIONS////////////////////////////////////////


    /////////////////////ALLOCATE AND ASSIGN////////////////////////////////////////
    public static void declare(Variable v) {
        switch (v.type) {
            case INT -> declare_i32(v.getName());
            case FLOAT32 -> declare_f32(v.getName());
            case FLOAT64 -> declare_f64(v.getName());
            default -> {
            }
        }
    }

    public static void declare_i32(String id) {
        main_text += "%" + id + " = alloca i32\n";
    }

    public static void assign_i32(String id, String value) {
        main_text += "store i32 " + value + ", i32* %" + id + "\n";
    }

    public static void declare_f32(String id) {
        main_text += "%" + id + " = alloca float, align 4\n";
    }

    public static void assign_f32(String id, String value) {
        String v = LLVMUtils.floatStrToLLVM(value);
        main_text += "store float " + v + ", float* %" + id + "\n";
    }

    public static void declare_f64(String id) {
        main_text += "%" + id + " = alloca double\n";
    }

    public static void assign_f64(String id, String value) {
        String v = LLVMUtils.doubleStrToLLVM(value);
        main_text += "store double " + v + ", double* %" + id + "\n";
    }
/////////////////////ALLOCATE AND ASSIGN////////////////////////////////////////


    public static void printf(Variable v) {
        switch (v.type) {
            case INT -> printf_int(v.getName());
            case FLOAT32 -> printf_float32(v.getName());
            case FLOAT64 -> printf_float64(v.getName());
            default -> {
            }
        }
    }

    /////////////////////SCANF AND PRINTF////////////////////////////////////////
    static void printf_int(String id) {
        main_text += "%" + reg + " = load i32, i32* %" + id + "\n";
        reg++;
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
        reg++;
    }

    static void printf_float32(String id) {
        main_text += "%" + reg + " = load float, float* %" + id + "\n";
        reg++;
        main_text += "%" + reg + " = fpext float %" + (reg - 1) + " to double\n";
        reg++;
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_float32, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    static void printf_float64(String id) {
        main_text += "%" + reg + " = load double, double* %" + id + "\n";
        reg++;
        main_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @printf_str_float64, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    public static void scanf(Variable v) {
        switch (v.type) {
            case INT -> scanf_int(v.getName());
            case FLOAT32 -> scanf_float32(v.getName());
            case FLOAT64 -> scanf_float64(v.getName());
            default -> {
            }
        }
    }

    public static void scanf_int(String id) {
        main_text += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @scanf_str_int, i32 0, i32 0), i32* %" + id + ")\n";
        reg++;
        main_text += "%" + reg + " = call i32 @getchar()\n";
        reg++;

    }

    public static void scanf_float32(String id) {
        main_text += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @scanf_str_float32, i32 0, i32 0), float* %" + id + ")\n";
        reg++;
    }

    public static void scanf_float64(String id) {
        main_text += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @scanf_str_float64, i32 0, i32 0), double* %" + id + ")\n";
        reg++;
    }
    /////////////////////SCANF AND PRINTF////////////////////////////////////////

    static String generate() {
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @getchar()\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        //scanf
        text += "@scanf_str_int = constant [3 x i8] c\"%d\\00\"\n";
        text += "@scanf_str_float32 = constant [3 x i8] c\"%f\\00\"\n";
        text += "@scanf_str_float64 = constant [4 x i8] c\"%lf\\00\"\n";
        //printf
        text += "@printf_str_int = constant [4 x i8] c\"%d\n\\00\"\n";
        text += "@printf_str_float32 = constant [4 x i8] c\"%f\n\\00\"\n";
        text += "@printf_str_float64 = constant [5 x i8] c\"%lf\n\\00\"\n";


        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }
}

