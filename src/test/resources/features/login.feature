Feature: Login
  As QA Automation
  I want I want to enter Linkedin
  To validate login functionality

  Scenario: Login with the correct data
    Given enter the portal Linkedin
    When enter the username and password
      | user                | password |
      | valentina@gmail.com | 9876543  |
    Then will enter the web already with the user
