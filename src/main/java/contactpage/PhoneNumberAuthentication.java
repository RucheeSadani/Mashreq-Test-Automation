package contactpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import global.OpenWebsite;


public class PhoneNumberAuthentication {
	 String path;
	 WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver=OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void checkPhoneNumberLessThan7Digits() throws InterruptedException {
		 driver.findElement(By.xpath("//li[@class='contact-btn']//a[@class='masterTooltip' and @title='Contact us']")).click();
		 Thread.sleep(5000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)", "");
		 driver.findElement(By.xpath("//input[@id='mobile']")).click();
		 driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("12345");
		 String a= driver.findElement(By.xpath("//div[@class='col-lg-9 col-md-9 col-sm-9 col-xs-9 padding-right-0px']//span")).getText();
			 Assert.assertEquals(a, "Mobile number should be 7 digit");
	 }	
	 
	 @Test
	 public void checkPhoneNumber7Digits() throws InterruptedException {
		 driver.findElement(By.xpath("//li[@class='contact-btn']//a[@class='masterTooltip' and @title='Contact us']")).click();
		 Thread.sleep(5000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 driver.findElement(By.xpath("//input[@id='mobile']")).click();
		 driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567");
		 boolean a= driver.findElement(By.xpath("//div[@class='col-lg-9 col-md-9 col-sm-9 col-xs-9 padding-right-0px']//span")).isDisplayed();
		 Assert.assertEquals(a, false);
	 }
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}
