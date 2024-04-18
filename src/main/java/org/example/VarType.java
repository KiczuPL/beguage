package org.example;

public enum VarType {
    INT("i32"), FLOAT32("float"), FLOAT64("double"), UNRECOGNIZED("");
    public final String llvmType;

    VarType(String llvmType) {
        this.llvmType = llvmType;
    }

    static VarType fromString(String s) {
        switch (s) {
            case "i32" -> {
                return INT;
            }
            case "f32" -> {
                return FLOAT32;
            }
            case "f64" -> {
                return FLOAT64;
            }
            default -> {
                return UNRECOGNIZED;
            }
        }
    }
}
