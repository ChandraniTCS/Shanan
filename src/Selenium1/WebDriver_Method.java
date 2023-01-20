package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.manage().window().minimize();
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.close();
}
}
