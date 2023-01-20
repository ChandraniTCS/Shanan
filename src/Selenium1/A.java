package Selenium1;

import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws InterruptedException {

		// Step:1 set the properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");

		// Step: 2 Create instace for web driver
		ChromeDriver driver = new ChromeDriver();

		// Step: 3 open url
		driver.get("https://vctcpune.com/selenium/practice.html");

		// Step: 4 launch browser and maximize the window
		driver.manage().window().maximize();

		// Step: 5 get the page title before clicking
		String title1 = driver.getTitle();

		// Step: 6 Print Title
		System.out.println("First Page : " + title1);

		// Step: 7 get the page url
		String url1 = driver.getCurrentUrl();

		// Step: 8 print the url
		System.out.println("Page Url Print : " + url1);

		// Step: 10 wait for 4sec
		Thread.sleep(4000);

		// Step: 11 click operation perform

		String parent = driver.getWindowHandle();

		driver.findElement(By.id("opentab")).click();

		Set<String> tabs = driver.getWindowHandles();

		System.out.println("Size of Tab : " + tabs.size());

		for (String val : tabs) {

			if (!val.equals(parent)) {

				driver.switchTo().window(val);

				String childTitle = driver.getTitle();

				System.out.println("Expected Title : " + childTitle);
			}
		}
		// Step: 12 wait for 4sec
		Thread.sleep(4000);

		// Step: 13 Get the title
		String actT = driver.getTitle();
		// System.out.println(actT);
		// Step: 14 wait for 4sec
		Thread.sleep(4000);

		// Step: 15 expected title
		String expT = "Velocity | Best software testing centre in Pune and Mumbai";
		// String actT = driver.getTitle();
		System.out.println("Current pagr Title is :[" + actT + "]");
		if (expT.equals(actT)) {
			System.out.println("TC is pass");
		} else {
			System.out.println("TC is fail");
		}
		Thread.sleep(2000);

		driver.quit();

		// WebElement d = driver.findElement(By.xpath("//a[@class='navbar-brand
		// font-weight-bold text-white']"));
		// d.getText();

		// driver.findElement(By.id(""));
	}
}