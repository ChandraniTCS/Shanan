package Xpathby_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute2 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.instagram.com/");
	//enter userrname
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Chandrani");
	//enter password
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Chandrani27");
	//Click on login button
	driver.findElement(By.xpath("//div[@class=\"_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm\"]")).click();
	
	}
	
}
