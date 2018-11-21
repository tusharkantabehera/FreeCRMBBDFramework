package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.testBase.TestBase;
import com.crm.utils.Utils;

public class HomePage extends TestBase{

	@FindBy(xpath="//td[contains(text(),'Tushar')]")
	WebElement usernameLevel;
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactLink;
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDealLink;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);	
	}
	
	public String varifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean varifyUsername()
	{
		Utils.switchToFrame("mainpanel");
		boolean flag=usernameLevel.isDisplayed();
		driver.switchTo().defaultContent();
		return flag;
	}
	
	public ContactsPage clickOnContacts()
	{
		Utils.switchToFrame("mainpanel");
		contactLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals()
	{
		Utils.switchToFrame("mainpanel");
		dealsLink.click();
		return new DealsPage();
	}
	
	public void clickOnNewDeal()
	{
		Utils.switchToFrame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(dealsLink).build().perform();
		newDealLink.click();
	}
	
	public TasksPage clickOnTasks()
	{
		Utils.switchToFrame("mainpanel");
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContact()
	{
		Utils.switchToFrame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newContactLink.click();
	}
	
}
