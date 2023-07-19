package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DesktopsPage;
import pages.MainPage;

public class DesktopAllStepDefinition {
    MainPage mainPage = new MainPage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @When("I select Desktops")
    public void i_select_desktops() {
        mainPage.clickButtonNarbarMenu();
    }

    @And("I click on Show All Desktops")
    public void i_click_on_show_all_desktops() {
        mainPage.clickButtonShowAllDesktop();
    }


    @Then("Check that value in Show dropdown is 10")
    public void checkThatValueInShowDropdownIs10() {
        String actualCountShow = desktopsPage.getValueCountShow();
        Assert.assertEquals(actualCountShow, "10");
    }

    @Then("Check that value in Sort By is Default")
    public void checkThatValueInSortByIsDefault() {
        String actualSortShow = desktopsPage
                .getValueSortShow();
        Assert.assertEquals(actualSortShow, "Default");
    }

    @Then("Check that value 10 products display on page")
    public void checkThatValueProductsDisplayOnPage() {
        Assert.assertEquals(desktopsPage.countFindAll(), 10);
    }

    @And("I select from Show dropdown")
    public void iSelectFromShowDropdown() {
        desktopsPage.selectCountShow("25");
    }

    @Then("Check that value 12 products display on page")
    public void checkThatProductsDisplayOnPage() {
        Assert.assertEquals(desktopsPage.countFindAll(), 12);
    }

    @Then("Check that text displays on the bottom of the page")
    public void checkThatTextDisplaysOnTheBottomOfThePage() {
               Assert.assertEquals(desktopsPage
                .getValueCheckTest(), "Showing 1 to 12 of 12 (1 Pages)");
    }

}
