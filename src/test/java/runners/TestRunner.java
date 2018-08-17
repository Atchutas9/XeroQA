package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		monochrome = true,
		plugin= {"pretty", "json:target/cucumber-reports/cucumber-report.json" ,
				"html:target/cucumber-reports/cucumber-report"},
		features = {"src/test/resources/features/AddBankAccount.feature"},
		glue= {"src/test/java/stepDefinitions/AddBankAccount_stepsTest.java"}
		)
 

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
}

