package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageStepDefinition {
    MainPage mainPage = new MainPage();


    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        mainPage.openMainPage();
    }

    @When("I click on brands link")
    public void i_click_on_brands_link() {
        mainPage.clickBrands();
    }

    @When("I click on MyAccount")
    public void i_click_on_MyAccount() {
        mainPage.clickButtonMyAccount();
    }

}
