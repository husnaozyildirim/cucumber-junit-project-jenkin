package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("setup before scenario");
    }
    @After
    public void tearDown(){
        System.out.println("tear down after annotation");
    }
}
