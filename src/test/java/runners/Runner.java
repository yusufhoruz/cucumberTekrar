package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOuput/failed_scenerio.txt"},
        features = "src/test/resources/features",
        glue = {"hooks","stepdefinitions"},
        tags = "@bc",
        dryRun = false,
        monochrome = false)

public class Runner {
}
