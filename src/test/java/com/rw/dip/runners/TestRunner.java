package com.rw.dip.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber/reports/report.html",
                "json:target/cucumber/reports/cucumber.json",
                "junit:target/cucumber/reports/cucumber.xml",
                "timeline:target/cucumber/reports/timeline",
                "rerun:target/cucumber/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = {"com.rw.dip.steps"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

