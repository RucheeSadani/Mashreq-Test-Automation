package global;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroller {

	static WebDriver driver;
	public static JavascriptExecutor jsExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,650)", "");
		return js;
	
	}
}
