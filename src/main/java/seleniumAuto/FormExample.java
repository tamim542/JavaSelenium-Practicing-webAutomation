package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormExample extends Locators{

	@Test
	
	public void form() {
		driver.get("https://demoqa.com/automation-practice-form");
		
	}
	@Test
	public void formAutomation() {
		WebElement radioButton = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		radioButton.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys("test");
	}
}
