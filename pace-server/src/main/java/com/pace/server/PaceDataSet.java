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
	
	public double[] getRow(int index) {
		return data.viewRow(index).toArray();
	}

	public int getRowCount() {
		return data.rows();
	}
	
	public int getColCount() {
		return data.columns();
	}

}
