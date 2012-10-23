/**
 * 
 */
package com.pace.server.assortment;

import java.util.ArrayList;
import java.util.List;

import com.pace.base.app.PafDimSpec;
import com.pace.db.PacePOJO;
import com.pace.server.PaceDataSet;

/**
 * @author jim
 *
 */
public class AsstSet extends PacePOJO {
	String label;
	
	PafDimSpec timePeriods = new PafDimSpec();		
	PafDimSpec dimToMeasure = new PafDimSpec();	
	PafDimSpec dimToCluster = new PafDimSpec();
	PafDimSpec measures = new PafDimSpec();
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	public int getNumRows() {
		if (dimToCluster != null)
			return dimToCluster.getExpressionList().length;
		else
			return 0;
	}
	
	public int getNumCols() {
		if (timePeriods == null || dimToMeasure == null || dimToCluster == null || measures == null) 
			return 0;
		else
			return timePeriods.getExpressionList().length * 
					dimToMeasure.getExpressionList().length *
					dimToCluster.getExpressionList().length *
					measures.getExpressionList().length;
	}

	
	
	public PafDimSpec getTimePeriods() {
		return timePeriods;
	}
	public void setTimePeriods(PafDimSpec timePeriods) {
		this.timePeriods = timePeriods;
	}
	public PafDimSpec getDimToMeasure() {
		return dimToMeasure;
	}
	public void setDimToMeasure(PafDimSpec dimToMeasure) {
		this.dimToMeasure = dimToMeasure;
	}
	public PafDimSpec getDimToCluster() {
		return dimToCluster;
	}
	public void setDimToCluster(PafDimSpec dimToCluster) {
		this.dimToCluster = dimToCluster;
	}
	public PafDimSpec getMeasures() {
		return measures;
	}
	public void setMeasures(PafDimSpec measures) {
		this.measures = measures;
	}
	
	public AsstSet() {
		super();
	}	
	


}
