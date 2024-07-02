package InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdowns {

	WebDriver driver;
	@Test
	public void Dropdown()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		//Handling the Dropdown..
		WebElement s = driver.findElement(By.id("select-demo"));
		Select ele = new Select(s);
		//ele.selectByIndex(1);
		//ele.selectByValue("Tuesday");
		ele.selectByVisibleText("Tuesday");
		

	}
}
