package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.testBase.TestBase;

public class ContactsPage extends TestBase {

	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactLevel;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean varifyContactLevel()
	{
		return contactLevel.isDisplayed();
	}
	
	public void selectContact(String name)
	{
		driver.findElement(By.xpath("//input[@type='checkbox']/../following-sibling::td/a[text()='"+name+"']")).click();
	}
	
	
}
