package seleniumAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Locators { 
	@Test
	public void dropDown() {
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
	}
	@Test
	
	public void dropdownExample() throws InterruptedException {
		WebElement gender=driver.findElement(By.xpath("//body/form[@id='form1']/fieldset[@id='regform']/div[1]/div[1]/div[7]/select[1]"));
		Select select=new Select(gender); 
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		select.selectByValue("na");
		select.selectByVisibleText("Male");
	}
	

}
