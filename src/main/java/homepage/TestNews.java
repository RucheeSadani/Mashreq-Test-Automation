package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import global.OpenWebsite;

public class TestNews {
	String path;
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver= OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void testNewsDisplay() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,650)", "");
    Thread.sleep(5000);
	String news=driver.findElement(By.xpath("//div[@class='newsBox']//h3")).getText();
	System.out.println("news=" + news);
		String ExpectedTitle = "Mashreq News";
		String ActualTitle=news;
		System.out.println("Actual title is :" + ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	 }
	 
	 @AfterTest
	 public void tearDown() {
		 driver.quit();
	 }
}
