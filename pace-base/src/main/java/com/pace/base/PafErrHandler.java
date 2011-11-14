/*
 * PafLogger.java created on Jul 26, 2005
 * by Jim Watkins
 * 
 * Copyright(c) Palladium Group, 2005.
 * All Rights Reserved.
 */
package com.pace.base;


import org.apache.log4j.Logger;

import com.pace.base.state.IPafClientState;



/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */


public class PafErrHandler {

    static Logger logger = Logger.getLogger(PafErrHandler.class);
    
    
    static public void handleException(Exception e, PafErrSeverity pes) {
        
        PafException pex = new PafException(e.getMessage(), pes, e);
        handleException(pex);   
    }

    static public void handleException(PafException pex) {

//        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
//                new String[] {"base-spring-config.xml"});

        String msg = "Exception thrown \n" +
        "  -----------------------------------\n";
        
        msg += addMessageMain(pex);
        msg += addMessageDetail(pex);
        msg += addClientState(pex);
        msg += "\n  ------------------------------------";
        
        
        switch (pex.getSeverity()) {
        case Debug : 
            logger.debug( msg );
            break;
        case Info : 
            logger.info( msg );
            break;
        case Warning : 
            logger.warn( msg );
            break;
        case Error : 
            logger.error( msg );
            break;
        case Fatal : 
            logger.fatal( msg );
            break;
        default : logger.warn( msg );
        }

 }    
    
    private static String addClientState(PafException pex) {
        StringBuffer sb = null;
        if (pex.getClientState() != null) {
            sb = new StringBuffer("\n  Client Information: ");
            sb.append("  UserName: " + pex.getClientState().getUserName());            
            sb.append(", ID: " + pex.getClientState().getClientId());
            sb.append(", IP: " + pex.getClientState().getClientIpAddress()); 
        }
        return (sb == null? "" : sb.toString());
    }

    private static String addMessageDetail(PafException pex) {
        StringBuffer sb = null;
        if (pex.getMessageDetails() != null && pex.getMessageDetails().size() > 0) {
            sb = new StringBuffer("\n  Additional Details: ");
            for (String dtl : pex.getMessageDetails() )
                sb.append(dtl + ", ");
        }
        return (sb == null? "" : sb.toString());
    }
    
    
    

    private static String addMessageMain(PafException pex) {
        return  
        "  Message: " + pex.getMessage() + "\n" + 
        "  Class: " + pex.getClass() + "\n" + 
        "  Cause: " + pex.getCause();
    }
    

    public static void handleException(String string, PafErrSeverity severity, Exception e, IPafClientState clientState) {
        // TODO add utilization of client state to error handler.
        PafException pex = new PafException(string, severity, e );
        handleException(pex);
        
    }
    
    
    
}
