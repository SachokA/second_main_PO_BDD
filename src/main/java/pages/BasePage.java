package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    protected WebElement waitUntilPresent(WebElement webElement, int seconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public void select(WebElement webElement, String value){
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }
    public WebElement waitUntilClickable(WebElement element, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}
