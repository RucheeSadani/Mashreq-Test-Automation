package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import global.OpenWebsite;


public class ContactUs {

	String path;
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver= OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void testContactUs() throws InterruptedException {
	driver.findElement(By.xpath("//li[@class='contact-btn']//a[@class='masterTooltip' and @title='Contact us']")).click();
	Thread.sleep(5000);
	String Actual=driver.findElement(By.xpath("//div[@class='row text-center']//div[@class='col-lg-6']//h3")).getText();
	String Expected = "Contact Us";
	System.out.println("Actual title is :" + Actual);
	Assert.assertEquals(Actual, Expected);
	 }
	 
	 @AfterTest
	 public void tearDown() {
		 driver.quit();
	 }
}
