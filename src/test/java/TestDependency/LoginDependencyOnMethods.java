package TestDependency;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDependencyOnMethods{
	WebDriver driver;
	
	@Test(priority=1)
	public void LaunchBrowserUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://buy.samil.in/");
		
	}
	
	@Test(priority=2,dependsOnMethods = {"LaunchBrowserUrl"})
	public  void Vlogin()
	{
		driver.findElement(By.id("txtuserID")).sendKeys("9384359814",Keys.TAB);
		driver.findElement(By.id("txtpassword")).sendKeys("Raji@800",Keys.ENTER);
	}
	
	@Test(priority=3,dependsOnMethods = {"Vlogin"})
	public void  VerifyLogin() throws Exception
	{
		if(driver.getTitle().equalsIgnoreCase("Event Listing"))
		{
			System.out.println("Valid Login");
			Thread.sleep(3000);
		}
		else
		{
			throw new Exception();
		}
	}
	
	@Test(priority=4,dependsOnMethods = {"VerifyLogin"})
	public void CartCount() throws Exception
	{
		String Count = driver.findElement(By.id("cartCount")).toString();
		
		if(Count.length()>=1)
		{
			driver.findElement(By.id("cartCount")).click();
		}
		else
		{
			throw new Exception();
		}
	}
	
	

}
