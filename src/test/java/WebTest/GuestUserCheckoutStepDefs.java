package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuestUserCheckoutStepDefs extends Utils
{
    HomePage homePage = new HomePage();
    GuestUserCheckout guestUserCheckout = new GuestUserCheckout();
    PaymentPage paymentpage =new PaymentPage();


    @Given("User is on home page")
    public void user_is_on_home_page() {
    }

    @When("User click on Books Category")
    public void user_click_on_Books_Category() {
        homePage.clickOnBookCategory();
    }

    @When("user click on add to cart button on First Prize Pies book")
    public void user_click_on_add_to_cart_button_on_First_Prize_Pies_book()
    {
        guestUserCheckout.addToCart();
    }

    @When("go to cart and  tick I agree with the terms of service and click on check out")
    public void go_to_cart_and_tick_I_agree_with_the_terms_of_service_and_click_on_check_out() {
        guestUserCheckout.guestCheckOut();
    }

    @When("click on check out as guest user")
    public void click_on_check_out_as_guest_user() {

    }

    @When("out all mandatory field")
    public void out_all_mandatory_field() {

    }

    @When("click on continue and select credit card payment")
    public void click_on_continue_and_select_credit_card_payment()
    {

    }

    @When("enter old payment details")
    public void enter_payment_details()
    {
        paymentpage.paymentInstruction();
    }

    @When("click continue")
    public void click_continue() {

    }

    @When("click confirm")
    public void click_confirm() {

    }

    @Then("user should be able to see message ‘your order has been successfully processed!’")
    public void user_should_be_able_to_see_message_your_order_has_been_successfully_processed() {

    }
}
