Feature: Non-registered user should not be able to refer any product to friend
  @referNonRegUser
  Scenario: Non-Registered User should not be able to refer Product to A Friend successfully
  Given User is on Home Page
  When User click on Book Category
  And Click on Click on product Fahrenheit 451 by Ray Bradbury
  And Click on Email a Friend
  And Enter Friend's email address
  And Enter your Invalid (Non-Registered) email address
  And Click on Send Email button
  Then User should not be able to refer Product to a Friend
  And error message "Only registered customers can use email a friend feature" should be displayed
