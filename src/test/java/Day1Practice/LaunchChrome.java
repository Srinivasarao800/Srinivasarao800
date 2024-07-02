//Launching the ChromeDriver and Enter the URL


package Day1Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	public WebDriver driver;
	@Test
	public void Launchrome()
	{
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("https://www.samil.in/");
		
	}

}
