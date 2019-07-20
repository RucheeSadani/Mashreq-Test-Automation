package contactpage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import global.OpenWebsite;

public class CheckIAmLookingForDropdown {
	String path;
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver= OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void checkIAmLookingForDropdown() throws InterruptedException {
		 driver.findElement(By.xpath("//li[@class='contact-btn']//a[@class='masterTooltip' and @title='Contact us']")).click();
		 Thread.sleep(5000);
		 List<String> constList1=Variables1.vari;
		 driver.findElement(By.xpath("//select[@id='reachoutforproduct']")).click();
		 List<WebElement> iAmLooking=driver.findElements(By.xpath("//select[@id='reachoutforproduct']//option"));
		 System.out.println("iAmLooking size" + iAmLooking.size());
		 List<String> all_elements_text=new ArrayList<>();
		 for(int i=1;i<iAmLooking.size();i++)
		 all_elements_text.add(iAmLooking.get(i).getText());		 
		 System.out.println("all_elements_text" + all_elements_text + "size is:" + all_elements_text.size());
		 System.out.println("constList1: " + constList1);
		 System.out.println("all_elements_text = " +all_elements_text);    
		 Assert.assertEquals(all_elements_text.size(), 4, "The Elements in the IamLooking dropdown was");    
	 }
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
}
