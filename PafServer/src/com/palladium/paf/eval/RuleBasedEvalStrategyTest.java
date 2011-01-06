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
//
//public class RuleBasedEvalStrategyTest extends TestCase {

//    RuleBasedEvalStrategy strategy = new RuleBasedEvalStrategy();
//    PafDataService dataService = PafDataService.getInstance();
//    private static Logger logger = Logger.getLogger(RuleBasedEvalStrategyTest.class);
    
//    /*
//     * Test method for 'com.palladium.paf.eval.RuleBasedEvalStrategy.ExecuteStrategy(SliceState, PafUowCache, IFormulaEvalEngine)'
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
