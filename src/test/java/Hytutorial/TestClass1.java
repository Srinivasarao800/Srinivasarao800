package Hytutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass1 {


	@Test
	public void T1()
	{
		//way 2
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		//2) Open the Url
		driver.get("https://buy.samil.in/");


		//3) Validate the Titleof the Page.  Login
		String ExpectedTitle ="Login";
		String  ActulTitle = driver.getTitle();
		if(ActulTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Page Titles are Equals and Test Case Passed.");
		}
		else 
		{
			System.out.println("Page Titles are not Equals and Test Case Fail.");
		}
	}

}
