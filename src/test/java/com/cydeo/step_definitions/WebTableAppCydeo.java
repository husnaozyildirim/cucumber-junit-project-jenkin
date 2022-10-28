package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableAppPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTableAppCydeo {

    WebTableAppPage page = new WebTableAppPage();

    @Given("go to: Web table Application webpage")
    public void go_to_https_web_table_cydeo_com_login() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("enter username {string}")
    public void enter_username(String username) {
        page.usernameInput.sendKeys(username);

    }
    @When("enter password {string}")
    public void enter_password(String password) {
        page.passwordInput.sendKeys(password);
    }
    @When("click to login button")
    public void click_to_login_button() {
        page.loginBtn.click();
    }
    @Then("verify URL should end with {string}")
    public void verify_url_should_end_with(String str) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(str));
    }
}
