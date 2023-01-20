package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Compatibility5 {
	@Parameters("browsertype")
	@Test
	public void tc(String browsertype) {
		WebDriver driver = null;
		if(browsertype.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
		 driver  = new ChromeDriver();
		}
		else if(browsertype.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\geckodriver-v0.32.0-win32 (1)\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else if(browsertype.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\edge108\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("https://www.google.com/");
		
	}

}
