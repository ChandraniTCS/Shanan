package Xpathby_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Atrribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Chandrani");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@class=\"_acan _aiit _acap _aijb _acas _aj1-\"]")).click();
		
	}

}
