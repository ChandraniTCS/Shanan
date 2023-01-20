package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CompatibleSuit {
@Test 
public void TC1() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\edge108\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in");
	
}
}
//System.setProperty("webdriver.gecko.driver","C:\\Users\\ravi9\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
