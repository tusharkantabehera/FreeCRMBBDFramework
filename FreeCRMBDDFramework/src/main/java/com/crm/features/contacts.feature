Feature: FreeCRM create contacts

Scenario Outline: FreeCRM create a new contact

Given User is already in login page
When title of the login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on Homepage
Then User moves to new contact page
Then User enters contact info "<firstname>" and "<lastname>" and "<position>"



Examples:

|   username   | password  |  firstname | lastname | position |
| tusharkec143 |lenovopc@12|   tushar   |   kanta  |  Tester  |