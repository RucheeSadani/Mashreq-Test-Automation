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

public class ProductLoanDropdown {
	String path;
	WebDriver driver;
	List<String> prodList= Variables1.subprod;
    List<String> all_elements_text=new ArrayList<>();
    
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver= OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void checkProductLoanDropdown() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='contact-btn']//a[@class='masterTooltip' and @title='Contact us']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='need']")).click();
		List<WebElement> productLoanValues= driver.findElements(By.xpath("//select[@id='need']//option"));
		
		for(WebElement e: productLoanValues) {
			System.out.println(e.getText());
			if(e.getText().equalsIgnoreCase("Loans")) {
				//Thread.sleep(30000);
				e.click();
				break;
	          } 
			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//select[@id='product']")).click();
			System.out.println("HI");
			List<WebElement>prod=driver.findElements(By.xpath("//select[@id='product']//option"));
			System.out.println(prod.size());
			for(int i=1;i<prod.size();i++) {
				all_elements_text.add(prod.get(i).getText());
		        //to print directly
		        System.out.println(prod.get(i).getText());
			}
			System.out.println("all_elements_text = " +all_elements_text);
		    Assert.assertEquals(all_elements_text, prodList);
		    System.out.println("Hi");
		    Assert.assertEquals(all_elements_text.size(), 6);
		    System.out.println("Hi 1"); 
		    Assert.assertEquals(all_elements_text.contains("Home Loan UAE Resident"), true, "xyz");   
	 }
			
	 @AfterMethod
	 public void tearDown() {
		driver.quit();
	 }
}
