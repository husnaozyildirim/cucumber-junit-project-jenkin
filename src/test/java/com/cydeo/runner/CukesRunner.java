package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html" ,
        features = "src/test/resources/feature" ,
        glue = "com/cydeo/step_definitions" ,
        dryRun = false ,
        tags =  "@Regression and @eating"
)
public class CukesRunner {

}
