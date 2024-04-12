package org.example;

import java.util.HashMap;
import java.util.Stack;


public class LLVMActions extends BeguageBaseListener {
    HashMap<String, VariableOrValue> variables = new HashMap<>();
    Stack<VariableOrValue> stack = new Stack<>();
    static int BUFFER_SIZE = 16;


    @Override
    public void exitAssign(BeguageParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        VariableOrValue variable = stack.pop();
        variables.put(ID, new VariableOrValue(ID, variable.type));

        if (variable.type == VarType.INT) {
            LLVMGenerator.declare_i32(ID);
            LLVMGenerator.assign_i32(ID, variable.nameOrValue);
        } else if (variable.type == VarType.FLOAT32) {
            LLVMGenerator.declare_f32(ID);
            LLVMGenerator.assign_f32(ID, variable.nameOrValue);
        } else if (variable.type == VarType.FLOAT64) {
            LLVMGenerator.declare_f64(ID);
            LLVMGenerator.assign_f64(ID, variable.nameOrValue);
        }
    }

    @Override
    public void exitReassign(BeguageParser.ReassignContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            error(ctx.getStart().getLine(), "variable was not declared");
        }
        VariableOrValue variable = variables.get(ID);
        VariableOrValue newVariableValue = stack.pop();

        if (variable.type != newVariableValue.type) {
            LLVMGenerator.matchTypes(variable, newVariableValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), variable.type));
            newVariableValue = stack.pop();
        }

        variables.put(ID, new VariableOrValue(ID, newVariableValue.type));

        if (newVariableValue.type == VarType.INT) {
            LLVMGenerator.assign_i32(ID, newVariableValue.nameOrValue);
        } else if (newVariableValue.type == VarType.FLOAT32) {
            LLVMGenerator.assign_f32(ID, newVariableValue.nameOrValue);
        } else if (newVariableValue.type == VarType.FLOAT64) {
            LLVMGenerator.assign_f64(ID, newVariableValue.nameOrValue);
        }
    }


    @Override
    public void exitAdd(BeguageParser.AddContext ctx) {
        VariableOrValue v2 = stack.pop();
        VariableOrValue v1 = stack.pop();

        if (v1.type != v2.type) {
            LLVMGenerator.matchTypes(v1, v2);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), v1.type));
            v2 = stack.pop();
        }

        if (v1.type == VarType.INT) {
            LLVMGenerator.add_i32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.INT));
        } else if (v1.type == VarType.FLOAT32) {
            LLVMGenerator.add_f32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
        } else if (v1.type == VarType.FLOAT64) {
            LLVMGenerator.add_f64(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
        }
    }

    @Override
    public void exitSub(BeguageParser.SubContext ctx) {
        VariableOrValue v2 = stack.pop();
        VariableOrValue v1 = stack.pop();
        if (v1.type != v2.type) {
            LLVMGenerator.matchTypes(v1, v2);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), v1.type));
            v2 = stack.pop();
        }
        if (v1.type == VarType.INT) {
            LLVMGenerator.sub_i32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.INT));
        } else if (v1.type == VarType.FLOAT32) {
            LLVMGenerator.sub_f32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
        } else if (v1.type == VarType.FLOAT64) {
            LLVMGenerator.sub_f64(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
        }
    }

    @Override
    public void exitMul(BeguageParser.MulContext ctx) {
        VariableOrValue v1 = stack.pop();
        VariableOrValue v2 = stack.pop();
        if (v1.type != v2.type) {
            LLVMGenerator.matchTypes(v1, v2);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), v1.type));
            v2 = stack.pop();
        }
        if (v1.type == VarType.INT) {
            LLVMGenerator.mul_i32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.INT));
        } else if (v1.type == VarType.FLOAT32) {
            LLVMGenerator.mul_f32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
        } else if (v1.type == VarType.FLOAT64) {
            LLVMGenerator.mul_f64(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
        }
    }

    @Override
    public void exitDiv(BeguageParser.DivContext ctx) {
        VariableOrValue v2 = stack.pop();
        VariableOrValue v1 = stack.pop();
        if (v1.type != v2.type) {
            LLVMGenerator.matchTypes(v1, v2);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), v1.type));
            v2 = stack.pop();
        }
        if (v1.type == VarType.INT) {
            LLVMGenerator.div_i32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.INT));
        } else if (v1.type == VarType.FLOAT32) {
            LLVMGenerator.div_f32(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
        } else if (v1.type == VarType.FLOAT64) {
            LLVMGenerator.div_f64(v1.nameOrValue, v2.nameOrValue);
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
        }

    }

    @Override
    public void exitId(BeguageParser.IdContext ctx) {
        String ID = ctx.ID().getText();
        if (variables.containsKey(ID)) {
            LLVMGenerator.load(variables.get(ID));
            stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), variables.get(ID).type));
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    @Override
    public void exitTo_int(BeguageParser.To_intContext ctx) {
        VariableOrValue v = stack.pop();
        LLVMGenerator.matchTypes(v, VarType.INT);
        stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.INT));
    }

    @Override
    public void exitTo_float32(BeguageParser.To_float32Context ctx) {
        VariableOrValue v = stack.pop();
        LLVMGenerator.matchTypes(v, VarType.FLOAT32);
        stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
    }

    @Override
    public void exitTo_float64(BeguageParser.To_float64Context ctx) {
        VariableOrValue v = stack.pop();
        LLVMGenerator.matchTypes(v, VarType.FLOAT64);
        stack.push(new VariableOrValue("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
    }


    ///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////
    @Override
    public void exitInt(BeguageParser.IntContext ctx) {
        stack.push(new VariableOrValue(ctx.INT().getText(), VarType.INT));
    }

    @Override
    public void exitFloat32(BeguageParser.Float32Context ctx) {
        stack.push(new VariableOrValue(ctx.FLOAT32().getText(), VarType.FLOAT32));
    }

    @Override
    public void exitFloat64(BeguageParser.Float64Context ctx) {
        stack.push(new VariableOrValue(ctx.FLOAT64().getText(), VarType.FLOAT64));
    }

    @Override
    public void exitRead(BeguageParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = VarType.fromString(ctx.READ_TYPE().getText());
        if (type == VarType.UNRECOGNIZED) {
            error(ctx.getStart().getLine(), "unrecognized type");
        }
        VariableOrValue v = new VariableOrValue(ID, type);
        if (variables.containsKey(ID)) {
            if (variables.get(ID).type != type) {
                error(ctx.getStart().getLine(), "variable already declared with different type");
            }
        } else {
            variables.put(ID, v);
            LLVMGenerator.declare(v);
        }
        LLVMGenerator.scanf(v);
    }


    @Override
    public void exitWrite(BeguageParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        if (variables.containsKey(ID)) {
            VariableOrValue v = variables.get(ID);
            if (v.type != null) {
                LLVMGenerator.printf(v);
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable");
        }
    }


    @Override
    public void exitProgram(BeguageParser.ProgramContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    public static void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(-1);
    }


}

enum VarType {
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