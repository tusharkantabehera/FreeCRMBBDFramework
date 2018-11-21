package com.crm.stepDefinations;

import java.util.Map;

import org.testng.Assert;

import com.crm.pages.LoginPage;
import com.crm.testBase.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends TestBase{

	LoginPage loginPage;
	
	@Given("^User is already in login page$")
	public void User_is_already_in_login_page()
	{
		enterUrl();
	}
	
	@When("^title of the login page is Free CRM$")
	public void title_of_the_login_page_is_Free_CRM()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
    //Using DataTable
//	@Then("^User enters username and password$")
//	public void Then_User_enters_username_and_password(DataTable creds)
//	{
//		List<List<String>> data=creds.raw();
//		loginPage=new LoginPage();
//		loginPage.enterUsername(data.get(0).get(0));
//		loginPage.enterPassword(data.get(0).get(1));
//	}
	
    //Using Map
	@Then("^User enters username and password$")
	public void Then_User_enters_username_and_password(DataTable creds)
	{
		loginPage = new LoginPage();
		for (Map<String, String> data : creds.asMaps(String.class, String.class)) {

			loginPage.enterUsername(data.get("username"));
			loginPage.enterPassword(data.get("password"));
		}
		
	} 
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters__and_password(String username,String password)
	{
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}
	
	@Then("^User clicks on login button$")
	public void User_clicks_on_login_button() throws InterruptedException
	{
		Thread.sleep(2000);
		loginPage.clickOnLoginButton();
		Thread.sleep(3000);
	}
	
}
