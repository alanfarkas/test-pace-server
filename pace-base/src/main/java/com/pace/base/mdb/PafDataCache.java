/*
 *	File: @(#)PafUowCache.java 	Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Aug 27, 2005  			By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.base.mdb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.MeasureType;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PafDimSpec;
import com.pace.base.app.UnitOfWork;
import com.pace.base.app.VersionDef;
import com.pace.base.app.VersionFormula;
import com.pace.base.app.VersionType;
import com.pace.base.data.IPafDataCache;
import com.pace.base.data.Intersection;
import com.pace.base.data.PafDataSlice;
import com.pace.base.utility.LogUtil;
import com.pace.base.utility.Odometer;
import com.pace.base.utility.StringUtils;
import com.pace.base.view.PafMVS;

/**
 * Container for a subset of multidimensional data cells corresponding
 * to a "unit of work"
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public abstract class PafDataCache implements IPafDataCache {

	private Map<Intersection, Integer> dataBlockIndexMap = null; // Maps data block key to an item in the data block pool
	private List<double[][]> dataBlockPool = null;	// [Measure][Time]
	private LinkedList<Integer> deletedBlockIndexes = null;	// Surrogate keys of deleted blocks (Linked list for performance reasons)
	private Map<String, Set<Intersection>> dataBlocksByVersion = null;	// Data block keys organized by version
	private Map<Intersection, Set<Intersection>> aliasKeyLookup = null; // Identifies any alias keys for a given data block
	private int blockSize = 0;	// Number of cells in a data block
	private int axisCount = 0, dataBlockCount = 0;
	private int[] axisSizes = null;
	private int[] indexedCoreAxes = null; // The core dimension axes that comprise that data block key
	private int[][] indexedIsElements = null; // Indexed intersection elements organized by cell intersection size
	private String[] allDimensions = null; 	// Valid intersection dimensions
	private String[] coreDimensions = null;	// The required cell intersection dimensions
	private String[] indexedCoreDims = null;	// The The core dimensions that comprise that data block key
	private String[] attributeDims = null;	// Valid attribute dimensions
	private String[] baseDimensions = null; // Valid base dimensions
	private List<List<String>> memberArray = null;
	private Map<String, Integer> axisIndexMap = null;
	private List<Map<String, Integer>> memberIndexMap = null;
	private String[] planVersions = null; // Plan version 
	private Set<String> lockedPeriods = null;	// Locked planning periods
	private PafDataCacheCells changedCells = new PafDataCacheCells(); //TODO Change this to <List> changedCells = new ArrayList<Intersection>()
	//private List<Intersection> changedCells = new ArrayList<Intersection>();
	private PafApplicationDef appDef = null;
	private boolean isDirty = true;	// Inidicates that the data cache has been updated
	private final static int NON_KEY_DIM_COUNT = 2;	// Measure and Time Dimension
	private static Logger logger = Logger.getLogger(PafDataCache.class);
	private static Logger performanceLogger = Logger.getLogger(PafBaseConstants.PERFORMANCE_LOGGER_DC);
	

	/**
	 *	Return the number of columns in the data cache
	 *
	 * @return Returns the number of columns in the data cache.
	 */
	public int getColumnCount() {
		return getAxisSizes()[0];
	}


	/**
	 *	Return the PafMVS
	 *
	 * @return Returns the PafMVS
	 */
	public abstract PafMVS getPafMVS();


	/**
	 *	Initialize data cache
	 *
	 */
	protected void initDataCache() {

		int initialBlockCount = 0;
		long initDcStartTime = System.currentTimeMillis();
		
		// Create axisIndexMap
		setAxisIndexMap(createAxisIndexMap());

		// Set baseDimension array to the list of initial dimensions, which will 
		// all be base dimensions. Attribute dimensions will optionally be added
		// later as need on a particular view.
		setBaseDimensions(getAllDimensions());
		
		// Create indexedDimension arrays
		//setCoreDimensions(createIndexedDimensions());
		//setCoreDimensions(allDimensions); //TODO Fix this - might be passed in
		setIndexedIsElements(createIndexedIsElements());

		// Create memberIndexMap
		setMemberIndexMap(createMemberIndexMap());

		// Create keyIndexes Array
		// Initialize data block index and data block pool. To minimize the
		// the time it takes to initially populate the data cache, the index
		// and pool are pre-allocated to hold all initially defined blocks.
		setBlockSize(getMeasureSize() * getTimeSize());
		initialBlockCount = getMaxCoreDataBlockCount();
		setDataBlockIndex(new HashMap<Intersection, Integer>(initialBlockCount));
		setDataBlockPool(new ArrayList<double[][]>(initialBlockCount));
		
		// Initialize various data block housekeeping objects
		dataBlocksByVersion = new HashMap<String, Set<Intersection>>(getVersionSize());
		aliasKeyLookup = new HashMap<Intersection, Set<Intersection>>();
		deletedBlockIndexes = new LinkedList<Integer>();

		// Initialize data block list
		performanceLogger.info("Initializing Data Cache...");
		long maxCellCount = initialBlockCount * getBlockSize();
		String stepDesc = "Data Cache intialized with a potential base intersection count of : [" 
			+ StringUtils.decimalFormat(maxCellCount, "#,###,###,###,###") + "] ";
		logger.info(stepDesc);
		String logMsg = LogUtil.timedStep(stepDesc, initDcStartTime);
		performanceLogger.info(logMsg);

	}

	/**
	 *	Simple Array Validation
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 * 
	 * @throws IllegalArgumentException 
	 */
	protected void validateArray(boolean[] array, String arrayName) throws IllegalArgumentException {

		// Validate that the array contains data 
		validateArrayNotEmpty(array, arrayName);

		// Validate that the array is the proper size
		if (array.length != axisCount) {
			// array length does not match axisCount
			String errMsg = "PafUowCache parms error - [" + arrayName + "] array length does not match axisCount";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

	/**
	 *	Simple Array Validation
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 * @throws IllegalArgumentException 
	 */
	protected void validateArray(int[] array, String arrayName) throws IllegalArgumentException {

		// Validate that the array contains data 
		validateArrayNotEmpty(array, arrayName);

		// Validate that the array is the proper size
		if (array.length != axisCount) {
			// array length does not match axisCount
			String errMsg = "PafUowCache parms error - [" + arrayName + "] array length does not match axisCount";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

	/**
	 *	Simple Array Validation
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 * 
	 * @throws IllegalArgumentException 
	 */
	protected void validateArray(Object[] array, String arrayName) throws IllegalArgumentException {

		// Validate that the array contains data
		validateArrayNotEmpty(array, arrayName);

		// Validate that the array is the proper size
		if (array.length != axisCount) {
			// array length does not match axisCount
			String errMsg = "PafUowCache parms error - [" + arrayName + "] array length does not match axisCount";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}


	/**
	 *	Valid that array is not empty or null
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 * @throws IllegalArgumentException 
	 */
	private void validateArrayNotEmpty(boolean[] array, String arrayName) throws IllegalArgumentException {

		// Validate that the array contains data and is the proper size
		if (array == null || array.length == 0) {
			// Empty or null array
			String errMsg = "PafUowCache parms error - empty or null [" + arrayName + "] array";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

	/**
	 *	Valid that array is not empty or null
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 * @throws IllegalArgumentException
	 */
	private void validateArrayNotEmpty(int[] array, String arrayName) throws IllegalArgumentException {

		// Validate that the array contains data and is the proper size
		if (array == null || array.length == 0) {
			// Empty or null array
			String errMsg = "PafUowCache parms error - empty or null [" + arrayName + "] array";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

	/**
	 *	Valid that array is not empty or null
	 *
	 * @param array Array to validate
	 * @param arrayName Array name
	 * @throws IllegalArgumentException 
	 */
	private void validateArrayNotEmpty(Object[] array, String arrayName) throws IllegalArgumentException {

		// Validate that the array contains data and is the proper size
		if (array == null || array.length == 0) {
			// Empty or null array
			String errMsg = "PafUowCache parms error - empty or null [" + arrayName + "] array";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}


	/**
	 *	Valid that object is not null
	 *
	 * @param object Array to validate
	 * @param objectName Array name
	 * @throws IllegalArgumentException 
	 */
	@SuppressWarnings("unused")
	private void validateObjectNotNull(Object object, String objectName) throws IllegalArgumentException {

		// Validate that object is not null
		if (object == null) {
			// Empty object
			String errMsg = "PafUowCache parms error - [" + objectName + "] object is null";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}
	}

	/**
	 *	Create PafUowCache axis index map
	 *
	 * @return HashMap used for resolving dimension names to a specific axis index value.
	 */
	protected HashMap<String, Integer> createAxisIndexMap() {

		HashMap <String, Integer> axisIndexMap = null;

		// Fill the axisIndexMap, which is used to resolve dimension
		// names to a specific axis index.
		logger.debug("Creating axisIndexMap ...");
		axisIndexMap = new HashMap<String, Integer>();
		for (int i = 0; i < axisCount; i++) {
			axisIndexMap.put(allDimensions[i], i);
		}
		return axisIndexMap;
	}


	/**
	 *	Create indexed intersection elements array
	 *
	 * @return An array containing the indexed intersection elements by intersection section size
	 */
	protected int[][] createIndexedIsElements() {

		int measureAxis = getMeasureAxis(), timeAxis = getTimeAxis();

		//TODO FIX C O M M E N T S !!!
		// Fill the indexedIsElements array, which contains the list of all
		// UOW dimensions axis that comprise the data block index. This would be 
		// all dimensions except Measure and Time, which are not included as 
		// they each are represented within the data block itself.
		logger.debug("Creating indexedAxis array...");
		int minIsSize = coreDimensions.length;
		int maxIsSize = allDimensions.length;
		int[][] indexedIsElements = new int[maxIsSize + 1][];

		indexedCoreAxes = new int[minIsSize - NON_KEY_DIM_COUNT];
		indexedCoreDims = new String[indexedCoreAxes.length];
		int i = 0;
		for (int axisIndex = 0; axisIndex < minIsSize; axisIndex++) {
			if (axisIndex != measureAxis && axisIndex != timeAxis) {
				indexedCoreAxes[i] = axisIndex;
				indexedCoreDims[i] = getDimension(axisIndex); 
				i++;
			}
		}
		indexedIsElements[minIsSize] = indexedCoreAxes;

		for (int element = minIsSize + 1; element <= maxIsSize; element++) {
			int[] prevIndexedAxes = indexedIsElements[element - 1];
			int[] indexedAxes = new int[element];
			System.arraycopy(prevIndexedAxes, 0, indexedAxes, 0, prevIndexedAxes.length);
			indexedAxes[prevIndexedAxes.length + 1] = element;
			indexedIsElements[element] = indexedAxes;
		}
		return indexedIsElements;
	}

	/**
	 *	Create indexed dimensions array
	 *
	 * @return An array containing the list of Indexed dimensions (excludes Measure and Time)
	 */
	protected String[] createIndexedDimensions() {

		int dimCount = 0, dimIndex = 0;
		String measureDim = getMeasureDim(), timeDim = getTimeDim();
		String[] indexedDimensions = null;

		
		// Fill the indexedDimensions array, which contains the list of all
		// UOW dimensions that comprise the data block index. This would be 
		// all dimensions except Measure and Time, which are not included as 
		// they each are represented within the data block itself.
		logger.debug("Creating indexedDimensions array...");
		dimCount = getAllDimensions().length - NON_KEY_DIM_COUNT;
		indexedDimensions = new String[dimCount];
		for (int axisIndex = 0; axisIndex < axisCount; axisIndex++) {
			String dimension = getDimension(axisIndex);
			if (!dimension.equalsIgnoreCase(measureDim) && !dimension.equalsIgnoreCase(timeDim)) {
				// Check for index out of bounds condition
				if (dimIndex >= dimCount) {
					String errMsg = "PafDataCache init error - index out of bounds error when creating the Indexed Dimensions array. Possible issue with the naming of the Time or Measure dimension.";
					logger.error(errMsg);
					throw new  ArrayIndexOutOfBoundsException(errMsg);
				}
				indexedDimensions[dimIndex++] = dimension;
			}
		}
		return indexedDimensions;
	}


	/**
	 *	Create PafUowCache member index map
	 *
	 * @return HashMap used for resolving member names to a specific index value
	 */
	protected ArrayList<Map<String, Integer>> createMemberIndexMap() {

		ArrayList<Map<String, Integer>> memberIndex = null;

		// Fill the memberIndexMap array, which is used to resolve member
		// names to a specific index.
		logger.debug("Filling memberIndexMap array...");
		memberIndex = new ArrayList<Map<String, Integer>>(axisCount);

		for (int i = 0; i < axisCount; i++) {
			HashMap <String, Integer> axisIndex = new HashMap <String, Integer> (memberArray.get(i).size());
			for (int j = 0; j < axisSizes[i]; j++) {
				axisIndex.put(memberArray.get(i).get(j), j);
			}
			memberIndex.add(axisIndex);
			logger.debug("Member index for Axis [" + i + "] populated");
		}
		return memberIndex;
	}



	/**
	 *	Returns the existing number of data blocks in the data cache
	 *
	 * @return The existing number of data blocks in the data cache
	 */
	public int getDataBlockCount() {

		int dataBlockCount = dataBlockPool.size();
		return dataBlockCount;
	}

	/**
	 *	Returns the maximum number of addressable data blocks across the core
	 *	dimensions
	 *
	 * @return The maximum number of addressable data blocks across the core dimensions
	 */
	public int getMaxCoreDataBlockCount() {

		int memberCombinations = 1;

		// Multiply the number of members in each core dimension by
		// each other.
		for (int axisIndex = 0; axisIndex < indexedCoreAxes.length; axisIndex++) {
			memberCombinations = memberCombinations * getAxisSize(axisIndex);
		}

		return memberCombinations;
	}


	/**
	 * @param dataBlockIndex the dataBlockIndex to set
	 */
	private void setDataBlockIndex(Map<Intersection, Integer> dataBlockIndex) {
		this.dataBlockIndexMap = dataBlockIndex;
	}


	/**
	 * @return the dataBlockPool
	 */
	protected List<double[][]> getDataBlockPool() {
		return dataBlockPool;
	}


	/**
	 * @param dataBlockPool the dataBlockPool to set
	 */
	protected void setDataBlockPool(List<double[][]> dataBlockPool) {
		this.dataBlockPool = dataBlockPool;
	}


	/**
	 * @return the blockSize
	 */
	public int getBlockSize() {
		return blockSize;
	}


	/**
	 * @param blockSize the blockSize to set
	 */
	protected void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}


	/**
	 *	Return an map of VersionDef objects for those data cache verions whose formulas 
	 *  are dependent on any of the versions passed to this method 
	 *  
	 *
	 * @param versions 
	 * 
	 * @return An map of VersionDef objects for those versions whose formulas are dependent on any of the versions passed to this method
	 */
	public Map<String, VersionFormula> getDependentVersionDefs(String[] versions) {

		Map<String, VersionFormula> dependentVersions = new HashMap<String, VersionFormula>();
		List<VersionDef> derivedVersionDefs = null;

		// Get list of versionDef objects for all derived versions
		derivedVersionDefs = getDerivedVersionDefs();
		
		// Cycle through each version and check for dependent formulas
		for (String version:versions) {
			for (VersionDef versionDef:derivedVersionDefs) {

				// Get formula components
				String derivedVersion = versionDef.getName();
				VersionFormula versionFormula = versionDef.getVersionFormula();
				String baseVersion = versionFormula.getBaseVersion();
				String compareVersion = null;
				
				// Determine the comparison version
				if (versionDef.getType() == VersionType.Variance) {
					// Variance version - use compare version property
					compareVersion = versionFormula.getCompareVersion(); 
				} else if (versionDef.getType() == VersionType.ContribPct) {
					// Contribution percent - search for possible compare version
					for (PafDimSpec compareMemberSpec:versionFormula.getCompareIsSpec()) {
						String dim = compareMemberSpec.getDimension();
						if (dim.equalsIgnoreCase(getVersionDim())) {
							compareVersion = compareMemberSpec.getExpressionList()[0];
						}
					}
				}
				
				// Add version formula if it is dependant of the selected versions 
				if (version.equalsIgnoreCase(baseVersion) || 
						(compareVersion != null && version.equalsIgnoreCase(compareVersion))) {
					dependentVersions.put(derivedVersion, versionFormula);
				}
			}

		}
		return dependentVersions;
	}


	/**
	 *	Determine if the Version and Year combination are locked
	 *
	 * @param version Selected member of version dimension
	 * @param year Selected member of year dimension
	 *
	 * @return true if Version and Year combination contains locked periods
	 */
	public boolean hasLockedPeriods(String version, String year) {	

		boolean hasLockedPeriods = false;
		VersionType versionType = getVersionType(version);

		// A Version and Year combination contains locked periods if the following conditions are met:
		// 	1. The year matches the "current year"
		//	2. The Version is Forward Plannable 
		//			OR The Version is a Variance Version whose Base Version is Forward Plannable
		if (year.equalsIgnoreCase(getCurrentYear())) {
			if (versionType == VersionType.ForwardPlannable) {
				hasLockedPeriods = true;
			} else if (PafBaseConstants.DERIVED_VERSION_TYPE_LIST.contains(versionType)) {
				String baseVersion = getVersionDef(version).getVersionFormula().getBaseVersion();
				hasLockedPeriods = hasLockedPeriods(baseVersion, year);
			}
		}
		return hasLockedPeriods;
	}


	/**
	 *	Get the entire list of Forward Plannable periods in this data cache
	 *
	 * @return List of Forward Plannable periods
	 */
	public List<String> getForwardPlannablePeriods() {
		return getForwardPlannablePeriods(getDimMembers(getTimeDim()), getLockedPeriods()) ;
	}


	/**
	 *	Get the list of Forward Plannable members from the supplied list of time members
	 *
	 * @param allPeriods All valid members of the time dimension
	 * @param lockedPeriods List of current locked periods
	 * 
	 * @return List of Forward Plannable periods
	 */
	public List<String> getForwardPlannablePeriods(String[] allPeriods, Set<String> lockedPeriods) {

		List<String> fpPeriods = new ArrayList<String>();

		// Return any periods from the Time dimension that are not contained in lockedPeriods
		for (String period:allPeriods) {
			if (!lockedPeriods.contains(period)) {
				fpPeriods.add(period);
			}
		}
		return fpPeriods;
	}


	/**
	 *	Get the list open periods in this data cache based on the selected version and year
	 *	 
	 * @param version Selected member of version dimension
	 * @param year Selected member of year dimension
	 * 
	 * @return List of open periods
	 */
	public List<String> getOpenPeriods(String version, String year) {
		return getOpenPeriods(version, year, getDimMembers(getTimeDim()), getLockedPeriods()) ;
	}


	/**
	 *	Get the list open periods based on the version and year
	 *
	 * @param version Selected member of version dimension
	 * @param year Selected member of year dimension
	 * @param timeMembers A valid members of the time dimension
	 * @param lockedPeriods List of current locked periods
	 * 
	 * @return List of open periods
	 */
	public List<String> getOpenPeriods(String version, String year, String[] timeMembers, Set<String> lockedPeriods) {

		List<String> openPeriods = null;

		// Does the selected Version Type and Year comination have locked periods?
		if (hasLockedPeriods(version, year)) {
			// Yes - Just return list of Forward Plannable members
			openPeriods = getForwardPlannablePeriods(timeMembers, lockedPeriods);
		} else {
			// No locked periods - Return entire list of time members
			openPeriods = Arrays.asList(timeMembers);
		}
		return openPeriods;
	}


	/**
	 *	Returns the planning versions
	 *
	 * @return An array of planning versions
	 */
	public String[] getPlanVersions() {
		return planVersions;
	}
	/**
	 *	Set the active planning versions
	 *
	 * @param planVersions An array of active planning versions
	 * 
	 */
	protected void setPlanVersions(String[] planVersions) {
		this.planVersions = planVersions;
	}

	
	/**
	 * Return an array containing the dimensions that are represented in the data cache
	 * 
	 * @return Returns the dimension array.
	 */
	public String[] getAllDimensions() {
		return allDimensions;
	}
	/**
	 * @param allDimensions the allDimensions to set
	 */
	protected void setAllDimensions(String[] allDimensions) {
		this.allDimensions = allDimensions;
	}

	/**
	 * @return Returns the appDef.
	 */
	public PafApplicationDef getAppDef() {
		return appDef;
	}
	/**
	 *	Set the application definition
	 *
	 * @param appDef
	 */
	protected void setAppDef(PafApplicationDef appDef) {
		this.appDef = appDef;
	}

	/**
	 *	Return the number of axes contained in the data cache
	 *
	 * @return Returns the number of axes contained in the data cache.
	 */
	public int getAxisCount() {
		return axisCount;
	}
	/**
	 *	Set the number of axes contained in the data cache
	 *
	 * @param axisCount The number of axes contained in the data cache
	 */
	protected void setAxisCount(int axisCount) {
		this.axisCount = axisCount;
	}

	/**
	 *	Return the axis number that corresponds to the 
	 *  the supplied dimension name
	 *
	 * @param dimName Dimension name
	 * @return Returns the axis number of the supplied dimension name.
	 */
	public int getAxisIndex(String dimName) {

		int index = 0;	

		if (axisIndexMap.containsKey(dimName)) {
			index = axisIndexMap.get(dimName);
		} else {
			// Dimension name not found
			String errMsg = "Unable to get index for dimension ["
				+ dimName + "] - this dimension does not exist in the paf data cache";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          
		}

		return index;
	}

	/**
	 * @param axisIndexMap the axisIndexMap to set
	 */
	protected void setAxisIndexMap(Map<String, Integer> axisIndexMap) {
		this.axisIndexMap = axisIndexMap;
	}

	/**
	 *	Return an array containing the members in the specified axis
	 *
	 * @param axis Index axis
	 * @return Returns an array containing the members in the specified axis.
	 */
	public String[] getAxisMembers(int axis) {
		return memberArray.get(axis).toArray(new String[0]);
	}

	/**
	 *	Return the number of members in specified axis.
	 *
	 * @param axis Axis index
	 * @return Returns the number of members in the specified axis.
	 */
	public int getAxisSize(int axis) {

		// Validate axis
		if (axis < 0 || axis > axisCount - 1) {
			// Invalid axis value
			String errMsg = "Unable to get size of axis ["
				+ axis + "] - axis value is out of bounds";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          			
		}

		return axisSizes[axis];
	}

	/**
	 *	Return the array containing the number of members in each axis.
	 *
	 * @return Returns the array containing the number of members in each axis.
	 */
	public int[] getAxisSizes() {
		return axisSizes;
	}
	/**
	 *	Set the array containing the number of members in each axis.
	 *
	 * @param axisSizes Array containing the number of members in each axis.
	 */
	protected void setAxisSizes(int[] axisSizes) {
		this.axisSizes = axisSizes;
	}


	/**
	 * @return the attributeDims
	 */
	public String[] getAttributeDims() {
		return attributeDims;
	}


	/**
	 * @param attributeDims the attributeDims to set
	 */
	protected void setAttributeDims(String[] attributeDims) {
		this.attributeDims = attributeDims;
	}


	/**
	 * @return the baseDimensions
	 */
	public String[] getBaseDimensions() {
		return baseDimensions;
	}


	/**
	 * @param baseDimensions the baseDimensions to set
	 */
	protected void setBaseDimensions(String[] baseDimensions) {
		this.baseDimensions = baseDimensions;
	}


	/**
	 *	Return the data cache cell count
	 *
	 * @return Returns the data cache cell count.
	 */
	public int getCellCount() {
		return getDataBlockCount() * blockSize;
	}

	

	/**
	 *	Return the cell value for the specified intersection coordinates
	 *
	 * @param members Array of dimension members that define a single cell intersection
	 * @return Returns the cell value.
	 */
	public double getCellValue(String[] members) {

		Intersection intersection = new Intersection(getAllDimensions(), members);
		return getCellValue(intersection);
	}

	/**
	 *	Return the cell value for the specified intersection. If the requested intersection
	 *  is valid, but does not exist, then a zero value is returned.
	 *
	 * @param intersection Member intersection object that corresponds to data cache cell
	 * 
	 * @return Returns the cell value
	 */
	public double getCellValue(Intersection intersection)  {

		// Get the cell address of the specified intersection
		DataCacheCellAddress cellAddress = calculateCellAddress(intersection);

		// Return cell value
		double[][] dataBlock = getDataBlock(cellAddress.getDataBlockKey()).getDataBlock();
		if (dataBlock != null) {
			// Intersection exists - return cell value
			return dataBlock[cellAddress.getCoordX()][cellAddress.getCoordY()];
		} else {
			// Intersection does not exist
			if (isValidIntersection(intersection)) {
				// Valid intersection - return 0
				return 0;
			} else {
				// Invalid intersection - throw error
				String errMsg = "Data Cache error - Unable to get data cache cell value for invalid intersection ["
					+ StringUtils.arrayToString(intersection.getCoordinates()) + "]";
				throw new IllegalArgumentException(errMsg);
			}
		}

	}

	/**
	 *	Return the cell value for the specified index
	 *
	 * @param nDimIndex Array of n-dimensional indexes that define a single cell intersection 
	 * @return Returns the cell value.
	 */
	public double getCellValue(int[] nDimIndex) {

		Intersection intersection = createIntersection(nDimIndex);    	
		return getCellValue(intersection);
	}

	
	/**
	 *	Set the value for a specific data cache cell
	 *
	 * @param members Array of dimension members that define a single cell intersection
	 * @param value Value to put into cell
	 */
	public void setCellValue(String[] members, double value) {

		int index[] = membersToIndex(members);
		setCellValue(index, value);
	}

	/**
	 *	Set the value for a specific data cache cell
	 *
	 * @param nDimIndex Array of n-dimensional indexes that define a single cell intersection 
	 * @param value Value to put into cell
	 */
	public void setCellValue(int[] nDimIndex, double value) {

		Intersection intersection = createIntersection(nDimIndex);
		setCellValue(intersection, value);
	}

	/**
	 *	Set the value for a specific data cache cell and track any changed cells
	 *
	 * @param cellIndex Data cache cell index
	 * @param cellValue Value to put into cell
	 */
	public void setCellValueAndTrackChanges(int[] cellIndex, double cellValue) {

		double oldCellValue = getCellValue(cellIndex);
		setCellValue(cellIndex, cellValue);
		if (Math.abs(cellValue - oldCellValue) > PafBaseConstants.DC_TRACK_CHANGES_THRESHHOLD) {
			int[] changedCellIndex = new int[axisCount];
			System.arraycopy(cellIndex, 0, changedCellIndex, 0, axisCount);
			addChangedCell(changedCellIndex, cellValue);
		}
	}

	/**
	 *	Set the value for a specific data cache cell
	 *
	 * @param intersection Cell intersection
	 * @param value Value to put into cell
	 */
	public void setCellValue(Intersection intersection, double value) {
		
		DataBlockResponse dataBlockResp = null;
		double[][] dataBlock = null;

		// Validate intersection
		if (!isValidIntersection(intersection)) {
			// Invalid intersection - throw error
			String errMsg = "Data Cache error - Unable to set data cache cell value for invalid intersection ["
				+ StringUtils.arrayToString(intersection.getCoordinates()) + "]";
			throw new IllegalArgumentException(errMsg);
		}
		
		// Get the cell address of the specified intersection
		DataCacheCellAddress cellAddress = calculateCellAddress(intersection);
		
		// Get the corresponding data block
		Intersection dataBlockKey = cellAddress.getDataBlockKey();
		dataBlockResp = getDataBlock(dataBlockKey);
		dataBlock = dataBlockResp.getDataBlock();

		// Create data block if it doesn't already exist
		if (dataBlock == null) {
			dataBlockResp = addDataBlock(dataBlockKey);
			dataBlock = dataBlockResp.getDataBlock();
		}
		
		// Round updated cell value to a predefined number of digits to mask any potential precision errors
		long longValue = (long) value;
		double signedMantissa = value - longValue;
		double roundedMantissa = Math.round(signedMantissa * PafBaseConstants.DC_ROUNDING_CONSTANT)
								/ PafBaseConstants.DC_ROUNDING_CONSTANT;
		double roundedValue = longValue + roundedMantissa;
		
		// Update cell value
		dataBlock[cellAddress.getCoordX()][cellAddress.getCoordY()] = roundedValue;

		// Set dirty flag to indicate that data cache was updated
		setDirty(true);
	}


	/**
	 *	Add a new data block to the data cache.
	 *
	 * @param key Data block key
	 * @return DataBlockResponse
	
	 */
	protected DataBlockResponse addDataBlock(Intersection key) {

		int surrogateKey = 0;		

		// Ensure that intersection being added is valid
		if (!isValidDataBlock(key)) {
			String msg = "An attempt was made to add the invalid data block: "
				+ key.toString() + " to the data cache.";
			throw new IllegalArgumentException(msg);
		}
		
		// If alias data block key, add key to index. Also check for
		// correpsonding primary data block. If the primary ddata
		// block doesn't already exists, then create it.  
		if (isAliasDataBlockKey(key)) {
			Intersection primaryKey = calculatePrimaryKey(key);
			DataBlockResponse aliasDataBlockResp =  getDataBlock(primaryKey);
			if (aliasDataBlockResp.getDataBlock() == null) {
				aliasDataBlockResp = addDataBlock(primaryKey);
				surrogateKey = addDataBlock(primaryKey).getSurrogateKey();
			}
			surrogateKey = aliasDataBlockResp.getSurrogateKey();
			dataBlockIndexMap.put(key, surrogateKey);
			addAliasKey(key, primaryKey); 
			return aliasDataBlockResp;
		}
		
		// Add index entry for new data block. Attempt to reuse any
		// previously deleted blocks.
		if (deletedBlockIndexes.size() == 0) {
			// Add index entry for new data block (index is auto-incremented)
			surrogateKey = dataBlockCount;
		} else {
			// Reuse index of a deleted block
			surrogateKey = deletedBlockIndexes.removeLast();
		}
		dataBlockIndexMap.put(key, surrogateKey);
		dataBlockCount++;
		
		// Create new data block and add it to data block pool
		//TODO Check for alias intersections - if adding, create base intersection first
		// if it doesn't exist, else find it.
		// addDimension(dimension, dimensionType)
		// addMember(dimension, member) (should call add dimension)
		// --- addDimension & addMember should be called first before the blocks are even added,
		// ----- by logic that's repsonsible for making sure that only members/dimensions that 
		// ----- exist in the UOW are defined in the UOW. so that addDataBlock can be a gatekeeper
		// ----- and ensure that only the valid member intersections get created.
		double[][] dataBlock = new double[getMeasureSize()][getTimeSize()];
		dataBlockPool.add(dataBlock);
		
		// Add data block key to lookup collections
		//TODO only primary block key should be added
		addDataBlockKey(key);
		
		// Return data block response
		DataBlockResponse dataBlockResp = new DataBlockResponse();
		dataBlockResp.setSurrogateKey(surrogateKey);
		dataBlockResp.setDataBlock(dataBlock);
		return dataBlockResp;
	}


	/**
	 * 	Add alias data block key to alias key lookup
	 * 
	 * @param aliasKey Alias data block key
	 * @param primaryKey Corresponding primary data block key
	 */
	private void addAliasKey(Intersection aliasKey, Intersection primaryKey) {
		
		Set<Intersection> aliasKeys = aliasKeyLookup.get(primaryKey);
		if (aliasKeys == null) {
			aliasKeys = new HashSet<Intersection>();
		}
		aliasKeys.add(aliasKey);
		aliasKeyLookup.put(primaryKey, aliasKeys);

	}


	/**
	 * Convert an alias data block key to its corresonding primary 
	 * data block key
	 *  
	 * @param aliasKey Alias data block key
	 * @return Primary data block key.
	 */
	private Intersection calculatePrimaryKey(Intersection aliasKey) {
		
		// Strip off non-core dimension elements. The non-core
		// dimension elements will aways appear after the core
		// dimension elements.
		Intersection primaryKey = aliasKey.createSubIntersection(coreDimensions.length);
		return primaryKey;
	}


	/**
	 *  Add data block key to lookup collections
	 *  
	 * @param key
	 */
	private void addDataBlockKey(Intersection key) {
	
		// Add data block key to version collection
		//TODO only primary block key should be added
		String version = key.getCoordinate(this.getVersionDim());
		Set<Intersection> versionBlocks = dataBlocksByVersion.get(version);
		if (versionBlocks != null) {
			versionBlocks.add(key);
		} else {
			versionBlocks = new HashSet<Intersection>();
			versionBlocks.add(key);
			dataBlocksByVersion.put(version, versionBlocks);
		}	
	}


	/**
	 *	Delete a data block from the data cache.
	 *
	 * @param key Data block key	
	 */
	protected void deleteDataBlock(Intersection key) {
		
		// Retrieve the data block being deleted
		DataBlockResponse dataBlockResp = getDataBlock(key);
		double[][] dataBlock = dataBlockResp.getDataBlock();
		
		if (dataBlock == null) {
			String errMsg = "Data Cache Error - attempt to delete block deletion error - a data block with a key of [" 
				+ key + "] does not exist";
			logger.error(errMsg);
			throw new IllegalArgumentException(errMsg);
		}
		

		// If this is an alias data block key, remove key entry
		// from data block index and exit.
		if (isAliasDataBlockKey(key)) {
			dataBlockIndexMap.remove(key);
			return;
		}
		
		// Remove data block key from collections
		deleteDataBlockKey(key);
		
		// Delete data block
		dataBlock = null;
		dataBlockIndexMap.remove(key);
		dataBlockCount--;

		// Add index of deleted block to collection so that the 
		// index entry can be reused for a future data
		// block addition. 
		int surrogateKey = dataBlockResp.getSurrogateKey();
		deletedBlockIndexes.add(surrogateKey);
			
	}


	/**
	 *	Remove data block key from lookup collections
	 *
	 * @param key Data block key
	 */
	private void deleteDataBlockKey(Intersection key) {

		// This method is only called on the primary data
		// block key.
		
		// Remove key from version collection
		Set<Intersection> versionBlocks = dataBlocksByVersion.get(key.getCoordinate(getVersionDim()));
		if (versionBlocks != null) {
			versionBlocks.remove(key);
		}

		// Remove any associated alias key entries
		Set<Intersection> aliasKeys = aliasKeyLookup.remove(key);
		if (aliasKeys != null) {
			for (Intersection aliasKey : aliasKeys) {
				dataBlockIndexMap.remove(aliasKey);
			}
		}
		
	}


	/**
	 * Returns true if the data block key is not the primary
	 * key
	 * @param Returns true if the data block key is not the
	 * @return
	 */
	private boolean isAliasDataBlockKey(Intersection dataBlockKey) {
		return !isPrimaryDataBlockKey(dataBlockKey);
	}


	/**
	 * Returns true if the data block key is only comprised of
	 * primary data cache dimensions. (not exactly true ---
	 * NEED TO CONSIDER ATTRIBUTE INTERSECTIONS THAT DON'T
	 * DIRECTLY MAP TO A BASE INTERSECTION
	 * 
	 * If the data cache holds a unit of work, then a key
	 * comprised of only base dimensions would return true.
	 * Conversely, a key containing any attribute dimensions 
	 * would return false.
	 * 
	 * @param dataBlockKey Data block key
	 * @return boolean
	 */
	private boolean isPrimaryDataBlockKey(Intersection dataBlockKey) {
		
		// Simple and fast check. Assume that a key is primrary
		// if it contains the extact number of data cache core 
		// dimensions.  
		String[] dataBlockKeyDims = dataBlockKey.getDimensions();
		if (dataBlockKeyDims.length == coreDimensions.length - NON_KEY_DIM_COUNT) {
			return true;
		} else {
			// TODO - Need to check if alias key corresponds
			// to a primary key (only level 0 attributes and assoicate
			// base members) 
			// or is a primary key comrpised of attributes
			// (at least one aggregate attribute dim member
			// or an aggregate member in one or mroe associated base 
			// dimensions.  --- NEED TREES (Argh...) - pass in client 
			// state to data cache?
			return false;
		}
	}


	/**
	 *  Remove data blocks for the specified versions. If the version
	 *  filter is empty or null then no data will be removed.
	 *  
	 * @param versionFilter Specifies the versions to clear
	 */
	public int clearVersionData(List<String> versionFilter) {
	
		int deletedBlockCount = 0;
		if (versionFilter != null && !versionFilter.isEmpty()) {
			for (String version : versionFilter) {
				List<Intersection> dataBlockKeys = new ArrayList<Intersection>(dataBlocksByVersion.get(version));
				if (dataBlockKeys != null) {
					for (Intersection key: dataBlockKeys) {
						deleteDataBlock(key);
						deletedBlockCount++;
					}
				}
			}
		}
		
		logger.info(StringUtils.commaFormat(deletedBlockCount) + " data block(s) removed from data cache across versions: " 
				+  StringUtils.listToString(versionFilter));
		return deletedBlockCount;
		
	}

	/**
	 *	Return the data block corresponding to the specified intersection.
	 *  Additional information is also returned.
	 *  
	 *  If the data block is not found, then the returned data block will
	 *  be a null value.
	 *   
	 * @param intersection Data block key
	 * 
	 * @return DataBlockResponse
	 */
	private DataBlockResponse getDataBlock(Intersection dataBlockKey) {
		
		double[][] dataBlock = null;
		
		// Find data block index entry
		Integer  surrogateKey = dataBlockIndexMap.get(dataBlockKey);
		
		// Get data block (if an index entry exists)
		if (surrogateKey != null) {
			dataBlock = dataBlockPool.get(surrogateKey);
			if (dataBlock == null) {
				// Index entry was found
				String errMsg = "Data Cache Error - Non-existent data block at intersection: " 
					+ StringUtils.arrayToString(dataBlockKey.getCoordinates());
				throw new IllegalArgumentException(errMsg);
			}
		}
		
		// Return data block response
		DataBlockResponse dataBlockResp = new DataBlockResponse();
		dataBlockResp.setSurrogateKey(surrogateKey);
		dataBlockResp.setDataBlock(dataBlock);
		return dataBlockResp;
	}


	/**
	 * 	Update the contents of the specified data block
	 * 
	 * @param dataBlockResp Data Block Response Object
	 */
	protected void updateDataBlock(DataBlockResponse dataBlockResp) {
		dataBlockPool.set(dataBlockResp.getSurrogateKey(), dataBlockResp.getDataBlock());
	}


	/**
	 * 	Update the contents of the specified data block
	 * 
	 * @param dataBlockKey Data Block Key
	 * @param dataBlock Data Block
	 */
	protected void updateDataBlock(Intersection dataBlockKey, double[][] dataBlock) {
		
		Integer  surrogateKey = dataBlockIndexMap.get(dataBlockKey);	
		dataBlockPool.set(surrogateKey, dataBlock);
		
	}


	/**
	 *	Return the cell address for the specified intersection
	 *
	 * @param intersection Cell intersection 
	 * @return DataCacheCellAddress
	 */
	private DataCacheCellAddress calculateCellAddress(Intersection intersection) {
		
		int measureAxis = getMeasureAxis();
		int timeAxis = getTimeAxis();
		DataCacheCellAddress cellAddress = new DataCacheCellAddress();

		
		// Convert intersection to data block key
		//TODO - add logic to convert other types of intersections (Attribute, synthetic)
		Intersection dataBlockKey = calculateDataBlockKey(intersection);
		cellAddress.setDataBlockKey(dataBlockKey);
		
		// Set x and y coordinates (measure, time)
		int measureIndex = getMemberIndex(intersection.getCoordinates()[measureAxis], measureAxis);
		cellAddress.setCoordX(measureIndex);
		int timeIndex = getMemberIndex(intersection.getCoordinates()[timeAxis], timeAxis);
		cellAddress.setCoordY(timeIndex);

		// Return cell address
		return cellAddress;
	}


	/**
	 * 	Calculate the data block key for the specified cell intersection
	 * 
	 * @param intersection Cell Intersection
	 * @return Intersection
	 */
	private Intersection calculateDataBlockKey(Intersection intersection) {
		
		Intersection dataBlockKey = null;
		
		// The data block key is calculated by taking the intersection
		// and removing the elements that corresond to the non-indexed
		// dimensions. 
		//
		// To reduce overhead, this method access a pre-built array that
		// contains the desired intersection elements for each
		// given intersection size.  
		int[] keyDimIndexes = indexedIsElements[intersection.getSize()];
		dataBlockKey = intersection.createSubIntersection(keyDimIndexes);
		return dataBlockKey;
	}


	/**
	 * 	Filter out loaded reference data intersections from data specification
	 *  map
	 *  
	 * @param memberSpecByAxis Defines a subset of reference data in the data cache 
	 * 
	 * @return
	 */
	public Map<Integer, List<String>> getFilteredRefDataSpec(Map<Integer, List<String>> memberSpecByAxis) {
		
		long filterStartTime = System.currentTimeMillis();
		String logMsg = null;
		Map<Integer, List<String>> filteredRefDataSpec = new HashMap<Integer, List<String>>();
		
		
		// Generate all the data block keys represented by the member specifications. Since
		// reference data is loaded an entire block at a time, we only need to filter at the
		// data block level instead of the individual intersection level
		logMsg = "Filtering data cache reference data specification....";
		logger.debug(logMsg);
		
		// Generate all the data block keys represented by the member specifications. Since
		// reference data is loaded an entire block at a time, we only need to filter at the
		// data block level instead of the individual intersection level
		int indexedAxisCount = indexedCoreAxes.length;
		@SuppressWarnings("unchecked")
		List<String>[] memberLists = new ArrayList[indexedAxisCount]; 
		for (int i = 0; i < indexedAxisCount; i++) {
			
			// Get the next indexed core dimension axis
			int axis = indexedCoreAxes[i];
			
			// Get the list of members for the current axis. If there's
			// no entry in the member spec then select all defined axis
			// members.
			List<String> memberList = memberSpecByAxis.get(axis);
			if (memberList == null) {
				memberList = new ArrayList<String>(Arrays.asList(getAxisMembers(axis)));
			}
			memberLists[i] = memberList;
		}
		Odometer dataBlockIterator = new Odometer(memberLists);
		//List<Intersection> representedDataBlockKeys = IntersectionUtil.buildIntersections(memberLists, indexedCoreDims);

		// Get list of keys for any requested data blocks that don't yet exist
		List<Intersection> requiredKeys = new ArrayList<Intersection>();
		while (dataBlockIterator.hasNext()) { 
			@SuppressWarnings("unchecked")
			Intersection dataBlockKey = new Intersection(indexedCoreDims, (String[])dataBlockIterator.nextValue().toArray(new String[0]));
			if (!isExistingDataBlock(dataBlockKey)) {
				requiredKeys.add(dataBlockKey);
			}
		}
		
		
		// Build a data spec that defines a superset of all non-existing data blocks
		// that need to be loaded.
		if (!requiredKeys.isEmpty()) {
			
			// Iterate through the required data block keys and compile a
			// unique list of required members by dimension. 
			Map<String, Set<String>> memberSets = new HashMap<String, Set<String>>();
			for (String dim : indexedCoreDims) {
				memberSets.put(dim, new HashSet<String>());
			}
			for (Intersection dataBlockKey : requiredKeys) {
				for (String dim : indexedCoreDims) {
					memberSets.get(dim).add(dataBlockKey.getCoordinate(dim));
				}
			}
			// Build a revised member specification map that represents the
			// minimal superset of all the required data block keys 
			for (String dim : indexedCoreDims) {
				filteredRefDataSpec.put(this.getAxisIndex(dim),
						new ArrayList<String>(memberSets.get(dim)));
			}
			// Add in all defined measure and time members
			filteredRefDataSpec.put(getMeasureAxis(),
					Arrays.asList(getAxisMembers(getMeasureAxis())));
			filteredRefDataSpec.put(getTimeAxis(),
					Arrays.asList(getAxisMembers(getTimeAxis())));
		}
		
		// Return filtered data spec
		logMsg = "Filtering of mdb data specification";
		logger.debug(logMsg);
		performanceLogger.info(LogUtil.timedStep(logMsg, filterStartTime));
		return filteredRefDataSpec;
	}


	/**
	 * Generate a fully expanded unit of work specification
	 * 
	 * @return UnitOfWork
	 */
	public UnitOfWork getUowSpec() {
		
		String[][] members = new String[axisCount][];
		for (int i = 0; i < axisCount; i++) {
			members[i] = memberArray.get(i).toArray(new String[0]);
		}
		UnitOfWork unitOfWork = new UnitOfWork(allDimensions, members);
		
		return unitOfWork;
	}
	
	/**
	 * @return Returns the current year.
	 */
	public String getCurrentYear() {
		return appDef.getCurrentYear();
	}

	/**
	 * Returns an iterator object designed to iterate through all data cells
	 *
	 * @return An iterator object designed to iterate through all data cells
	 */
	public PafIntersectionIterator getDataCellIterator() {
		return getDataCellIterator(null);
	}

	/**
	 * Returns an iterator object designed to iterate through all data cells
	 *
	 * @param memberFilters List of member by dimension to filter iterator on
	 * @return An iterator object designed to iterate through all data cells
	 */
	public PafIntersectionIterator getDataCellIterator(Map <String, List<String>> memberFilters) {

		int[] axes = new int[axisCount];
		PafIntersectionIterator cellIterator = null;

		// Get a list of all axis. This will be used as parameter for the 
		// PafIntersectionIterator.
		for (int i = 0; i < axisCount; i++) {
			axes[i] = i;
		}

		// Get a data cell iterator object
		cellIterator = new PafIntersectionIterator(axes, this, memberFilters);
		return cellIterator;
	}

	
	/**
	 *	Convert an n-dimensional index to an intersection object
	 *
	 * @param index N-dimensional cell index
	 * @return DataCell index (int)
	 */
	private Intersection createIntersection(int[] index) {

		// Convert cell index to intersection object
		String members[] = new String[index.length];
		for (int axis = 0; axis < index.length; axis++) {
			members[axis] = this.getDimMember(axis, index[axis]);
		}
		Intersection intersection = new Intersection(getAllDimensions(), members);
		
		
		// Return intersection
		return intersection;
	}

	/**
	 *	Enter dimension member indexes into appropriate elements of the 
	 *	data cache cell index, based on the dimension order found in the 
	 *	data cache.
	 *
	 * @param cellIndex Data cache cell index
	 * @param dimIndexes Array of pointers to each data cache dimension that is to be updated
	 * @param memberIndexes Array of member indexes that correspond to each dimension in dimIndexes array
	 * @return Updated data cache index
	 */
	public int[] updateCellIndex(int[] cellIndex, int[] dimIndexes, int[] memberIndexes) {

		for (int i = 0; i < dimIndexes.length; i++) {
			cellIndex[dimIndexes[i]] = memberIndexes[i];
		}
		return cellIndex;
	}


	
	/**
	 * @return the indexedIsElements
	 */
	private int[][] getIndexedIsElements() {
		return indexedIsElements;
	}

	/**
	 * @param indexedAxes the indexedAxes to set
	 */
	private void setIndexedIsElements(int[][] indexedIsElements) {
		this.indexedIsElements = indexedIsElements;
	}


	/**
	 * @param coreDimensions the coreDimensions to set
	 */
	protected void setCoreDimensions(String[] coreDimensions) {
		this.coreDimensions = coreDimensions;
	}
	
	/**
	 * @return Returns the lockedPeriods.
	 */
	public Set<String> getLockedPeriods() {
		return lockedPeriods;
	}
	/**
	 * @param lockedPeriods the lockedPeriods to set
	 */
	public void setLockedPeriods(Set<String> lockedPeriods) {
		this.lockedPeriods = lockedPeriods;
	}

	/**
	 *	Returns the axis number corresponding to the Measure dimension
	 *
	 * @return Axis number corresponding to the Measure dimension
	 */
	public int getMeasureAxis() {
		return getAxisIndex(getMeasureDim());
	}

	/**
	 *	Returns the measureDef object for the specified measure
	 *
	 * @param measure measure dimension member
	 *
	 * @return the measureDef object for the specified measure
	 */
	public MeasureDef getMeasureDef(String measure) {

		MeasureDef measureDef = getAppDef().getMeasureDef(measure);

		// Check if versionDef was found
		if (measureDef == null) {
			// No matching versionDef found - throw IllegalArgumentException
			String errMsg = "getMeasureDef() error - no matching measureDef for member: ["
				+ measure + "]";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);	
			throw iae;
		}

		return measureDef;
	}

	/**
	 *	Returns the name of the Measure dimension
	 *
	 * @return Name of the Measure dimension
	 */
	public String getMeasureDim() {
		return appDef.getMdbDef().getMeasureDim();
	}

	/**
	 *	Return the number of members in the Measure dimension
	 *
	 * @return The number of members in the Measure dimension
	 */
	public int getMeasureSize() {
		return getAxisSize(getMeasureAxis());
	}

	/**
	 *	Returns the measure type for the specified measure
	 *
	 * @param measure Measure dimension member
	 *
	 * @return the measure type for the specified measure
	 */
	public MeasureType getMeasureType(String measure) {
		return getMeasureDef(measure).getType();	
	}

	/**
	 * 	Return an array containing the members for each data cache axis
	 * 
	 * @return Returns the memberArray.
	 */
	public List<List<String>> getMemberArray() {
		return memberArray;
	}
	/**
	 * @param memberArray the memberArray to set
	 */
	public void setMemberArray(String[][] memberArray) {
		
		// Convert 2D string array to arrayList of arrayLists. This is kind of a 
		// kludge, but this was done to reduce impact on the code that does the inital
		// load of the UOW from Essbase.
		List<List<String>> memberArrayList = new ArrayList<List<String>>(memberArray.length);
		for (String[] dimMembers : memberArray) {
			List<String> memberList = new ArrayList<String>(Arrays.asList(dimMembers));
			memberArrayList.add(memberList);
		}
		this.memberArray = memberArrayList;
	}

	/**
	 * @param memberIndexMap the memberIndexMap to set
	 */
	protected void setMemberIndexMap(ArrayList<Map<String, Integer>> memberIndexMap) {
		this.memberIndexMap = memberIndexMap;
	}

	/**
	 *	Returns the axis number corresponding to the PlanType dimension
	 *
	 * @return Axis number corresponding to the PlanType dimension
	 */
	public int getPlanTypeAxis() {
		return getAxisIndex(getPlanTypeDim());
	}

	/**
	 *	Returns the name of the PlanType dimension
	 *
	 * @return Name of the PlanType dimension
	 */
	public String getPlanTypeDim() {
		return appDef.getMdbDef().getPlanTypeDim();
	}

	/**
	 *	Returns the axis number corresponding to the Time dimension
	 *
	 * @return Axis number corresponding to the Time dimension
	 */
	public int getTimeAxis() {
		return getAxisIndex(getTimeDim());
	}

	/**
	 *	Returns the name of the Time dimension
	 *
	 * @return Name of the Time dimension
	 */
	public String getTimeDim() {
		return appDef.getMdbDef().getTimeDim();
	}

	/**
	 *	Return the number of members in the Time dimension
	 *
	 * @return The number of members in the Time dimension
	 */
	public int getTimeSize() {
		return getAxisSize(getTimeAxis());
	}

	/**
	 *	Returns the axis number corresponding to the Version dimension
	 *
	 * @return Axis number corresponding to the Version dimension
	 */
	public int getVersionAxis() {
		return getAxisIndex(getVersionDim());
	}

	/**
	 *	Returns the versionDef object for the specified version
	 *
	 * @param version Version dimension member
	 *
	 * @return the versionDef object for the specified version
	 */
	public VersionDef getVersionDef(String version) {

		VersionDef versionDef = getAppDef().getVersionDef(version);

		// Check if versionDef was found
		if (versionDef == null) {
			// No matching versionDef found - throw IllegalArgumentException
			String errMsg = "getVersionDef() error - no matching versionDef for member: ["
				+ version + "]";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);	
			throw iae;
		}

		return versionDef;
	}

	/**
	 *	Returns the versionDefs catalog from the application definition object
	 *  for those versions that exist in this data cache
	 *
	 * @return the versionDefs catalog from the application definition object
	 */
	public Map<String, VersionDef> getVersionDefs() {
		
		Map<String, VersionDef> validVersionDefs = new HashMap<String, VersionDef>();
		String[] validVersions = getVersions();
		for (String version:validVersions) {
			validVersionDefs.put(version, getAppDef().getVersionDef(version));
		}

		return validVersionDefs;
	}

	/**
	 *	Returns the list of versionDef objects for the derived versions that exist 
	 *  in this data cache
	 *
	 * @return List of versionDef objects
	 */
	public List<VersionDef> getDerivedVersionDefs() {
		
		List<VersionDef> allDerivedVersionDefs = getAppDef().getDerivedVersionDefs();		
		List<VersionDef> derivedVersionDefs = new ArrayList<VersionDef>();
		for (VersionDef versionDef:allDerivedVersionDefs) {
			String version = versionDef.getName();
			if (isMember(getVersionDim(), versionDef.getName())) {
				derivedVersionDefs.add(getAppDef().getVersionDef(version));
			}
		}

		return derivedVersionDefs;
	}

	/**
	 *	Returns the list of versionDef objects for the variance versions that exist 
	 *  in this data cache
	 *
	 * @return List of versionDef objects
	 */
	public List<VersionDef> getVarianceVersionDefs() {
		
		List<VersionDef> allVarianceVersionDefs = getAppDef().getVarianceVersionDefs();		
		List<VersionDef> varianceVersionDefs = new ArrayList<VersionDef>();
		for (VersionDef versionDef:allVarianceVersionDefs) {
			String version = versionDef.getName();
			if (isMember(getVersionDim(), versionDef.getName())) {
				varianceVersionDefs.add(getAppDef().getVersionDef(version));
			}
		}

		return varianceVersionDefs;
	}

	/**
	 *	Returns the name of the Version dimension
	 *
	 * @return Name of the Version dimension
	 */
	public String getVersionDim() {
		return appDef.getMdbDef().getVersionDim();
	}

	/**
	 *	Returns the entire list of versions in the PafDataCache 
	 *
	 * @return The entire list of versions with the PafDataCache
	 */
	public String[] getVersions() {
		return getAxisMembers(getVersionAxis());
	}

	/**
	 *	Returns the list of Versions with the specified VersionType
	 *
	 * @param versionType The Version Type to match
	 * 
	 * @return The list of Versions with the specified VersionType
	 */
	public List<String> getVersionsByType(VersionType versionType) {

		List<String> matchedVersions = new ArrayList<String>();
		String[] allVersions = getVersions();

		// Cycle through all defined versions and return the ones that match "VersionType"
		for(String version:allVersions)  {
			if (getVersionType(version) == versionType) {
				matchedVersions.add(version);
			}
		}
		return matchedVersions;
	}

	/**
	 *	Return list of base versions
	 *
	 * @return List<String>
	 */
	public List<String> getBaseVersions() {

		List<String> baseVersions = new ArrayList<String>();

		// Cycle through all defined versions and return the ones that are 
		// base versions (ForwardPlannable, NonPlannable, or Plannable)
		for(String version:getVersions())  {
			VersionType versionType = getVersionType(version);
			if (PafBaseConstants.BASE_VERSION_TYPE_LIST.contains(versionType) 
					|| versionType == VersionType.Plannable) {
				baseVersions.add(version);
			}
		}
		return baseVersions;
	}

	/**
	 *	Return list of reference versions - all non-derived versions, except the 
	 *  active planning versions
	 *
	 * @return List<String>
	 */
	public List<String> getReferenceVersions() {

		List<String> referenceVersions = getBaseVersions();
		List<String> activePlanVersions = Arrays.asList(getPlanVersions());
		
		referenceVersions.removeAll(activePlanVersions);
		return referenceVersions;
	}

	/**
	 *	Returns the number of members in the Version dimension
	 *
	 * @return The number of members in the Version dimension
	 */
	public int getVersionSize() {
		return getAxisSize(getVersionAxis());
	}

	/**
	 *	Returns the version type for the specified version
	 *
	 * @param version Version dimension member
	 *
	 * @return the version type for the specified version
	 */
	public VersionType getVersionType(String version) {
		return getVersionDef(version).getType();	
	}

	/**
	 *	Returns the axis number corresponding to the Year dimension
	 *
	 * @return Axis number corresponding to the Year dimension
	 */
	public int getYearAxis() {
		return getAxisIndex(getYearDim());
	}

	/**
	 *	Returns the name of the Year dimension
	 *
	 * @return Name of the Year dimension
	 */
	public String getYearDim() {
		return appDef.getMdbDef().getYearDim();
	}

	/**
	 *	Return the number of members in the Year dimension
	 *
	 * @return The number of members in the Year dimension
	 */
	public int getYearSize() {
		return getAxisSize(getYearAxis());
	}

	/**
	 *	Add data cache cell to the list of changed cells
	 *
	 * @param cellIndex Data cache cell index
	 * @param cellValue Changed cell value
	 */
	public void addChangedCell(int[] cellIndex, double cellValue) {
		changedCells.add(cellIndex, cellValue);		
	}

	/**
	 * @return Returns the list of changed data cache cells.
	 */
	public List<PafDataCacheCell> getChangedCells() {
		return changedCells.getCells();
	}

	/**
	 *	Initialize the list of changed cells
	 *
	 */
	public void initChangedCells() {
		logger.debug("Initializing changed cells list");
		this.changedCells = new PafDataCacheCells();
	}	

	/**
	 *	Load in cells from another data cache. This is a convenience method for
	 *  loadCacheCells(sourceCache, memberFilter) where memberFilter is set to null.
	 *
	 * @param sourceCache Source data cache
	 * 
	 * @return PafDataCache
	 * @throws PafException 
	 */
	public void loadCacheCells(final PafDataCache sourceCache) throws PafException  {
		loadCacheCells(sourceCache, null);
	}

	/**
	 *	Load in cells from another data cache using the supplied member filter
	 *
	 * @param sourceCache Source data cache
	 * @param memberFilter Member filter by dimension
	 * 
	 * @return PafDataCache
	 * @throws PafException 
	 */
	public void loadCacheCells(final PafDataCache sourceCache, final Map<String, List<String>> memberFilter) throws PafException  {

		Map<String, List<String>> generatedMemberFilter = new HashMap<String, List<String>>();

		// By default a filter will be created for each dimension, consisting of the common members
		// between both data caches. However, any supplied filters for a given dimension will take 
		// precedence.
		for (String dimension:getAllDimensions()) {
			// Use dimensionality of all dsCache dimensions, except the version dimension
			if (memberFilter != null && memberFilter.containsKey(dimension)) {
				
				// Validate filter members
				List<String> memberList = memberFilter.get(dimension);
				List<String> missingMembers = new ArrayList<String>();
				for (String member : memberList) {
					if (!isMember(dimension, member) || !sourceCache.isMember(dimension, member)) {
						missingMembers.add(member);
					}
				}
				memberList.removeAll(missingMembers);
				
				// Exit if there are no valid members for current filtered dimension
				if (memberList.isEmpty()) {
					return;
				}
				
				// Add dimension filter
				generatedMemberFilter.put(dimension, memberList);
				
			} else {
				
				List<String> destCacheMembers = Arrays.asList((getDimMembers(dimension)));
				Set<String> commonMembers = new HashSet<String>(destCacheMembers);
				List<String> sourceCacheMembers = Arrays.asList((sourceCache.getDimMembers(dimension)));
				commonMembers.retainAll(new HashSet<String>(sourceCacheMembers));
				//FIX TTN-838 (KRM)
				if(commonMembers != null && commonMembers.size() == 0){
					String members = StringUtils.arrayToString(destCacheMembers.toArray(new String[0]), "", "", "", "", ",");
					String errMsg = "The following dimension: [" + dimension + "], has member(s): [" + members + "] that are defined on the view, but don't exist in the unit of work.";
					logger.error(errMsg);
					throw new PafException(errMsg, PafErrSeverity.Error);
				}
				generatedMemberFilter.put(dimension, Arrays.asList(commonMembers.toArray(new String[0])));
			}
		}

		// Iterate through all cell intersections represented by the member filter
		PafIntersectionIterator cacheIterator = getDataCellIterator(generatedMemberFilter );
		while(cacheIterator.hasNext()) {

			// Copy source intersection to this data cache
			int[] cacheIndex = cacheIterator.getNext();
			String[] sourceCacheIndex;
			sourceCacheIndex = indexToMembers(cacheIndex);
//			try {
				setCellValue(cacheIndex, sourceCache.getCellValue(sourceCacheIndex));
//			} catch (PafException pfe) {
//				// Problem encountered with source cache index
//				String errMsg = "Unable to load data into DESTINATION data cache - requested member don't exist in SOURCE data cache.";
//				logger.error(errMsg);
//				errMsg = pfe.getMessage() + "  --- " + errMsg;
//				throw new PafException(errMsg, PafErrSeverity.Error);
//			}
		}
	}

	/**
	 * 	Get data "slice" using dimensional and member specifications
	 *  defined in supplied parameter object
	 *
	 * @param parms Object containing required PafDataSlice parameters
	 * 
	 * @return Returns "Data Slice" - a subset of cells in the UowCache
	 * @throws PafException
	 */
	public PafDataSlice getDataSlice(PafDataSliceParms parms) throws PafException {

		boolean hasPageDimensions = false;
		int cellCount = 0, cols = 0, rows = 0, sliceIndex = 0;
		int colDimIndexes[] = null, pageDimIndexes[] = null, rowDimIndexes[] = null;
		double[] dataSlice = null;
		String[] cellIndex = new String[axisCount];
		String[][] colTuples = parms.getColTuples();
		String[][] rowTuples = parms.getRowTuples();
		PafDataSlice pafDataSlice = null;

		try {
			// Validate data slice parms
			logger.info("Validating PafDataSlice parameters...");
			hasPageDimensions = validateDataSliceParms(parms);

			// Creating new data slice array 
			logger.info("Creating new data slice array");
			cols = colTuples.length;
			rows = rowTuples.length;
			cellCount = rows * cols;
			dataSlice = new double[cellCount];

			// Enter page headers into appropriate elements of the data cell 
			// index, based on the dimension order found in the data cache
			if (hasPageDimensions) {
				logger.debug("Entering page headers into data cache index");
				pageDimIndexes = getDimIndexes(parms.getPageDimensions());
				cellIndex = updateCellIndex(cellIndex, pageDimIndexes, parms.getPageMembers());
			}

			// Create array of row dimension indexes
			logger.debug("Creating array of row header indexes");
			rowDimIndexes = getDimIndexes(parms.getRowDimensions());

			// Create array of column dimension indexes
			logger.debug("Creating array of col header indexes");
			colDimIndexes = getDimIndexes(parms.getColDimensions());

			// Load data slice. Start by cycling through row tuples
			logger.info("Getting data slice - [" + StringUtils.commaFormat(rows)  
					+ "] rows  X  [" + cols + "] columns  =  [" 
					+ StringUtils.commaFormat(cellCount) + "] total cells");  	
			for (String[] rowTuple:rowTuples) {
				// Updated the cell index with the current row header information.
				cellIndex = updateCellIndex(cellIndex, rowDimIndexes, rowTuple);

				// Cycle through column tuples
				for (String[] colTuple:colTuples) {

					// Update the cell index with the current column header information 
					// index, based on the dimension order found in the data cache
					cellIndex = updateCellIndex(cellIndex, colDimIndexes, colTuple);

					// Copy selected cell to data slice
					dataSlice[sliceIndex++] = getCellValue(cellIndex);
				}
			}

			// Transfer data slice to PafDataSlice object
			pafDataSlice = new PafDataSlice(dataSlice, cols);

		} catch (PafException pfe) {
			// throw Paf Exception
			throw pfe;
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}

		logger.info("Returning pafDataSlice");
		return pafDataSlice;
	}


	/**
	 *	Validate data slice parameters
	 *
	 * @param parms PafDataSlice parameter object
	 * 
	 * @return True if page dimensions are found among data slice parameters
	 * @throws PafException 
	 */
	private boolean validateDataSliceParms(PafDataSliceParms parms) throws PafException {

		boolean hasPageDimensions;
		boolean[] dimensionFlags = null;
		int dimCount = allDimensions.length;
		String[] pageDimensions = parms.getPageDimensions();
		String[] colDimensions = parms.getColDimensions();
		String[] rowDimensions = parms.getRowDimensions();
		String[][] colMembers = parms.getColTuples();
		String[] pageMembers = parms.getPageMembers();
		String[][] rowMembers = parms.getRowTuples();


		// Checking for existence of page dimensions
		if (pageDimensions != null && pageDimensions.length > 0) {
			hasPageDimensions = true;
		} else {
			hasPageDimensions = false;
		}

		// Check that all arrays are not empty (page dimensions are optional)
		logger.debug("Validating that arrays are not empty....");
		//validateArrayNotEmpty(pageDimensions, "pageDimensions");
		validateArrayNotEmpty(colDimensions, "colDimensions");
		validateArrayNotEmpty(rowDimensions, "rowDimensions");
		if (hasPageDimensions) validateArrayNotEmpty(pageMembers, "pageMembers");
		validateArrayNotEmpty(colMembers, "colMembers");
		validateArrayNotEmpty(rowMembers, "rowMembers");

		// Validate that the correct number of dimensions have been specified
		int parmsDimCount = 0;
		if (hasPageDimensions) {
			parmsDimCount = pageDimensions.length + colDimensions.length + rowDimensions.length;
		} else {
			parmsDimCount = colDimensions.length + rowDimensions.length;
		}
		
		if (parmsDimCount != dimCount) {
			// Incorrect number of dimensions specified
			String errMsg;
			if (parmsDimCount >= dimCount) {
				String missingparmDims = " ";

				List<String> allDimensionsList = Arrays.asList(allDimensions);
				for(String dim : parms.getAllDimensions()){
					if (! allDimensionsList.contains(dim)){
						missingparmDims += dim + ", ";
					}
				}
				
				errMsg = "The view definition has more dimensions than the server expects.  The extra view dimensions are: " + missingparmDims;
			}else{
				errMsg = parmsDimCount + " dimensions specified in data slice parms, but data cache has "
				+ dimCount + " dimensions specified"; 
			}
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
			throw pfe; 				
		}

		// Check that all dimensions are valid and accounted for 
		logger.debug("Validating that all dimensions are valid and accounted for....");
		dimensionFlags = new boolean[dimCount];
		for (int i = 0; i < dimCount; i++) {
			dimensionFlags[i] = false;
		}
		if (hasPageDimensions) {
			for (String dimension:pageDimensions) {
				if (axisIndexMap.containsKey(dimension)) {
					// Indicate that dimension was found
					dimensionFlags[axisIndexMap.get(dimension)] = true;
				} else {
					// Unknown page dimension
					String errMsg = "Unknown page dimension [" + dimension 
					+ "] found in paf data slice parms";
					logger.error(errMsg);
					PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
					throw pfe; 				
				}
			}
		}
		for (String dimension:colDimensions) {
			if (axisIndexMap.containsKey(dimension)) {
				// Indicate that dimension was found
				dimensionFlags[axisIndexMap.get(dimension)] = true;
			} else {
				// Unknown column dimension
				String errMsg = "Unknown column dimension [" + dimension 
				+ "] found in paf data slice parms";
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
				throw pfe; 				
			}
		}
		for (String dimension:rowDimensions) {
			if (axisIndexMap.containsKey(dimension)) {
				// Indicate that dimension was found
				dimensionFlags[axisIndexMap.get(dimension)] = true;
			} else {
				// Unknown row dimension
				String errMsg = "Unknown row dimension [" + dimension 
				+ "] found in paf data slice parms";
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
				throw pfe; 				
			}
		}
		for (int i = 0; i < dimCount; i++) {
			if (dimensionFlags[i] == false) {
				// Unknown row dimension
				String errMsg = "Dimension [" + allDimensions[i] 
				                                              + "] was not specified in the data slice parms";
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
				throw pfe; 								
			}
		}

		// Check that corresponding dimension and tuple arrays match
		if (hasPageDimensions) {
			if (pageDimensions.length != pageMembers.length) {
				// Row dimensions array has different number of dimensions than row tuples array
				String errMsg = "Page dimensions array has different number of dimensions than page tuples array";
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
				throw pfe; 	
			}
		}
		if (rowDimensions.length != rowMembers[0].length) {
			// Row dimensions array has different number of dimensions than row tuples array
			String errMsg = "Row dimensions array has different number of dimensions than row tuples array";
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
			throw pfe; 											
		}
		if (colDimensions.length != colMembers[0].length) {
			// Row dimensions array has different number of dimensions than row tuples array
			String errMsg = "Column dimensions array has different number of dimensions than column tuples array";
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
			throw pfe; 											
		}

		// Indicate presence of page dimensions
		return hasPageDimensions;
	}


	/**
	 * 	Update the data cache with the contents of the data slice
	 *
	 * @param pafDataSlice Paf Data Slice
	 * @param parms Object containing required PafDataSlice parameters
	 * 
	 * @throws PafException
	 */
	public void update(PafDataSlice pafDataSlice, PafDataSliceParms parms) throws PafException {

		boolean hasPageDimensions = false;
		int cols = 0, rows = 0, sliceIndex = 0;
		int colDimIndexes[] = null, pageDimIndexes[] = null, rowDimIndexes[] = null;
		double[] dataSlice = null;
		String[] cacheIndex = new String[axisCount];
		String[][] colTuples = parms.getColTuples();
		String[][] rowTuples = parms.getRowTuples();

		try {
			// Validate data slice parms
			logger.info("Validating PafDataSlice parameters...");
			hasPageDimensions = validateDataSliceParms(parms);

			// Getting data slice array 
			logger.info("Getting data slice array");
			cols = pafDataSlice.getColumnCount();
			dataSlice = pafDataSlice.getData();
			rows = pafDataSlice.getRowCount();

			// Enter page headers into appropriate elements of the data cache 
			// index, based on the dimension order found in the data cache
			if (hasPageDimensions) {
				logger.debug("Entering page headers into data cell index");
				pageDimIndexes = getDimIndexes(parms.getPageDimensions());
				cacheIndex = updateCellIndex(cacheIndex, pageDimIndexes, parms.getPageMembers());
			}

			// Create array of row dimension indexes
			logger.debug("Creating array of row header indexes");
			rowDimIndexes = getDimIndexes(parms.getRowDimensions());

			// Create array of column dimension indexes
			logger.debug("Creating array of col header indexes");
			colDimIndexes = getDimIndexes(parms.getColDimensions());

			// Load data slice. Start by cycling through row tuples
			logger.info("Updating data cache with data slice - rows: " + rows + " columns: " + cols + " cells: " + dataSlice.length);  	
			for (String[] rowTuple:rowTuples) {
				// Enter row headers into appropriate elements of the data cache
				// index, based on the dimension order found in the data cache
				cacheIndex = updateCellIndex(cacheIndex, rowDimIndexes, rowTuple);

				// Cycle through column tuples
				for (String[] colTuple:colTuples) {

					// Enter column headers into appropriate elements of the data cache 
					// index, based on the dimension order found in the data cache
					cacheIndex = updateCellIndex(cacheIndex, colDimIndexes, colTuple);

					// Copy selected data slice cell to data cache
					setCellValue(cacheIndex, dataSlice[sliceIndex++]);
				}
			}

		} catch (PafException pfe) {
			// throw Paf Exception
			throw pfe;
		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}

	}

	/**
	 *	Enter dimensional headers into appropriate elements of the 
	 *	data cache cell index, based on the dimension order found in the 
	 *	data cache
	 *
	 * @param cellIndex Data cache cell index
	 * @param dimIndexes Array of pointers to each data cache dimension
	 * @param memberNames Array of members that correspond to each dimension in dimIndexes array
	 * 
	 * @return Data cache cell index
	 */
	protected String[] updateCellIndex(String[] cellIndex, int[] dimIndexes, String[] memberNames) {

		for (int i = 0; i < dimIndexes.length; i++) {
			cellIndex[dimIndexes[i]] = memberNames[i];
		}
		return cellIndex;
	}

	/**
	 * Return the dimension for the specified axis
	 * 
	 * @param axis Axis index
	 * @return Returns the dimension name.
	 */
	public String getDimension(int axis) {

		// Validate axis
		if (axis < 0 || axis > axisCount - 1) {
			// Invalid axis value
			String errMsg = "Unable to get dimension for axis ["
				+ axis + "] - axis value is out of bounds";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          			
		}
		return allDimensions[axis];
	}


	/**
	 *	Return corresponding data cache axis indexes 
	 *	for supplied array of dimension names
	 *
	 * @param dimNames Array of dimension names
	 * @return Returns array of data cache axis indexes
	 */
	protected int[] getDimIndexes(String[] dimNames) {

		int[] dimIndexes = new int[dimNames.length];
		for (int i = 0; i < dimNames.length; i++) {
			dimIndexes[i] = getAxisIndex(dimNames[i]);
		}
		return dimIndexes;
	}


	/**
	 *	Return the dimension member for the corresponding axis and member index
	 *
	 * @param axis Axis index
	 * @param memberIndex Dimension member index
	 * @return Returns the dimension member for the corresponding axis and member index.
	 */
	public String getDimMember(int axis, int memberIndex) {
		return getAxisMembers(axis)[memberIndex];
	}    


	/**
	 *	Return an array containing the members in the specified dimension name
	 *
	 * @param dimName Dimension name
	 * @return Returns an array containing the members in the specified axis.
	 */
	public String[] getDimMembers(String dimName) {
		return getAxisMembers(getAxisIndex(dimName));
	}    


	/**
	 *	Return number of data cache rows
	 *
	 * @return Returns the number of data cache rows.
	 */
	public int getRowCount() {
		return getCellCount() / getColumnCount();
	}


	/**
	 *	Convert a member name to its corresponding index value
	 *
	 * @param axis Axis index
	 * @param member Dimension member
	 * 
	 * @return Returns a dimension member index.
	 */
	public int getMemberIndex(String member, int axis) {

		int memberIndex = 0;

		// Validate axis
		if (axis < 0 || axis > axisCount - 1) {
			// Invalid axis value
			String errMsg = "Unable to convert member [" 
				+ member + "] to an index - axis value of [" + axis + "] - axis is out of bounds";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          			
		}

		// Compute member index
		if (memberIndexMap.get(axis).containsKey(member)) {
			memberIndex = memberIndexMap.get(axis).get(member);
		} else { 
			// Member not found
			String errMsg = "Member to index conversion error - member ["
				+ member + "] not found in axis [" + axis + "] (dimension [" + allDimensions[axis]  + "])";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae;          			
		}

		return memberIndex;
	}

	/**
	 *	Convert an array of member names to array of index values
	 *
	 * @param members Array of members that define a single cell intersection
	 * @return Returns a data cache cell index.
	 */
	private int[] membersToIndex(String[] members) {

		int[] cellIndex = null;
		String member = null;

		// Validate the the members array is not null
		if (members == null) {
			String errMsg = "Member array to index conversion error - member array is null";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}

		// Validate that the array is the proper size
		if (members.length != axisCount) {
			// array length does not match axisCount
			String errMsg = "Member array to index conversion error - member array length ["  
				+ members.length + "] - does not match axisCount [" + axisCount + "]";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
			throw iae; 
		}

		// Compute cell index
		cellIndex = new int[axisCount];
		for (int i = 0; i < axisCount; i++) {
			member = members[i];
			if (member == null) {
				String errMsg = "Member array to index conversion error - member corresponding to [" + 
				allDimensions[i] + "] dimension (axis [" + i + "]) is null";
				logger.error(errMsg);
				IllegalArgumentException iae = new IllegalArgumentException(errMsg);    
				throw iae;          			
			}
			cellIndex[i] = getMemberIndex(member, i);
		}

		return cellIndex;
	}


	/**
	 *	Convert a data cache cell index to an array of member names
	 *
	 * @param cellIndex Data cache cell index
	 * 
	 * @return Returns Array of members that define a single cell intersection .
	 * @throws PafException 
	 */
	public String[] indexToMembers(int[] cellIndex) throws PafException {

		int index = 0;
		String[] members = null;

		try {
			// Validate cellIndex array
			validateArray(cellIndex, "cellIndex");

			// Create member array
			members = new String[axisCount];
			for (int i = 0; i < axisCount; i++) {
				index = cellIndex[i];
				members[i] = getDimMember(i, index);
			}

		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}

		return members;
	}


	/**
	 *	Determines if the specified member exists in the specified dimension
	 *
	 * @param dimension Dimension name
	 * @param member Dimension member name
	 * 
	 * @return True if the member exists in the specified dimension
	 */
	public boolean isMember(String dimension, String member) {

		boolean isFound = false;

		// Get axis for specified dimension
		int axis = getAxisIndex(dimension);

		// Look for member
		Map<String, Integer> memberMap = memberIndexMap.get(axis);
		if (memberMap.containsKey(member)) {
			isFound = true;
		}

		// Return status
		return isFound;
	}

	/**
	 *	Determines if the specified member exists in the specified dimension,
	 *  ignoring case.
	 *
	 * @param dimension Dimension name
	 * @param searchMember Dimension member name to search for
	 * @param foundMember Dimension member name found (could differ in case)
	 * 
	 * @return True if the member exists in the specified dimension
	 */
	public boolean isMemberIgnoresCase(String dimension, String searchMember, StringBuffer foundMember) {

	
		// Initialize found member string buffer
		foundMember.setLength(0);
		foundMember.trimToSize();
		
		// Look for member - ignoring case
		if (isMember(dimension, searchMember)) {
			foundMember.append(searchMember);
			return true;
		}
			
		// Check for alternate case match
		String[] members = getDimMembers(dimension);
		for (String member : members) {
			if (searchMember.equalsIgnoreCase(member)) {
				foundMember.append(member);
				return true;
			}
		}

		// Member not found
		return false;
	}


	/**
	 *	Determines if the specified data block exists in the data cache
	 *
	 * @param key Data block key
	 * @return True if the specified data block exists in the data cache
	 */
	public boolean isExistingDataBlock(Intersection key) {

		boolean isFound = false;

		// Look for data block
		if (dataBlockIndexMap.containsKey(key)) {
			isFound = true;
		}

		// Return status
		return isFound;
	}

	/**
	 *	Determines if the specified intersection exists in the data cache
	 *
	 * @param intersection Cell intersection
	 * @return True if the specified intersection exists in the data cache
	 */
	public boolean isExistingIntersection(Intersection intersection) {

		boolean isFound = false;

		// Get the data block key (this step also validates the measure and time members)
		DataCacheCellAddress cellAddress = calculateCellAddress(intersection);
		
		// Look for intersection
		if (dataBlockIndexMap.containsKey(cellAddress.getDataBlockKey())) {
			isFound = true;
		}

		// Return status
		return isFound;
	}


	/**
	 *	Determines if the specified key represents a valid data block. This 
	 *  does not necessarily mean that the data block exists in the data cache.
	 *
	 * @param key Data block key
	 * @return True if the specified intersection is a valid data cache intersection
	 */
	public boolean isValidDataBlock(Intersection key) {

		int[] indexedAxes = getIndexedIsElements()[key.getSize() + NON_KEY_DIM_COUNT];
		
		// Assume that intersection is not null
		//TODO Modify this logic to account for attribute intersections and virtual time dimension intersections
		
		// Check data block key size. The data block key must be big enough
		// all core data cache key dimensions, but can't be bigger than the 
		// number allowable key dimensions.
		int minKeyDims = coreDimensions.length - NON_KEY_DIM_COUNT;
		int maxKeyDims = allDimensions.length - NON_KEY_DIM_COUNT;
		int keyDimCount = key.getDimensions().length;
		if (keyDimCount < minKeyDims || keyDimCount > maxKeyDims ) {
			return false;
		}
		
		//TODO first check core dimensions in sequence by position, then check each
		// additional dim to make sure they exist are in ordered in ascending
		// axis order.
		// Cycle through each data block index axis
		int axisCount = indexedAxes.length;
		for (int i = 0; i < axisCount; i++) {
			
			// Lookup the axis number
			int axis = indexedAxes[i];
			
			// Validate dimension name and dimension order
			String dim = key.getDimensions()[i];
			if (!dim.equals(this.getDimension(axis))) {
				return false;
			}
			
			//Validate member name
			String member = key.getCoordinate(dim);
			if (!this.isMember(dim, member)) {
				return false;
			}
		}


		// Return status
		return true;
	}

	/**
	 *	Determines if the specified intersection is a valid data cache intersection. This
	 *  does not necessarily mean that the intersection exists in the data cache.
	 *
	 * @param intersection Cell intersection
	 * @return True if the specified intersection is a valid data cache intersection
	 */
	public boolean isValidIntersection(Intersection intersection) {

		// Assume that intersection is not null
		
		// Check intersection size. The intersection must be big enough to fit 
		// all core data cache dimensions, but can't be bigger than the number
		// of allowable dimensions.
		int isDimCount = intersection.getDimensions().length;
		if (isDimCount < coreDimensions.length || isDimCount > allDimensions.length ) {
			return false;
		}
		
		//TODO Modify this logic to account for attribute intersections and virtual time dimension intersections
		//TODO first check core dimensions in sequence by position, then check each
		// additional dim to make sure they exist are in ordered in ascending
		// axis order.
		// Cycle through each data cache axis
		for (int axis = 0; axis < axisCount; axis++) {
			
			// Validate dimension name and dimension order
			String dim = intersection.getDimensions()[axis];
			if (!dim.equals(this.getDimension(axis))) {
				return false;
			}
			
			//Validate member name
			String member = intersection.getCoordinate(dim);
			if (!this.isMember(dim, member)) {
				return false;
			}
		}


		// Return status
		return true;
	}

	
	/**
	 *	Validate member filters used for retrieving filtered data cache data
	 *
	 * @param memberFilters Map comprised of member lists for each filtered dimension
	 * @throws IllegalArgumentException
	 */
	public void validateMemberFilters(Map<String, List<String>> memberFilters) {
		for (String dimension:memberFilters.keySet()) {
			List<String> members = memberFilters.get(dimension);
			if (members.size() == 0) {
				// Empty member list - throw IllegalArgumentException
				String errMsg = "Member filter error - empty member list specifed on filtered dimension: ["
					+ dimension + "]";
				logger.error(errMsg);
				throw (new IllegalArgumentException(errMsg));
			}
		}		
	}


	/**
	 * @return the isDirty
	 */
	public boolean isDirty() {
		return isDirty;
	}


	/**
	 * @param isDirty the isDirty to set
	 */
	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
	}


	/*
	 *	Represent the DataCache as a 2-dimensional array of data cells
	 *
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		int measureSize = getMeasureSize();
		int timeSize = getTimeSize();
		StringBuffer stringBuffer = new StringBuffer("\n");	
		String format = "%#11.2f\t";

		for (double[][] dataBlock : dataBlockPool) {
			for (int measureIndex = 0; measureIndex < measureSize; measureIndex++ ) {
				for (int timeIndex = 0; timeIndex < timeSize; timeIndex++ ) {
					stringBuffer.append(String.format(format, dataBlock[measureIndex][timeIndex]));
				}
				stringBuffer.append("\n");
			}
		}
		return stringBuffer.toString();
	}




}
