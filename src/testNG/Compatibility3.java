package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Compatibility3 {
@Parameters("browsername")
@Test
public void Tc1(String browsername){
	WebDriver driver=null;
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
}
	else if(browsername.equals("Edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\edge108\\msedgedriver.exe");
		driver=new EdgeDriver();
		}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\geckodriver-v0.32.0-win32 (1)\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}  
	

	driver.get("https://www.myntra.com/mantra");

}
}
