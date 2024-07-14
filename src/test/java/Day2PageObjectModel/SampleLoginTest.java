package Day2PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleLoginTest {

	WebDriver driver;
	
	//Initiate the WebDriver
	@BeforeClass
	void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login#google_vignette");
		driver.manage().window().maximize();
		
	}
	@Test
	void  Login1() throws InterruptedException
	{
		LoginPageLocators lp = new LoginPageLocators(driver);
		lp.setUsername("practice");
		lp.setPassword("SuperSecretPassword!");
		//lp.Login();
		Thread.sleep(2000);
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
}
