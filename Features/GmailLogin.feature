Feature: Test the compose mail functionality

  Scenario: Check the gmail login with valid credential
    Given browser is open
    Given user is on login page
    When user enters the username
    And  click on next button
    When user enters the password
    And click on nextt button
    Then home page should be displayed
    When user click on compose mail
    And user enters the mail id
    And user enters the subject
    And user enters the body
    And user attached the file
    And user click on the sent button
    Then email appears in the send folder of gmail