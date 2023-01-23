package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FirstWebAutomation extends Locators{

	
	 // String baseUrl="https://www.daraz.com.bd/";
	  @Test
		public void openUrl() {
			driver.get(baseUrl);
			WebElement id= driver.findElement(By.id(id1));
			id.sendKeys("test@yahoo.com");
			// Thread.sleep(2000);
		}
	
}
