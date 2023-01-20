package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Compatibility {
	@Parameters("browsername")
	@Test
	public void TC(String browsername) {
		WebDriver driver=null;
		if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		}
		else if(browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ravi9\\Desktop\\Java Tools\\edge108\\msedgedriver.exe");
		    driver=new EdgeDriver();
		}
			driver.get("https://www.selenium.dev/");
			}
	}

