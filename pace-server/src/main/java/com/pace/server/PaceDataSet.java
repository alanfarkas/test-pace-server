package com.pace.server;

import java.util.Map;

import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix2D;

import com.pace.db.PacePOJO;

/**
 * @author jim
 * Just a wrapper class for the data matrix classes, meant to carry grids of data from mathematical operations
 *
 */
public class PaceDataSet extends PacePOJO {
	
	private DoubleMatrix2D data;
	transient private Map<Integer, String>  clusterRowMap;
	
	
	public PaceDataSet() {
	}

	public PaceDataSet(double[][] inData) {
		this.data = DoubleFactory2D.dense.make(inData);
	}
	
	public PaceDataSet(double[][] inData, Map<Integer, String> clusterRowMap) {
		this.data = DoubleFactory2D.dense.make(inData);
		this.clusterRowMap = clusterRowMap;
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

	public Map<Integer, String>  getClusterRowMap() {
		return clusterRowMap;
	}

	public void setClusterRowMap(Map<Integer, String>  clusterRowMap) {
		this.clusterRowMap = clusterRowMap;
	}
}
