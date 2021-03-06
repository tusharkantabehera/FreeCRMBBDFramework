package com.crm.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="./src/main/java/com/crm/features/hooks.feature",        //Path of the features files
                 glue= {"com/crm/stepDefinations"},                  //Path of the Step-definitions files   
				 plugin= {"pretty","html:target","json:target/cucumber-reports/CucumberTestReport.json",
						  "rerun:target/cucumber-reports/rerun.txt"}, 
//			     format= {"pretty","html:target","json:target/cucumber-reports/CucumberTestReport.json"}, 
				 monochrome=true,      //Display the console output in a proper readable format
				 strict=true,          //It will check if any step is not define in step-definition file
				 dryRun=false           //The mapping is proper between features file and step-definition file
//				 tags= {"@SmokeTest,@RegressionTest"}     //OR  : execute all tests tagged as smoke OR regression
//   			 tags= {"@SmokeTest","@RegressionTest"}   //AND : execute all tests tagged as smoke AND regression
//			     tags= {"~@SmokeTest"}                    //Ignoring SmokeTest
//				 tags= {"@SmokeTest","~@RegressionTest"}  //Ignoring SmokeTest AND RegressionTest
				)

public class TestRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setUpClass()
	{
		testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
	}
	
	@DataProvider
	public Object[][] features()
	{
		return testNGCucumberRunner.provideFeatures();
	}
	
	@Test(groups="cucumber",description="Run cucumber features",dataProvider= "features")
	public void feature(CucumberFeatureWrapper cucumberFeature)
	{
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		testNGCucumberRunner.finish();
	}
}
 