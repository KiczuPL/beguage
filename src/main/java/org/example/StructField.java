package org.example;

public class StructField {
    String number;
    VarType type;

    public StructField(VarType type, int size) {
        this.number = Integer.toString(size);
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }
}
