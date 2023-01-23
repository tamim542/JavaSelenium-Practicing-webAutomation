package seleniumAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWaiting extends Locators {
	
	String BsaeUrl="https://Qavbox.github.io/demo/delay";
	@Test
	public void seleniumWaiting() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(BsaeUrl);
		driver.manage().window().maximize();
		By lateText=By.xpath("//body/form[@id='form1']/fieldset[@id='regform']/div[1]/div[1]/input[1]");
		
		driver.findElement(By.xpath("//body/form[@id='form1']/fieldset[@id='regform']/div[1]/div[1]/input[1]")).click();
		WebElement lateTextBy=driver.findElement(lateText);
		System.out.println(lateTextBy.getText());
		
	    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//body/form[@id='form1']/fieldset[@id='regform']/div[1]/div[2]/input[1]")).click();
	    
	    
	}
	
}
