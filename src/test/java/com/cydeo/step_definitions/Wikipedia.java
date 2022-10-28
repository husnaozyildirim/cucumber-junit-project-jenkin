package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia {
    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchBtn.click();
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikipediaPage.searchInput.sendKeys(arg0);
    }

    @Then("User see {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }

    @Then("User see {string} is in the main header")
    public void userSeeIsInTheMainHeader(String arg0) {
        Assert.assertEquals(arg0, wikipediaPage.head.getText());
    }


    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String str) {
     Assert.assertTrue(wikipediaPage.imgHeader.getText().equals(str));
    }
}
