package com.crm.stepDefinations;

import com.crm.pages.NewContactPage;
import com.crm.testBase.TestBase;

import cucumber.api.java.en.Then;

public class NewContactStepDefinations extends TestBase{
	
	NewContactPage newcontactpage;

	@Then("^User enters contact info \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_info_and_and(String firstname, String lastname, String position)
	{
		newcontactpage=new NewContactPage();
		newcontactpage.enterFirstName(firstname);
		newcontactpage.enterLastName(lastname);
		newcontactpage.enterPosition(position);
	}
}
