Feature: FreeCRM Login feature

#Without Examples Keyword
#
#Scenario: FreeCRM Login Test scenario
#
#Given User is already in login page
#When title of the login page is Free CRM
#Then User enters "tusharkec143" and "lenovopc@12"
#Then User clicks on login button
#And User is on Homepage


#With Examples Keyword
#
Scenario Outline: FreeCRM Login Test scenario

Given User is already in login page
When title of the login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
And User is on Homepage

Examples: 
    
      |  username  | password  |
      |tusharkec143|lenovopc@12|
	  |  tushar    |  abc@12   |



