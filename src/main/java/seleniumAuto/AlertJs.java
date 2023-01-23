package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertJs extends Locators{
	@Test (priority=0)
	public void alertWebsite() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}
	@Test (priority=1)
	public void altertJs() throws InterruptedException {
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
//		jsAlert.click();
//		String text=driver.switchTo().alert().getText();
//		System.out.println("text="+text);
//		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
//		jsConfirm.click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
		jsPrompt.click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("text");
		//driver.switchTo().alert().dismiss();
		
		
		
	}
}
