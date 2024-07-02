package Hytutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertValidaion 
{


	@Test
	public void Assertation()
	{
		//way 2
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		//2) Open the Url
		driver.get("https://buy.samil.in/");


		//3) Validate the Titleof the Page.  Login
		String ExpectedTitle ="Login";
		String  ActulTitle = driver.getTitle();

		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ExpectedTitle, ActulTitle);
		driver.quit();
	}

}
