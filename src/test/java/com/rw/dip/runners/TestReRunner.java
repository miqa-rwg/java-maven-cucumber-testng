package com.rw.dip.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber-rerun.json",
                "junit:target/cucumber-reports/cucumber-rerun.xml",
                "html:target/cucumber-reports/output/report-rerun.html",
        },
        features = "@target/cucumber/rerun.txt",
        glue = { "com.rw.dip.steps" },
        monochrome = true
)
public class TestReRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
