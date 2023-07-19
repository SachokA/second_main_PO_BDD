package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CamerasPage;
import pages.MainPage;

import java.util.Optional;

public class CamerasPriceStepDefinition {
    MainPage mainPage = new MainPage();
    CamerasPage camerasPage = new CamerasPage();

    @When("I click on the Cameras")
    public void i_click_on_the_cameras() {
        mainPage.clickButtonCameras();
    }

    @Then("Check that {double} cameras exist on page")
    public void check_that_cameras_exist_on_page(Double double1) {
         Assert.assertEquals(camerasPage.getCamerasSize(),double1);
    }


    @Then("Check that Canon EOS 5D has old price {double}")
    public void check_that_canon_eos_5d_has_old_price(Double double1) {
        Assert.assertEquals(camerasPage.cannonOldPrice(), double1);
    }

    @Then("Check that Canon EOS 5D has new price {double}")
    public void check_that_canon_eos_5d_has_new_price(Double double1) {
        Assert.assertEquals(camerasPage.cannonNewPrice(), double1);
    }

    @Then("Check that Nikon D300 has ex.rate {double}")
    public void check_that_nikon_d300_has_ex_rate(Double double1) {
        Assert.assertEquals(camerasPage.cannonPriceTax(), double1);
    }

}
