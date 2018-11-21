@FunctionalTest
Feature: FreeCRM application testing

@SmokeTest
Scenario: Login with correct username and password
Given This is a valid Login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a ivalid Login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a task
Given This is a task test case

@SmokeTest
Scenario: Create a case
Given This is a case test case

@SmokeTest
Scenario: Verify left panel links
Given clicking on left panel links

@SmokeTest @RegressionTest
Scenario: Search a deal
Given This is a search deal test

@RegressionTest
Scenario: Search a contact
Given This is a search contact test

@SmokeTest @End2End
Scenario: Search a case
Given This is a search case test

@End2End
Scenario: Search a task
Given This is a search task test

@RegressionTest @End2End
Scenario: Search a call
Given This is a search task test

@SmokeTest @End2End
Scenario: Search a email
Given This is a search email test

@SmokeTest @End2End
Scenario: Search a docs
Given This is a search docs test

@RegressionTest
Scenario: Search a form
Given This is a search form test

@End2End
Scenario: Validate a report
Given This is a report test

@End2End
Scenario: Application logout
Given This is a logout test
