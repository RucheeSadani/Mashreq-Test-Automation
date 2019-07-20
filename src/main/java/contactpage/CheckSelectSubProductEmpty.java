package contactpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import global.OpenWebsite;

public class CheckSelectSubProductEmpty {
	String path;
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver= OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void checkSelectSubProductEmpty() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='contact-btn']//a[@class='masterTooltip' and @title='Contact us']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='product']")).click();
		List<WebElement> a=driver.findElements(By.xpath("//select[@id='product'//option]"));
		System.out.println(a.isEmpty());
		Assert.assertEquals(a.isEmpty(), true, "The Select SubProduct Dropdown is Empty");		
	 }
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}
