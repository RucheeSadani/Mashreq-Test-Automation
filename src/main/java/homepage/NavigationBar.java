package homepage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import contactpage.Variables1;
import global.OpenWebsite;


public class NavigationBar {
	String path;
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 this.driver=OpenWebsite.openMashreq();
	 }
	 
	 @Test
	 public void navigationBarCheck() {
		//to catch all web elements into list
		 List<WebElement> a=driver.findElements(By.xpath("//div[@class='col-md-9 col-xs-12 no-padding']//div[@class='leftLinks']//li"));
		    //myList contains all the web elements
		    //if you want to get all elements text into array list
		 	List<String> constList= Variables1.navi;
		    List<String> all_elements_text=new ArrayList<>();
		    for(int i=1; i<a.size(); i++){
		        //loading text of each element in to array all_elements_text
		        all_elements_text.add(a.get(i).getText());
		        //to print directly
		        System.out.println(a.get(i).getText());
		    }
		    System.out.println("all_elements_text = " +all_elements_text);
		    Assert.assertEquals(all_elements_text, constList);
	 }	 
	 @AfterMethod
	 public void tearDown() {
		driver.quit();
	 }
}
