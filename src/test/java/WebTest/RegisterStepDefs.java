package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefs extends Utils

{
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage =new RegistrationResultPage();
    @Given("user is on home page")
    public void user_is_on_home_page() {
    }
    @When("user click on register button")
    public void user_click_on_register_button() {
       registerPage.userClickOnRegisterButton();
    }
    @When("user enters registration details")
    public void user_enters_registration_details()
    {registerPage.userEnterRegistrationDetails();
    }
    @When("user click on submit button")
    public void user_click_on_submit_button() {
        registerPage.clickOnSubmitButton();
    }
    @Then("user should see registration success message")
    public void user_should_see_registration_success_message()
    {registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

    }

}
