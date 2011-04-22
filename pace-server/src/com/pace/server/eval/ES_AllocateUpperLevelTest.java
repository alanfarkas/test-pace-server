package com.pace.server.eval;
//package com.pace.base.eval;
//
//import junit.framework.TestCase;
//
//import org.apache.log4j.Logger;
//
//import com.pace.base.PafErrHandler;
//import com.pace.base.PafException;
//import com.pace.base.data.PafDataSlice;
//import com.pace.base.mdb.PafUowCache;
//import com.pace.base.server.PafDataService;
//import com.pace.base.server.UtilityStubs;
//import com.pace.base.state.EvalState;
//import com.pace.base.view.PafView;

//public class ES_AllocateUpperLevelTest extends TestCase {

//    private static Logger logger = Logger.getLogger(ES_AllocateUpperLevelTest.class);
//    PafDataService dataService = PafDataService.getInstance();

//    /*
//     * Test method for 'com.pace.base.eval.ES_AllocateUpperLevel.performEvaluation(SliceState, PafUowCache, IFormulaEvalEngine)'
//     */
//FIXME Fix Unit Test
//    public void testperformEvaluation() {
//        ES_AllocateUpperLevel allocateStep = new ES_AllocateUpperLevel();
////      TODO Fix test to use dummy clientstate object
//        PafUowCache dataCache = null;
//        EvalState evalState = new EvalState(UtilityStubs.getTestSliceState(), null, dataCache);
////        EvalState evalState = new EvalState(UtilityStubs.getTestSliceState(), PafMetaData.importApplications()[0]);
//
//        PafDataSlice dataSlice = null;
//        PafView view = UtilityStubs.getSampleView()[0];
//        try {
//            dataService.loadUowCache(null, null, UtilityStubs.getTestUow());
//            dataCache = dataService.getUowCache("5");
//            dataSlice = dataService.getDataSlice(view, view.getViewSections()[0], null, true);  
//
//            logger.debug("\nPre Evaluation Step\n--------------------");
//            logger.debug("\n" + dataSlice.toString());
//
//            dataCache.setCellValue(evalState.getSliceState().getChangedCells()[0].getCoordinates(), 12000);
//            allocateStep.performEvaluation(evalState);
//
//            dataSlice = dataService.getDataSlice(view, view.getViewSections()[0], null, true);  
//            logger.debug("\nPost Evaluation Step\n--------------------");            
//            logger.debug("\n" + dataSlice.toString());         
//        } catch (PafException e) {
//            PafErrHandler.handleException(e);
//        }
//    }
    

//}
