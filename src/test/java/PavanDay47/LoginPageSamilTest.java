package PavanDay47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageSamilTest {

	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://buy.samil.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	void TestLogin() throws Exception
	{
		//LoginPageSamil lp = new LoginPageSamil(driver);
		LoginPageSamil2usingPagefactory lp = new LoginPageSamil2usingPagefactory(driver);
		
		lp.setUserName("9384359814");
		lp.setUserPassword("Raji@800");
		lp.clickLogin();
		Thread.sleep(20000);
		Assert.assertEquals(driver.getTitle(),"Event Listing");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
