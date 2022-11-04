package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  { "pretty" ,
                "html:target/cucumber-reports.html" ,
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
             } ,
        features = "src/test/resources/feature" ,
        glue = "com/cydeo/step_definitions" ,
        dryRun = true ,
        tags =  "@wip",
        publish = true
)
public class CukesRunner { }
