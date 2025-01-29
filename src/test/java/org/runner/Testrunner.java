package org.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Feature/login.feature"},
        dryRun = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        glue = "org.stepdefinition",
        plugin = {"pretty","json:target/cucumber.json",
                  "html:target/cucumber.html",
                  "junit:target/cucumber.xml"}
)
public class Testrunner {



}
