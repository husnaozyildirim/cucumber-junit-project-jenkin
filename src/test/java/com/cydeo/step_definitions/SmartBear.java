package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearLoginPage;
import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartBear {
    SmartBearOrderPage orderPage = new SmartBearOrderPage();
    SmartBearLoginPage loginPage = new SmartBearLoginPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        loginPage.usernameInput.sendKeys("Tester");
        loginPage.passwordInput.sendKeys("test");
        loginPage.loginBtn.click();
        orderPage.orderModule.click();
    }

    @When("User fills out the form as followed")
    public void user_fills_out_the_form_as_followed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters {string}")
    public void user_enters(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
