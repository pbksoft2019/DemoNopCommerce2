Feature: user should be able to short price from high to low
  @sortHighToLow
    Scenario: User should be able to sort product price High to Low successfully
    Given User is on Home Page
    When User click on Book Category
    And Click on Filter Sort By
    And Select Price High to Low
    Then user should be able to sort price High to Low