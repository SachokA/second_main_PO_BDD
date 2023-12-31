package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends BasePage {
    @FindBy(xpath ="//select[@id='input-limit']") ///*[@id='input-limit']/option[1]
    private WebElement valueCountShow;
    @FindBy(xpath = "//*[@id='input-sort']")
    private WebElement valueSortShow;
    @FindBy(xpath = "//div[@class='product-thumb']")
    private List<WebElement> product;
    @FindBy(xpath = "//*[@id='content']/div[5]/div[2]")
    private WebElement checkText;
    @FindBy(xpath = "//span[@class='price-new']")
    private List<WebElement> productsPrice ;

    public DesktopsPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public String getValueCountShow() {
        Select showDropdownSelect = new Select(valueCountShow);
        return showDropdownSelect.getFirstSelectedOption().getText();
    }
    public String getValueSortShow() {
        Select showDropdownSelect = new Select(valueSortShow);
        return showDropdownSelect.getFirstSelectedOption().getText();
    }
    public String getValueCheckTest(){
        return checkText.getText();
    }
    public List<String> getProducts() {
        List<WebElement> all = product;
        List<String> list = new ArrayList<>();
        for (WebElement element : all) {
            list.add(element.getText());
        }
        return list;
    }
    public List<String> getProductsSort() {
        List<String> sortedNames = new ArrayList<>(getProducts());
        Collections.sort(sortedNames, String::compareToIgnoreCase);
        return sortedNames;
    }
    public int countFindAll() {
        return getProducts().size();
    }
    public DesktopsPage selectCountShow(String value){
        select(valueCountShow,value);
        return this;
    }

    public void selectSortedPrice(String value){
        select(valueSortShow,value);
    }

    public List<Double> getProductsPrice() {
        List<WebElement> all = productsPrice;
        List<Double> list = new ArrayList<>();
        for (WebElement element : all) {
            list.add(Double.valueOf(element.getText().replace("$","")));
        }
        return list;
    }
    public List<Double> getProductsSortPrice() {
        List<WebElement> all = productsPrice;
        List<Double> list = new ArrayList<>();
        for (WebElement element : all) {
            list.add(Double.valueOf(element.getText().replace("$","")));
        }
        Collections.sort(list);
        return list;
    }
}


