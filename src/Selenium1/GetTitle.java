package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
		public static void main(String [] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		}
}
