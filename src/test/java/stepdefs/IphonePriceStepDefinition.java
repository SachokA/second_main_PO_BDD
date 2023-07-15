package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import pages.IphonePage;
import pages.MainPage;

public class IphonePriceStepDefinition {
    MainPage mainPage = new MainPage();
    IphonePage iphonePage = new IphonePage();

    @When("Click on the Iphone")
    public void click_on_the_iphone() {
        mainPage.clickIphone();
    }

    @Then("Check that {string}")
    public void check_that(String price) {
        String actualResultPriceDollar = iphonePage
                .getPriceIphoneDollar();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(actualResultPriceDollar).as("Not the same").isEqualTo(price);

    }

    @When("Select on the main page current currency is {string}")
    public void selectOnTheMainPageCurrentCurrencyIs(String locator) {
        WebElement currencyElement = null;

        switch (locator) {
            case "selectDollarSign":
                currencyElement = iphonePage.selectDollarSign;
                break;
            case "currencyEuro":
                currencyElement = iphonePage.iPhonePriceEuro;
                break;
            case "currencyPound":
                currencyElement = iphonePage.iPhonePricePound;
                break;
        }

        if (currencyElement != null) {
            iphonePage.changedCurrency(currencyElement);
        } else {
            throw new IllegalArgumentException("Invalid currency locator: " + locator);
        }
    }
}
