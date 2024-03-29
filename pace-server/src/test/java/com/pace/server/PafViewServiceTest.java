package com.pace.server;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.pace.base.app.SuppressZeroSettings;
import com.pace.base.data.PafDataSlice;
import com.pace.base.view.PafViewSection;

public class PafViewServiceTest extends TestCase {
/*	PafViewService viewSrv = PafViewService.getInstance();

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	 * Test method for 'com.pace.base.server.PafViewService.getViewMetaData()'
	 
	public void testGetViewMetaData() {

	}

	
	 * Test method for 'com.pace.base.server.PafViewService.updateViewCache(String, PafView)'
	 
	public void testUpdateViewCache() {

	}

	
	 * Test method for 'com.pace.base.server.PafViewService.saveViewCache()'
	 
	public void testSaveViewCache() {
//		viewSrv.saveViewCache();
	}

	
	 * Test method for 'com.pace.base.server.PafViewService.loadViewCache()'
	 
	public void testLoadViewCache() {

	}

	
	 * Test method for 'com.pace.base.server.PafViewService.getInstance()'
	 
	public void testGetInstance() {

	}

	
	 * Test method for 'com.pace.base.server.PafViewService.getView(String)'
	 
	public void testGetView() {
        PafView view = null;
        ViewRequest request = new ViewRequest();
      
        request.setClientId("5");
        request.setViewName("Default");
        request.setSessionToken("12345");
        
        
        try {
            view = viewSrv.getView(request);
        }
        catch (PafException pex) {
            PafErrHandler.handleException(pex);
        }
        
		assertNotNull(view);
	}
	
	public void testGetExpandedView() {
        PafView view = null;
        ViewRequest request = new ViewRequest();
        request.setClientId("5");
        request.setViewName("Test.Expanded");
        request.setSessionToken("12345");
        
        try {
            view = viewSrv.getView(request);
        }
        catch (PafException pex) {
            PafErrHandler.handleException(pex);
        }
        
		assertNotNull(view);
	}
	*/
    public void testSuppressZeros(){
    	PafViewSection pvs = new PafViewSection();
    	SuppressZeroSettings sup = new SuppressZeroSettings();
    	
    	pvs.setSuppressZeroSettings(sup);
    	pvs.getSuppressZeroSettings().setRowsSuppressed(true);
    	pvs.getSuppressZeroSettings().setColumnsSuppressed(true);
    	
    	double[] data = {
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			1,2,0,3,4,5,6,0,7,8,9,10,11,12,0,13,14,15,16,0,17,18,19,20,21,22,0,23,24,25,26,0,27,28,29,30,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
    			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
    			

    			};
    	
    	PafDataSlice pds = new PafDataSlice();
    	pvs.setPafDataSlice(pds);
    	pvs.getPafDataSlice().setData(data);
    	pvs.getPafDataSlice().setColumnCount(36);
    	
		List<Integer> suppressedRows = new ArrayList<Integer>();
		List<Integer> suppressedColumns = new ArrayList<Integer>();
    	
    	suppressZeros(pvs, suppressedRows, suppressedColumns);
    	
    	int k = 0;
    	System.out.println(pvs.getPafDataSlice().getRowCount());
    	System.out.println(pvs.getPafDataSlice().getColumnCount());
    	System.out.println(pvs.getPafDataSlice().getData().length);
    	System.out.println(suppressedRows.size());
    	System.out.println(suppressedColumns.size());
    	
    	for(int i =0; i < pvs.getPafDataSlice().getRowCount(); i++){ //got to use original row count
			for(int j = 0; j < pvs.getPafDataSlice().getColumnCount()    ; j++){
				System.out.print(pvs.getPafDataSlice().getData()[k++]);
			}	
			System.out.println("");
    	}
    	
    }

	private void suppressZeros(PafViewSection viewSection, List<Integer> suppressedRows, List<Integer> suppressedColumns ){
		
		PafDataSlice dataSlice = viewSection.getPafDataSlice();
		boolean areRowsSuppressed = viewSection.getSuppressZeroSettings().getRowsSuppressed();
		boolean areColumnsSuppressed = viewSection.getSuppressZeroSettings().getColumnsSuppressed();
		boolean zeroFlag;
		int rowCount = dataSlice.getRowCount();
		int columnCount = dataSlice.getColumnCount();
		int k;
		
		k = 0;
		List<Integer> columnsWithZeros = new ArrayList<Integer>();
	
		//get the rows and columns to suppress
		for(int i = 0; i < rowCount; i++){
			zeroFlag = true;
			for(int j = 0; j < columnCount; j++){
				if (areRowsSuppressed = true && dataSlice.getData()[k] != 0){
					zeroFlag = false;
				}else if(areColumnsSuppressed == true){ // get the row 0 columns with a zero data value
					if(i == 0){
						suppressedColumns.add(j);
					}
					columnsWithZeros.add(j);
				}
				k++;
			}
			
			if (areRowsSuppressed == true){
				if (zeroFlag == true){
					suppressedRows.add(i);
				}
			}
			
			if(areColumnsSuppressed == true){
				suppressedColumns.retainAll(columnsWithZeros);
				columnsWithZeros.clear();
			}
		}
		
		int arrayLength;
		double[] data;
		int l;
	
		//suppress rows
		if (areRowsSuppressed == true){
			rowCount = rowCount - suppressedRows.size();
			arrayLength = rowCount * columnCount;
			
			k = 0;
			l = 0;
			data = new double[arrayLength];
	
			for(int i =0; i < dataSlice.getRowCount(); i++){ //got to use original row count
				for(int j = 0; j < columnCount; j++){
	
					if (! suppressedRows.contains(i)){
						data[l++] = (dataSlice.getData()[k]);
						k++;
					}else{//skip row
						k = k + columnCount;
						break;
					}
				}
			}
			dataSlice.setData(data.clone());
		}
		
		//suppress columns
		if(areColumnsSuppressed == true){
			columnCount = columnCount - suppressedColumns.size();
			arrayLength = rowCount * columnCount;
		
			k = 0;
			l = 0;
			data = new double[arrayLength];

			for(int i =0; i < rowCount; i++){
				for(int j = 0; j < dataSlice.getColumnCount(); j++){ //got to use original column count

					if (! suppressedColumns.contains(j)){
						data[l++] = (dataSlice.getData()[k]);
					}
					k++;
				}
			}
			dataSlice.setData(data.clone());

			//if you don't have any rows, then you can't you have any columns
			if(rowCount == 0){
				columnCount = 0;
			}
			dataSlice.setColumnCount(columnCount);

		}
		
		//viewSection.setPafDataSlice(dataSlice);
	}
}
