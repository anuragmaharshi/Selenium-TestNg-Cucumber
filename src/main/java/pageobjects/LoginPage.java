package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "bt-split-screen__header")
    private WebElement loginHeaderTitle;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "next")
    private WebElement selanjutnyaButton;

    @FindBy(xpath = "//div[@class='bt-social-group']//button[1]")
    private WebElement loginFacebookButton;

    @FindBy(id = "btnGoogle")
    private WebElement loginGoogleButton;

    @FindBy(className = "bt-question-register")
    private WebElement registerQuestionText;

    @FindBy(xpath = "//a[@href='/register']")
    private WebElement registerLink;

    public boolean emailLoginPageIsDisplayed() {
//        loginHeaderTitle.isDisplayed();
//        emailField.isDisplayed();
//        selanjutnyaButton.isDisplayed();
//        loginFacebookButton.isDisplayed();
//        loginGoogleButton.isDisplayed();
//        registerQuestionText.isDisplayed();
//        registerLink.isDisplayed();
        System.out.println("LoginPage - email");
        return true;
    }

    public String getLoginHeaderTitle() {
//        loginHeaderTitle.isDisplayed();
//        return loginHeaderTitle.getText();
        System.out.println("LoginPage - getlog");
        return "";
    }

    public String getQuestionRegisterText() {
//        registerQuestionText.isDisplayed();
//        return registerQuestionText.getText();
        System.out.println("LoginPage - get ques");
        return "";
    }

    public void fillEmailData(String email) {
//        emailField.isEnabled();
//        emailField.clear();
//        emailField.sendKeys(email);
        System.out.println("LoginPage - fill");
    }

    public void clickSelanjutnyaButton() {
//        selanjutnyaButton.isEnabled();
//        selanjutnyaButton.click();
        System.out.println("Login - clickSel");
    }
}
