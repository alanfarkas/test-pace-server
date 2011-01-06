//package com.palladium.paf.eval;
//
//import junit.framework.TestCase;
//
//import org.apache.log4j.Logger;
//
//import com.palladium.paf.PafErrHandler;
//import com.palladium.paf.PafException;
//import com.palladium.paf.comm.ClientInitRequest;
//import com.palladium.paf.data.PafDataSlice;
//import com.palladium.paf.mdb.PafUowCache;
//import com.palladium.paf.server.PafAppService;
//import com.palladium.paf.server.PafDataService;
//import com.palladium.paf.server.UtilityStubs;
//import com.palladium.paf.state.EvalState;
//import com.palladium.paf.state.PafClientState;
//import com.palladium.paf.view.PafView;
//
//public class ES_AggregateTest extends TestCase {
//    
//    private static Logger logger = Logger.getLogger(ES_AggregateTest.class);
//    private PafAppService appService = PafAppService.getInstance();
//    private PafDataService dataService = PafDataService.getInstance();
    
//    /*
//     * Test method for 'com.palladium.paf.eval.ES_Aggregate.performEvaluation(EvalState, PafUowCache, IFormulaEvalEngine)'
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
