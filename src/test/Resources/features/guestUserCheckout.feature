Feature: Guest user should be able to checkout succesfully
  @guestCheckout
  Scenario: user should be able to checkout successfully as a guest
Given User is on home page
When User click on Books Category
And user click on add to cart button on First Prize Pies book
And go to cart and  tick I agree with the terms of service and click on check out
And click on check out as guest user
And out all mandatory field
And click on continue and select credit card payment
And enter payment details
And click continue
And click confirm
Then user should be able to see message ‘your order has been successfully processed!’
