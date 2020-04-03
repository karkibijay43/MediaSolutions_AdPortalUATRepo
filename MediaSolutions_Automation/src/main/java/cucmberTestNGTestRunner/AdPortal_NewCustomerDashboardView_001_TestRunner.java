package cucmberTestNGTestRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.ExtentProperties;

import adPortalManagers.WebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions
(features = "/Users/p2815492/git/MediaSolutionsRepo/MediaSolutions_Automation/src/main/java/adportalfeatures/AdPortal_NewCustomerDashboardView_001.feature", 
glue = {
		"adPortalstepdefinitions" 
		}, plugin = { "com.cucumber.listener.ExtentCucumberFormatter:"
		// AdPortalRegressionTestReport/NewDashboardViewReport.html" },
		}, 
				monochrome = true

)

public class AdPortal_NewCustomerDashboardView_001_TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	WebDriver driver;
	WebDriverManager webDriverManager;
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		extentProperties.setReportPath("AdPortalRegressionTestReport/NewDashboardViewReport_" + timeStamp + ".html");
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
		webDriverManager = new WebDriverManager();
		webDriverManager.closeDriver();
		
	}
}
