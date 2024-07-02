package Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case:
--------------
1) Launch the Browser
2) Open the Url
3) Validate the Titleof the Page.
4) Close the Browser.
*/

public class BasicProgram {

	public static void main(String[] args) {
		//1) Launch the Browser
		
		//ChromeDriver driver = new ChromeDriver(); way 1
		
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
		
		
		//4) Close the Browser.
		driver.close();  //it Closes  the Current opned Browser
		driver.quit(); //it Closes  the all opned Browser
		
	}

}
