package com.crm.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {

	private static boolean flag=false;
	
	public static Logger getLogger(Class cls)
	{
		if(flag)
		{
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(".\\src\\test\\resources\\log4j.properties");
		flag=true;
		return Logger.getLogger(cls);
	}
}
