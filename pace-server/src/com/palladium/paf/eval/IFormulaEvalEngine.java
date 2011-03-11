package com.palladium.paf.eval;

import com.pace.base.rules.Formula;

public interface IFormulaEvalEngine {
	public double Evaluate(String expression);
	public double evaluate(Formula f, String[] variables, double[] values);
}
