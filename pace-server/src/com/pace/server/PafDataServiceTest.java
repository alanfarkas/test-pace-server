package com.pace.server;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PafDimSpec;
import com.pace.base.app.Season;
import com.pace.base.comm.ClientInitRequest;
import com.pace.base.comm.PafPlannerConfig;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafBaseTree;
import com.pace.base.mdb.testCommonParms;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.StringUtils;

public class PafDataServiceTest extends TestCase {

	private static Logger logger = Logger.getLogger(PafDataServiceTest.class);
	PafDataService pds = PafDataService.getInstance();
	PafAppService appService = PafAppService.getInstance();
	PafApplicationDef appDef = appService.getApplications().get(0);
	ClientInitRequest pcInit = new ClientInitRequest();
    PafClientState clientState = testCommonParms.getClientState();
    Set<String> activeVersions = new HashSet<String>(Arrays.asList(new String[]{"WP"}));
    PafPlannerConfig plannerConfig = PafMetaData.getPaceProject().getRoleConfigurations().get(0);
    Season season = PafMetaData.getPaceProject().getSeasons().get(0);
 
	protected void setUp() throws Exception {
		super.setUp();
		if (pds == null) {
			pds = PafDataService.getInstance();
//			pds.initAttributeMemberTreeStore();
//			pds.initMemberTreeStore(new String[] {"Measures", "Product", "Time" }, "Titan" );	
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
    
    /**
     * 
     */
    public void testLoadDataCache() {
    	
    	boolean isSuccess = false;

    	clientState.setApp(appDef);
    	clientState.setActiveVersions(activeVersions);
    	plannerConfig = PafMetaData.getPaceProject().getRoleConfigurations().get(0);
    	plannerConfig.setCalcElapsedPeriods(true);
    	clientState.setPlannerConfig(plannerConfig);
    	clientState.setPlanSeason(season);
        try {
            pds.loadUowCache(clientState, appDef, UtilityStubs.getTestUow() );
            isSuccess = true;
        } catch (PafException pex) {
            PafErrHandler.handleException(pex);
        } catch (Exception ex) {
                PafErrHandler.handleException(ex, PafErrSeverity.Error);
        } finally {
        	assertTrue(isSuccess);
        }
    }

/* THIS TEST IS TEMPORARILY BYPASSED. THIS TEST HAS NOT WORKED SINCE THE MIGRATION TO LINUX AND NEW PACKAGE NAMING
    
/*	
	 * Test method for 'com.pace.base.server.PafDataService.initDataStore(String[])'
	 
	public void testInitDataStore() {
		assertEquals(pds.getBaseTrees().containsKey("Measures"), true);
		PafBaseTree dt = pds.getBaseTrees().get("Product");
		try {
			assertEquals(dt.getMember("DIV01").getMemberProps().getGenerationNumber(), 3);
		}
		catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		}
	}
*/
/*	*//**
	 * Test method for {@link com.pace.base.mdb.PafBaseTree#getAttributeIntersections(java.lang.String, java.lang.String[])}.
	 *//*
	public void testGetAttributeCombinations1() {
		
		boolean isSuccess = false;
		
		final String dimName = "Product";
		final String baseMember = "CLS363-10";
		final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		int expectedCount = 1;
		
		PafBaseTree baseTree = null;

		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeCombinations1 (" + baseMember
					+ ", " + StringUtils.arrayToString(attrDimNames, "[", "]", "", "", ", ") + ")");
			
			// Get selected dimension
			baseTree = pds.getBaseTree(dimName);
			
			// Get member combinations and display them
			Set<Intersection> memberCombos = baseTree.getAttributeIntersections(baseMember, attrDimNames);
			testCommonParms.displayIntersectionSet(memberCombos, logger);
			
			// Validate number of member combinations returned
			if (memberCombos.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

	*//**
	 * Test method for {@link com.pace.base.mdb.PafBaseTree#getAttributeIntersections(java.lang.String, java.lang.String[])}.
	 *//*
	public void testGetAttributeCombinations2() {
		
		boolean isSuccess = false;
		
		final String dimName = "Product";
		final String baseMember = "DPT363";
		final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		int expectedCount = 4;
		
		PafBaseTree baseTree = null;

		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeCombinations2 (" + baseMember
					+ ", " + StringUtils.arrayToString(attrDimNames, "[", "]", "", "", ", ") + ")");
			
			// Get selected dimension
			baseTree = pds.getBaseTree(dimName);
			
			// Get member combinations and display them
			Set<Intersection> memberCombos = baseTree.getAttributeIntersections(baseMember, attrDimNames);
			testCommonParms.displayIntersectionSet(memberCombos, logger);
			
			// Validate number of member combinations returned
			if (memberCombos.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

	*//**
	 * Test method for {@link com.pace.base.mdb.PafBaseTree#getAttributeIntersections(java.lang.String, java.lang.String[])}.
	 *//*
	public void testGetAttributeCombinations3() {
		
		boolean isSuccess = false;
		
		final String dimName = "Product";
		final String baseMember = "DIV03";
		final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		int expectedCount = 13;
		
		PafBaseTree baseTree = null;

		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeCombinations3 (" + baseMember
					+ ", " + StringUtils.arrayToString(attrDimNames, "[", "]", "", "", ", ") + ")");
			
			// Get selected dimension
			baseTree = pds.getBaseTree(dimName);
			
			// Get member combinations and display them
			Set<Intersection> memberCombos = baseTree.getAttributeIntersections(baseMember, attrDimNames);
			testCommonParms.displayIntersectionSet(memberCombos, logger);
			
			// Validate number of member combinations returned
			if (memberCombos.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

	*//**
	 * Test method for {@link com.pace.base.mdb.PafBaseTree#getAttributeIntersections(java.lang.String, java.lang.String[])}.
	 *//*
	public void testGetAttributeCombinations4() {
		
		boolean isSuccess = false;
		
		final String dimName = "Product";
		final String baseMember = "DIV03";
		final String[] attrDimNames = {"Indoor.Outdoor"};
		int expectedCount = 2;
		
		PafBaseTree baseTree = null;

		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeCombinations4 (" + baseMember
					+ ", " + StringUtils.arrayToString(attrDimNames, "[", "]", "", "", ", ") + ")");
			
			// Get selected dimension
			baseTree = pds.getBaseTree(dimName);
			
			// Get member combinations and display them
			Set<Intersection> memberCombos = baseTree.getAttributeIntersections(baseMember, attrDimNames);
			testCommonParms.displayIntersectionSet(memberCombos, logger);
			
			// Validate number of member combinations returned
			if (memberCombos.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

	
	 * Test method for 'com.pace.base.server.PafDataService.getAttributeIntersections(String, String, String[])'
	 
	public void testGetAttributeIntersections1() {
		
		boolean isSuccess = false;
		Set<Intersection> validIs = null;
		final String baseDimName = "Product", baseMemberName = "DPT363";
		final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		final int expectedCount = 20;
		
		
		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeIntersections1 (" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");

			// Get valid intersections and display them
			validIs = pds.getAttributeIntersections(baseDimName, baseMemberName, attrDimNames);
			testCommonParms.displayIntersectionSet(validIs, logger);
			
			// Validate number of intersections returned
			if (validIs.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	public void testGetAttributeIntersections2() {
		
		boolean isSuccess = false;
		Set<Intersection> validIs = null;
		
		final String baseDimName = "Product", baseMemberName = "CLS363-10";
		final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		final int expectedCount = 8;
				
		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeIntersections2 (" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");

			// Get valid intersections and display them
			validIs = pds.getAttributeIntersections(baseDimName, baseMemberName, attrDimNames);
			testCommonParms.displayIntersectionSet(validIs, logger);
			
			// Validate number of intersections returned
			if (validIs.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	public void testGetAttributeIntersections3() {
		
		boolean isSuccess = false;
		Set<Intersection> validIs = null;
		
		final String baseDimName = "Product", baseMemberName = "DPTNA";
		final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		final int expectedCount = 0;
				
		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeIntersections3 (" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");

			// Get valid intersections and display them
			validIs = pds.getAttributeIntersections(baseDimName, baseMemberName, attrDimNames);
			testCommonParms.displayIntersectionSet(validIs, logger);
			
			// Validate number of intersections returned
			if (validIs.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	public void testGetAttributeIntersections4() {
		
		boolean isSuccess = false;
		Set<Intersection> validIs = null;
		
		final String baseDimName = "Product", baseMemberName = "DPT365";
		final String[] attrDimNames = {"Indoor.Outdoor"};
		final int expectedCount = 2;
				
		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeIntersections4 (" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");

			// Get valid intersections and display them
			validIs = pds.getAttributeIntersections(baseDimName, baseMemberName, attrDimNames);
			testCommonParms.displayIntersectionSet(validIs, logger);
			
			// Validate number of intersections returned
			if (validIs.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	public void testGetAttributeIntersections5() {
		
		boolean isSuccess = false;
		Set<Intersection> validIs = null;
		
		final String baseDimName = "Product", baseMemberName = "DIV03";
		final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		final int expectedCount = 50;
				
		try {
			logger.info("");
			logger.info("Running unit test: testGetAttributeIntersections5 (" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");

			// Get valid intersections and display them
			validIs = pds.getAttributeIntersections(baseDimName, baseMemberName, attrDimNames);
			testCommonParms.displayIntersectionSet(validIs, logger);
			
			// Validate number of intersections returned
			if (validIs.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	
	 * Test method for 'com.pace.base.server.PafDataService.getBaseDimNameWithAttributes()'
	 
	public void testGetBaseDimNameWithAttributes() {
		
		boolean isSuccess = false;
		Set<String> baseDimNames = null;
		final int expectedCount = 2;
		
		try {
			logger.info("");
			logger.info("Running unit test: testGetBaseDimNamesWithAttributes\n");
			baseDimNames = pds.getBaseDimNamesWithAttributes();
			if (baseDimNames.isEmpty()) {
				logger.info("  No base dimensions returned!");
			} else {
				logger.info("Returned dimensions: " + StringUtils.arrayToString(baseDimNames.toArray()));
				if (baseDimNames.size() == expectedCount) {
					isSuccess = true;
				}
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	
	 * Test method for 'com.pace.base.server.PafDataService.getInvalidAttributeIntersections(String, String, String[])'
	 
	public void testGetInvalidAttributeIntersections() {
		
		boolean isSuccess = false;
		Set<Intersection> invalidIs = null;

		final String baseDimName = "Product", baseMemberName = "DPT615";
		final String[] attrDimNames = {"Purpose", "Season"};
		final int expectedCount = 26;

		
		try {
			logger.info("");
			logger.info("Running unit test: testGetInvalidAttributeIntersections(" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");
			invalidIs = pds.getInvalidAttributeIntersections(baseDimName, baseMemberName, attrDimNames);
			for (Intersection intersection:invalidIs) {
				logger.info (StringUtils.arrayToString(intersection.getCoordinates()));
			}
			logger.info("");
			logger.info(invalidIs.size() + " invalid attribute combinations found.");
			if (invalidIs.isEmpty()) {
				logger.info("  No invalid attribute intersections returned!");
			}
			if (invalidIs.size() == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	
	 * Test method for 'com.pace.base.server.PafDataService.isValidAttributeIntersections(String, String, String[])'
	 
	public void testIsValidAttributeIntersection() {
		
		boolean isSuccess = false, isValidIs = false;
		final String baseDimName = "Product", baseMemberName = "DPT362";
		final String[] attrDimNames = {"Indoor.Outdoor", "Season", "Purpose"};
		final String[] attrValues = {"Outdoor", "Holiday", "Craft"};
		
		try {
			logger.info("");
			logger.info("Running unit test: testIsValidAttributeIntersection(" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");
			isValidIs = pds.isValidAttributeIntersection(baseDimName, baseMemberName, attrDimNames, attrValues);
			if (isValidIs) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	
	 * Test method for 'com.pace.base.server.PafDataService.isInvalidAttributeIntersection(String, String, String[], String[])'
	 
	public void testIsInvalidAttributeIntersection() {
		
		boolean isSuccess = false, isInvalidIs = true;
		final String baseDimName = "Product", baseMemberName = "DPT362";
		final String[] attrDimNames = {"Indoor.Outdoor", "Season", "Purpose"};
		final String[] attrIs = {"Outdoor", "Holiday", "Craft"};
		
		try {
			logger.info("");
			logger.info("Running unit test: testIsInvalidAttributeIntersection(" + baseDimName
					+ ", " + baseMemberName + ", " + StringUtils.arrayToString(attrDimNames)
					+ ")\n");
			isInvalidIs = pds.isInvalidAttributeIntersection(baseDimName, baseMemberName, attrDimNames, attrIs);
			if (!isInvalidIs) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		} finally {
			assertTrue(isSuccess);
		}
	}

	*//**
	 * Test method for {@link com.pace.base.mdb.PafBaseTree#getAttributeIntersections(java.lang.String, java.lang.String[])}.
	 *//*
	public void testGetValidAttributeMembers1() {
		
		boolean isSuccess = false;
		
		final String selBaseDim = "Product";
		final String selBaseMember = "DPT363";
		final String requestedAttrDim = "Indoor.Outdoor";
		final String[] selAttrDims = new String[0];
		final PafDimSpec[] selAttrMembers = new PafDimSpec[0];
		//final String[] attrDimNames = {"Indoor.Outdoor", "Purpose", "Season"};
		int expectedCount = 3;
		

		try {
			logger.info("");
			logger.info("Running unit test: testGetValidAttributeMembers1 (" + selBaseDim 
					+ ", " + selBaseMember + ", " + requestedAttrDim + ", "
					+ ", " + StringUtils.arrayToString(selAttrDims, "[", "]", "", "", ", ") + ")");
			
			// Get valid attributes
			String[] validAttributes = pds.getValidAttributeMembers(requestedAttrDim, selBaseDim, selBaseMember, selAttrMembers);
			
			// Display valid attributes
			logger.info("\n");
			logger.info("Displaying attribute members:\n");
			for (String validAttribute:validAttributes) {
				logger.info(validAttribute);
			}
			logger.info("");
			logger.info(validAttributes.length + " attribute member(s) returned.\n");		
			// Validate number of member combinations returned
			if (validAttributes.length == expectedCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

*/	/*
	 * Test method for 'com.pace.base.server.PafDataService.getChildren(String, String)'
	 */
	public void testGetChildren() {
		PafBaseTree dt = pds.getBaseTrees().get("Product");
		try {
			assertEquals(11, dt.getMember("DIV01").getChildren().size(), 11);
		}
		catch (Exception ex) {
            PafErrHandler.handleException(ex, PafErrSeverity.Warning);
		}
	}
	
}
