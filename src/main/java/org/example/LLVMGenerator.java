package org.example;


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import static org.example.VarType.*;

class LLVMGenerator {

    static String header_text = "";
    static String buffer = "";
    static int reg = 1;
    static int regToBack = 1;
    static int br = 0;
    static String main_text = "";
    static Stack<Integer> brstack = new Stack<Integer>();


///////////////////////////////TYPE CONVERSION////////////////////////////////////////

    static void matchTypes(VariableOrValue variable, VarType targetType) {
        if (targetType == variable.type) {
            return;
        } else if (targetType == INT && variable.type == FLOAT32) {
            f32_to_i32(variable.getNameOrValue());
        } else if (targetType == INT && variable.type == FLOAT64) {
            f64_to_i32(variable.getNameOrValue());
        } else if (targetType == FLOAT32 && variable.type == INT) {
            i32_to_f32(variable.getNameOrValue());
        } else if (targetType == FLOAT32 && variable.type == FLOAT64) {
            f64_to_f32(variable.getNameOrValue());
        } else if (targetType == FLOAT64 && variable.type == INT) {
            i32_to_f64(variable.getNameOrValue());
        } else if (targetType == FLOAT64 && variable.type == FLOAT32) {
            f32_to_f64(variable.getNameOrValue());
        }
    }

    static void matchTypes(VariableOrValue left, VariableOrValue right) {
        matchTypes(right, left.type);
    }

    static void f64_to_i32(String id) {
        buffer += "%" + reg + " = fptosi double " + id + " to i32\n";
        reg++;
    }

    static void i32_to_f64(String id) {
        buffer += "%" + reg + " = sitofp i32 " + id + " to double\n";
        reg++;
    }

    static void f64_to_f32(String id) {
        buffer += "%" + reg + " = fptrunc double " + id + " to float\n";
        reg++;
    }

    static void f32_to_f64(String id) {
        buffer += "%" + reg + " = fext float " + id + " to double\n";
        reg++;
    }

    static void i32_to_f32(String id) {
        buffer += "%" + reg + " = sitofp i32 " + id + " to float\n";
        reg++;
    }

    static void f32_to_i32(String id) {
        buffer += "%" + reg + " = fptosi float " + id + " to i32\n";
        reg++;
    }


///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////

    /////////////////////ARITHMETIC OPERATIONS////////////////////////////////////////
    //ADD
    static void add_i32(String val1, String val2) {
        buffer += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void add_f32(String val1, String val2) {
        buffer += "%" + reg + " = fadd float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void add_f64(String val1, String val2) {
        buffer += "%" + reg + " = fadd double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    //SUB
    static void sub_i32(String val1, String val2) {
        buffer += "%" + reg + " = sub i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sub_f32(String val1, String val2) {
        buffer += "%" + reg + " = fsub float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sub_f64(String val1, String val2) {
        buffer += "%" + reg + " = fsub double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    //MUL
    static void mul_i32(String val1, String val2) {
        buffer += "%" + reg + " = mul i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void mul_f32(String val1, String val2) {
        buffer += "%" + reg + " = fmul float " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void mul_f64(String val1, String val2) {
        buffer += "%" + reg + " = fmul double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    //DIV
    static void div_i32(String val1, String val2) {
        buffer += "%" + reg + " = sdiv i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void div_f32(String val1, String val2) {
        buffer += "%" + reg + " = fdiv float " + val1.replace("f", "") + ", " + val2.replace("f", "") + "\n";
        reg++;
    }

    static void div_f64(String val1, String val2) {
        buffer += "%" + reg + " = fdiv double " + val1 + ", " + val2 + "\n";
        reg++;
    }
/////////////////////ARITHMETIC OPERATIONS////////////////////////////////////////


    /////////////////////ALLOCATE, ASSIGN AND LOAD////////////////////////////////////////
    public static void declare(VariableOrValue v, boolean global) {
        switch (v.type) {
            case INT -> declare_i32(v.getNameOrValue(), global);
            case FLOAT32 -> declare_f32(v.getNameOrValue(), global);
            case FLOAT64 -> declare_f64(v.getNameOrValue(), global);
            default -> {
            }
        }
    }

    public static void declare_i32(String id, boolean global) {
        if (global) {
            header_text += "@" + id + " = global i32 0\n";
        } else {
            buffer += "%" + id + " = alloca i32\n";
        }
    }

    public static void assign_i32(String id, String value) {
        buffer += "store i32 " + value + ", i32* " + id + "\n";
    }

    public static void declare_f32(String id, boolean global) {
        if (global) {
            header_text += "@" + id + " = global float, align 4 0\n";
        } else {
            buffer += "%" + id + " = alloca float, align 4\n";
        }
    }

    public static void assign_f32(String id, String value) {
        String v = LLVMUtils.floatStrToLLVM(value);
        buffer += "store float " + v + ", float* " + id + "\n";
    }

    public static void declare_f64(String id, boolean global) {
        if (global) {
            header_text += "@" + id + " = global double 0\n";
        } else {
            buffer += "%" + id + " = alloca double\n";
        }
    }

    public static void assign_f64(String id, String value) {
        String v = LLVMUtils.doubleStrToLLVM(value);
        buffer += "store double " + v + ", double* " + id + "\n";
    }

    public static void load(VariableOrValue v) {
        buffer += "%" + reg + " = load " + v.type.llvmType + ", " + v.type.llvmType + "* " + v.getNameOrValue() + "\n";
        reg++;
    }

/////////////////////ALLOCATE, ASSIGN AND LOAD////////////////////////////////////////


    public static void printf(VariableOrValue v) {
        switch (v.type) {
            case INT -> printf_int(v.getNameOrValue());
            case FLOAT32 -> printf_float32(v.getNameOrValue());
            case FLOAT64 -> printf_float64(v.getNameOrValue());
            default -> {
            }
        }
    }

    /////////////////////SCANF AND PRINTF////////////////////////////////////////
    static void printf_int(String id) {
//        buffer += "%" + reg + " = load i32, i32* " + id + "\n";
//        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_int, i32 0, i32 0), i32 " + (id) + ")\n";
        reg++;
    }

    static void printf_float32(String id) {
//        buffer += "%" + reg + " = load float, float* " + id + "\n";
//        reg++;
        buffer += "%" + reg + " = fpext float " + (id) + " to double\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @printf_str_float32, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    static void printf_float64(String id) {
//        buffer += "%" + reg + " = load double, double* " + id + "\n";
//        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @printf_str_float64, i32 0, i32 0), double " + (id) + ")\n";
        reg++;
    }

    public static void scanf(VariableOrValue v) {
        switch (v.type) {
            case INT -> scanf_int(v.getNameOrValue());
            case FLOAT32 -> scanf_float32(v.getNameOrValue());
            case FLOAT64 -> scanf_float64(v.getNameOrValue());
            default -> {
            }
        }
    }

    public static void scanf_int(String id) {
        buffer += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @scanf_str_int, i32 0, i32 0), i32* " + id + ")\n";
        reg++;
        buffer += "%" + reg + " = call i32 @getchar()\n";
        reg++;

    }

    public static void scanf_float32(String id) {
        buffer += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @scanf_str_float32, i32 0, i32 0), float* " + id + ")\n";
        reg++;
    }

    public static void scanf_float64(String id) {
        buffer += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @scanf_str_float64, i32 0, i32 0), double* " + id + ")\n";
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

