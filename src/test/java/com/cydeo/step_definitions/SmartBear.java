package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SmartBear {
    SmartBearPage smartBearPage = new SmartBearPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearPage.usernameInput.sendKeys("Tester");
        smartBearPage.passwordInput.sendKeys("test");
        smartBearPage.loginBtn.click();
        smartBearPage.orderModule.click();
    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productType) {
        new Select(smartBearPage.productSelect).selectByVisibleText(productType);
    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBearPage.quantity.sendKeys(quantity);
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {
        smartBearPage.customerName.sendKeys(name);
    }

    @When("User enters {string}")
    public void user_enters(String street) {
        smartBearPage.street.sendKeys(street);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        smartBearPage.city.sendKeys(city);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBearPage.state.sendKeys(state);
    }

    @When("User enters {string} zip")
    public void user_enters_zip(String zip) {
        smartBearPage.zip.sendKeys(zip);
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String visaType) {
        smartBearPage.visaRadioBtn.click();
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNr) {
        smartBearPage.cardNr.sendKeys(cardNr);
    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expireDate) {
        smartBearPage.expireDate.sendKeys(expireDate);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processBtn.click();
        BrowserUtils.sleep(3);
    }

    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {
        smartBearPage.viewAllOrders.click();
        List<WebElement> listOfAllOrdersNames = Driver.getDriver().findElements(By.xpath("//table[@class='SampleTable']//tbody/tr/td[2]"));

        WebElement johnWebElm  = null;
        for (WebElement each : listOfAllOrdersNames) {
            if (each.getText().equals("John Wick")) {
                johnWebElm = each ;
            }
        }

        Assert.assertTrue(johnWebElm.isDisplayed());

    }

}
