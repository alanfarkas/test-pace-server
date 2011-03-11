package com.pace.base.app;

import junit.framework.TestCase;

public class SeasonTest extends TestCase {

	public SeasonTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testClone() {

		Season season = new Season();		
		Season clonedSeason = season.clone();		
		assertNotNull(clonedSeason);		
		assertEquals(season, clonedSeason);
		
		String id = "test id";    
		boolean isOpen = false;
		String planCycle = "test plan cycle";
		String year = "test year";
		String timePeriod = "test time period";
		PafDimSpec[] otherDims = null;
		
		season.setId(id);
		season.setOpen(isOpen);
		season.setPlanCycle(planCycle);
		season.setYear(year);
		season.setTimePeriod(timePeriod);
		
		clonedSeason = season.clone();		
		assertNotNull(clonedSeason);		
		assertEquals(season, clonedSeason);
		
		otherDims = new PafDimSpec[3];
		
		otherDims[0] = new PafDimSpec();
		
		otherDims[1] = new PafDimSpec();
		
		otherDims[2] = new PafDimSpec();
		
		season.setOtherDims(otherDims);
		
		clonedSeason = season.clone();		
		assertNotNull(clonedSeason);		
		assertEquals(season, clonedSeason);
		assertEquals(season.getOtherDims().length, clonedSeason.getOtherDims().length);
		
		for (int i = 0; i < season.getOtherDims().length; i++ ) {
			
			assertEquals(season.getOtherDims()[i], clonedSeason.getOtherDims()[i]);
			
		}	
		
		String dim1 = "dim1";
		String dim2 = "dim2";
		String dim3 = "dim3";
		
		String exp1 = "exp1";
		String exp2 = "exp2";
		String exp3 = "exp3";
		
		otherDims[0].setDimension(dim1);
		otherDims[0].setExpressionList(new String[] { exp1 });		
		
		otherDims[1].setDimension(dim2);
		otherDims[1].setExpressionList(new String[] { exp2 });
		
		otherDims[2].setDimension(dim3);
		otherDims[2].setExpressionList(new String[] { exp3 });
		
		season.setOtherDims(otherDims);
		
		clonedSeason = season.clone();		
		assertNotNull(clonedSeason);		
		assertEquals(season, clonedSeason);
		assertEquals(season.getOtherDims().length, clonedSeason.getOtherDims().length);
		
		for (int i = 0; i < season.getOtherDims().length; i++ ) {
			
			assertEquals(season.getOtherDims()[i], clonedSeason.getOtherDims()[i]);
			
		}
		
	}

}

