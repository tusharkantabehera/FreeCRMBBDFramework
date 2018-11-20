package com.crm.stepDefinations;

import org.testng.Assert;

import com.crm.helper.Constants;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends TestBase{

	LoginPage loginPage;
	HomePage hopmepage;
	
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

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters__and_password(String username,String password)
	{
		loginPage=new LoginPage();
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}
	
	@Then("^User clicks on login button$")
	public void User_clicks_on_login_button() throws InterruptedException
	{
		Thread.sleep(2000);
		loginPage.clickOnLoginButton();
	}
	
	@And("^User is on Homepage$")
	public void User_is_on_Homepage()
	{
		hopmepage=new HomePage();
		boolean flag=hopmepage.varifyUsername();
		Assert.assertTrue(flag);
	}
}
