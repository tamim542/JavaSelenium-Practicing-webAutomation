package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeHandle extends Locators{
	String baseURL="https://jqueryui.com/checkboxradio";
	
	@Test
	
	public void iframeExample() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize();
		WebElement iframTest=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframTest);
		WebElement newyorkButton = driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[1]"));
		newyorkButton.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement iframeOutSide = driver.findElement(By.xpath("//a[contains(text(),'API documentation')]"));
		iframeOutSide.click();
	}
	
}
