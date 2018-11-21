//package com.crm.stepDefinations;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class HooksStepDefinations {
//	
//	//Global Hooks(Applicable for all)
//	@Before(order=0)
//	public void setUP1(){
//		System.out.println("launch FF");
//		System.out.println("Enter URL for Free CRM APP");
//	}
//	@Before(order=1)
//	public void setUP2(){
//		System.out.println("After SetUp");
//	}
//	@After(order=1)
//	public void tearDown1(){
//		System.out.println("Before Teardown");
//	}
//	@After(order=0)
//	public void tearDown2(){
//		System.out.println("close the browser");
//	}
//	
//	
//	//Local hooks(i.e Applicable for @SmokeTest)
//	@Before("@SmokeTest")
//	public void beforeSmoke(){
//		System.out.println("Before SmokeTest");
//	}
//	@After("@SmokeTest")
//	public void afterSmoke(){
//		System.out.println("After SmokeTest");
//	}
//	
//	
//	
//	@Given("^user is on deal page$")
//	public void user_is_on_deal_oage() throws Throwable {
//		System.out.println("user is on deal page");
//	}
//	
//	@When("^user fills the deals form$")
//	public void user_fills_the_deals_form() throws Throwable {
//		System.out.println("create a deal");
//	}
//	
//	@Then("^deal is created$")
//	public void deal_is_created() throws Throwable {
//		System.out.println("deal is created");
//	}
//		
//	
//	@Given("^user is on contact page$")
//	public void user_is_on_contact_page() throws Throwable {
//		System.out.println("user is on contact page");
//	
//	}
//	
//	@When("^user fills the contact form$")
//	public void user_fills_the_contact_form() throws Throwable {
//		System.out.println("create a contact");
//	}
//	
//	@Then("^contact is created$")
//	public void contact_is_created() throws Throwable {
//		System.out.println("contact is created");
//	}
//	
//	
//	
//	@Given("^user is on mail page$")
//	public void user_is_on_mail_page() throws Throwable {
//		System.out.println("user is on mail pahge");
//	}
//	
//	@When("^user fills the mail form$")
//	public void user_fills_the_mail_form() throws Throwable {
//		System.out.println("create a mail");
//	}
//	
//	@Then("^mail is created$")
//	public void mail_is_created() throws Throwable {
//		System.out.println("mail is created");
//	}	
//}
