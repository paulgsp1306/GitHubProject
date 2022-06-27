package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},monochrome=true,glue= {"stepDefinitions"},
plugin = {"pretty", "html:target/cucumber-reports"}
)
public class Runner {
	

}
