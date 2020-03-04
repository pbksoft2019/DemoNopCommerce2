package WebTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReferNonRegStepDefs extends Utils

{
    ReferToFriend referToFriend = new ReferToFriend();
    ReferToFriendNonRegUser referToFriendNonRegUser =new ReferToFriendNonRegUser();
    @When("Click on Click on product Fahrenheit {int} by Ray Bradbury")
    public void click_on_Click_on_product_Fahrenheit_by_Ray_Bradbury(Integer int1)
    {
     referToFriend.clickOnBook();
    }

    @When("Enter your Invalid \\(Non-Registered) email address")
    public void enter_your_Invalid_Non_Registered_email_address()
    {
       referToFriendNonRegUser.emailAFriendNonRegUserDetails();
    }

    @Then("User should not be able to refer Product to a Friend")
    public void user_should_not_be_able_to_refer_Product_to_a_Friend()
    {
    }

    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String string) {
      referToFriendNonRegUser.verifyUserSeeErrorMessage();
    }

}
