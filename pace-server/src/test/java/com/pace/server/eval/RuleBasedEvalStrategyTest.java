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
//
//public class RuleBasedEvalStrategyTest extends TestCase {

//    RuleBasedEvalStrategy strategy = new RuleBasedEvalStrategy();
//    PafDataService dataService = PafDataService.getInstance();
//    private static Logger logger = Logger.getLogger(RuleBasedEvalStrategyTest.class);
    
//    /*
//     * Test method for 'com.pace.base.eval.RuleBasedEvalStrategy.ExecuteStrategy(SliceState, PafUowCache, IFormulaEvalEngine)'
//     */
//FIXME Fix Unit Test
//    public void testExecuteStrategy() {
//
//        RuleBasedEvalStrategy strategy = new RuleBasedEvalStrategy();
//
//        //      TODO Fix test to use dummy clientstate object
//        PafUowCache dataCache = null;
//        EvalState evalState = new EvalState(UtilityStubs.getTestSliceState(), null, dataCache);
////        EvalState evalState = new EvalState(UtilityStubs.getTestSliceState(), PafMetaData.importApplications()[0]);
//
//        PafDataSlice dataSlice = null;
//        PafView view = UtilityStubs.getSampleView()[0];
//        try {
//            
//            dataService.loadUowCache(null, null, UtilityStubs.getTestUow());
//            dataCache = dataService.getUowCache("5");
//            dataSlice = dataService.getDataSlice(view, view.getViewSections()[0], null, true);  
//            logger.debug("\nInitial State\n--------------------");
//            logger.debug("\n" + dataSlice.toString());
//            
//            // Update cache with lower value at intersection
//            dataCache.setCellValue(evalState.getSliceState().getChangedCells()[0].getCoordinates(), 12000);
//            dataCache.setCellValue(evalState.getSliceState().getChangedCells()[1].getCoordinates(), 4200);
// 
//            
//            dataSlice = dataService.getDataSlice(view, view.getViewSections()[0], null, true);  
//            logger.debug("\nPre Evaluation Step (after changes)\n--------------------");
//            logger.debug("\n" + dataSlice.toString());
//
//            strategy.executeStrategy(evalState);
//
//            dataSlice = dataService.getDataSlice(view, view.getViewSections()[0], null, true);  
//            logger.debug("\nPost Evaluation Step\n--------------------");            
//            logger.debug("\n" + dataSlice.toString());         
//        } catch (PafException e) {
//            PafErrHandler.handleException(e);
//        }
//
//    }

// }
