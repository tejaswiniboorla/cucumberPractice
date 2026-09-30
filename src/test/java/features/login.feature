@smoke
Feature: This is to validate login functionality

Scenario: Positive test case

Given User is on login screen
When User enter "abc@123" as username
And User enter "pass@123" as password
Then User is Logged In
 
