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

    @FindBy(xpath = "//*[text()='Desktops']")
    private WebElement narbarMenu;

    @FindBy(xpath = "//a[text()='Show All Desktops']")
    private WebElement showAllDesktops;


    @FindBy(xpath = "//a[text()='iPhone']")
    private WebElement iPhone;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void openMainPage() {
        getDriver().get("https://demo.opencart.com/");
        getDriver().manage().window().maximize();
    }

    public BrandsPage clickBrands() {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click()", brandsLocator);
        return new BrandsPage();
    }

    public LoginPage clickButtonMyAccount() {
        buttonMyAccount.click();
        buttonLogin.click();
        return new LoginPage();
    }

    public MainPage clickButtonNarbarMenu() {
        narbarMenu.click();
        return this;
    }

    public DesktopsPage clickButtonShowAllDesktop() {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click()", showAllDesktops);
        return new DesktopsPage();
    }



    public void clickIphone() {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click()", iPhone);
    }
}
