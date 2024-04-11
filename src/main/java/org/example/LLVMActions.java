package org.example;

import java.util.HashMap;
import java.util.Stack;


public class LLVMActions extends BeguageBaseListener {
    HashMap<String, Variable> variables = new HashMap<>();
    Stack<Value> stack = new Stack<>();
    static int BUFFER_SIZE = 16;


    @Override
    public void exitAssign(BeguageParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value variable = stack.pop();
        variables.put(ID, new Variable(ID, variable.type));

        if (variable.type == VarType.INT) {
            LLVMGenerator.declare_i32(ID);
            LLVMGenerator.assign_i32(ID, variable.valueStr);
        } else if (variable.type == VarType.FLOAT32) {
            LLVMGenerator.declare_f32(ID);
            LLVMGenerator.assign_f32(ID, variable.valueStr);
        } else if (variable.type == VarType.FLOAT64) {
            LLVMGenerator.declare_f64(ID);
            LLVMGenerator.assign_f64(ID, variable.valueStr);
        }
    }

    @Override
    public void exitReassign(BeguageParser.ReassignContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            error(ctx.getStart().getLine(), "variable was not declared");
        }

        Value variable = stack.pop();
        variables.put(ID, new Variable(ID, variable.type));

        if (variable.type == VarType.INT) {
            LLVMGenerator.assign_i32(ID, variable.valueStr);
        } else if (variable.type == VarType.FLOAT32) {
            LLVMGenerator.assign_f32(ID, variable.valueStr);
        } else if (variable.type == VarType.FLOAT64) {
            LLVMGenerator.assign_f64(ID, variable.valueStr);
        }
    }


    @Override
    public void exitAdd(BeguageParser.AddContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.add_i32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            } else if (v1.type == VarType.FLOAT32) {
                LLVMGenerator.add_f32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
            } else if (v1.type == VarType.FLOAT64) {
                LLVMGenerator.add_f64(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSub(BeguageParser.SubContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.sub_i32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            } else if (v1.type == VarType.FLOAT32) {
                LLVMGenerator.sub_f32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
            } else if (v1.type == VarType.FLOAT64) {
                LLVMGenerator.sub_f64(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
            }
        } else {
            error(ctx.getStart().getLine(), "sub type mismatch");
        }
    }

    @Override
    public void exitMul(BeguageParser.MulContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.mul_i32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            } else if (v1.type == VarType.FLOAT32) {
                LLVMGenerator.mul_f32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
            } else if (v1.type == VarType.FLOAT64) {
                LLVMGenerator.mul_f64(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitDiv(BeguageParser.DivContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.div_i32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            } else if (v1.type == VarType.FLOAT32) {
                LLVMGenerator.div_f32(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT32));
            } else if (v1.type == VarType.FLOAT64) {
                LLVMGenerator.div_f64(v1.valueStr, v2.valueStr);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.FLOAT64));
            }
        } else {
            error(ctx.getStart().getLine(), "div type mismatch");
        }
    }

    @Override
    public void exitId(BeguageParser.IdContext ctx){
        stack.push(new Value(ctx.ID().getText(), variables.get(ctx.ID().getText()).type));
    }



    ///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////
///////////////////////////////READY TO USE////////////////////////////////////////
    @Override
    public void exitInt(BeguageParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT));
    }

    @Override
    public void exitFloat32(BeguageParser.Float32Context ctx) {
        stack.push(new Value(ctx.FLOAT32().getText(), VarType.FLOAT32));
    }

    @Override
    public void exitFloat64(BeguageParser.Float64Context ctx) {
        stack.push(new Value(ctx.FLOAT64().getText(), VarType.FLOAT64));
    }

    @Override
    public void exitRead(BeguageParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = VarType.fromString(ctx.READ_TYPE().getText());
        if (type == VarType.UNRECOGNIZED) {
            error(ctx.getStart().getLine(), "unrecognized type");
        }
        Variable v = new Variable(ID, type);
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
            Variable v = variables.get(ID);
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

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }


}

enum VarType {
    INT("i32"), FLOAT32("float"), FLOAT64("double"), UNRECOGNIZED("");
    private final String llvmType;

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

class Value {
    public String valueStr;
    public VarType type;

    public Value(String valueStr, VarType type) {
        this.valueStr = valueStr;
        this.type = type;
        if (type == VarType.FLOAT32) {
            this.valueStr = LLVMUtils.floatStrToLLVM(valueStr);
        } else if (type == VarType.FLOAT64) {
            this.valueStr = LLVMUtils.doubleStrToLLVM(valueStr);
        }
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }

    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }
}

class Variable {
    public String name;
    public VarType type;

    public Variable(String name, VarType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VarType getType() {
        return type;
    }

    public void setType(VarType type) {
        this.type = type;
    }
}