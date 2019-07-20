package contactpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import global.OpenWebsite;

public class CheckErrorWithoutEnteringDetails {

	String path;
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver= OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void testErrorWithoutFillingDetails() throws InterruptedException {
	driver.findElement(By.xpath("//li[@class='contact-btn']//a[@class='masterTooltip' and @title='Contact us']")).click();
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,650)", "");
	 }
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}
