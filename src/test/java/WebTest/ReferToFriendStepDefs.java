package WebTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReferToFriendStepDefs
{
    LogIn logIn =new LogIn();
    ReferToFriend referToFriend = new ReferToFriend();


    @When("user login")
    public void userLogin()
    {logIn.logIn();
    logIn.enterLoginDetails();
    }
    @When("Click on product Fahrenheit {int} by Ray Bradbury")
    public void clickOnProductFahrenheitByRayBradbury(int arg0)
    {referToFriend.clickOnBook();
    }

    @When("Click on Email a Friend")
    public void click_on_Email_a_Friend()
    {
        referToFriend.emailAFriendDetails();

    }

    @When("Enter Friend's email address")
    public void enter_Friend_s_email_address() {

    }

    @When("Enter your valid \\(Registered) email address")
    public void enter_your_valid_Registered_email_address() {

    }

    @When("Click on Send Email button")
    public void click_on_Send_Email_button() {

    }

    @Then("User should be able to refer Product to a Friend")
    public void user_should_be_able_to_refer_Product_to_a_Friend() {

    }

    @Then("Your message has been sent message should be displayed.")
    public void your_message_has_been_sent_message_should_be_displayed()
    {
        referToFriend.verifyUserSeeSuccessMessageOfEmailAFriend();
    }


}


