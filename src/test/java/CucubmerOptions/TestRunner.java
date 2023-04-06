package CucubmerOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = "Step_Definition", stepNotifications = true,tags = "@SanityTest",
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"},
		dryRun=true,
		monochrome = true)

// tags = " not @SanityTest" to skip this sanity test cases only
//tags = " @SanityTest"  and " SmokeTest" to check both condition
public class TestRunner {
	




}
