package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPageClass {
	
	WebDriver driver;
	By search = By.xpath("//input[@type='search']");
	By productname = By.cssSelector("h4.product-name");

	public void EnterSearchitem(String name) {
		driver.findElement(search).sendKeys(name);	
	}	
}
