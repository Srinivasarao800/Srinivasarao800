package Hytutorial;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertValidaion
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

		assertEquals(ExpectedTitle, ActulTitle,"Title Verification"); //HardAssertion.

		driver.quit();
	}

}
