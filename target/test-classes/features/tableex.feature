@table
Feature: Datatable example

  Scenario: Scenario of datatable
    Given user is on sign up screen
    Then user enter details
      | username    | "priyanka"      |
      | email       | "abc@gmail.com" |
      | phoneNumber | 9999988888      |
