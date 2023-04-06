package CucubmerOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/Features",
		glue = "Step_Definition")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
