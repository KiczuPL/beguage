package org.example;

class VariableOrValue {
    public String nameOrValue;
    public VarType type;

    public VariableOrValue(String nameOrValue, VarType type) {
        this.nameOrValue = nameOrValue;
        this.type = type;
        if (type == VarType.FLOAT32) {
            this.nameOrValue = LLVMUtils.floatStrToLLVM(nameOrValue);
        } else if (type == VarType.FLOAT64) {
            this.nameOrValue = LLVMUtils.doubleStrToLLVM(nameOrValue);
        }
    }

    public String getNameOrValue() {
        return nameOrValue;
    }

    public void setNameOrValue(String nameOrValue) {
        this.nameOrValue = nameOrValue;
    }

    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }
}