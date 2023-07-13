package stepdefs;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.BrandsPage;
import pages.MainPage;


import java.util.Arrays;
import java.util.List;

public class BrandsPageStepDefinition {

    BrandsPage brandsPage = new BrandsPage();

    @Then("I collect brands links and check it name")
    public void iRedirectedToPageWithCorrectTitle() {
        List<String> actualResult = brandsPage.getBrands();
        List<String> expectedResult = Arrays.asList("Apple", "Canon", "Hewlett-Packard", "HTC",
                "Palm", "Sony");
        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }
}

