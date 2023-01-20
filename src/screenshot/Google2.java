package screenshot;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Google2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\Desktop\\Java Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement abc =driver.findElement(By.xpath("//span[@id=\"glow-ingress-line2\"]"));
		File src = abc.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ravi9\\Desktop\\ScreenShot\\PAmazone1.jpg");
		Files.copy(src, dest);
		
	}

}
