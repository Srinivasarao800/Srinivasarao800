package Day1Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeandminimizeBrowser {
	public WebDriver driver;
	@Test
	public void Maximize() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.samil.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
	}

}
