package com.cydeo.step_definitions;

import com.cydeo.pages.HioscarPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

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
    public void from_coverage_year_dropdown_select_option(Integer year) {
        hioscarPage.coverageYear.click();

        for (WebElement eachYear : hioscarPage.coverageYearOptions) {
            if (eachYear.getAttribute("aria-label").equals(year)) {
                eachYear.click();
                break;
            }
        }

    }

    @When("From Coverage access dropdown Select \"Employer-provided\" option")
    public void from_coverage_access_dropdown_select_employer_provided_option(String option) {
        hioscarPage.coverageAccess.click();

        for (WebElement each : hioscarPage.accessOptions) {
            if (each.getText().equals(option)){
                each.click();
                break;
            }
        }

    }

    @When("From Network partner dropdown Select \"Oscar\" option")
    public void from_network_partner_dropdown_select_oscar_option(String option) {
hioscarPage.networkPartner.click();

        for (WebElement each : hioscarPage.networkPartnerOption) {
            if(each.getText().equals(option)){
                each.click();
                break;
            }
        }


    }

    @When("From Coverage area dropdown Select New Jersey")
    public void from_coverage_area_dropdown_select_new_jersey() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click Continue button")
    public void click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify title contains {string}")
    public void verify_title_contains(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
