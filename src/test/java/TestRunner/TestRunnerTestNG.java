package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="StepDefinations",
monochrome =true
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
