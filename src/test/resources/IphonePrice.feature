Feature: Test Scenario

  Scenario Outline: Check price Iphone
    Given I am on the main page
    When Click on the Iphone
    When Select on the main page current currency is '<webElement>'
    Then Check that '<price>'
    Examples:
      | webElement       | price  |
      | selectDollarSign | 123.20 |
      | currencyEuro     | 112.45 |
      | currencyPound    | 96.41  |

