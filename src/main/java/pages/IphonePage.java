package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IphonePage extends BasePage {
    @FindBy(xpath = "//span[text()='Currency']")
    private WebElement currency;
    @FindBy(xpath = "//*[@id='form-currency']/div/a/strong")
    private WebElement dollarSign;
    @FindBy(xpath = "//a[@href='USD']")
    public WebElement selectDollarSign;
    @FindBy(xpath = "//*[@id='content']/div[1]/div[2]/ul[2]/li[1]/h2/span")
    public WebElement iPhonePriceDollar;
    @FindBy(xpath = "//*[@id='content']/div[1]/div[2]/ul[2]/li[1]/h2/span")
    public WebElement iPhonePriceEuro;
    @FindBy(xpath = "//*[@id='content']/div[1]/div[2]/ul[2]/li[1]/h2/span")
    public WebElement iPhonePricePound;
    @FindBy(xpath = "//a[text()='€ Euro']")
    private WebElement currencyEuro;
    @FindBy(xpath = "//*[@id='form-currency']/div/ul/li[2]/a")
    private WebElement currencyPound;

    public IphonePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void checkCurrencyIsDollar() {
        if (!dollarSign.isDisplayed()) {
            currency.click();
            selectDollarSign.click();
        }
    }

    public void changedCurrency(WebElement changeCurrency) {
        currency.click();
        changeCurrency.click();
    }

    public void changedCurrencyPound() {
        currency.click();
        currencyPound.click();
    }

    public String getPriceIphoneDollar() {
        return iPhonePriceDollar.getText().substring(1);
    }

    public String getPriceIphoneEuro() {
        return iPhonePriceEuro.getText().replace("€", "");
    }

    public String getPriceIphoneDPound() {
        return iPhonePricePound.getText().substring(1);
    }
}
