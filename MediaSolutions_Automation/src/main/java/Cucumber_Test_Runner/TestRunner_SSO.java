package Cucumber_Test_Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/p2815492/git/MediaSolutionsRepo/MediaSolutions_Automation/src/main/java/Features/SSOSignUP.feature"
		, glue= {"StepDefinitions"}
 )

public class TestRunner_SSO {

}