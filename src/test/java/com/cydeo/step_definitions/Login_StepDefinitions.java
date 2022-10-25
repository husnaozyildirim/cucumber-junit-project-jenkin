package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    // @Given("User is on the library login page")
    // public void user_is_on_the_library_login_page() {
    //     System.out.println("User is on the library login page");
    // }
    // @When("User enters librarian username")
    // public void user_enters_librarian_username() {
    //     System.out.println("User enters librarian username");
    // }
    // @When("User enters librarian password")
    // public void user_enters_librarian_password() {
    //     System.out.println("User enters librarian password");
    // }


//  @When("User enters student username")
//  public void userEntersStudentUsername() {
//      System.out.println("User enters student username");
//  }

//  @And("User enters student password")
//  public void userEntersStudentPassword() {
//      System.out.println("User enters student password");
//  }

//  @When("User enters admin username")
//  public void userEntersAdminUsername() {
//  }

//  @And("User enters admin password")
//  public void userEntersAdminPassword() {
//  }

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
