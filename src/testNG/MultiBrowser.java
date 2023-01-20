package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	@Parameters("browsername")
	@Test
	public void TC(String browsername)
		{
			WebDriver driver = null;
			
			if(browsername.equals("Chrome")) {
			//for chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");			
				driver = new ChromeDriver();
			}
			else if (browsername.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			driver.get("https://www.mantra.com/mantra");
		
}
}
