package com.pace.server;

import com.pace.db.PacePOJO;

import cern.colt.matrix.DoubleMatrix2D;

/**
 * @author jim
 * Just a wrapper class for the data matrix classes, meant to carry grids of data from mathematical operations
 *
 */
public class PaceDataSet extends PacePOJO {
	
	private DoubleMatrix2D data;

	
	public PaceDataSet(double[][] inData) {
		data.assign(inData);
	}
	
	public PaceDataSet() {

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
	
	public double[][] getData() {
		return data.toArray();
	}

	public void setData(double[][] inData) {
		data.assign(inData);
	}
	
}
