package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DontKnow;

public class Test2Steps {
    private DontKnow dontKnow;
    public Test2Steps(DontKnow dontKnow){
        System.out.println("Inside test2 app cons");
        this.dontKnow=dontKnow;
    }
    @Then("button should be displayed")
    public void buttonShouldBeDisplayed() {
        System.out.println("buttonShouldBeDisplayed");
        System.out.println(dontKnow.getData());
    }

    @When("Wait for Test{int} app to load")
    public void waitForTestAppToLoad(int arg0) {
        System.out.println("waitForTestAppToLoad");
    }
}
