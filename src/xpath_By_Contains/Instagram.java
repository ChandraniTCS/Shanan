package xpath_By_Contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[contains(@class,\"_aa4b _add6 _ac4d\")]")).sendKeys("Chandrani");
	driver.findElement(By.xpath("//input[contains(@name,\"password\")]")).sendKeys("123456780");
	
	
}
}
