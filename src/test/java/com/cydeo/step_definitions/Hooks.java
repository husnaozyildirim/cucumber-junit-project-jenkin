package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {




    @After
    public void tearDownScenario(Scenario scenario) { // we will implement taking screenshot in this method

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }



  // @BeforeStep
  // public void setupScenarioStep() {
  //     System.out.println("Setting up using @BeforeStep");
  // }
  // //@Before (order = 1)
  // public void setupScenario() {
  //     System.out.println("setting up browser using cucumber @Before each scenario  @Before (order = 1)");
  //     Driver.getDriver().get("Url");
  //     //mostly background will take care of set up Driver.getDriver().get("Url");
  // }

    // @Before (value = "@login" , order = 2)
    //public void setUpForLogin() {
    //if you want to run specific feature/scenario
    //you can use value = "@tagname" to determine this
    //}

    //  @Before (value = "@db" , order = 3)
    //public void setupForDatabaseScenario() {
    //}

}
