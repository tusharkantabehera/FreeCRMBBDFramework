package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.testBase.TestBase;

public class DealsPage extends TestBase{
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(name="probability")
	WebElement probability;
	
	@FindBy(name="commission")
	WebElement commission;
	
	@FindBy(name="amount")
	WebElement amount;
	
	@FindBy(xpath="//div[@id='existingCampaignLayer']/descendant::input[2]")
	WebElement saveButton;
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public void enterTitle(String title)
	{
		this.title.sendKeys(title);
	}
	
	public void enterProbability(String probability)
	{
		this.probability.sendKeys(probability);
	}
	
	public void enterCommission(String commission)
	{
		this.commission.sendKeys(commission);
	}
	
	public void enterAmount(String amount)
	{
		this.amount.sendKeys(amount);
	}
}
