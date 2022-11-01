package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebTableAppPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class WebTableAppCydeo {

    WebTableAppPage page = new WebTableAppPage();
    BasePage basePage = new BasePage();

    Select select;

    @Given("go to: Web table Application webpage")
    public void go_to_https_web_table_cydeo_com_login() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("enter username and password ang login")
    public void enterUsernamePassword(Map<String, String> credentials) {
        page.loginWebTableApp(credentials.get("username"), credentials.get("password"));
    }

    @Then("verify URL should end with {string}")
    public void verify_url_should_end_with(String str) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(str));
    }


    @Given("user is already logged in and on order page")
    public void userIsAlreadyLoggedInAndOnOrderPage() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        page.loginWebTableApp(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
        basePage.order.click();
    }

    @When("user selects {string} product type")
    public void userSelectsProductType(String productType) {
        select = new Select(page.productDropdown);
        select.selectByVisibleText(productType);
    }

    @And("user enters {int} quantity")
    public void userEntersQuantity(Integer quantity) {
        page.quantityInput.sendKeys(Keys.BACK_SPACE);
        // page.quantityInput.clear();
        page.quantityInput.sendKeys(quantity+"");
        //page.quantityInput.sendKeys(String.valueOf(quantity));
    }

    @And("user enters {string} customer name")
    public void userEntersCustomerName(String customerName) {
        page.customerNameInput.sendKeys(customerName);
    }

    @And("user enters {string} street")
    public void userEntersStreet(String street) {
        page.streetInput.sendKeys(street);
    }

    @And("user enters {string} city")
    public void userEnters(String city) {
        page.cityInput.sendKeys(city);
    }

    @And("user enters {string} state")
    public void userEntersState(String state) {
        page.stateInput.sendKeys(state);
    }

    @And("user enters {string} zipcode")
    public void userEntersZipcode(String zip) {
        page.zipInput.sendKeys(zip);
    }

    @And("user selects {string} credit card type")
    public void userSelectsCreditCardType(String cardType) {
        BrowserUtils.clickRadioButton(page.allCardType,cardType);
    }

    @And("user enters {string} credit card number")
    public void userEntersCreditCardNumber(String creditCardNumber) {
        page.cardNoInput.sendKeys(creditCardNumber);
    }

    @And("user enters {string} expiry date")
    public void userEntersExpiryDate(String expDate) {
        page.cardExpInput.sendKeys(expDate);
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
        page.processOrderBtn.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String customerName) {
        Assert.assertTrue(page.nameFirstRow.getText().equals(customerName));
    }
}
