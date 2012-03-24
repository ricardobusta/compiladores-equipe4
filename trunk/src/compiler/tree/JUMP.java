package compiler.tree;

import compiler.temp.Label;
import compiler.temp.LabelList;
import compiler.temp.Temp;

public class JUMP extends Stm {
	public Exp exp;
	public LabelList targets;
	public JUMP(Exp e, LabelList t) {exp=e; targets=t;}
	public JUMP(Label target) {
		this(new NAME(target), new LabelList(target,null));
	}
	public ExpList kids() {return new ExpList(exp,null);}
	public Stm build(ExpList kids) {
		return new JUMP(kids.head,targets);
	}
}