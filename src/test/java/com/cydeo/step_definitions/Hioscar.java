package com.cydeo.step_definitions;

import com.cydeo.pages.HioscarPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Hioscar {
    HioscarPage hioscarPage = new HioscarPage();

    @Given("go to Hioscar page")
    public void go_to_hioscar_page() {
        Driver.getDriverPool().get("https://www.hioscar.com/care-options");
    }

    @When("click search network")
    public void click_search_network() {
        hioscarPage.searchNetworkBtn.click();
    }

    @When("From Coverage year dropdown Select {int} option")
    public void from_coverage_year_dropdown_select_option(int year) {
        hioscarPage.coverageYear.click();
        String yearInString = String.valueOf(year);

        for (WebElement eachYear : hioscarPage.coverageYearOptions) {
            if (eachYear.getAttribute("id").contains(yearInString) ) {
                eachYear.click();
                break;
            }
        }

    }

    @When("From Coverage access dropdown Select {string} option")
    public void from_coverage_access_dropdown_select_employer_provided_option(String option) {
        hioscarPage.coverageAccess.click();

        for (WebElement each : hioscarPage.accessOptions) {
            if (each.getText().equalsIgnoreCase(option)) {
                each.click();
                break;
            }
        }

    }

    @When("From Network partner dropdown Select {string} option")
    public void from_network_partner_dropdown_select_oscar_option(String option) {
        hioscarPage.networkPartner.click();

        for (WebElement each : hioscarPage.networkPartnerOption) {
            if (each.getAttribute("aria-label").contains(option)) {
                each.click();
                break;
            }
        }


    }

    @When("From Coverage area dropdown Select {string}")
    public void from_coverage_area_dropdown_select_new_jersey(String state) {
       hioscarPage.coverageArea.click();

        for (WebElement each : hioscarPage.coverageAreaOptions) {
            if ( each.getText().equalsIgnoreCase(state)){
                each.click();
                break;
            }
        }
    }

    @When("Click Continue button")
    public void click_continue_button() {
        hioscarPage.continueBtn.click();
    }

    @Then("Verify title contains {string}")
    public void verify_title_contains(String string) {
        Assert.assertTrue(Driver.getDriverPool().getTitle().contains(string));
    }



}
