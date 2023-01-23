package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoard extends Locators{
	@Test (priority=0)
	public void keyBoardWebsite() {
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}
	@Test (priority=1)
	public void keyboardExample() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("tester");
		
		//Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		//copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		//past
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		
	}

}
