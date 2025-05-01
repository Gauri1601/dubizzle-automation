package com.dubizzle.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features", // Path to .feature files
    glue = "com.dubizzle.stepDefinitions",    // Package with step definitions
    plugin = {
            "pretty",
            "html:target/cucumber-report.html",
            "json:target/cucumber.json"
        },
        monochrome = true,
        dryRun=true// to check with step def
    
)
public class SearchRunner extends AbstractTestNGCucumberTests {
}
