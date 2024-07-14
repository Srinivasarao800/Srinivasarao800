package Day1Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	public WebDriver driver;
	@Test
	public void AlertMessage() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		
		//Clicking on the Alert which is prompt alert and Accepting.
		driver.findElement(By.xpath("//*[@class='btn btn-primary'][text()='Alert']")).click();
	
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
