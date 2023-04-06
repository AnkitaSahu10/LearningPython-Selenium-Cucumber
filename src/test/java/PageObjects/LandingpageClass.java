package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingpageClass {
public WebDriver driver;
public LandingpageClass(WebDriver driver) {
	this.driver = driver;
}
By search = By.xpath("//input[@type='search']");
By productname = By.cssSelector("h4.product-name");

public void EnterSearchitem(String name) {
	driver.findElement(search).sendKeys(name);	
}	
public void getSearchText() {	
	driver.findElement(search).getText();
}
	
public String getProductName() {	
	 return driver.findElement(productname).getText();
}
}

