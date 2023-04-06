package StepDefinations;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingpageClass;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinations {

public WebDriver driver;
public String offerpageproductname;
public String landingpageproductname;
TestContextSetup tcs;
// single responsibility principle and loosely coupled classs(able to enhance in future )
public LandingPageStepDefinations(TestContextSetup tcs) {
	this.tcs = tcs;
}
@Given("User is on Greenkart Landing Page")
public void user_is_on_greenkart_landing_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankita Sahu\\chromedriver_win32\\chromedriver.exe");
	tcs.driver = new ChromeDriver();
	tcs.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
}
@When("User searched with short name {string} and extract actual name of product")
public void user_searched_with_short_name_and_extract_actual_name_of_product(String shortname) throws InterruptedException {
 
	LandingpageClass l = new LandingpageClass(tcs.driver);
	l.EnterSearchitem(shortname);
	Thread.sleep(3000);
	tcs.landingPageProductName = l.getProductName().split("-")[0].trim();
	System.out.print(landingpageproductname +"is extracted from home page");
	

}


}
