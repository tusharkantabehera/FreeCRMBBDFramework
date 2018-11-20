Feature: FreeCRM Login feature

Scenario: FreeCRM Login Test scenario

Given User is already in login page
When title of the login page is Free CRM
Then User enters "tusharkec143" and "lenovopc@12"
Then User clicks on login button
And User is on Homepage


#Scenario: User is able to create a new contact
#
#Given User is already on Homepage
#When User mouseHover on contact link
#Then User click on new contact link
#Then User enters firsName and lastName
#Then User click on save button
#Then Verify new conatct is created


