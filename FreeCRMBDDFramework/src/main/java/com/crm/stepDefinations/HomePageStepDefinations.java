package com.crm.stepDefinations;

import org.testng.Assert;

import com.crm.pages.HomePage;
import com.crm.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class HomePageStepDefinations extends TestBase{
	
	HomePage homepage;
	
	@And("^User is on Homepage$")
	public void User_is_on_Homepage()
	{
		homepage=new HomePage();
		boolean flag=homepage.varifyUsername();
		Assert.assertTrue(flag);
	}
	
	@Then("^User moves to new contact page$")
	public void User_moves_to_new_contact_page()
	{
		homepage.clickOnNewContact();
	}
	
	@Then("^User moves to new deal page$")
	public void User_moves_to_new_deal_page()
	{
		homepage.clickOnNewDeal();
	}
}
