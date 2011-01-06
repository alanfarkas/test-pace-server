//package com.palladium.paf.eval;
//
//import junit.framework.TestCase;
//
//import org.apache.log4j.Logger;
//
//import com.palladium.paf.PafErrHandler;
//import com.palladium.paf.PafException;
//import com.palladium.paf.data.PafDataSlice;
//import com.palladium.paf.mdb.PafUowCache;
//import com.palladium.paf.server.PafDataService;
//import com.palladium.paf.server.UtilityStubs;
//import com.palladium.paf.state.EvalState;
//import com.palladium.paf.view.PafView;

//public class ES_AllocateUpperLevelTest extends TestCase {

//    private static Logger logger = Logger.getLogger(ES_AllocateUpperLevelTest.class);
//    PafDataService dataService = PafDataService.getInstance();

//    /*
//     * Test method for 'com.palladium.paf.eval.ES_AllocateUpperLevel.performEvaluation(SliceState, PafUowCache, IFormulaEvalEngine)'
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
