package Day1Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigations {
	public WebDriver driver;
	@Test
	public void PageNavigations()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.samil.in/");
		driver.manage().window().maximize();
		//Clicking on the BackWard Direction.
		driver.navigate().back();
		//Clicking on the Forward Direction.
		driver.navigate().forward();
		//Clicking on the Reload.
		driver.navigate().refresh();
		
	}

}
