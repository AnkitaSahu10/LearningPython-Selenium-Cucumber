package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingpageClass LandlingPageClass;
	private WebDriver driver;
	
	public LandingpageClass getLandingPage() {
		
		 LandlingPageClass = new LandingpageClass(driver);
		return LandlingPageClass;
	}

	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}

}
