package InterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsinSelenium {
	
	/*
	 * 
	 * Diffrent Locators in Selenium?
	 * ID,Xpath,CssSelector,ClassName,tagName,name,LinkText,partialLinktext.
	 * 
	 * */
	
	
	WebDriver driver;
	@Test
	public void Test() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		//launching Browser..
		driver = new ChromeDriver();
		
		//Enter the Url
		driver.navigate().to("https://buy.samil.in/");
		
		//Maximize the Window.
		driver.manage().window().maximize();
		
		//Locate the Element using the ID Selector..
		driver.findElement(By.id("txtuserID")).sendKeys("srinu");
		Thread.sleep(1000);
		//Clear the Text
		driver.findElement(By.id("txtuserID")).clear();
		
		//Locating the with the Tagname
		List<WebElement> E = driver.findElements(By.tagName("input"));
		System.out.println(E.size());
		
		//css selector ID
		driver.findElement(By.cssSelector("#txtuserID")).sendKeys("srinu");
		
		//Clear the Text
		driver.findElement(By.cssSelector("#txtuserID")).clear();
	}
	
	

}
