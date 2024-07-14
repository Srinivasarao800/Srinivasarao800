package PavanDay47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageSamil
{
	WebDriver driver;

	//Constructor  --it will intiate the drivers.
	
	LoginPageSamil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locatrs--Locate the elements
	
	By txt_userId = By.id("txtuserID");
	By txt_passWord = By.id("txtpassword");
	By txt_submit = By.id("LoginButton");
	
	
	//Action Methods--perfomr the actions like click..
	//make all the methods are public because these can be use any where in project.
	public void setUserName(String username)
	{
		driver.findElement(txt_userId).sendKeys(username);
	}
	public void setUserPassword(String password)
	{
		driver.findElement(txt_passWord).sendKeys(password);
	}
	public void clickLogin()
	{
		driver.findElement(txt_submit).click();
	}
	
	
}
