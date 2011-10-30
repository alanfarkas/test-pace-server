/**
 * Unique Time-Year combination used for indexing time-based cell collections
 */
package com.pace.base.data;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.app.MdbDef;


/**
 * @author Alan Farkas
 *
 */
public class TimeSlice {
	
	private String period = null;
	private String year = null;
	
	Logger logger = Logger.getLogger(TimeSlice.class);


	/**
	 * @param period Time dimesion coordinate
	 * @param year Year dimension coordinate
	 */
	public TimeSlice(String period, String year) {

		this.period = period;
		this.year = year;
	}

	/**
	 * @param timeHorizonCoord Time horizon member 
	 */
	public TimeSlice(String timeHorizonCoord) {

		// Look for period/year delimiter. Throw an error if the delimiter is not found
		// or if it is the last character.
		int pos = findTimeHorizonDelim(timeHorizonCoord);

		// Split time horizon coordinate into period and year
		period = timeHorizonCoord.substring(pos + PafBaseConstants.TIME_HORIZON_MBR_DELIM_LEN);
		year = timeHorizonCoord.substring(0, pos);
		
	}

	/**
	 * Don't allow instansiation whithout any parameters
	 */
	@SuppressWarnings("unused")
	private TimeSlice() {}


	/**
	 * @return the period
	 */
	public String getPeriod() {
		return period;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(String period) {
		this.period = period;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	
	/**
	 * Update the cell intersection using the specified time horizon coordinate
	 * 
	 * @param cellIs Cell intersection
	 */
	public static void applyTimeHorizonCoord(Intersection cellIs, String timeHorizonCoord, MdbDef mdbDef) {
		
		String timeDim = mdbDef.getTimeDim(), yearDim = mdbDef.getYearDim();
		
		// Look for period/year delimiter. Throw an error if the delimiter is not found
		// or if it is the last character.
		int pos = findTimeHorizonDelim(timeHorizonCoord);

		// Split time horizon coordinate into period and year
		cellIs.setCoordinate(timeDim, timeHorizonCoord.substring(pos + PafBaseConstants.TIME_HORIZON_MBR_DELIM_LEN));
		cellIs.setCoordinate(yearDim, timeHorizonCoord.substring(0, pos));
	}
	
	/**
	 * Generate a time horizon coordinate from the supplied period and year
	 *
	 * @param period Period dimension member
	 * @param year Year dimension member
	 * 
	 * @return Time horizon coordinate
	 */
	static public String buildTimeHorizonCoord(String period, String year) {
		return year + PafBaseConstants.TIME_HORIZON_MBR_DELIM + period;
	}
	
	
	/**
	 * Translate time horizon intersection coordinates to time/year coordinats
	 * 
	 * @param coords Intersection coordinates
	 * @param peridIndex Period coordinate index
	 * @param yearIndex Year coorindate index
	 */
	public static void translateTimeHorizonCoords(String[] coords, int periodIndex, int yearIndex) {
		
		String yearCoord = coords[yearIndex];
		
		// Verify that these are time horizon coordinates before performing translation
		if (yearCoord.equals(PafBaseConstants.TIME_HORIZON_DEFAULT_YEAR)) {
			String timeHorizonCoord = coords[periodIndex];
			int pos = findTimeHorizonDelim(timeHorizonCoord);
			coords[periodIndex] = timeHorizonCoord.substring(pos + PafBaseConstants.TIME_HORIZON_MBR_DELIM_LEN);
			coords[yearIndex] = timeHorizonCoord.substring(0, pos);
		}
	
	}

	/**
	 * Return the position of the time horizon delimiter in a time horizon coordinate
	 * 
	 * @param timeHorizonCoord Time horizon coordinate
	 * @return
	 */
	private static int findTimeHorizonDelim(String timeHorizonCoord) {

		// Look for period/year delimiter. Throw an error if the delimiter is not found
		// or if it is the last character.
		int pos = timeHorizonCoord.indexOf(PafBaseConstants.TIME_HORIZON_MBR_DELIM);
		if (pos == -1 || pos > timeHorizonCoord.length()) {
			String errMsg = "Invalid Time Horizon coordinate [" + timeHorizonCoord 
					+ "] passed to TimeSlice object";
//			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		
		return pos;
	}

	/**
	 * Return the time horizon period coordinate
	 * 
	 * @return the time horizon period coordinate
	 */
	public String getTimeHorizonPeriod() {
		return buildTimeHorizonCoord(period, year);
	}
	
	/**
	 * Return the default time horizon year coordinate
	 * 
	 * @return the default time horizon year coordinate
	 */
	static public String getTimeHorizonYear() {
		return PafBaseConstants.TIME_HORIZON_DEFAULT_YEAR;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		TimeSlice other = (TimeSlice) obj;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getTimeHorizonPeriod();
	}

}
