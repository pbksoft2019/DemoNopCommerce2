Feature:
  @referToFriend
Scenario: User should be able to refer Product to A Friend successfully
Given User is on Home Page
When user login
And User click on Book Category
And Click on product Fahrenheit 451 by Ray Bradbury
And Click on Email a Friend
And Enter Friend's email address
And Enter your valid (Registered) email address
And Click on Send Email button
Then User should be able to refer Product to a Friend
And Your message has been sent message should be displayed.
