package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    private By _clickOnBook = org.openqa.selenium.By.linkText("Books");

    public void clickOnBookCategory()
    {
        clickOnElement(_clickOnBook);

    }
}
