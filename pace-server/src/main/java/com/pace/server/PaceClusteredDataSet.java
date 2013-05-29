package com.pace.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.stat.clustering.Cluster;
import org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint;

public class PaceClusteredDataSet {
	private PaceDataSet clusterData;
	
	private Map<String, Integer>clusterKeys = new HashMap<String, Integer>();
	private Map<Integer, String> clusterRowMap = new HashMap<Integer, String>();
	private List<Cluster<EuclideanIntegerPoint>> clusters;

	public PaceDataSet getClusterData() {
		return clusterData;
	}

	public void setClusterData(PaceDataSet clusterData) {
		this.clusterData = clusterData;
	}

	public Map<String, Integer> getClusterKeys() {
		return clusterKeys;
	}

	public void setClusterKeys(Map<String, Integer> clusterKeys) {
		this.clusterKeys = clusterKeys;
	}

	public List<Cluster<EuclideanIntegerPoint>> getClusters() {
		return clusters;
	}

	public void setClusters(List<Cluster<EuclideanIntegerPoint>> clusters) {
		this.clusters = clusters;
	}

	public Map<Integer, String> getClusterRowMap() {
		return clusterRowMap;
	}

	public void setClusterRowMap(Map<Integer, String> clusterRowMap) {
		this.clusterRowMap = clusterRowMap;
	}
	
}
