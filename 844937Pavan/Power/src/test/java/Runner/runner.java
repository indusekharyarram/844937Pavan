package Runner;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\feature\\testcase.feature",
		glue= {"StepDefinition"},
		// To Generate Extent, html,json,junit reports
	plugin = {"pretty:target/json-report.json","html:target/cucumber-html-report","junit:target/junit-xml-report.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true,
		strict=true,
		dryRun=false
		)
public class runner {
	
}