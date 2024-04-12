package org.example;// Generated from Beguage.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BeguageParser}.
 */
public interface BeguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BeguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BeguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BeguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite(BeguageParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite(BeguageParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BeguageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BeguageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reassign}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReassign(BeguageParser.ReassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reassign}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReassign(BeguageParser.ReassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRead(BeguageParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link BeguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRead(BeguageParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link BeguageParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(BeguageParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link BeguageParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(BeguageParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link BeguageParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(BeguageParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link BeguageParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(BeguageParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link BeguageParser#expression0}.
	 * @param ctx the parse tree
	 */
	void enterSub(BeguageParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link BeguageParser#expression0}.
	 * @param ctx the parse tree
	 */
	void exitSub(BeguageParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link BeguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(BeguageParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link BeguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(BeguageParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link BeguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterMul(BeguageParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link BeguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitMul(BeguageParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link BeguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(BeguageParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link BeguageParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(BeguageParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterId(BeguageParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitId(BeguageParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float64}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterFloat64(BeguageParser.Float64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code float64}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitFloat64(BeguageParser.Float64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code float32}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterFloat32(BeguageParser.Float32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code float32}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitFloat32(BeguageParser.Float32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterInt(BeguageParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitInt(BeguageParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code to_int}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterTo_int(BeguageParser.To_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code to_int}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitTo_int(BeguageParser.To_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code to_float64}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterTo_float64(BeguageParser.To_float64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code to_float64}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitTo_float64(BeguageParser.To_float64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code to_float32}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterTo_float32(BeguageParser.To_float32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code to_float32}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitTo_float32(BeguageParser.To_float32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterPar(BeguageParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link BeguageParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitPar(BeguageParser.ParContext ctx);
}