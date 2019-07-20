package global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {
	
	static String path;
	static WebDriver driver;
	
	public  static WebDriver openMashreq() {
	System.out.println("welcome");
	  System.out.println("Browser is Chrome");
		path = System.getProperty("user.dir")+"\\driver\\chromedriver1.exe";
		System.out.println("Path is "+path);
		System.setProperty("webdriver.chrome.driver",path);	
		driver = new ChromeDriver();//launch chrome browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.mashreqbank.com/uae/en/personal/home");
		System.out.println("Inside Mashreq ");
		return driver;
	}
}
