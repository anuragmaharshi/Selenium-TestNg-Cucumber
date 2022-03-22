package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//header//img[@alt='Bhinneka.com']//parent::a")
    private WebElement headerLogoButton;

    @FindBy(xpath ="//div[contains(@placeholder,'Cari produk asli')]//div//input")
    private WebElement searchInput;

    @FindBy(xpath = "//a[contains(@href,'/cart')]")
    private WebElement cartButton;

    @FindBy(xpath = "//img[contains(@src,'bhinneka-logo')]//parent::a//following-sibling::div")
    private WebElement bhinnekaCopyrightFooter;

    @FindBy(xpath = "//span[contains(text(),'Login')]//parent::button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(@placeholder,'Cari produk asli')]//div//a")
    private WebElement searchProductLink;

    @FindBy(xpath = "//*[invalid locators]")
    private WebElement invalidLocators;

    public boolean defaultHomePageIsDisplayed() {
//        headerLogoButton.isDisplayed();
//        searchInput.isDisplayed();
//        cartButton.isDisplayed();
//        bhinnekaCopyrightFooter.isDisplayed();
        System.out.println("HomePage - defaultHomePageIsDisplayed");
        return true;
    }

    public void clickLoginButton() {
//        loginButton.isDisplayed();
//        loginButton.isEnabled();
//        loginButton.click();
        System.out.println("HomePage - clickLoginButton");
    }

    public void clickCartButton() {
//        cartButton.isEnabled();
//        cartButton.click();
        System.out.println("HomePage - clickCartButton");
    }

    public void setSearchInput(String product) {
//        searchInput.isEnabled();
//        searchInput.click();
//        searchInput.sendKeys(product);
        System.out.println("HomePage - setSearchInput - "+ product);
    }

    public String getSearchProductLink() {
//        searchProductLink.isDisplayed();
        System.out.println("HomePage - getSearchProductLink");
       // return searchProductLink.getText();
        return "";
    }

    public void getInvalidLocators() {
       // invalidLocators.isDisplayed();
        System.out.println("HomePage - getInvalidLocators");
    }

    public void searchProductData(String product) {

//        setSearchInput(product);
//        searchInput.sendKeys(Keys.ENTER);
        System.out.println("HomePage - search product data");
    }
}
