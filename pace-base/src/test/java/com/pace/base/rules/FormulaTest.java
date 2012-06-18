package com.pace.base.rules;

import com.pace.base.PafException;
import com.pace.base.app.MeasureFunctionFactory;
import com.pace.base.funcs.CustomFunctionDef;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FormulaTest extends TestCase {

    public static void main(String[] args) {
        new FormulaTest().testFormulaString();
    }

    /*
     * Test method for 'com.pace.base.rules.Formula.Formula(String)'
     */
    public void testFormulaString() {
    	
    	String expressionTerm = "EOPRTL_DLR";
    	String resultMeasure = "BOPRTL_DLR";
    	
    	//@Next(BOPRTL_DLR, Time, 1) = EOPRTL_DLR
        String s = "@Next(" + resultMeasure + ", Time, 1) = " + expressionTerm;
        Formula f;
        try {
            f = new Formula(s);
            
            //load function factory
            
            
            f.parse(new MeasureFunctionFactory(getTestFunctions() ) );
            Assert.assertNotNull(f.getExpressionTerms());
            
            Assert.assertEquals(1, f.getExpressionTerms().length);
            Assert.assertEquals(expressionTerm, f.getExpressionTerms()[0]);
           
            Assert.assertEquals(resultMeasure, f.getResultMeasure());
            
            /*for (String exp : f.getExpressionTerms()) {
            	System.out.println(exp);
            }*/
            
            //System.out.println("------------------");
            
        } catch (PafException e) {
            e.printStackTrace();
            Assert.fail();
        }
        
    }
    
    public void testFormulaStringString() {
        String s1 = "@Next(BOPRTL_DLR, Time, 1)";
        String s2 = "EOPRTL_DLR";
        Formula f;
        try {
            f = new Formula(s1, s2);
            f.parse(new MeasureFunctionFactory(getTestFunctions() ) );
            Assert.assertNotNull(f.getExpressionTerms());
            Assert.assertEquals(1, f.getExpressionTerms().length);
            Assert.assertEquals(s2, f.getExpressionTerms()[0]);
           /* for (String exp : f.getExpressionTerms()) {
            	System.out.println(exp);
            }
            System.out.println("------------------");*/
        } catch (PafException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
    
    public void testComplexFormulaString() {
        String s1 = "ResuleMsr";
        String s2 = "((((GroupNo - 1) / (GroupNo - 1)) - 1) * Sales.Cost) * (0 - 1)";
        Formula f;
        try {
            f = new Formula(s1, s2);
            f.parse(new MeasureFunctionFactory(getTestFunctions() ) );
            Assert.assertNotNull(f.getExpressionTerms());
            
            Assert.assertEquals(3, f.getExpressionTerms().length);
            String groupNo = "GroupNo";
			Assert.assertEquals(groupNo, f.getExpressionTerms()[0]);
			Assert.assertEquals(groupNo, f.getExpressionTerms()[1]);
			Assert.assertEquals("Sales.Cost", f.getExpressionTerms()[2]);
//            for (String exp : f.getExpressionTerms()) {
//            	System.out.println(exp);
//            }
//            System.out.println("------------------");
        } catch (PafException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }    
    
    
    public static CustomFunctionDef[] getTestFunctions() {
        CustomFunctionDef[] cfds = new CustomFunctionDef[1];
        cfds[0] = new CustomFunctionDef();
        cfds[0].setClassName("com.pace.base.funcs.F_Next");
        cfds[0].setFunctionName("@NEXT");
        
        
        
        return cfds;
        
        
        
    }
    
    
    
}
