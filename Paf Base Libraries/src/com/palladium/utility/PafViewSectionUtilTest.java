package com.palladium.utility;

import com.palladium.paf.view.PafAxis;
import com.palladium.paf.view.PafViewSection;
import com.palladium.paf.view.PageTuple;

import junit.framework.TestCase;

public class PafViewSectionUtilTest extends TestCase {

	private PafViewSection pafViewSection = null;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		pafViewSection = new PafViewSection();
		
		PageTuple p1 = new PageTuple("Location", null);
		PageTuple p2 = new PageTuple("Product", null);

		pafViewSection.setPageTuples(new PageTuple[] { p1, p2 });
		
		pafViewSection.setColAxisDims(new String[] { "Time", "Measures" } );
		pafViewSection.setRowAxisDims(new String[] { "Version", "Years" } );
		
		
	}

	/*
	 * Test method for 'com.palladium.utility.PafViewSectionUtil.getDimensionAxis(PafViewSection, String)'
	 */
	public void testGetDimensionAxis() {
		
		PafAxis pafAxis = null;
		
		pafAxis = PafViewSectionUtil.getDimensionAxis(null, null);
		
		assertNull(pafAxis);

		pafAxis = PafViewSectionUtil.getDimensionAxis(pafViewSection, null);
		
		assertNull(pafAxis);
		
		pafAxis = PafViewSectionUtil.getDimensionAxis(pafViewSection, "");
		
		assertNull(pafAxis);
		
		pafAxis = PafViewSectionUtil.getDimensionAxis(null, "");
		
		assertNull(pafAxis);
		
		pafAxis = PafViewSectionUtil.getDimensionAxis(pafViewSection, "Location");
		
		assertEquals(PafAxis.PAGE, pafAxis.getValue());
				
		pafAxis = PafViewSectionUtil.getDimensionAxis(pafViewSection, "Time");
		
		assertEquals(PafAxis.COL, pafAxis.getValue());

		pafAxis = PafViewSectionUtil.getDimensionAxis(pafViewSection, "Years");
		
		assertEquals(PafAxis.ROW, pafAxis.getValue());
		
		pafAxis = PafViewSectionUtil.getDimensionAxis(pafViewSection, "InvalidDimName");
		
		assertNull(pafAxis);
		
	}

}
