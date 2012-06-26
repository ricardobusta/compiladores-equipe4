package compiler.frame;import java.util.List;public abstract class Frame implements compiler.temp.TempMap {    public compiler.temp.Label name;    public List<Access> formals;        public abstract Frame newFrame(String name, List formals);    public abstract Access allocLocal(boolean escape);    public abstract compiler.temp.Temp FP();    public abstract int wordSize();    public abstract compiler.tree.Exp externalCall(String func, List<compiler.tree.Exp> args);    public abstract compiler.temp.Temp RV();    public abstract String string(compiler.temp.Label label, String value);    public abstract compiler.temp.Label badPtr();    public abstract compiler.temp.Label badSub();    public abstract String tempMap(compiler.temp.Temp temp);    public abstract List<compiler.assem.Instr> codegen(List<compiler.tree.Stm> stms);    public abstract void procEntryExit1(List<compiler.tree.Stm> body);    public abstract void procEntryExit2(List<compiler.assem.Instr> body);    public abstract void procEntryExit3(List<compiler.assem.Instr> body);    public abstract compiler.temp.Temp[] registers();    public abstract void spill(List<compiler.assem.Instr> insns, compiler.temp.Temp[] spills);    public abstract String programTail(); //append to end of target code}