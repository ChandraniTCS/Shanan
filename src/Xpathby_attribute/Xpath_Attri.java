package Xpathby_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attri {
	public static void main(String[] args) {
		

		//set the properties
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				//enter un
				driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("admin");
				//enter pwd
				driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("manager");
				//clcik on login btn
				driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
}
	}
