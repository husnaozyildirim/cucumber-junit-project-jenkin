package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    //@Before (order = 1)
    public void setupScenario(){
        System.out.println("setting up browser using cucumber @Before each scenario  @Before (order = 1)");
        Driver.getDriver().get("Url");
    }
   // @Before (value = "@login" , order = 2)
    public void setUpForLogin(){
        //if you want to run specific feature/scenario
        //you can use value = "@tagname" to determine this
        System.out.println(" @Before (value = \"@login\" , order = 2)");
    }

  //  @Before (value = "@db" , order = 3)
    public void setupForDatabaseScenario(){
        System.out.println("@Before (value = \"@db\" , order = 3)");
    }

    @After
    public void tearDownScenario(){ // we will implement taking screenshot in this method
        Driver.closeDriver();
    }

    @BeforeStep
    public void setupScenarioStep(){
        System.out.println("Setting up using @BeforeStep");
    }
}
