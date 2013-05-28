/**
 *
 * Use accessors for internal properties to avoid issues w lazy loaded properties.
 * 
 */
package com.pace.server.assortment;

import com.pace.base.app.PafDimSpec2;
import com.pace.db.PacePOJO;

/**
 * @author jim
 *
 */
public class AsstSet extends PacePOJO {
	private String label;
	private PafDimSpec2 timePeriods;		
	private PafDimSpec2 dimToMeasure;	
	private PafDimSpec2 dimToCluster;
	private PafDimSpec2 measures;
	
	public AsstSet(String clientId, String sessionId) {
		super(clientId, sessionId);
	}
	
	public AsstSet(String label) {
		super();
		this.label = label;
	}

	public AsstSet() {
		super();
	}	
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	public int getNumRows() {
		// accessor access forces load of underlying property
		if (getDimToCluster() != null)
			return dimToCluster.getExpressionList().size();
		else
			return 0;
	}
	
	public int getNumCols() {
		
		if (getTimePeriods() == null || getDimToMeasure() == null || getDimToCluster() == null || getMeasures() == null) 
			return 0;
		else
			return getTimePeriods().getExpressionList().size() * 
					getDimToMeasure().getExpressionList().size() *
					getMeasures().getExpressionList().size();
	}

	
	
	public PafDimSpec2 getTimePeriods() {
		return timePeriods;
	}
	public void setTimePeriods(PafDimSpec2 timePeriods) {
		this.timePeriods = timePeriods;
	}
	public PafDimSpec2 getDimToMeasure() {
		return dimToMeasure;
	}
	public void setDimToMeasure(PafDimSpec2 dimToMeasure) {
		this.dimToMeasure = dimToMeasure;
	}
	public PafDimSpec2 getDimToCluster() {
		return dimToCluster;
	}
	public void setDimToCluster(PafDimSpec2 dimToCluster) {
		this.dimToCluster = dimToCluster;
	}
	public PafDimSpec2 getMeasures() {
		return measures;
	}
	public void setMeasures(PafDimSpec2 measures) {
		this.measures = measures;
	}
}
