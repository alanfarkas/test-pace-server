/*
 *	File: @(#)EsbData.java 		Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 15, 2005  		By: Alan Farkas
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
package com.pace.mdb.essbase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.essbase.api.base.EssException;
import com.essbase.api.base.IEssSequentialIterator;
import com.essbase.api.dataquery.IEssMdAxis;
import com.essbase.api.dataquery.IEssMdDataSet;
import com.essbase.api.dataquery.IEssMdMember;
import com.essbase.api.datasource.IEssCube;
import com.essbase.api.datasource.IEssOlapFileObject;
import com.essbase.api.datasource.IEssOlapServer;
import com.pace.base.PafBaseConstants;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PafDimSpec;
import com.pace.base.app.UnitOfWork;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.IMdbData;
import com.pace.base.mdb.PafIntersectionIterator;
import com.pace.base.mdb.PafUowCache;
import com.pace.base.mdb.PafUowCacheParms;
import com.pace.base.state.IPafClientState;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.LogUtil;
import com.pace.base.utility.Odometer;
import com.pace.base.utility.StringUtils;

/**
 * Provides access to operations on Essbase data
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbData implements IMdbData{	

	private String dataSourceID = "";
	private String esbConnAlias = null;
	private Properties connectionProps = null;
	private boolean useConnPool = false;
	private final static String ESS_TEXT_FILE_SUFFIX = PafBaseConstants.ESS_TEXT_FILE_SUFFIX;
	private static Logger logger = Logger.getLogger(EsbData.class);
	private static Logger performanceLogger = Logger.getLogger(PafBaseConstants.PERFORMANCE_LOGGER_MDB_IO);
	
	
	/**
	 * Default constructor called by IMdbData interface
	 * 
	 * @param connectionProps Essbase connection properties
	 */
	public EsbData(Properties connectionProps) {
		// Assume that any available connection pool should be used
		this(connectionProps, true);
	}
	
	/**
	 * @param connectionProps Essbase connection properties
	 * @param useConnPool True if any available connection pool should be used
	 */
	public EsbData(Properties connectionProps, boolean useConnPool ) {
		
		String esbConnAlias = "[" + connectionProps.getProperty("SERVER") + "/" 
				+ connectionProps.getProperty("APPLICATION") + "/" 
				+ connectionProps.getProperty("DATABASE") + "]";
		logger.debug("Creating instance of EsbData - Connection Alias: " 
				+ esbConnAlias + " - Use Connection Pool: " + useConnPool);
		this.esbConnAlias = esbConnAlias;
		this.connectionProps = connectionProps;
		this.useConnPool = useConnPool;
	}

	/**
	 * @param connectionProps Essbase connection property collection
	 * @param dataSourceID Data Source ID corresponding to specified connection
	 */
	public EsbData(Properties connectionProps, String dataSourceID) {
		
		// Assume that any available connection pool should be used
		this(connectionProps, true);
		this.dataSourceID = dataSourceID;
		logger.info("- DataSourceID [" + dataSourceID + "]");
	}
	
	/**
	 * @param esbConnAlias Essbase Connection Alias
	 * @param useConnPool True if any available connection pool should be used
	 */
	public EsbData(String esbConnAlias, boolean useConnPool ) {
		
		logger.debug("Creating instance of EsbData - Connection Alias: " 
				+ esbConnAlias + " - Use Connection Pool: " + useConnPool);
		this.esbConnAlias = esbConnAlias;
		this.useConnPool = useConnPool;
	}
	

	
	/** 
	 *	Return a populated Data Cache based on the supplied UOW, and 
	 *  Application Definition. 
	 *
	 * @param dataSpecByVersion Specifies the intersections to retrieve for each version
	 * @param attributeDims Set of attribute dimension names 
	 * @param clientState Client State
	 * @param lockedPeriods List of locked reporting periods
	 * 
	 * @return PafUowCache - Result set and corresponding meta-data
	 * @throws PafException
	 */
	public PafUowCache loadUowCache(Map<String, Map<Integer, List<String>>> dataSpecByVersion, String[] attributeDims, PafClientState clientState, Set<String> lockedPeriods) throws PafException {
		
		//TODO migrate this method to the data service (or data cache) since the logic here is not specific to the Essbase provider
//		int axisCount = 0;
//		int[] axisSize = null;
//		String[] uowDims = uowSpec.getDimensions();
//		String[][] memberArray = null;
		
//		PafApplicationDef appDef = clientState.getApp();
		PafUowCache dataCache = null;
//		PafUowCacheParms dataCacheParms = null;
		
		
		// B u i l d   a n d   l o a d   t h e   u n i t   o f   w o r k
//		logger.info("Initializing UOW..." ); 
//		dataCache = new PafUowCache(clientState, attributeDims, lockedPeriods);
		
//		// Parse out the dimensional specification in the expanded 
//		// unit of work map
//		axisCount = uowDims.length;
//		axisSize = new int[axisCount];
//		memberArray = new String[axisCount][];
//		for (int axis = 0; axis < axisCount; axis++) {
//			String[] members = uowSpec.getDimMembers(uowDims[axis]);
//			memberArray[axis] = members;
//			axisSize[axis] = members.length;
//		}
//
//		//  Create a data cache conforming to the unit of work specification
//		logger.debug("Inserting Essbase meta-data into PafUowCache...");
//		dataCacheParms = new PafUowCacheParms();
//		dataCacheParms.setAppDef(appDef);
//		dataCacheParms.setActiveVersion(new String[]{clientState.getPlanningVersion().getName()});
//		dataCacheParms.setLockedPeriods(lockedPeriods);
//		dataCacheParms.setAxisCount(axisCount);
//		dataCacheParms.setAxisSize(axisSize);
//		dataCacheParms.setDimensions(uowDims);
//		dataCacheParms.setMemberArray(memberArray);
//		dataCache = new PafUowCache(dataCacheParms);

		// Load the data cache with the required Essbase data
//		refreshDataCache(dataCache, dataSpecByVersion);

		
		logger.debug("Returning Paf Data Cache");
		return dataCache;
	}
	

	/** 
	 *	Refresh the data cache across any version listed in the version filter.
	 *
	 * 	Any refreshed version will first be initialized before the data is refreshed
	 *  from the mdb using the supplided data specification. Any refreshed versions not 
	 *  referneced in the data spec will be loaded as needed during view rendering or 
	 *  evaluation.
	 * 
	 *  No data will be refreshed if the vesion filter is empty.
	 *  
	 * @param dataCache Uow cache
	 * @param mdbDataSpec Specifies the data intersections to reload from Essbase, by version
	 * @param versionFilter List of versions to refresh
	 * 	  
	 * @return List of updated versions
	 * @throws PafException 
	 */ 
	public List<String> refreshDataCache(PafUowCache dataCache, Map<String, Map<Integer, List<String>>> mdbDataSpec, List<String> versionFilter) throws PafException {
	
		// Initialize refreshed versions
		dataCache.clearVersionData(versionFilter);

		// Reload specified data intersections
		return updateUowCache(dataCache, mdbDataSpec);
	}

	/** 
	 *	Update the data cache with mdb data for the specified versions. For
	 * 	performance reasons, existing data blocks will not be updated.
	 * 
	 *  Any versions that need to be completely refreshed should be cleared before 
	 *  calling this method.
	 *
	 *  No data will be refreshed if the vesion filter is empty.
	 *  
	 * @param dataCache Uow cache
	 * @param expandedUow Expanded unit of work specification
	 * @param versionFilter List of versions to refresh
	 * 	  
	 * @return List of updated versions
	 * @throws PafException 
	 */ 
	public List<String> updateDataCache(PafUowCache dataCache, UnitOfWork expandedUow, List<String> versionFilter) throws PafException {
	
		// Exit if version filter is empty
		if (versionFilter == null || versionFilter.isEmpty()) {
			return new ArrayList<String>();
		}
		
		// Create a data specification for each filtered version that specifies that
		// all UOW data (for the filtered version) is loaded from the mdb.
		int versionAxis = dataCache.getVersionAxis();
		Map<String, Map<Integer, List<String>>> mdbDataSpec = new HashMap<String, Map<Integer, List<String>>>();
		for (String version : versionFilter) {
			Map<Integer, List<String>> expandedUowMap = expandedUow.getUowMap(); 
			List<String> versionSpec = new ArrayList<String>(Arrays.asList(new String[]{version}));
			expandedUowMap.put(versionAxis, versionSpec);
			mdbDataSpec.put(version, expandedUowMap);
		}
		
		// Update filtered versions
		return updateUowCache(dataCache, mdbDataSpec);
	}

	/** 
	 *	Update the data cache with mdb data for the intersections specified, by version.
	 * 	For performance reasons, existing data blocks will not be updated.
	 * 
	 *  Any versions that need to be completely refreshed should be cleared before 
	 *  calling this method.
	 *
	 *  No data will be loaded if the data specification is empty.
	 *  
	 * @param dataCache Uow cache
	 * @param mdbDataSpec Specifies the intersections to retrieve from Essbse, by version
	 * 
	 * @return List of refreshed versions
	 * @throws PafException
	 */
    public List<String> updateUowCache(PafUowCache dataCache, Map<String, Map<Integer, List<String>>> mdbDataSpec) throws PafException {

    	int mdxCellCount = 0;
		long loadDcStartTime = System.currentTimeMillis();
		String cubeViewName = null;
		String esbApp = null, esbDb = null;
		String mdxFrom = null, mdxWhere = "";
		String logMsg = null;
    
		EsbCubeView esbCubeView = null;

		// Exit if no data has been specified
		if (mdbDataSpec == null || mdbDataSpec.size() == 0) {
			logger.debug("UpdateDataCache() - empty data spec - no data loaded");
			return new ArrayList<String>();
		}
		
		logger.info("Loading UOW from cube: " + esbConnAlias ); 

		// Connect to Essbase Cube
		cubeViewName = "Paf View - " + esbConnAlias;
		logger.debug("Opening cube view: " + cubeViewName); 
		long esbConnectStartTime = System.currentTimeMillis();
		String stepDesc = "Connection to Essbase Cube: " + esbConnAlias;
		esbCubeView = new EsbCubeView(cubeViewName,  connectionProps, useConnPool, false, false, true);	
		logMsg = LogUtil.timedStep(stepDesc, esbConnectStartTime);
		performanceLogger.info(logMsg);

		// Extract Essbase data into data cache a version at a time.
		logger.debug("Extracting Essbase data into DataCache...");   
		mdxCellCount = 0;		
		esbApp = esbCubeView.getEsbApp();
		esbDb = esbCubeView.getEsbDb(); 
		mdxFrom = " FROM " + esbApp + "." + esbDb;
		Set<String> extractedVersions = mdbDataSpec.keySet();
		for (String version: extractedVersions) {

			// Filter out existing intersections - skip version, if no data to load
			Map<Integer, List<String>> memberMap = mdbDataSpec.get(version);
			Map<Integer, List<String>> filteredMemberMap = dataCache.getFilteredRefDataSpec(memberMap);
			if (filteredMemberMap.isEmpty()) {
				logMsg = "UpdateDataCache() - all requested data already exists - no data updated";
				logger.debug(logMsg);
				performanceLogger.info(logMsg);
				continue;
			}
			
			// Construct MDX select statement that will extract data for selected version,
			// suppressing misssing intersection rows
			String mdxSelect = buildMdxSelect(filteredMemberMap, true);
			String mdxQuery = mdxSelect + mdxFrom + mdxWhere; 

			// Update data cache with Essbase data for selected version
			int retrievedCells = loadCubeData(esbCubeView, mdxQuery, dataCache);
			mdxCellCount += retrievedCells;

		}
		logMsg = "[" + StringUtils.commaFormat(mdxCellCount) + "] total cells retrieved from Essbase.";
		logger.info(logMsg); 
		logMsg = LogUtil.timedStep("UOW Load", loadDcStartTime);
		logger.info(logMsg);
		performanceLogger.info(logMsg);

		// Close cube view
		logger.debug("Closing cube view...");            
		if (esbCubeView != null) {
			esbCubeView.disconnect();
		}

		// Return list of retrieved versions
		return new ArrayList<String>(extractedVersions);

    }


	/**
	 * 	Extract Essbase data into the data cache
	 * 
	 * @param esbCubeView Essbase cube view that points to the cube being queried
	 * @param mdxQuery MDX retrieval query
	 * @param dataCache Data cache
	 * 
	 * @return Number of retrieved cells
	 * @throws PafException 
	 */
	private int loadCubeData(EsbCubeView esbCubeView, String mdxQuery, PafUowCache dataCache) throws PafException {
		
		int axisCount = dataCache.getAxisCount(), retrievedCellCount = 0;
		String dimensions[] = dataCache.getBaseDimensions();
		String logMsg = null;
		PafApplicationDef appDef = dataCache.getAppDef();
		IEssMdAxis[] axes = null;
		IEssMdDataSet essMdDataSet = null;
		IEssMdMember[] essMdMembers = null;

		// Extract Essbase data into data cache using MDX to query the data. Missing data is 
		// suppressed to optimize retrieval time. 
		// 
		// The query will (almost always) return only a subset of the data intersections 
		// defined to the data cache. However, the results of each MDX query to Essbase 
		// contain meta-data that indicates which data intersections were retrieved. This 
		// meta-data is used to define the member intersections to iterate through when 
		// loading the retrieved data into the data cache.

		try {
			// Extract data from cube using supplied Mdx query
			logger.debug("Running Essbse data query: " + mdxQuery);
			performanceLogger.info("Running Essbse data query: " + mdxQuery);
			essMdDataSet = esbCubeView.runMdxQuery(mdxQuery, appDef.getEssNetTimeOut());
			long qryStartTime = System.currentTimeMillis();
			retrievedCellCount = essMdDataSet.getCellCount();
			logMsg = LogUtil.timedStep("Essbase data query", qryStartTime);
			performanceLogger.info(logMsg);
			logMsg = "Essbase data query returned " + StringUtils.decimalFormat(retrievedCellCount, "###,###,###") + " cells";
			logger.debug(logMsg);
			performanceLogger.info(logMsg);

			// Exit method if no data was found
			if (retrievedCellCount == 0) {
				return 0;
			}

			// Get list of retrieved members for each dimension
			long dcLoadStartTime = System.currentTimeMillis();
			axes = essMdDataSet.getAllAxes();
			@SuppressWarnings("unchecked")
			List<String>[] memberLists = new ArrayList[axisCount]; 
			for (int i = 0; i < axisCount; i++) {
				int memberCount = axes[i].getTupleCount();
				ArrayList<String> memberList  = new ArrayList<String>(memberCount);
				for (int j = 0; j < memberCount; j++) {
					essMdMembers = axes[i].getAllTupleMembers(j);
					memberList.add(essMdMembers[0].getName());
				}
				memberLists[i] = memberList;
			}

			// Populate data cache with retrieved Essbase data. Iterate through
			// all data intersections retrieved from Essbase.
			int mdxCellIndex = 0;
			Odometer cellIterator = new Odometer(memberLists);
			while (cellIterator.hasNext()) { 
				// Load next data cache cell - Ignore #MISSING values
				@SuppressWarnings("unchecked")
				Intersection intersection = new Intersection(dimensions, (String[])cellIterator.nextValue().toArray(new String[0]));
				// Ignore missing values
				if (!essMdDataSet.isMissingCell(mdxCellIndex)) {
					double cellValue = essMdDataSet.getCellValue(mdxCellIndex);
					dataCache.setCellValue(intersection, cellValue);	
				}
				mdxCellIndex++;
			}
			logMsg = LogUtil.timedStep("Essbase data load", dcLoadStartTime);
			performanceLogger.info(logMsg);

		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		}

		// Return count of retrieved data cells
		return retrievedCellCount;
	}

	
	/**
	 *	Build an MDX select statement using the supplied collection of dimension members.
	 *
 	 * @param dimMembers A map containing a list of members for each axis
 	 * @param isNonEmptyFlagUsed Indicates that only "non empty" flag should be appended to MDX query
 	 *  	  
 	 * @return Returns an MDX select statement that matches the specified dimensionality.
	 */
	public String buildMdxSelect(Map<Integer, List<String>> dimMembers, Boolean isNonEmptyFlagUsed) {

		int axis = 0;
		String mdxSelect = null;
		StringBuilder sb = new StringBuilder("SELECT ");

		logger.debug("Building MDX Query...");
		//
		// SAMPLE MDX QUERY:
		//
		// SELECT 	{[NEEDED_CUMREC],[APPROVED_TTL]} ON AXIS(0), 
		//		 	{[ClassChn]} ON AXIS(1), 
		//			{[WK01],[WK02],[WK03]} ON AXIS(2), 
		//			{[LY],[CF]} ON AXIS(3), 
		//			{[FY2006]} ON AXIS(4), 
		//			{[DIV09]} ON AXIS(5), 
		//			{[StoreTotal]} ON AXIS(6) 
		//
		
		
		// Check for null dimMembers
		if (dimMembers == null) {
			String errMsg = "buildMdxQuery() error - dimMembers can not be NULL";
			logger.error(errMsg);
			IllegalArgumentException iae = new IllegalArgumentException(errMsg);	
			throw iae;			
		}
				
		// Build MDX Select
		for (axis = 0; axis < dimMembers.size(); axis++) {
			List<String> memberList = dimMembers.get(axis);
			
			// Includes the optional keywords Non Empty before the set specification in each axis in order to suppress 
			// slices that contain entirely #MISSING values.
			if(isNonEmptyFlagUsed == true)
			{
				sb.append(" Non Empty ");
			}
			
			sb.append(StringUtils.arrayToString(memberList.toArray(), "{", "}", "[", "]", "," )) ;
			sb.append(" ON AXIS(" + axis + "), ");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		
		// Return MDX Select
		mdxSelect = sb.toString();
		return mdxSelect;

	}

	
	/**
	 *	Send data back to Essbase
	 *
	 * @param dataCache PafUowCache Object - Updated data and associated meta-data
	 * @param clientState Client state object

	 * @throws PafException
	 */
	public void sendData(PafUowCache dataCache, PafClientState clientState) throws PafException {
		
		final String dataFilePath = clientState.getTransferDirPath();
		final String dataFilePrefix = "esb";
		final String fieldDelim = " ";
		final String lineTerm = "\n";
		final String q = "\"";
		final String missingData = "#MI";
		int axisCount = dataCache.getAxisCount(), dataCols = 0;
		int rowDimCount = 0, measureAxis = dataCache.getMeasureAxis();
		int timeAxis = dataCache.getTimeAxis(), versionAxis = dataCache.getVersionAxis();
		int planTypeAxis = dataCache.getPlanTypeAxis();
        int yearAxis = dataCache.getYearAxis();
		int[] axisSize = dataCache.getAxisSizes(), cellIndex = new int[axisCount];
		int[] rowDimIndexes = null, rowIntersection = null;
		float sendElapsed = 0;
		long sendStart = 0, sendEnd = 0;
		String dataFileName = null, dataFileShortName = null;
		String[] activeVersions = dataCache.getPlanVersions();
 		FileWriter dataLoadFile = null;
		List<String> versionFilter = new ArrayList<String>();
		Set<Integer> nonRowIndexes = new HashSet<Integer>();
		
		EsbCube esbCube = null;
		IEssCube cube = null;
		IEssOlapServer olapServer = null;
		PafIntersectionIterator rowIntersections = null;
		
		
		// Selected data in the data cache (e.g. Active Version(s)) is written back to Essbase in the form of an
		// Essbase data load. The data is first written to a temporary text file residing on the Paf Application
		// Server, using a format that is supported by Essbase for doing data loads without any corresponding 
		// load rules. This temporary file is then copied into the database directory of the appropriate Essbase
		// cube. From there, the data is then loaded into Essbase. 
		//
		// To minimize the size of the data being transferred to Essbase, this process cycles through each
		// unique combination of Year, Version, and Plan Type. This allows the Version, Year, and Plan Type
		// to be defined as headers in each data load file, instead of being duplicated on each data row. 
		// This arrangement also makes it easier to handle "locked periods", since the evaluation of "locked
		// periods" is based on the unique combination of Year and Version.
		//
		//
		// Sample format of Essbase data load is displayed below:
		//
		//	"ClassChn" "FY2006" "WP"
		//	"Measures" "Product" "Location" "S01" "Q1" "Feb" "WK01" "WK02" "WK03" "WK04" "Mar"  
		//	"SLS_DLR" "DIV01" "Location" -383854.0 -191927.0 -63264.0 -19203.0 -11825.0 -16447.0 -15789.0 -56654.0  
		//	"MD_DLR" "DIV01" "Location" -37306.14000000001 -18653.070000000003 -5831.29 -1818.9299999999996 -574.5 -230.20999999999998 -82.5 -211.9
		//	"RECRTL_DLR" "DIV01" "Location" -438250.0 -219125.0 -58805.0 -14460.0 -11400.0 -16380.0 -16565.0 -76755.0 
		//	"BOPRTL_DLR" "DIV01" "Location" -1468069.6800000002 -734034.8400000001 -189863.50999999998 -53300.0 -1850.0 -3325.0 -2130.0 -2430.0 
		//	"EOPRTL_DLR" "DIV01" "Location" -1479241.5400000003 -739620.7700000001 -179573.21999999997 -46738.06999999999 -6258.789999999999 -6101.289999999999 -5780.389999999999 -5603.2699999999995 		
		//	"SLS_DLR" "DPT110" "Location" -51158.0 -25579.0 -8338.0 -2371.0 -1625.0 -2179.0 -2163.0 -7648.0  
		//	"MD_DLR" "DPT110" "Location" -5005.9800000000005 -2502.9900000000002 -788.7299999999999  -264.12 -755.03 -120.21000000000001 -141.5 -202.4  
		//	"RECRTL_DLR" "DPT110" "Location" #MI #MI -56100.0 -28050.0 -7630.0 -1760.0 -1550.0 -2070.0 -2250.0 -9735.0  
		//	"BOPRTL_DLR" "DPT110" "Location" -181453.16 -90726.58 -25240.47 -7100.0 -6258.789999999999 -6101.289999999999 -5780.389999999999 -25965.050000000003  
		//	"EOPRTL_DLR" "DPT110" "Location" #MI #MI -180610.37999999998 -90305.18999999999 -23743.739999999998 -27297.020000000004 -6212.060000000001 -7045.560000000001  
		//
		
		try {
			
			logger.info("Preparing data to be sent to Essbase");
			sendStart = System.currentTimeMillis();
			
			// Create version filter
			logger.debug("Creating version filter...");			
			// Add in active versions
			for (String version:activeVersions) {
				versionFilter.add(version);
			}
				
			// Adjust version dimension size to match number of member in version filter
			axisSize[versionAxis] = versionFilter.size();
			
			// Setting page & col header dimensions
			logger.debug("Setting page & col header dimensions...");			
			int[] pageDimIndexes = {planTypeAxis, yearAxis, versionAxis};
			int colDimIndex = timeAxis;
			for (int index:pageDimIndexes) {
				nonRowIndexes.add(index);
			}
			
			// Create an array of row dimensions to cycle through. For Essbase optimization reasons, Measures & Time 
			// are set as the right-most (inner) row header. Rows are comprised of all dimensions except Time, Version, 
			// Plan Type and Year.
			logger.debug("Setting row dimensions...");
			rowDimCount = axisCount - (pageDimIndexes.length + 1);		
			//TODO - Pull the list of sparse/dense dimensions from the outline and order accordingly
			rowDimIndexes = new int[rowDimCount];
			String[] rowMembers = new String[rowDimCount];
			rowDimIndexes[0] = measureAxis;
			int dimIndex = 1;
			for (int axisIndex = 0; axisIndex < axisCount; axisIndex++) {
				if (!nonRowIndexes.contains(axisIndex) && axisIndex != measureAxis && axisIndex != timeAxis) { 
					// Build an array of  the row dimension axes to feed into row iterator
					rowDimIndexes[dimIndex] = axisIndex;
					// Increment dimension index
					dimIndex++;
				}
			}
		
			// Instantiate row iterator - used to iterate through all row dimension members
			rowIntersections = new PafIntersectionIterator(rowDimIndexes, dataCache);
	
			// Open the cube object, use connection property string if supplied
			logger.info("Opening cube: [" + esbConnAlias + "]"); 
			if (connectionProps != null) {
				esbCube = new EsbCube(connectionProps);				
			} else {
				esbCube = new EsbCube(esbConnAlias);				
			}
			cube = esbCube.getEssCube();
			olapServer = esbCube.getOlapServer();
			
			// Create Essbase data load file. Create the temporary file directory, if it does not already exist.
			File fileObject = new File(dataFilePath);
			fileObject.mkdir();
			if (!fileObject.exists()) {
				StringBuffer errMsg = new StringBuffer("Can't create temporary data file, the required file path does not exist and cannot be created [");
				errMsg.append(fileObject.getAbsolutePath());
				errMsg.append("]. Data not sent to Essbase.");
				logger.error(errMsg);
				throw new IOException(errMsg.toString());			
			}
			File tempFile = File.createTempFile(dataFilePrefix, ESS_TEXT_FILE_SUFFIX, fileObject);
			dataFileName = tempFile.getPath();
			tempFile.deleteOnExit();
						
			// Cycle through list of Plan Types
			String[] planTypes = dataCache.getAxisMembers(planTypeAxis);
			for (String planType: planTypes) {
				int planTypeMemberIndex = dataCache.getMemberIndex(planType, planTypeAxis);
				cellIndex[planTypeAxis] = planTypeMemberIndex;
	
				// Cycle through list of Years
				String[] years = dataCache.getAxisMembers(yearAxis);
				for (String year:years) {
					int yearMemberIndex = dataCache.getMemberIndex(year, yearAxis);
					cellIndex[yearAxis] = yearMemberIndex;
					
					// Cycle through list of Versions 
					for (String version:versionFilter) {
						int versionMemberIndex = dataCache.getMemberIndex(version, versionAxis);
						cellIndex[versionAxis] = versionMemberIndex;
						logger.info("Creating Essbase Data Load File: Plan Type [" + planType + "] - Year ["
								+ year + "] - Version [" + version + "]"); 
						
						// Open new data load file
						dataLoadFile = new FileWriter(dataFileName);
						
						// Get the list of open (unlocked) periods
						List<String> openPeriods = dataCache.getOpenPeriods(version, year);
						dataCols = openPeriods.size();
					
						// Format header definition
						logger.debug("Formatting file header");
						dataLoadFile.append(dQuotes(planType) + fieldDelim + dQuotes(year) + fieldDelim + dQuotes(version));
						dataLoadFile.append(lineTerm);
											
						// Format column headers
						logger.debug("Formatting column headers");
						for (int axis:rowDimIndexes) {
							dataLoadFile.append(dQuotes(dataCache.getDimension(axis)) + fieldDelim);
						}
						for (String period:openPeriods) {
							dataLoadFile.append(dQuotes(period) + fieldDelim);
						}
						dataLoadFile.append(lineTerm);
						
						// Writing data rows
						logger.debug("Writing data rows");
						while (rowIntersections.hasNext()) {
							// Get next row header intersection
							rowIntersection = rowIntersections.getNext();
							
							// Get list of members in row header
							cellIndex = dataCache.updateCellIndex(cellIndex, rowDimIndexes, rowIntersection);								
							for (dimIndex = 0; dimIndex < rowIntersection.length; dimIndex++) {
								rowMembers[dimIndex] = dataCache.getDimMember(rowDimIndexes[dimIndex], rowIntersection[dimIndex]);
							}
							
							// Write out row header
							String rowHeader = StringUtils.arrayToString(rowMembers,"",fieldDelim,q,q,fieldDelim);
							dataLoadFile.append(rowHeader);
							
							// Write out data values
							for (int dataCol = 0; dataCol < dataCols; dataCol++) {
								String colMember = openPeriods.get(dataCol);
								int colMemberIndex = dataCache.getMemberIndex(colMember, timeAxis);
								cellIndex[colDimIndex] = colMemberIndex;
								double cellValue = dataCache.getCellValue(cellIndex);
								if (cellValue != 0) {
									dataLoadFile.append(String.valueOf(cellValue) + fieldDelim);
								} else {
									dataLoadFile.append(missingData + fieldDelim);
								}
							}
							dataLoadFile.append(lineTerm);
						}
						dataLoadFile.close();

						// Load data file to Essbase						
						logger.debug("Copying data file to Essbase Server");
						dataFileShortName = EsbUtility.copyTextFileToServer(olapServer, cube, tempFile);
						logger.info("Loading data to Essbase....");
						cube.loadData(IEssOlapFileObject.TYPE_RULES, null, IEssOlapFileObject.TYPE_TEXT, dataFileShortName, true);
						logger.info("Data saved: Plan Type [" + planType + "] - Year [" + year + "] - Version [" + version + "]");
						logger.info("");
						
						// Reset the row intersection iterator for the next set of page headers
						rowIntersections.reset();
					}					
				}
			}
						
			// Delete data load file from Essbase server
			logger.debug("Deleting data file from Essbase Server");
			EsbUtility.deleteServerTextFile(cube, dataFileShortName);
	
			// Delete data load file from Paf Server
			if (!tempFile.delete()) {
				// Log warning message if file could not be deleted
				String errMsg = "Unable to delete temporary data load file [" +
						tempFile.getName() + "] from Paf Server.";
				logger.warn(errMsg);
			}

			// Log elapsed time
			sendEnd = System.currentTimeMillis();
			sendElapsed = (float)(sendEnd - sendStart) / 1000;
			DecimalFormat decimalFormat = new DecimalFormat("[#,##0.00]");
			String formattedTime = decimalFormat.format(sendElapsed);
			logger.info("Essbase Save Complete - Total elapsed time: " + formattedTime + " seconds") ;
			
		} catch (EssException esx) {
			// Catch essbase exception
			String errMsg = esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} catch (Exception ex) {
			// Catch runtime errors (file handler errors)
			String errMsg = ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		} finally {
			try {
				// Close cube
				logger.info("Closing cube: [" + esbConnAlias + "]");            
				esbCube.disconnect();
			} catch (PafException pfe) {
				// throw Paf Exception
				throw pfe;
			}		
		}
	}
	
    /**
     *	Get Filtered meta-data from Essbase
     *
	 * @param expandedUow Fully expanded unit of work
	 * @param appDef Paf Application Definition
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)

	 * @throws PafException
     */
	public PafDimSpec[] getFilteredMetadata(Map<Integer, List<String>> expandedUOW, PafApplicationDef appDef) throws PafException{
		int axisCount = 0; 
		int[] axisSize = null;
		int[] dimCount = null;
		boolean[] isSlicerAxis = null;
		String cubeViewName = null;
		String esbApp = null, esbDb = null;
		String mdxFrom = null, mdxSelect = null, mdxQuery = null, mdxWhere = "";
		String dimension = null;
			
		EsbCubeView esbCubeView = null;
		IEssMdAxis[] axes = null;
		IEssMdDataSet essMdDataSet = null;
		IEssMdMember[] essMdMembers = null;
		PafDimSpec[] filteredUow = null;
		
		// Retrieve data
		logger.info("Beginning meta-data filter retrieval" ); 
		try {
			//Set return field
			filteredUow = new PafDimSpec[appDef.getMdbDef().getHierDims().length];
			
			// Open a cube view
			cubeViewName = "Paf View - " + esbConnAlias;
			logger.info("Opening cube view: " + cubeViewName);   
			esbCubeView = new EsbCubeView(cubeViewName,  connectionProps, useConnPool, false, false, true);				
			
			// Run mdx query with the "Dataless" option set to true. At this point only meta-deta will be generated.
			// The data will be returned in a seperate call in which any versions containing formulas will be removed
			// from the MDX query.
			esbApp = esbCubeView.getEsbApp();
			esbDb = esbCubeView.getEsbDb(); 
			mdxSelect = buildMdxSelect(expandedUOW, true);
			mdxFrom = " FROM " + esbApp + "." + esbDb;
			mdxQuery = mdxSelect + mdxFrom + mdxWhere; 
			logger.info("Running meta-data filter query: " + mdxQuery);
			essMdDataSet = esbCubeView.runMdxQuery(mdxQuery, true, false, appDef.getEssNetTimeOut());
			
			// Determine basic result set statistics.
			axes = essMdDataSet.getAllAxes();
			axisCount = axes.length;
			logger.info("Axis count: " + axisCount);
			
			// Check for empty result set
			if (axisCount == 0) {
				// Throw Paf Exception
				String errMsg = "Paf Exception: empty Mdx result set ";
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
				throw pfe;
			}
			
			// Determine axis statistics. 
			logger.debug("Computing axis statistics..." );
			axisSize = new int[axisCount];
			dimCount = new int[axisCount];
			isSlicerAxis = new boolean[axisCount];
			
			//	Cycle through each axis and gather axis statistics
			int hierDimCount = 0;
			for (int i = 0; i < axisCount; i++) {
				
				// Store the dimension that corresponds to each axis
				essMdMembers = axes[i].getAllDimensions();
				dimension = essMdMembers[0].getName();
				logger.debug("Axis [" + i + "] Dimension: " + dimension);
				
				// Determine if we have a slicer axis
				isSlicerAxis[i] = axes[i].isSlicerAxis();
				if (isSlicerAxis[i]) {
					// throw Paf Exception
					String errMsg = "Mdx query validation error - not all dimensions in cube assigned to an axis";
					logger.error(errMsg);
					PafException pfe = new PafException(errMsg, PafErrSeverity.Error);	
					throw pfe;
				}
				
				// Determine the number of members in each axis
				axisSize[i] = axes[i].getTupleCount();
				logger.debug("Axis [" + i + "] Size: " + axisSize[i]);
				
				// Store the list of members in each axis
				logger.debug("Getting member names for axis [" + i + "]");
				String axisMembers[] = new String[axisSize[i]];
				for (int j = 0; j < axisSize[i]; j++) {
					essMdMembers = axes[i].getAllTupleMembers(j);
					axisMembers[j] = essMdMembers[0].getName();
				}
				
				// Store filtered hierarchical dimension's meta-data for return
				// There is an assumption that there is only one dimension per axis
				List<String> baseDimsList = Arrays.asList(appDef.getMdbDef().getHierDims());
				if( baseDimsList.contains(dimension))
				{
					PafDimSpec temp = new PafDimSpec();
					temp.setDimension(dimension);
					temp.setExpressionList(axisMembers);
					filteredUow[hierDimCount++] = temp;
				}
				
				// Determine the number of Essbase dimensions in each axis
				dimCount[i] = axes[i].getDimensionCount();
				logger.debug("Axis [" + i + "] Dim Count: " + dimCount[i]);
			}										

		} catch (EssException esx) {
			// throw Paf Exception
			String errMsg = esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} finally {
			try {
				// Close cube view
				logger.info("Closing cube view...");            
				if (esbCubeView != null) {
					esbCubeView.disconnect();
				}
			} catch (PafException pfe) {
				// throw Paf Exception
				throw pfe;
			}
		}
		
		return filteredUow;
	}

	
	/**
	 *	Put double quotes ("") around supplied text string.
	 *
	 * @param text Text string to put double quotes around
	 * 
	 * @return Text string to put double quotes around
	 */
	private String dQuotes(String text) {
		return StringUtils.doubleQuotes(text);
	}

	/**
	 *	Run the specified Essbase calc script against the supplied cube
	 *
	 * @param cube Essbase cube object
	 * @param calcScript Name of Essbase calc script
	 * 
	 * @return Essbase error message (if null, then method was successful)
	 */
	public String runCalcScript(IEssCube cube, String calcScript) {
		
		String esbErrorMsg = null;
		
		// Run calc script - catch any Essbase exeptions
		try {
			cube.calculate(false, calcScript);
		} catch (EssException esx) {
			esbErrorMsg = esx.getMessage();
		}
		
		// Return status
		return esbErrorMsg;
	}

	/**
	 *	Run the specified Essbase calc script
	 *
	 * @param calcScript Name of Essbase calc script
	 * 
	 * @return Essbase error message (if null, then method was successful)
	 * @throws PafException 
	 */
	public String runCalcScript(String calcScript) throws PafException {
		
		String esbErrorMsg = null;
		
		// Open the Essbase cube
		logger.info("Opening cube: [" + getDataSourceID() + "]"); 
		EsbCube esbCube = new EsbCube(getConnectionProps());				
		IEssCube cube = esbCube.getEssCube();
	
		// Run calc script - catch any Essbase exeptions
		try {
			cube.calculate(false, calcScript);
		} catch (EssException esx) {
			esbErrorMsg = esx.getMessage();
		}
		
		// Close cube
		logger.info("Closing cube: [" + getDataSourceID() + "]");            
		esbCube.disconnect();
		
		// Return status
		return esbErrorMsg;
	}

	/**
	 *	Run the specified Essbase report script file against the supplied cube
	 *
	 * @param cube Essbase cube object
	 * @param reportScript Name of Essbase report script
	 * @param outputFilePath Fully qualified name of report output filet
	 * 
	 * @return Essbase error message (if null, then method was successful)
	 * @throws IOException 
	 */
	public String runReportScriptFile(IEssCube cube, String reportScriptFile, String outputFilePath) throws IOException {
		
		return runReportScript(cube, reportScriptFile, outputFilePath, true);
	}

	/**
	 *	Run the specified Essbase report script against the supplied cube
	 *
	 * @param cube Essbase cube object
	 * @param reportScript Name of Essbase report script
	 * @param outputFilePath Fully qualified name of report output filet
	 * 
	 * @return Essbase error message (if null, then method was successful)
	 * @throws IOException 
	 */
	public String runReportScript(IEssCube cube, String reportScript, String outputFilePath) throws IOException {
		
		return runReportScript(cube, reportScript, outputFilePath, false);
	}

	/**
	 *	Run the specified Essbase report script against the supplied cube
	 *
	 * @param cube Essbase cube object
	 * @param reportScript Name of Essbase report script
	 * @param outputFilePath Fully qualified name of report output file
	 * @param isLocalFile Indicates that report script is stored locally, not on the Essbase server
	 * 
	 * @return Essbase error message (if null, then method was successful)
	 * @throws IOException 
	 */
	public String runReportScript(IEssCube cube, String reportScript, String outputFilePath, boolean isLocalFile) throws IOException {
		
		String esbErrorMsg = null;
		
		// Open output file
		FileWriter outputFile = new FileWriter(outputFilePath);
		
		// Run report script - catch any Essbase exeptions
		try {
			IEssSequentialIterator output = cube.report(reportScript, true, isLocalFile, true, false);
			String reportSection = null;
			while ((reportSection = output.getNextString()) != null)
		    	// Write out each report section to ouput file
				outputFile.append(reportSection);
		} catch (EssException esx) {
			esbErrorMsg = esx.getMessage();
		} finally {
		    // Close all files
		    if (outputFile != null) {
		    	outputFile.close();
		    }			
		}
		
		// Return status
		return esbErrorMsg;
	}

	/**
	 *	Run a tokenized Essbase calc script 
	 *
	 * @param calcScript Name of the tokenized calc script
	 * @param tokenCatalog Client token catalog
	 * @param clientState Client state object
	 * 
	 * @throws PafException
	 */
	public void runTokenizedCalcScript(String calcScript, Properties tokenCatalog, IPafClientState clientState) throws PafException {
		
		String esbErrorMsg = null;
		String errMsg = "Error in running Essbase calc script [" + calcScript + "] - ";
		String tempServerCalcScript = "";
		long sendStart = 0, sendEnd = 0;
		float sendElapsed = 0;
		File tokenizedCalcScript = null, resolvedCalcScript = null;
		
		EsbCube esbCube = null;
		IEssCube cube = null;
		IEssOlapServer olapServer = null;
	
		logger.info("Preparing tokenized calc script [" + calcScript + "] ");
		sendStart = System.currentTimeMillis();
	
		try {
			// Open the Essbase cube
			logger.info("Opening cube: [" + getDataSourceID() + "]"); 
			esbCube = new EsbCube(getConnectionProps());				
			cube = esbCube.getEssCube();
			olapServer = esbCube.getOlapServer();
	
			// Copy calc script to file
			logger.debug("Getting tokenized calc script [" + calcScript + "] ");
			tokenizedCalcScript = EsbUtility.copyCalcScriptToFile(olapServer, cube, calcScript, clientState.getTransferDirPath());
			
			// Replacing calc script tokens
			logger.debug("Resolving tokens on tokenized calc script copy [" + tokenizedCalcScript.getName() + "] ");
			resolvedCalcScript = EsbUtility.resolveEssbaseScriptTokens(tokenizedCalcScript, tokenCatalog, clientState.getTransferDirPath());
	
			// Copy resolved calc script file to server
			logger.debug("Copying resolved calc script [" + resolvedCalcScript + "] to server");
			tempServerCalcScript = EsbUtility.copyCalcScriptToServer(olapServer, cube, resolvedCalcScript);
	
			// Run the calc script - throw exception if error was found
			logger.info("Running temporary server calc script [" + tempServerCalcScript + "] ");
			esbErrorMsg = this.runCalcScript(cube, tempServerCalcScript);
			if (esbErrorMsg != null) {
				errMsg += "Calc script error: " + esbErrorMsg;
				logger.error(errMsg);
				throw new PafException(errMsg, PafErrSeverity.Error);			
			}
		} catch (IOException ioe) {
			// throw Paf Exception
			errMsg += ioe.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ioe);	
			throw pfe;
		} catch (EssException esx) {
			// throw Paf Exception
			errMsg += esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} finally {
			// Delete temporary files from Essbase Server
			EsbUtility.deleteServerCalcScript(cube, tempServerCalcScript);
			
			// Close Essbase Cube
			logger.info("Closing cube: [" + getDataSourceID() + "]");            
			esbCube.disconnect();	 		
		}
		
		// Delete temporary files from Paf Server (if not in debug mode)
		if (!clientState.isDebugMode()) {
			if (tokenizedCalcScript != null && !tokenizedCalcScript.delete()) {
				// Log warning message if file could not be deleted
				errMsg += "Unable to delete temporary tokenized calc script ["
						+ tokenizedCalcScript.getName() + "] from Paf Server.";
				logger.warn(errMsg);
			}
			if (resolvedCalcScript != null && !resolvedCalcScript.delete()) {
				// Log warning message if file could not be deleted
				errMsg += "Unable to delete temporary resolved calc script ["
						+ resolvedCalcScript.getName() + "] from Paf Server.";
				logger.warn(errMsg);
			}
		}
		
		// Log elapsed time
		sendEnd = System.currentTimeMillis();
		sendElapsed = (float)(sendEnd - sendStart) / 1000;
		DecimalFormat decimalFormat = new DecimalFormat("[#,##0.00]");
		String formattedTime = decimalFormat.format(sendElapsed);
		logger.info("Calc script [" + calcScript + "] successfully executed - Total elapsed time: " 
				+ formattedTime + " seconds") ;
							
	}

	/**
	 * Run a tokenized Essbase report script to a file path accessible to
	 * the Pace server.
	 * 
	 * @param reportScript Name of report script to run
	 * @param outputFile Fully qualified file path of report output file
	 * @param tokenCatalog Client token catalog
	 * @param clientState Client state object
	 * 
	 * @throws PafException 
	 */
	public void runTokenizedReportScript(String reportScript, String outputFile, Properties tokenCatalog, IPafClientState clientState) throws PafException {
		
		String esbErrorMsg = null;
		String errMsg = "Error in running Essbase calc script [" + reportScript + "] - ";
		long sendStart = 0, sendEnd = 0;
		float sendElapsed = 0;
		File tokenizedReportScript = null, resolvedReportScript = null;
		
		EsbCube esbCube = null;
		IEssCube cube = null;
		IEssOlapServer olapServer = null;
	
		logger.info("Preparing tokenized report script [" + reportScript + "] ");
		sendStart = System.currentTimeMillis();
	
		try {
			// Open the Essbase cube
			logger.info("Opening cube: [" + getDataSourceID() + "]"); 
			esbCube = new EsbCube(getConnectionProps());				
			cube = esbCube.getEssCube();
			olapServer = esbCube.getOlapServer();
	
			// Copy report script to temporary file
			logger.debug("Getting tokenized report script [" + reportScript + "] ");
			tokenizedReportScript = EsbUtility.copyReportScriptToFile(olapServer, cube, reportScript, clientState.getTransferDirPath());
			
			// Replacing report script tokens
			logger.debug("Resolving tokens on tokenized report script copy [" + tokenizedReportScript.getName() + "] ");
			resolvedReportScript = EsbUtility.resolveEssbaseScriptTokens(tokenizedReportScript, tokenCatalog, clientState.getTransferDirPath());
	
			// Run the resolved report script - throw exception if error was found
			String resolvedScriptName = resolvedReportScript.getCanonicalPath();
			logger.info("Running resolved report script [" + resolvedScriptName + "] ");
			esbErrorMsg = this.runReportScriptFile(cube, resolvedScriptName, outputFile);
			if (esbErrorMsg != null) {
				errMsg += "Report script error: " + esbErrorMsg;
				logger.error(errMsg);
				throw new PafException(errMsg, PafErrSeverity.Error);			
			}
		} catch (IOException ioe) {
			// throw Paf Exception
			errMsg += ioe.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ioe);	
			throw pfe;
		} catch (EssException esx) {
			// throw Paf Exception
			errMsg += esx.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, esx);	
			throw pfe;
		} finally {
			// Close Essbase Cube
			logger.info("Closing cube: [" + getDataSourceID() + "]");            
			esbCube.disconnect();	 		
		}
		
		// Delete temporary files from Paf Server (if not in debug mode)
		if (!clientState.isDebugMode()) {
			if (tokenizedReportScript != null && !tokenizedReportScript.delete()) {
				// Log warning message if file could not be deleted
				errMsg += "Unable to delete temporary tokenized report script ["
						+ tokenizedReportScript.getName() + "] from Paf Server.";
				logger.warn(errMsg);
			}
			if (resolvedReportScript != null && !resolvedReportScript.delete()) {
				// Log warning message if file could not be deleted
				errMsg += "Unable to delete temporary resolved report script ["
						+ resolvedReportScript.getName() + "] from Paf Server.";
				logger.warn(errMsg);
			}
		}
		
		// Log elapsed time
		sendEnd = System.currentTimeMillis();
		sendElapsed = (float)(sendEnd - sendStart) / 1000;
		DecimalFormat decimalFormat = new DecimalFormat("[#,##0.00]");
		String formattedTime = decimalFormat.format(sendElapsed);
		logger.info("Report script [" + reportScript + "] successfully executed - Total elapsed time: " 
				+ formattedTime + " seconds") ;
							
	}

	/**
	 * @return Returns the connectionProps.
	 */
	protected Properties getConnectionProps() {
		return connectionProps;
	}

	/**
	 * @return Returns the dataSourceID.
	 */
	public String getDataSourceID() {
		return dataSourceID;
	}


	/**
	 * @return Returns the useConnPool.
	 */
	public boolean isUseConnPool() {
		return useConnPool;
	}


}
