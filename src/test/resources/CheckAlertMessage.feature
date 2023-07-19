Feature: Test Scenario

  Scenario: Check alert message
    Given I am on the main page
    When I click on MyAccount
    And I click on the button ForgottenPassword
    And I full in to email
    And I click on the button ClickContinue
    Then I check alert message