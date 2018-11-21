Feature: FreeCRM create contacts

Scenario: FreeCRM create a new Deal

Given User is already in login page
When title of the login page is Free CRM
Then User enters username and password

|   username   |   password  |
| tusharkec143 | lenovopc@12 |

Then User clicks on login button
Then User is on Homepage
Then User moves to new deal page
Then User enters deal details

|    title   | amount | probability | commission |
| Test Deal1 |  1000  |     50      |     10     |
| Test Deal2 |  1001  |     52      |     13     |
| Test Deal3 |  1002  |     53      |     15     |

