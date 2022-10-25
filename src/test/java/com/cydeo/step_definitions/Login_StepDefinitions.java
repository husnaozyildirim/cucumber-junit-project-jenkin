package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @Given("User is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("User is on the library login page");
    }
    @When("User enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }
    @When("User enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("User should see dashboard");
    }

    @When("User enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters student username");
    }

    @And("User enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters student password");
    }
}
