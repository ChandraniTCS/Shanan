package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {
	public static void main(String[] args) throws InterruptedException{
			// set the properties
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/bus-tickets/");
			// launch and maximize the window
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
			String actT = driver.getTitle();
			//enter username
			
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys("1234567897");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@data-cy=\"continueBtn\"]")).click();
			String expT = driver.getTitle();
			
			Thread.sleep(3000);
			
			System.out.println(actT);
			if(expT.equals(actT)) {
				System.out.println("TC is pass");
			}
			else {
				System.out.println("TC is fail");
			}
			driver.close();
	}	
}
