package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		WebElemnt Fashion driver.findElement(By.xpath("//div[text()=\"Fashion\"]"));
//		Select s = new Select(Fashion);
//		s.selectByVisibleText("");
//	//div[text()="Fashion"]
}
}
