package Day2PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageLocators {
	WebDriver driver;
	
	//Constructor.
	 LoginPageLocators(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	
	//Locators.
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By txt_LoginButton = By.xpath("//button[text()='Login']");
			
	
	//Actions.
	public void setUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password).sendKeys(pwd);
	}
	public void Login()
	{
		driver.findElement(txt_LoginButton).click();
	}
	
	
}
