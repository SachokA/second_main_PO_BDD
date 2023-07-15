package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DesktopsPage;
import pages.MainPage;

import java.util.List;

public class DesktopAllSortedDefinition {
    MainPage mainPage = new MainPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    @When("I select {string} from Show dropdown")
    public void iSelectNameFromShowDropdown(String value) {
               mainPage.clickButtonShowAllDesktop().selectSortedPrice(value);}

//    @When("I select Price (Low > High) from Show dropdown")
//    public void iSelectNameFromShowDropdown(String value) {
//        mainPage.clickButtonShowAllDesktop().selectSortedPrice("Price (Low > High)");
//    }
    @Then("Check that products were sorted correctly by name")
    public void check_that_products_were_sorted_correctly() {
        List<String> actualList = desktopsPage
                .getProducts();
        List<String> expectedList = desktopsPage
                .getProductsSort();
        Assert.assertEquals(actualList, expectedList);
    }

    @Then("Check that products were sorted correctly by price")
    public void checkThatProductsWereSortedCorrectlyByPrice() {
        List<Double> actualListPrice = desktopsPage
                .getProductsPrice();
        List<Double> expectedListPrice = desktopsPage
                .getProductsSortPrice();
        Assert.assertEquals(actualListPrice, expectedListPrice);
    }
}
