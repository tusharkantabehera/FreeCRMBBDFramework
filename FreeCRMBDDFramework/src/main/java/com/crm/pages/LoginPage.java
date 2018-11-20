package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.testBase.TestBase;

public class LoginPage extends TestBase{

	//PageFactory using @findBy annotation
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//a/font[text()='Sign Up']")
	WebElement signupButton;
	
	@FindBy(xpath="//a[@class='navbar-brand']/img[@class='img-responsive']")
	WebElement crmLogo;
	
	//Initializing the page objects
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginpageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMImane()
	{
		return crmLogo.isDisplayed();
	}
	
	public void enterUsername(String username)
	{
		this.username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	public HomePage login(String username,String password) throws InterruptedException
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		Thread.sleep(2000);
		loginButton.click();
		return new HomePage();
	}
}
