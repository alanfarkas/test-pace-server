package com.pace.base.data;

import com.pace.base.PafException;

/**
 * Interface that provides access to data cache; used in custom functions
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public interface IPafDataCache {

	public int getAxisIndex(String msrDim);
    public double getCellValue(Intersection intersection) throws PafException;
	public double getCumMbrCount(Intersection cellIs);
	public double getCumMbrCount(Intersection cellIs, String cumDim);
	public double getCumMbrCount(Intersection cellIs, String cumDim, int level);
	public double getCumTotal(Intersection cellIs) throws PafException;
	public double getCumTotal(Intersection cellIs, String cumDim) throws PafException;
	public double getCumTotal(Intersection cellIs, String cumDim, int offset) throws PafException;
	public int getMeasureAxis();    
	public String getMeasureDim();    
	public double getNextCellValue(Intersection dataIs) throws PafException;    
	public double getNextCellValue(Intersection dataIs, String offsetDim, int offset) throws PafException;    
	public double getNextCellValue(Intersection dataIs, String offsetDim, int offset, boolean bWrap) throws PafException;    
	public Intersection getNextIntersection(Intersection cellIs);
	public Intersection getNextIntersection(Intersection cellIs, String offsetDim, int offset);
	public Intersection getNextIntersection(Intersection cellIs, String offsetDim, int offset, boolean bWrap);
	public double getPrevCellValue(Intersection cellIs) throws PafException;
	public double getPrevCellValue(Intersection cellIs, String offsetDim, int offset) throws PafException;
	public double getPrevCellValue(Intersection dataIs, String offsetDim, int offset, boolean bWrap) throws PafException;    
	public String getTimeDim();
	public String getTimeHorizonDim();
	public String getVersionDim();
	public boolean isMember(String dimension, String member);
	public void setCellValue(Intersection target, double allocValue);
	public Intersection shiftIntersection(Intersection cellIs);
	public Intersection shiftIntersection(Intersection cellIs, final String offsetDim, final int offset);
	public Intersection shiftIntersection(Intersection cellIs, final String offsetDim, final int offset, final boolean bWrap);

}
