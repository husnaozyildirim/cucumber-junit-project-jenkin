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
  //  @When("User types Steve Jobs in the wiki search box")
  //  public void user_types_steve_jobs_in_the_wiki_search_box() {
  //      wikipediaPage.searchInput.sendKeys("Steve Jobs");
  //  }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchBtn.click();
    }


    // @Then("User sees Steve Jobs is in the wiki title")
  // public void user_sees_steve_jobs_is_in_the_wiki_title() {
  //     Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));
  // }


   @When("User types {string} in the wiki search box")
   public void userTypesInTheWikiSearchBox(String arg0) {
       wikipediaPage.searchInput.sendKeys(arg0);
   }

   @Then("User see {string} is in the wiki title")
   public void userSeesIsInTheWikiTitle(String arg0) {
       Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
   }
}
