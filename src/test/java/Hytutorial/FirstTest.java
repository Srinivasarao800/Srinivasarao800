package Hytutorial;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void TestSamilLogin() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buy.samil.in/");

		driver.findElement(By.id("txtuserID")).sendKeys("9384359814",Keys.TAB);

		driver.findElement(By.id("txtpassword")).sendKeys("Raji@800",Keys.ENTER);

		Thread.sleep(9000);  
		driver.quit();
	}

	@Test
	public void TestSamil() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buy.samil.in/");

		driver.findElement(By.id("txtuserID")).sendKeys("9384359814",Keys.TAB);

		driver.findElement(By.id("txtpassword")).sendKeys("Raji@800",Keys.ENTER);

		Thread.sleep(9000);
		driver.quit();
	}

}
