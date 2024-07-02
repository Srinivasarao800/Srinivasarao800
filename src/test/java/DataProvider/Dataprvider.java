package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprvider {
	
	WebDriver driver;
	//@Test(dataProvider="ValidLoginTest")  ---Way 1 by passing the Dataprovider Annotation name
	@Test(dataProvider="LoginValidData")        //Way 2 by passing  method name
	public void LoginSamil(String Username,String Password) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.orangehrm.com/en/contact-sales/");

		
		//driver.findElement(By.id("txtuserID")).sendKeys("9384359814",Keys.TAB);
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys(Username);
		Thread.sleep(2000);
		//driver.findElement(By.id("txtpassword")).sendKeys("Raji@00",Keys.ENTER);
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys(Password);
		
		
	}
	
	
	//@DataProvider(name="ValidLoginTest") ---with name 
	@DataProvider(parallel=true) //Without name
	public Object[][] LoginValidData() 
	{
		Object[][] data = new Object[2][2];
		data[0][0]="9384359814";
		data[0][1]= "Raji@800";
		
		
		data[1][0]="9384359814";
		data[1][1]= "Rajii@800";
		
		
		
		return data;
		
	}
	

}
