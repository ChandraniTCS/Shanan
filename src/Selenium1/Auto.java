package Selenium1;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Auto {

		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\geckodriver-v0.32.0-win32 (1)\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
			
		}
	}

//C:\Users\ravi9\Desktop\Java Tools\geckodriver-v0.32.0-win32 (1)\geckodriver.exe