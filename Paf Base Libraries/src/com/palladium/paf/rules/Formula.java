package com.palladium.paf.rules;

import java.util.ArrayList;
import java.util.Arrays;

import org.nfunk.jep.JEP;

import com.palladium.paf.PafException;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.funcs.IPafFunction;


/**
 * This class represents a formula used in the rules.xml file, more generically, 
 * within a rule. It is assumed to be of the form "SLS_DLR = SLS_AUR / SLS_U" and
 * is broken up into pieces to support processing within the evaluation engine. 
 * This can include custom functions like FWOS(SLS_UNITS) and NEXT(Time, 1). 
 * The left side term can contain a formula, but of the Next/Prev type only.
 *
 * @version	x.xx
 * @author jim
 *
 */
public class Formula {

		private String resultTerm;
        // the term on the left hand side of the = sign
        
		private String expression;
        // the formula on the right hand side of the = sign
        
        private String[] expressionTerms;
        // an array of terms occuring on the right hand side.
        
        private boolean[] functionTermFlags;
        // corresponds to the expressionTerms[], and is true when the term is 
        // a custom function
        
        private IPafFunction[] functionTerms;
        // corresponds to the expressionTerms[], and holds the complex function
        // object when the term is an function, or null
        
        private boolean resultFunction;
        // a flag indicate that the term on the left side of the equation is a function
        
        private IPafFunction resultFunctionObj;
        // an object to hold the function, when the left had side of the equation is a function
        
        private MeasureFunctionFactory functionFactory;
        // a factory class containing all defined custom functions in the application. Used
        // to resolve custom function strings in the equation and construct the function
        // evaluation class.
        
        private JEP jep;
        // an interface to a formula parser and evaluator. It holds a parse tree representation
        // of the jepFormula and can be used to evaluate the formula.
        
        private String jepFormula; 
        // this holds a simplified version of the formula where complex
        // terms are replaced by simple variables. This allows the JEP
        // parser to pre parse the formula while 
     
        
        private boolean isParsed = false; 
        // this flag is necessary to identify if functions have been properly parsed
        
        public Formula() {}
        

        /**
         * Non initializing variant. Used for file processing, but doesn't include fucntion
         * factory for resolving custom functions.
         * 
         * @param fullExpression
         */
        public Formula(String fullExpression) {
        	
            if (!fullExpression.contains("=")) 
                    throw new IllegalArgumentException(
                    "The single string contstructor for this object must use a full formula (e.g. X = Y + Z)");
            String[] pieces = fullExpression.split("=");
            if (pieces.length > 2)
                throw new IllegalArgumentException(
                "Formulas can only contain a single = sign (e.g. X = Y + Z)");
                       
        	this.resultTerm = pieces[0].trim();
            this.expression = pieces[1].trim();
        }
        
        private Object readResolve() {
        	
            if (functionFactory == null) {            	
            	isParsed = false;
            }
            
            //TTN-769
            if ( this.resultTerm != null ) {
            	this.resultTerm = this.resultTerm.trim();
            }

            //TTN-769
            if ( this.expression != null ) {
            	this.expression = this.expression.trim();	
            }           
            
            return this;
          }

        /**
         * Non initializing variant. Used for file processing, but doesn't include fucntion
         * factory for resolving custom functions.
         * 
         * @param resultTerm
         * @param expression
         */
        public Formula(String resultTerm, String expression) {
        	this.resultTerm = resultTerm.trim();
            this.expression = expression.trim();
        }
        
        public Formula(String resultTerm, String expression, MeasureFunctionFactory functionFactory) throws PafException {
            this.functionFactory = functionFactory;
        	this.resultTerm = resultTerm.trim();
            this.expression = expression.trim();
        	
        	init();
        }
                
        
        private void init() throws PafException {
            this.expressionTerms = extractTerms();
            this.setResultTerm(resultTerm);
            
            // convert complex formula into simplified jep formula
            // i.e. MD_% * FWOS(SLS_UNITS) + 1 / SLS_$ becomes
            // x1 * x2 + 1 / x3
            
            this.jepFormula = new String(this.expression);
            StringBuffer sb = new StringBuffer(this.expression);
            
            
            jep = new JEP();
            for (int i = 0; i < getExpressionTerms().length; i++ ) {
                sb.replace(sb.indexOf(getExpressionTerms()[i]), getExpressionTerms()[i].length()+sb.indexOf(getExpressionTerms()[i]), "X" + i);
            	jep.addVariable("X" + i, 0);
            }
            jepFormula = sb.toString();
//            try {
            	jep.parseExpression( jepFormula );
//            }
//            catch (ParseException parseEx) {
//            	throw new PafException("Error parsing formula " + this.toString(), PafErrSeverity.Error, parseEx);
//            }
            
        }
        
