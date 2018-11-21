Feature: FreeCRM create contacts

Scenario: FreeCRM create a new Deal

Given User is already in login page
When title of the login page is Free CRM
Then User enters username and password
| tusharkec143 | lenovopc@12 |

Then User clicks on login button
Then User is on Homepage
Then User moves to new deal page
Then User enters deal details
| Test Deal | 1000 | 50 | 10 |


