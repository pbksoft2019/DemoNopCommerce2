Feature: user should be able to compare 2 product successfully

@compare
Scenario: User should be able to compare two different products successfully
Given User is on Home Page
When User click on Book Category
And user Click on Add to Compare for product Fahrenheit 451 by Ray Bradbury
And Click on Add to Compare for product First Prize Pies
And Click on Product comparision on Popup Bar
Then user should compare two different products
And Compare Products message should be displayed
