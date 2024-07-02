package DataDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PraccticeWebLogin {

	public WebDriver driver;
	@Test(dataProvider="getData", dataProviderClass=ReadDatafromDataprovider.class)
	public void loginMain(String Username,String Password)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://buy.samil.in/");
		//driver.findElement(By.id("txtuserID")).sendKeys("9384359814",Keys.TAB);
		driver.findElement(By.id("txtuserID")).sendKeys(Username);
		//driver.findElement(By.id("txtpassword")).sendKeys("Raji@00",Keys.ENTER);
		driver.findElement(By.id("txtpassword")).sendKeys(Password);

	}
}
