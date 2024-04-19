package org.example;

import java.util.List;

public class Function {
    String functionName;
    VarType returnType;
    List<VariableOrValue> parameters;

    public Function(String function, VarType fReturnType, List<VariableOrValue> fParameters) {
        this.functionName = function;
        this.returnType = fReturnType;
        this.parameters = fParameters;
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
