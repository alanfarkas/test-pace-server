package com.pace.server.eval;
//package com.pace.base.eval;
//
//import junit.framework.TestCase;
//
//import org.apache.log4j.Logger;
//
//import com.pace.base.PafErrHandler;
//import com.pace.base.PafException;
//import com.pace.base.comm.ClientInitRequest;
//import com.pace.base.data.PafDataSlice;
//import com.pace.base.mdb.PafUowCache;
//import com.pace.base.server.PafAppService;
//import com.pace.base.server.PafDataService;
//import com.pace.base.server.UtilityStubs;
//import com.pace.base.state.EvalState;
//import com.pace.base.state.PafClientState;
//import com.pace.base.view.PafView;
//
//public class ES_AggregateTest extends TestCase {
//    
//    private static Logger logger = Logger.getLogger(ES_AggregateTest.class);
//    private PafAppService appService = PafAppService.getInstance();
//    private PafDataService dataService = PafDataService.getInstance();
    
//    /*
//     * Test method for 'com.pace.base.eval.ES_Aggregate.performEvaluation(EvalState, PafUowCache, IFormulaEvalEngine)'
//     */
//FIXME Fix Unit Test
//    public void testperformEvaluation() {
//        ES_Aggregate aggStep = new ES_Aggregate();
//// TODO Fix test to use dummy clientstate object
//        PafUowCache dataCache = null;
//        ClientInitRequest pcInit = new ClientInitRequest();
//        PafClientState clientState = new PafClientState(".999999", pcInit);
//        clientState.setApp(appService.getApplications().get(0));
//        EvalState evalState = new EvalState(UtilityStubs.getTestSliceState(), clientState, dataCache);
////        EvalState evalState = new EvalState(UtilityStubs.getTestSliceState(), PafMetaData.importApplications()[0]);
//        PafDataSlice dataSlice = null;
//        PafView view = UtilityStubs.getSampleView()[0];
//        try {
//            dataService.loadUowCache(null, null, UtilityStubs.getTestUow());
//            dataCache = dataService.getUowCache("5");
//
//            // Update cache with lower value at intersection
//            dataCache.setCellValue(evalState.getSliceState().getChangedCells()[0].getCoordinates(), 12000);
//            
//            dataSlice = dataService.getDataSlice(view, view.getViewSections()[0], null,true);  
//            logger.info("\nPre Evaluation Step\n--------------------");
//            logger.info("\n" + dataSlice.toString());
//
//
//            aggStep.performEvaluation(evalState);
//
//            dataSlice = dataService.getDataSlice(view, view.getViewSections()[0], null, true);  
//            logger.info("\nPost Evaluation Step\n--------------------");            
//            logger.info("\n" + dataSlice.toString());         
//        } catch (PafException e) {
//            PafErrHandler.handleException(e);
//        }
//    }

//}
