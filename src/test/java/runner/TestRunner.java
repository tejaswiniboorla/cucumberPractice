package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

 

@CucumberOptions(features = { "src//test//java//features" }, 

glue = { "stepdefinations"}
,tags="@color",
plugin= {"html:target/cucumber.html",

		  "json:target/cucumber.json", 

		  "junit:target/cucumber.xml","pretty"}
,dryRun=true)

public class TestRunner extends AbstractTestNGCucumberTests {
	

}