        /**
         *	This method resolves the given formula to a double value, assuming
         *  that all the terms in the expression terms collection are resolved
         *  using the termValues collection and match in sequence.
         *
         * @param termValues
         * @return
         */
        public double evaluate(double[] termValues) {
            
            double result = Double.NaN;
            
            for (int i = 0; i < termValues.length ; i++) {
                jep.setVarValue("X" + i, termValues[i]);
            }
            
            result = jep.getValue();
            
            return result;
            
        }
        
        
        private String[] extractTerms() throws PafException {
            
        	String[] terms = parseExpression(expression);
        	
            // process terms that are functions and set flags
            functionTermFlags = new boolean[terms.length];
            functionTerms = new IPafFunction[terms.length];
            for (int i = 0; i < terms.length; i++) {
                if (terms[i].startsWith("@")) { 
                    functionTermFlags[i] = true;
                    functionTerms[i] = functionFactory.getFunction(terms[i]);
                    
                }
                else {
                    functionTermFlags[i] = false;
                }
            }
            
            return terms;
        }
        
        
        private static String[] parseExpression(String expStr) {
            int cpos = 0;
            boolean inTerm = false;
            int termType = 0; // 0 - primitive, 1 - function
            int parenCnt = 0; // used to inc/dec parenthesis counts for overall expression
            int funcParenCnt = 0; // used to inc/dec parenthesis counts for nested functions.
            ArrayList<String> termList = new ArrayList<String>();
            StringBuffer currentToken = new StringBuffer();
            while ( cpos < expStr.length() ) {
                switch (expStr.charAt(cpos)) {
                case '+':
                case '-':
                case '*':
                case '/':
                case ' ':
                    if (inTerm && termType == 0) { // end term, simple measure name
                        inTerm = false;
                        if (currentToken.toString().trim().length() > 0)  termList.add(currentToken.toString().trim());
                        currentToken = new StringBuffer();
                    }
                    else if (inTerm && termType == 1) { // function, just add
                        currentToken.append(expStr.charAt(cpos)); 
                    }
                    break;                    
                    
                                        
                case '@':
                    if (inTerm && (parenCnt == 0) ) {
                        // starting new term, but stay 'interm'
                    	if (currentToken.toString().trim().length() > 0)  termList.add(currentToken.toString().trim());
                       currentToken = new StringBuffer();
                       currentToken.append(expStr.charAt(cpos));
                       termType = 1;
                    }
                    else if (inTerm && (parenCnt > 0)) {
                    	// nested function or malformed expression. Assumes nested function, so append to current token
                    	currentToken.append(expStr.charAt(cpos));
                    }
                    else { // start new term, assumes currentToken is empty
                        currentToken.append(expStr.charAt(cpos));                    
                        termType = 1;
                        inTerm = true;
                    }
                    
                    break;
                    
                case '(':
                	parenCnt++;
                	// currently only increment 
                    if (inTerm && termType == 1) {
                    	currentToken.append(expStr.charAt(cpos));
                        funcParenCnt++;                         	
                    }
                    break;                     
                    
                case ')':  
                    parenCnt--;                 	
                    if (inTerm && termType == 1) {                      
                        currentToken.append(expStr.charAt(cpos));
                        funcParenCnt--;
                    }
                    if (currentToken.toString().trim().length() > 0 && inTerm && termType == 1 && funcParenCnt == 0) {
                    	termList.add(currentToken.toString().trim());
                        currentToken = new StringBuffer();                    	
                        inTerm = false;                    	
                    }
                    break;                    
                    
                case '0':
                case '1':
                case '2':
                case '3':                    
                case '4':
                case '5':
                case '6':
                case '7':                       
                case '8':
                case '9':
                case '.':
                    // if in term append, or else assume primitive number and skip
                    if (inTerm) currentToken.append(expStr.charAt(cpos));
                    break;
                    
                case ',':
                    // better be in a function
                    if (termType == 1) currentToken.append(expStr.charAt(cpos));
                    break; 
                     
                default: //assumes alpha
                    // just add 
                    if (!inTerm) { //start of measure name
                        inTerm = true;
                        termType = 0;
                    }
                    currentToken.append(expStr.charAt(cpos));
                    break;
                       
                }
                
                cpos++;
            }
            if (currentToken.toString().trim().length() > 0) termList.add(currentToken.toString().trim());
            if (parenCnt != 0) throw new IllegalArgumentException("Invalid formula syntax, parenthesis don't match [" + expStr + "]");
            return termList.toArray(new String[0]);

        }

        
        /**
         *	Return the measure terms. This will strip out the underlying measure
         *  from functions if necessary
         *
         * @return String array of measure terms
         */
        public String[] getTermMeasures() {
        	String[] measTerms = new String[expressionTerms.length];

        	for (int i = 0; i < measTerms.length; i++) {
        		if (functionTermFlags[i]) {
        			measTerms[i] = functionTerms[i].getMeasureName();
        		}
        		else {
        			measTerms[i] = expressionTerms[i];
        		}
        	}
        	return measTerms;
        }
        
        
        /**
         * @return Returns the expressionTerms.
         * @throws PafException 
         */
        public String[] getExpressionTerms() throws PafException {
            if (expressionTerms == null && expression==null)
                return new String[0];
            if (expressionTerms == null && expression != null)
                expressionTerms = extractTerms();
            return expressionTerms;
        }
        /**
         * @param expression The expression to set.
         * @throws PafException 
         */
        public void setExpression(String expression) throws PafException {
            this.expression = expression;
            this.expressionTerms = extractTerms();
        }
        /**
         * @param expressionTerms The expressionTerms to set.
         */
        public void setExpressionTerms(String[] expressionTerms) {
            this.expressionTerms = expressionTerms;
        }
        /**
         * @param resultTerm The resultTerm to set.
         * @throws PafException 
         */
        public void setResultTerm(String resultTerm) throws PafException {
        	this.resultTerm = resultTerm;
        	if(functionFactory != null) {
        		if (functionFactory.isFunction(this.resultTerm)) {
        			resultFunction = true;
        			this.resultFunctionObj = functionFactory.getFunction(this.resultTerm);
        		}
        	}
        }
        
