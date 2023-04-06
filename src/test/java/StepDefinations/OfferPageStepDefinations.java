package StepDefinations;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferPageStepDefinations {

public WebDriver driver;
public String offerpageproductname;
public String landingpageproductname;


TestContextSetup tcs;

public OfferPageStepDefinations(TestContextSetup tcs) {
	this.tcs = tcs;
}

//we can reuse this moving to child window code
@Then("User searched for same {string} in offers page to check if product exist")
public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname2) throws InterruptedException {
   //tcs.driver.findElement(By.linkText("Top Deals")).click();
   Thread.sleep(3000);
   //Set<String> win = tcs.driver.getWindowHandles();
  // Iterator<String> i= win.iterator();
   // String parentwin =i.next();//parent window
   // String childwin =  i.next();
   // tcs.driver.switchTo().window(childwin);
   switchToOfferspage();
    tcs.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname2);	
     offerpageproductname  = tcs.driver.findElement(By.cssSelector("tr td:nth-child(1")).getText();
     System.out.print(offerpageproductname +"is extracted from offer page");
}

public void switchToOfferspage()
{
	//if already switch dont switch
//	if(tcs.driver.getCurrentUrl().equalsIgnoreCase(landingpageproductname))
	tcs.driver.findElement(By.linkText("Top Deals")).click();
	  Set<String> win = tcs.driver.getWindowHandles();
	  Iterator<String> i= win.iterator();
	  String parentwin =i.next();//parent window
	  String childwin =  i.next();
	  tcs.driver.switchTo().window(childwin);
	    
	   
}
@And("^validate product name in offers page matches with landing page$")
public void validate_product_name_in_offers_page_matches_with_landing_page() throws Throwable {
   
	Assert.assertEquals(offerpageproductname, tcs.landingPageProductName);
	
}

}