    public static void whileStart() {
        br++;
        buffer += "br label %loop" + br + "\n";
        buffer += "loop" + br + ":\n";
        brstack.push(br);
    }

    public static void whileBodyStart() {
        buffer += "br i1 %" + (reg - 1) + ", label %body" + br + ", label %exit" + br + "\n";
        buffer += "body" + br + ":\n";
        brstack.push(br);
    }

    public static void whileEnd() {
        int b = brstack.pop();
        buffer += "br label %loop" + b + "\n";
        buffer += "exit" + b + ":\n";
    }

    public static void ifStart() {
        br++;
        buffer += "br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        brstack.push(br);
    }

    public static void ifEnd() {
        int b = brstack.pop();

        buffer += "br label %false" + b + "\n";
        buffer += "false" + b + ":\n";
    }

    public static void icmp(VariableOrValue left, VariableOrValue right, ComparisonType comparisonType) {
        buffer += "%" + reg + " = icmp " + (comparisonType == ComparisonType.EQUAL || comparisonType == ComparisonType.NOTEQUAL ? "" : "s") + comparisonType.llvmComparisonName + " " + left.type.llvmType + " " + left.nameOrValue + ", " + right.getNameOrValue() + "\n";
        reg++;
    }

    public static void fcmp(VariableOrValue left, VariableOrValue right, ComparisonType comparisonType) {
        buffer += "%" + reg + " = fcmp o" + comparisonType.llvmComparisonName + " " + left.type.llvmType + " " + left.nameOrValue + ", " + right.getNameOrValue() + "\n";
        reg++;
    }

    private static String getRangeSign(boolean global) {
        return global ? "@" : "%";
    }

    public static void functionStart(Function function, List<VariableOrValue> fParameters) {
        main_text += buffer;
        regToBack = reg;
        buffer = "define " + function.returnType.llvmType + " @" + function.functionName + "(";
        for (int i = 0; i < fParameters.size(); i++) {
            buffer += fParameters.get(i).type.llvmType + "* %" + fParameters.get(i).nameOrValue;
            if (i != fParameters.size() - 1) {
                buffer += ", ";
            }
        }
        buffer += ") nounwind {\n";
        reg = 1;
    }

    public static void functionReturn(VariableOrValue v, Function function) {
        buffer += "ret " + v.type.llvmType + " " + v.nameOrValue + "\n";
    }

    public static void functionEnd() {
        //buffer += "ret " + buffer.substring(buffer.lastIndexOf("%")) + "\n";
        buffer += "}\n";
        header_text += buffer;
        buffer = "";
        reg = regToBack;
    }

    public static void closeMain() {
        main_text += buffer;
        buffer = "";
    }

    public static void callFunction(Function function, LinkedList<VariableOrValue> params) {
        for (int i = 0; i < params.size(); i++) {
            buffer += "%ptr_" + function.functionName + "_" + i + " = alloca float\n";
            buffer += "store float " + params.get(i).getNameOrValue() + ", float* %ptr_" + function.functionName + "_" + i + "\n";
        }
        buffer += "%" + reg + " = call " + function.returnType.llvmType + " @" + function.functionName + "(";
        for (int i = 0; i < params.size(); i++) {
            buffer += params.get(i).type.llvmType + "* " + "%ptr_" + function.functionName + "_" + i;
            if (i != params.size() - 1) {
                buffer += ", ";
            }
        }
        buffer += ")\n";
        reg++;
    }
}

