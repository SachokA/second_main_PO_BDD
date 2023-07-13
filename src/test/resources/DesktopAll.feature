Feature: Test Scenario

  Scenario:Check that value in Show dropdown is 10
    Given I am on the main page
    When I select Desktops
    And I click on Show All Desktops
    Then Check that value in Show dropdown is 10

  Scenario:Check that value in Sort By is Default
    Given I am on the main page
    When I select Desktops
    And I click on Show All Desktops
    Then Check that value in Sort By is Default

  Scenario:Check that value 10 products display on page
    Given I am on the main page
    When I select Desktops
    And I click on Show All Desktops
    Then Check that value 10 products display on page

    Scenario:Check that value 25 products display on page
      Given I am on the main page
      When I select Desktops
      And I click on Show All Desktops
      And I select from Show dropdown
      Then Check that value 12 products display on page

