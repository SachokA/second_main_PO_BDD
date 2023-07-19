package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ForgottenPasswordPage;
import pages.LoginPage;
import pages.MainPage;

public class ForgottenPasswordCheckAlertStepDefinition {
    MainPage mainPage = new MainPage();
    ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage();
    LoginPage loginPage = new LoginPage();

    @Then("I check alert message")
    public void checkAlertMessageOnPageForgottenPassword() {
        Assert.assertEquals(forgottenPasswordPage.alertMessage(),
                "Warning: The E-Mail Address was not found in our records!");
    }

    @And("I click on the button ForgottenPassword")
    public void iClickOnTheButtonForgottenPassword() {
        loginPage.clickButtonForgottenPasword();
    }

    @And("I full in to email")
    public void iFullInToEmail() {
        forgottenPasswordPage.fullInputEmail();
    }

    @And("I click on the button ClickContinue")
    public void iClickOnTheButtonClickContinue() {
        forgottenPasswordPage.buttonClickContinue();
    }
}
