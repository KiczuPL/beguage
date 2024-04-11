package beguage;


import java.util.HashSet;
public class LLVMActions extends BeguageBaseListener{
    HashSet<String> variables = new HashSet<String>();

    @Override
    public void exitProg(BeguageParser.ProgContext ctx) {
        System.out.println( LLVMGenerator.generate() );
    }

    @Override
    public void exitAssign(BeguageParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        if( ! variables.contains(ID) ) {
            variables.add(ID);
            LLVMGenerator.declare(ID);
        }
        LLVMGenerator.assign(ID, INT);
    }

    @Override
    public void exitWrite(BeguageParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        if( variables.contains(ID) ) {
            LLVMGenerator.printf( ID );
        } else {
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }

    @Override
    public void exitRead(BeguageParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        if( ! variables.contains(ID) ) {
            variables.add(ID);
            LLVMGenerator.declare(ID);
        }
        LLVMGenerator.scanf(ID);
    }

}
