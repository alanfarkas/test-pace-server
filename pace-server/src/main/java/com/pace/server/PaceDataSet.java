package com.pace.server;

import cern.colt.matrix.DoubleMatrix2D;

/**
 * @author jim
 * Just a wrapper class for the data matrix classes, meant to carry grids of data from mathematical operations
 *
 */
public class PaceDataSet {
	
	private DoubleMatrix2D data;
	
	public PaceDataSet(double[][] inData) {
		data.assign(inData);
	}
	
	
	

}
