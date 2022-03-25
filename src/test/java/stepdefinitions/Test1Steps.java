package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.DontKnow;
import utilities.TestContext;
import utilities.Wait;

public class Test1Steps {
    private DontKnow dontKnow;
    private TestContext testContext;
    public Test1Steps(DontKnow dontKnow, TestContext testContext){
        System.out.println("Inside test1 app constructor");
        this.dontKnow=dontKnow;
        this.testContext=testContext;
    }
    @Given("Open Test1 App")
    public void open_test1_app() {
        System.out.println("open_test1_app");
        dontKnow.setData("Hulk Hogan");
    }
    @When("Select any element")
    public void select_any_element() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("select_any_element");
        String xpath = "//img[@alt='Git']";
        WebDriver driver=testContext.getDriverManager().getDriver();
        Wait.untilElementIsVisible(driver, driver.findElement(By.xpath(xpath)), 30L);
        Assert.assertTrue(true);
    }
    @Then("It should be displayed")
    public void it_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("it_should_be_displayed");

    }
}
