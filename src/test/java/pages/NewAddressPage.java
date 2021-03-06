package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {

    private WebDriver driver;

    @FindBy(css = "#main h1")
    private WebElement pageHeader;

    @FindBy(css = "input[name=alias]")
    private WebElement aliasField;

    @FindBy(css = "input[name=address1]")
    private WebElement addressField;

    @FindBy(css = "input[name=city]")
    private WebElement cityField;

    @FindBy(css = "input[name=postcode]")
    private WebElement zipField;

    @FindBy(css = "select.form-control")
    private WebElement countryDropList;

    @FindBy(css = "input[name='phone']")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id='content']//button")
    private WebElement saveButton;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageHeader() {
        return pageHeader.getText();
    }

    public void inputAlias(String alias){
        aliasField.clear();
        aliasField.sendKeys(alias);
    }

    public void inputAddress(String address){
        addressField.clear();
        addressField.sendKeys(address);
    }

    public void inputCity(String city){
        cityField.clear();
        cityField.sendKeys(city);
    }

    public void inputZip(String zip){
        zipField.clear();
        zipField.sendKeys(zip);
    }

    public void chooseUKFromCountryList(){
        countryDropList.click();
        countryDropList.sendKeys("u");
    }

    public void inputPhone(String phone) {
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void saveAddress(){
        saveButton.click();
    }
}
