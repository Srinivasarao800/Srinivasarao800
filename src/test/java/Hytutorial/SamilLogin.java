package Hytutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamilLogin {
	WebDriver driver;


	@Parameters({"browsername"})	
	@BeforeMethod
	public void LaunchingBrowser(String b )
	{
		switch(b)
		{
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://buy.samil.in/");
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://buy.samil.in/");
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://buy.samil.in/");
			break;

		default:
			System.out.println("Not a ProperBorwserName");
			break;	
		}
	}

	@Parameters({"userid","password"})
	@Test
	public void LoginWithValidCredetionals(String id,String pass)
	{
		driver.findElement(By.id("txtuserID")).sendKeys(id,Keys.TAB);

		driver.findElement(By.id("txtpassword")).sendKeys(pass,Keys.ENTER);

	}

	@Test
	public void LoginWithInValidCredetionals()
	{
		driver.findElement(By.id("txtuserID")).sendKeys("9384359814",Keys.TAB);

		driver.findElement(By.id("txtpassword")).sendKeys("Raji@00",Keys.ENTER);
	}

	@Test
	public void LoginWithoutEnteringCredetionals()
	{
		driver.findElement(By.id("txtuserID")).sendKeys("",Keys.TAB);

		driver.findElement(By.id("txtpassword")).sendKeys("",Keys.ENTER);
	}

	@Test
	public void LoginWithoutEnteringUserId()
	{
		driver.findElement(By.id("txtuserID")).sendKeys("",Keys.TAB);

		driver.findElement(By.id("txtpassword")).sendKeys("Raji@00",Keys.ENTER);
	}

	@Test
	public void LoginWithoutEnteringPassword()
	{
		driver.findElement(By.id("txtuserID")).sendKeys("9384359814",Keys.TAB);

		driver.findElement(By.id("txtpassword")).sendKeys("",Keys.ENTER);
	}

	@AfterMethod
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
