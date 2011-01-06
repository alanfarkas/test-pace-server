package com.palladium.paf.eval;

import com.palladium.paf.rules.Formula;

public interface IFormulaEvalEngine {
	public double Evaluate(String expression);
	public double evaluate(Formula f, String[] variables, double[] values);
}
