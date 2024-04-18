package org.example;

public enum ComparisonType {
    EQUAL("eq"),
    NOTEQUAL("ne"),
    GREATER("gt"),
    LESS("le"),
    GREATEREQUAL("ge"),
    LESSEQUAL("le");
    String llvmComparisonName;

    ComparisonType(String llvmComparisonName) {
        this.llvmComparisonName = llvmComparisonName;
    }

    public String getLlvmComparisonName() {
        return llvmComparisonName;
    }
}
