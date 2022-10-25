package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before (order = 1)
    public void setup(){
        System.out.println("setting up browser using cucumber @Before each scenario  @Before (order = 1)");
    }
    @Before (value = "@login" , order = 2)
    public void setUpForLogin(){
        //if you want to run specific feature/scenario
        //you can use value = "@tagname" to determine this
        System.out.println(" @Before (value = \"@login\" , order = 2)");
    }

    @Before (value = "@db" , order = 3)
    public void setupForDatabaseScenario(){
        System.out.println("@Before (value = \"@db\" , order = 3)");
    }

    @After
    public void tearDownScenario(){ // we will implement taking screenshot in this method
        System.out.println("It will be closing browser using cucumber @After each scenario  @Before (value = \"@db\" , order = 3)");
    }

    @BeforeStep
    public void setupScenarioStep(){
        System.out.println("Setting up using @BeforeStep");
    }
}
