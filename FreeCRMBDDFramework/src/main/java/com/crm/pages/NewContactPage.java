package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.testBase.TestBase;

public class NewContactPage extends TestBase{
	
	public NewContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="title")
	WebElement titleDropdown;
	
	@FindBy(id="first_name")
	WebElement firstNameInput;
	
	@FindBy(id="surname")
	WebElement lastNameInput;
	
	@FindBy(name="client_lookup")
	WebElement companyInput;
	
	@FindBy(name="company_position")
	WebElement position;
	
	@FindBy(xpath="//input[@value='Load From Company']/following-sibling::input[1]")
	WebElement submitButton;
	
	public void enterFirstName(String fstname)
	{
		firstNameInput.sendKeys(fstname);
	}
	
	public void enterLastName(String lstname)
	{
		lastNameInput.sendKeys(lstname);
	}
	
	public void enterPosition(String position)
	{
		this.position.sendKeys(position);
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
	
	public void createNewContact(String title,String firstName,String LastName,String position,String cmpName)
	{
		Select select=new Select(titleDropdown);
		select.selectByValue(title);
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(LastName);
		companyInput.sendKeys(cmpName);
		this.position.sendKeys(position);
		submitButton.click();
	}
}
