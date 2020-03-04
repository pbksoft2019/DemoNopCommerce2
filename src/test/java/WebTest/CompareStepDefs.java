package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CompareStepDefs extends Utils
{
    HomePage homePage = new HomePage();
    CompareProduct compareProduct = new CompareProduct();
    CompareSuccessPage compareSuccessPage = new CompareSuccessPage();

    @Given("User is on Home Page")
    public void user_is_on_Home_Page()
    {

    }
    @When("User click on Book Category")
    public void user_click_on_Book_Category()
    {
        homePage.clickOnBookCategory();
        sleep( 3 );
    }
    @When("user Click on Add to Compare for product Fahrenheit by Ray Bradbury")
    public void user_Click_on_Add_to_Compare_for_product_Fahrenheit_by_Ray_Bradbury()

    {

    }

    @When("Click on Add to Compare for product First Prize Pies")
    public void click_on_Add_to_Compare_for_product_First_Prize_Pies()
    {
    }
    @When("Click on Product comparision on Popup Bar")
    public void click_on_Product_comparision_on_Popup_Bar()
    {
        //compareProduct.compareTwoSelectedProduct();
    }
    @Then("user should compare two different products")
    public void user_should_compare_two_different_products() {

    }
    @Then("Compare Products message should be displayed")
    public void compare_Products_message_should_be_displayed()
    {
        compareSuccessPage.verifyUserShouldSeeCompareSuccessMassage();
    }
}
