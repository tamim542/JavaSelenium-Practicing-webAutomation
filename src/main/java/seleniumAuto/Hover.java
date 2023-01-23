package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends Locators{
	@Test (priority=0)
	public void hoverWebsite() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}
	@Test (priority=1)
	public void hoverExample() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement electronic = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]"));
		action.moveToElement(electronic).perform();
		Thread.sleep(5000);
		
		WebElement electronic1 = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[6]/li[5]/a[1]/span[1]"));
		action.moveToElement(electronic1).perform();
		Thread.sleep(300);
	}
	

}
