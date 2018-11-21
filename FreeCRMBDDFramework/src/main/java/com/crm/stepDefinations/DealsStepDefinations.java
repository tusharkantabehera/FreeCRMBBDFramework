package com.crm.stepDefinations;

import java.util.Map;

import com.crm.pages.DealsPage;
import com.crm.testBase.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class DealsStepDefinations extends TestBase{

	DealsPage dealspage;
	
//	@Then("^User enters deal details$")
//	public void User_enters_deal_details(DataTable creds)
//	{
//		List<List<String>> data=creds.raw();
//		dealspage=new DealsPage();
//		dealspage.enterTitle(data.get(0).get(0));
//		dealspage.enterAmount(data.get(0).get(1));
//		dealspage.enterProbability(data.get(0).get(2));
//		dealspage.enterCommission(data.get(0).get(3));
//	}
//	
	@Then("^User enters deal details$")
	public void User_enters_deal_details_Map(DataTable creds)
	{
		dealspage=new DealsPage();
		for(Map<String,String> data : creds.asMaps(String.class, String.class))
		{
			dealspage.enterTitle(data.get("title"));
			dealspage.enterAmount(data.get("amount"));
			dealspage.enterProbability(data.get("probability"));
			dealspage.enterCommission(data.get("commission"));
			dealspage.clickOnSaveButton();
			
		}

	}
}
