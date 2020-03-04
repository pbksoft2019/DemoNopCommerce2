package WebTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortHighToLowStepDefs
{
    SortHighToLow sortHighToLow = new SortHighToLow();
    HomePage homePage = new HomePage();

    @When("Click on Filter Sort By")
    public void click_on_Filter_Sort_By()
    {homePage.clickOnBookCategory();

    }

    @When("Select Price High to Low")
    public void select_Price_High_to_Low()
    {
        sortHighToLow.UserSelectFRomPositionPriceHighToLow();
    }

    @Then("user should be able to sort price High to Low")
    public void user_should_be_able_to_sort_price_High_to_Low()
    {
        sortHighToLow.verifyUserShouldBeAbleToSeePriceHighToLow();

    }

}
