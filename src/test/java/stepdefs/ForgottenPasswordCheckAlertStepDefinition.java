package stepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ForgottenPasswordPage;
import pages.MainPage;

public class ForgottenPasswordCheckAlertStepDefinition {
    MainPage mainPage = new MainPage();

    @Then("I check alert message")
    public void checkAlertMessageOnPageForgottenPassword() {

        String actualMessage = mainPage.clickButtonMyAccount()
                .clickButtonForgottenPasword()
                .fullInputEmail()
                .buttonClickContinue()
                .alertMessage();
        Assert.assertEquals(actualMessage, "Warning: The E-Mail Address was not found in our records!");
    }
}
