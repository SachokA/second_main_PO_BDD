  Feature: Test Scenario

    Scenario: Check price for cameras
      Given I am on the main page
      When I click on the Cameras
      Then Check that 2 cameras exist on page
      Then Check that Canon EOS 5D has old price 122.00
      Then Check that Canon EOS 5D has new price 98.00
      Then Check that Nikon D300 has ex.rate 80.00
