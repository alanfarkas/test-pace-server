package com.pace.base.data;

import com.pace.base.PafException;

/**
 * Interface that provides read-only access to data cache; used in custom functions
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public interface IPafDataCache {

 //   public double getCellValue(String[] members) throws PafException;
    public double getCellValue(Intersection intersection) throws PafException;
	public int getMeasureAxis();    
	public String getMeasureDim();    
	public String getTimeDim();
	public boolean isMember(String dimension, String member);
	public String getVersionDim();    
}
