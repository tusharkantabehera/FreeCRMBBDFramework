package com.crm.stepDefinations;

import com.crm.testBase.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks extends TestBase{

	@Before
	public void InitializeTest()
	{
		initialization();
	}
	
	@After
	public void endBrowser()
	{
		driver.quit();
	}
}
