package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1Steps {
    @Given("Open Test1 App")
    public void open_test1_app() {
        System.out.println("open_test1_app");
    }
    @When("Select any element")
    public void select_any_element() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("select_any_element");
    }
    @Then("It should be displayed")
    public void it_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("it_should_be_displayed");
    }
}
