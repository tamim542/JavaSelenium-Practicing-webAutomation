package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Nevigate extends Locators{
	@Test
	public void nevigaetHeyper() {
		driver.get("https://member.daraz.com.bd/user/register");
		driver.manage().window().maximize();
	}
	@Test
	public void checkNevigate() {
		
		//driver.findElement(By.xpath("//button[contains(text(),'SIGN UP')]")).click();
		WebElement inputF=driver.findElement(By.linkText("//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]"));
	    inputF.click();
	}

}
