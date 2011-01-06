/**
 * 
 */
package com.palladium.paf.project.utils.excel.test;

import java.util.List;

import junit.framework.TestCase;

import com.palladium.paf.project.utils.excel.PaceExcelRow;
import com.palladium.paf.project.utils.excel.PaceExcelRowItem;

/**
 * @author jmilliron
 *
 */
public class PaceRowTest extends TestCase {

	private PaceExcelRow paceRow = null;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		paceRow = new PaceExcelRow();
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelRow#isHeader()}.
	 */
	public void testIsHeader() {
		
		assertEquals(paceRow.isHeader(), false);
		
		paceRow.setHeader(true);
		
		assertEquals(paceRow.isHeader(), true);
		
		paceRow.setHeader(false);
		
		assertEquals(paceRow.isHeader(), false);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelRow#setHeader(boolean)}.
	 */
	public void testSetHeader() {
		
		paceRow.setHeader(true);
		
		assertEquals(paceRow.isHeader(), true);
		
		paceRow.setHeader(false);
		
		assertEquals(paceRow.isHeader(), false);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelRow#addPaceRowItem(com.palladium.paf.project.utils.excel.PaceExcelRowItem)}.
	 */
	public void testAddPaceRowItem() {
		
		PaceExcelRowItem paceRowItem = new PaceExcelRowItem();
		
		assertEquals(paceRow.getPaceRowItems().size(), 0);
		
		paceRow.addPaceRowItem(paceRowItem);
		
		assertEquals(paceRow.getPaceRowItems().size(), 1);
		
		paceRow.addPaceRowItem(paceRowItem);
		
		assertEquals(paceRow.getPaceRowItems().size(), 2);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.project.utils.excel.PaceExcelRow#getPaceRowItems()}.
	 */
	public void testGetPaceRowItems() {
		
		assertNotNull(paceRow.getPaceRowItems());
		assertEquals(paceRow.getPaceRowItems().size(), 0);
		
		PaceExcelRowItem paceRowItem1 = new PaceExcelRowItem();
		
		PaceExcelRowItem paceRowItem2 = new PaceExcelRowItem();
		
		paceRow.addPaceRowItem(paceRowItem1);
		paceRow.addPaceRowItem(paceRowItem2);
		
		List<PaceExcelRowItem> paceRowItems = paceRow.getPaceRowItems();
		
		assertNotNull(paceRowItems);
		assertEquals(paceRowItems.size(), 2);
		assertEquals(paceRowItems.get(0), paceRowItem1);
		assertEquals(paceRowItems.get(1), paceRowItem2);
		
	}

}