        public String toString() {
            return this.resultTerm + " = " + this.expression;
        }

        /* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((expression == null) ? 0 : expression.hashCode());
			result = prime * result + Arrays.hashCode(expressionTerms);
			result = prime
					* result
					+ ((functionFactory == null) ? 0 : functionFactory
							.hashCode());
			result = prime * result + Arrays.hashCode(functionTermFlags);
			result = prime * result + (isParsed ? 1231 : 1237);
			result = prime * result
					+ ((jepFormula == null) ? 0 : jepFormula.hashCode());
			result = prime * result + (resultFunction ? 1231 : 1237);
			result = prime * result
					+ ((resultTerm == null) ? 0 : resultTerm.hashCode());
			return result;
		}


		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Formula other = (Formula) obj;
			if (expression == null) {
				if (other.expression != null)
					return false;
			} else if (!expression.equals(other.expression))
				return false;
			if (!Arrays.equals(expressionTerms, other.expressionTerms))
				return false;
			if (functionFactory == null) {
				if (other.functionFactory != null)
					return false;
			} else if (!functionFactory.equals(other.functionFactory))
				return false;
			if (!Arrays.equals(functionTermFlags, other.functionTermFlags))
				return false;
			if (isParsed != other.isParsed)
				return false;
			if (jepFormula == null) {
				if (other.jepFormula != null)
					return false;
			} else if (!jepFormula.equals(other.jepFormula))
				return false;
			if (resultFunction != other.resultFunction)
				return false;
			if (resultTerm == null) {
				if (other.resultTerm != null)
					return false;
			} else if (!resultTerm.equals(other.resultTerm))
				return false;
			return true;
		}
        
        /* These extract function are named as such to avoid AXIS/Soap stuff
         * from invoking them.
         */
      
		/**
         * @return Returns the functionTerms.
         * Violates bean naming convention to avoid soap invocation on this method.
         */
        public IPafFunction[] extractFunctionTerms() {
            return functionTerms;
        }
        
        public IPafFunction extractResultFunction() {
        	return resultFunctionObj;
        }
        
        public JEP extractJep() {
        	return jep;
        }

        /**
         * @return Returns the resultFunction.
         */
        public boolean isResultFunction() {
           return resultFunction;
        }

        /**
         * @param resultFunction The resultFunction to set.
         */
        public void setResultFunction(boolean resultFunction) {
            this.resultFunction = resultFunction;
        }

		public boolean isParsed() {
			return isParsed;
		}

		public void setParsed(boolean isParsed) {
			this.isParsed = isParsed;
		}



		/**
		 *	Visible method for kicking off parsing of formulas, once a function factory
		 *  has been loaded. Several constructors are available to prepare a formula without
		 *  fully processing them into function objects. This method is used after those
		 *  constructors. 
		 *
		 * @param functionFactory
		 * @throws PafException
		 */
		public void parse(MeasureFunctionFactory functionFactory) throws PafException {
			this.functionFactory = functionFactory;
			init();
			setParsed(true);
		}
		
		
        public String getExpression() {
            return expression;
        }

        public String getResultTerm() {
            return resultTerm;
        }
        
        
        public String getResultMeasure() {
        	if ( this.isResultFunction() )
        		return resultFunctionObj.getMeasureName();
        	else
        		return resultTerm;
        }
        
        
        public boolean[] getFunctionTermFlags() {
            return functionTermFlags;
        }

        

}

