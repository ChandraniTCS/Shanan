package Scroll_handling;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class key_Clas {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Chandrni@gmail.com",Keys.TAB,"Chandrani",Keys.ENTER);
	driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("chchc");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Bhede");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("12345699");
	driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("manager");
	WebElement day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	Select s = new Select(day);
	s.selectByVisibleText("27");
	WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	Select s1 = new Select(Month);
	s1.selectByVisibleText("Apr");
	WebElement Year =driver.findElement(By.xpath("//select[@id=\"year\"]"));
	Select s2 = new Select(Year);
	s2.selectByVisibleText("1995");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	
}
}
