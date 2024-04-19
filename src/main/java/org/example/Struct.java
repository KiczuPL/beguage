package org.example;

import java.util.List;
import java.util.Map;

public class Struct {
    String name;
    Map<String, StructField> fields;

    public Struct(String structName, List<VariableOrValue> structFields) {
        this.name = structName;
        fields = new java.util.HashMap<>();
        for (VariableOrValue field : structFields) {
            fields.put(field.nameOrValue, new StructField(field.type, fields.size()));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, StructField> getFields() {
        return fields;
    }

    public void setFields(Map<String, StructField> fields) {
        this.fields = fields;
    }
}
