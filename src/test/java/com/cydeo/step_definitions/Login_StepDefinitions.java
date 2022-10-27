package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println(" @Then(\"User should see dashboard\")");
    }

    @When("User enters {string} username")
    public void userEntersUsername(String username) {
        System.out.println("@When(\"User enters {string} username\")");
    }

    @And("User enters {string} password")
    public void userEntersPassword(String password) {
        System.out.println("@And(\"User enters {string} password\")");
    }

    @Given("User is on the {string} login page")
    public void userIsOnTheLoginPage(String arg0) {
        System.out.println("@Given(\"User is on the {string} login page\")");
    }
}
