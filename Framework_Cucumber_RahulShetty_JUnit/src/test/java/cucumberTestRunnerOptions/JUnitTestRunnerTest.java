package cucumberTestRunnerOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features", glue = "stepDefinitions", dryRun = false, monochrome = true,
		// tags="@SmokeTest and @RegressionTest",
		// tags="@SmokeTest or @RegressionTest",
		// tags="not @RegressionTest"
		// tags="@PlaceOrder",

		// html, xml, json, junit, extent :
		// https://extentreports.com/docs/versions/4/java/cucumber4.html

		  plugin = { 
			        
			        "json:target/jsonReports/Cucumber.json",  // This generates the JSON report
			        "json:target/cucumber/report.json",  
			        "html:target/cucumber/reports/report.html",  // Avoid conflicts here
			        "pretty",  // Optional: to make the output more readable
			        "html:target/cucumber-reports",  // Optional: if you want an HTML report as well			   
			        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			        "rerun:target/failed_scenarios.txt" 
    })
public class JUnitTestRunnerTest {
	
	}


