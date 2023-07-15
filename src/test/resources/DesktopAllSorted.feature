Feature: Test Scenario

  Scenario: Check corrected sorted All Desktops Name (A - Z)
    Given I am on the main page
    When I select Desktops
    And I click on Show All Desktops
    And I select "Name (A - Z)" from Show dropdown
    Then Check that products were sorted correctly by name

  Scenario: Check corrected sorted All Desktops Price (Low > High)
    Given I am on the main page
    When I select Desktops
    And I click on Show All Desktops
    And I select "Price (Low > High)" from Show dropdown
    Then Check that products were sorted correctly by price