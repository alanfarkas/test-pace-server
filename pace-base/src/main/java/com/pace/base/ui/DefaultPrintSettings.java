package com.pace.base.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultPrintSettings {
	private static DefaultPrintSettings _instance;
	@Autowired
	private static PrintStyle defaultPrintStyle;
	
	private DefaultPrintSettings() {}
	
	public static DefaultPrintSettings getInstance() {
		if( _instance == null ) {
			_instance = new DefaultPrintSettings();
			loadDefaultPrintSettings();
		}
		return _instance;
	}
	
	private static void loadDefaultPrintSettings() {
		Thread.currentThread().setContextClassLoader(DefaultPrintSettings.class.getClassLoader());
		ApplicationContext context = 
	    	  new ClassPathXmlApplicationContext(new String[] {"defaultPrintSettings.xml"});
		defaultPrintStyle = (PrintStyle)context.getBean("defaultPrintStyle");
	}

	public PrintStyle getDefaultPrintSettings() {
		return defaultPrintStyle;
	}
}
