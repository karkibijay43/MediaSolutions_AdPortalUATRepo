package Cucumber_Test_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features="/Users/p2815492/eclipse-workspace/MediaSolutions_Automation/src/main/java/Features/LogIn.feature"
		features = "/Users/p2815492/git/MediaSolutionsRepo/MediaSolutions_Automation/src/main/java/Features/Login.feature", 
		glue = {"StepDefinitions" }
		
		)

public class TestRunner {

}
