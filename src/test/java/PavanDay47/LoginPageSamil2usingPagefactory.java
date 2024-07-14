package PavanDay47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSamil2usingPagefactory
{
	WebDriver driver;

	//Constructor  --it will intiate the drivers.
	
	LoginPageSamil2usingPagefactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	/*//Locatrs--Locate the elements Using the pagefactory. way1
	@FindBy(id="txtuserID") 
	WebElement txt_userId;
	@FindBy(id="txtpassword") 
	WebElement txt_passWord;
	@FindBy(id="LoginButton")
	WebElement txt_submit;
	@FindBy(tagName ="a")
	List<WebElement> links; */
	
	//Locatrs--Locate the elements Using the pagefactory. way1
		@FindBy(how=How.ID,using="txtuserID") 
		WebElement txt_userId;
		@FindBy(how=How.ID,using="txtpassword") 
		WebElement txt_passWord;
		@FindBy(how=How.ID,using="LoginButton") 
		WebElement txt_submit;
		@FindBy(tagName ="a")
		List<WebElement> links;
	
	//Action Methods--perfomr the actions like click..
	//make all the methods are public because these can be use any where in project.
	
	public void setUserName(String username)
	{
		txt_userId.sendKeys(username);
	}
	public void setUserPassword(String password)
	{
		txt_passWord.sendKeys(password);
	}
	public void clickLogin()
	{
		txt_submit.click();
	}
	
	
}
