package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
					
			// create object of webdriver
			WebDriver driver = new ChromeDriver();

			// maximize window
			driver.manage().window().maximize();

			// open webpage
			driver.get("https://demo.automationtesting.in/Register.html");
			Thread.sleep(2000);
			// find element
			// Enter First name
			WebElement fName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
			fName.sendKeys("Nitesh");
			
			// Thread.sleep(1000);
			// Enter last Name
			WebElement lName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
			lName.sendKeys("Moon");

			// Thread.sleep(1000);
			// Enter address
			WebElement address = driver.findElement(By.tagName("textarea"));
			address.sendKeys("plot no 12345 siddharth nagar Dapodi");

			// Thread.sleep(1000);
			// Enter Email
			WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("nagpur@gmail.com");

			// Thread.sleep(1000);
			// Enter mobile no
			WebElement mobNo = driver.findElement(By.xpath("//input[@type='tel']"));
			mobNo.sendKeys("9541285641");

			// Thread.sleep(1000);
			// Select Gender
			WebElement gender = driver.findElement(By.cssSelector("input[value='Male']"));
			gender.click();

			Thread.sleep(1000);
			// Select Hobbies
			WebElement hobbies = driver.findElement(By.id("checkbox2"));
			hobbies.click();

			// Scrolling on webpage
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");

			Thread.sleep(3000);
			// select Language

			 driver.findElement(By.id("msdd")).click();
			WebElement languages = driver.findElement(By.id("msdd"));
			Select lang = new Select(languages);
			lang.selectByVisibleText("Arabic");
			Thread.sleep(2000);

//			List<WebElement> languages = driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
//			System.out.println("No of element : " + languages.size());
	//
//			// step:7 using for each loop
//			for (WebElement e : languages) {
//				Select language = new Select((WebElement) languages);
//				language.selectByValue("Danish");
//				e.click();
//				Thread.sleep(2000);
//			}

//			// using select class
//			Select language = new Select((WebElement) languages);
//			language.selectByValue("Danish");
	//
			// Select Skills
			WebElement skills = driver.findElement(By.id("Skills"));
			Select skill = new Select(skills);
			skill.selectByIndex(10);
			Thread.sleep(2000);

			// select country
//			WebElement country = driver.findElement(By.className("select2-selection select2-selection--single"));
//			Select cntry = new Select(country);
//			cntry.selectByIndex(5);
//			Thread.sleep(5000);

			WebElement years = driver.findElement(By.id("yearbox"));
			Select selYear = new Select(years);
			selYear.selectByValue("1993");
			Thread.sleep(2000);

			WebElement months = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
			months.click();
			Select selMonth = new Select(months);
			selMonth.selectByVisibleText("February");
			Thread.sleep(2000);

			WebElement date = driver.findElement(By.id("daybox"));
			Select selDay = new Select(date);
			selDay.selectByValue("3");
			Thread.sleep(2000);

			// Enter password
			driver.findElement(By.id("firstpassword")).sendKeys("Nit@123");

			// Re-enter password
			driver.findElement(By.id("secondpassword")).sendKeys("Nit@123");
			driver.close();

		}

	}

