package testNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Geko {
	
	@Test
	public void Tc() {
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\ravi9\\\\Desktop\\\\Java Tools\\\\geckodriver-v0.32.0-win32 (1)\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
}
}
