package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch {
    GooglePage googlePage = new GooglePage();

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("User types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String searchKeyword) {
        googlePage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
}
