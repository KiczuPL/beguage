package org.example;

public class Function {
    String functionName;
    VarType returnType;

    public Function(String function, VarType fReturnType) {
        this.functionName = function;
        this.returnType = fReturnType;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public VarType getReturnType() {
        return returnType;
    }

    public void setReturnType(VarType returnType) {
        this.returnType = returnType;
    }
}
