package com.pace.server;

import java.rmi.RemoteException;
import java.util.Arrays;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.PafSecurityToken;
import com.pace.base.PafSoapException;
import com.pace.base.comm.ClientInitRequest;
import com.pace.base.mdb.PafSimpleAttributeTree;
import com.pace.base.mdb.PafSimpleDimTree;
import com.pace.base.view.PafView;
import com.pace.server.comm.*;

public class PafServiceProviderTest extends TestCase {

    private PafServiceProvider pafService = new PafServiceProvider();
    private static Logger logger = Logger.getLogger(PafServiceProviderTest.class);

    /*
     * Test method for 'com.pace.base.server.PafServiceProvider.saveViewCache()'
     */
    public void testSaveViewCache() {

    }

//    /*
//     * Test method for 'com.pace.base.server.PafServiceProvider.getDimensionTrees()'
//     */
//FIXME Fix Unit Test
//    public void testGetDimensionTrees() {
//    
//    	PafTreesRequest request = null;
//    	PafTreesResponse response = null;
//    	PafSimpleDimTree[] trees = null;
//    	boolean isSuccess = false;
//    
//    	try {
//			response = pafService.getDimensionTrees(request);
//			trees = response.getPafSimpleDimTrees();
//			logger.info("\n");
//			logger.info("The following trees were returned:");
//			for (PafSimpleDimTree tree:trees) {
//				String dim = tree.getId();
//				if (tree instanceof PafSimpleAttributeTree) {
//					logger.info ("\tAttribute Tree: " + dim);
//				} else {
//					logger.info ("\tBase Tree: " + dim);					
//				}
//			}
//			isSuccess = true;
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (PafSoapException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			assertTrue(isSuccess);
//		}
//		
//	
//    }

    /*
     * Test method for 'com.pace.base.server.PafServiceProvider.getVersion()'
     */
    public void testGetVersion() {

    }

    /*
     * Test method for 'com.pace.base.server.PafServiceProvider.clientInit(PafClientInit)'
     */
    public void testClientInit() {
        PafServerAck ack = null;
    
        try {
            ack = pafService.clientInit(CLIENT_INIT());
        }
        catch (RemoteException rex) {
            //shouldn't occur, only for web service layer
        } catch (PafSoapException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        assertEquals(ack.getServerVersion(), PafServerConstants.SERVER_VERSION);
    }

//    /*
//     * Test method for 'com.pace.base.server.PafServiceProvider.clientAuth(PafAuthRequest)'
//     */
//FIXME Fix Unit Test
//    public void testClientAuth() {
//        PafServerAck ack = null;
//        PafSecurityToken token = null;
//        PafAuthResponse response = null;
//        try {
//            ack = pafService.clientInit(CLIENT_INIT());
//            response = pafService.clientAuth(AUTH_REQ(ack.getClientId()));
//            token = response.getSecurityToken();
//        }
//        catch (RemoteException rex) {
//            //shouldn't occur, only for web service layer
//        } catch (PafSoapException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        assertTrue(Double.parseDouble(token.getSessionToken()) > 0);
//        System.out.print("Security token returned: " + token.getSessionToken());
//        assertNotNull(response.getPlannerRoles());  
//    }

//FIXME Fix Unit Test
//    public void testStartPlanSession() {
//        PafServerAck ack = null;
//        PafSecurityToken token = null;
//        
//        PafPlanSessionRequest planReq = new PafPlanSessionRequest();
//        PafPlanSessionResponse resp = null;
//
//
//        try {
//            ack = pafService.clientInit(CLIENT_INIT());
//            token = pafService.clientAuth(AUTH_REQ(ack.getClientId())).getSecurityToken();
//            planReq.setClientId(ack.getClientId());
//            planReq.setSessionToken(token.getSessionToken());
//            planReq.setSelectedRole("Class Planner");
//            planReq.setSeasonId("Fall - Forecast - 2005");
//            try {
//				resp = pafService.startPlanSession(planReq);
//			} catch (PafSoapException e) {
//				
//			}
//			
//        }
//        catch (RemoteException rex) {
//            //shouldn't occur, only for web service layer
//        } catch (PafSoapException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        assertNotNull(resp.getDimTrees());
//        assertTrue(resp.getDimTrees().length > 1);
//        
//    }    
  
    
//    /*
//     * Test method for 'com.pace.base.server.PafServiceProvider.getView(String)'
//     */
//FIXME Fix Unit Test
//    public void testGetView() {
//        PafServerAck ack = null;
//        PafSecurityToken token = null;
//        @SuppressWarnings("unused")
//		PafClientCacheBlock clientCache = null;
//        @SuppressWarnings("unused")
//		PafPlanSessionResponse planResp = null;
//        PafView pv = null;
//
//        try {
//            ack = pafService.clientInit(CLIENT_INIT());
//            token = pafService.clientAuth(AUTH_REQ(ack.getClientId())).getSecurityToken();
//            planResp = pafService.startPlanSession(PLAN_REQ(ack.getClientId(), token.getSessionToken()));
//            
//            ViewRequest req = new ViewRequest();
//            req.setClientId(ack.getClientId());
//            req.setSessionToken(token.getSessionToken());
//            req.setViewName("Weeks");
//            pv = pafService.getView(req);
//        }
//        catch (RemoteException rex) {
//            //shouldn't occur, only for web service layer
//        }  catch (PafSoapException pEx) {
//        	
//        }
//        assertNotNull(pv);
////        assertNotNull(pv.getViewSections()[0].getRowTuples()[13].getNumberFormat().getPattern());
////        assertNotNull(pv.getViewSections()[0].getRowTuples()[2].getNumberFormat().getPattern());
////        assertTrue(pv.getViewSections()[0].getRowTuples()[2].getNumberFormat().getName().equals("ExpPattern"));
////        assertTrue(pv.getViewSections()[0].getRowTuples()[13].getNumberFormat().getName().equals("StdPattern"));        
//        
//    }

    @SuppressWarnings("unused")
	private static PafClientCacheRequest CACHE_REQ(String clientId, String sessId) {
        PafClientCacheRequest cacheRequest = new PafClientCacheRequest();
        cacheRequest.setClientId(clientId);
        cacheRequest.setSessionToken(sessId);
        cacheRequest.setPafSimpleUow(UtilityStubs.getTestUow().getSimpleUow());       
        return cacheRequest;
    }
    
    private static PafAuthRequest AUTH_REQ(String clientId) {
        PafAuthRequest authReq = new PafAuthRequest();
        authReq.setUsername("jim");
        //authReq.setPasswordHash("01234345237722123155");
        authReq.setPasswordHash("");
        authReq.setClientId(clientId);        
        return authReq;
    }
    
    private static ClientInitRequest CLIENT_INIT() {
        ClientInitRequest clientInit = new ClientInitRequest();
        clientInit.setClientType("Excel_2003_SP1");
        clientInit.setClientVersion("1.0");
        clientInit.setIpAddress("Localhost"); 
        return clientInit;
    }
    
    private static PafPlanSessionRequest PLAN_REQ(String clientId, String sessId) {
        PafPlanSessionRequest planReq = new PafPlanSessionRequest();

        planReq.setClientId(clientId);
        planReq.setSessionToken(sessId);
        planReq.setSelectedRole("Class Planner");
        planReq.setSeasonId("Fall - Forecast - 2005");
        
        return planReq;
    }
    

}
