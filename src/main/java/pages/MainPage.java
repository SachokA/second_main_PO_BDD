package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[text()='Brands']")
    private WebElement brandsLocator;

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement buttonMyAccount;
    @FindBy(xpath = "//*[@id='top']/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a")
    private WebElement buttonLogin;
    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void openMainPage(){
        getDriver().get("https://demo.opencart.com/");
        getDriver().manage().window().maximize();
    }

    public BrandsPage clickBrands() {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click()", brandsLocator);
        return new BrandsPage();
    }

    public LoginPage clickButtonMyAccount(){
        buttonMyAccount.click();
        buttonLogin.click();
        return new LoginPage();
    }
}