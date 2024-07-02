package Hytutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	/*
	 * execuion Order
	   	@BeforeSuite
		@BeforeTest
		@BeforeClass
		@BeforeMethod
		@Test
		@AfterMethod
		@AfterClass
		@AfterTest
	 
	 */
	
	//PerConditions statring with the @before
	@BeforeSuite
	public void setUp()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("@BeforeMethod");
	}
	@BeforeTest
	public void Login()
	{
		System.out.println("@BeforeTest");
	}
	
	//Starting with the @Test are the Test Cases.
	@Test
	public void pageTileTest()
	{
		System.out.println("@Test");
	}
	
	//PostConditions statring with the @After
	@AfterMethod
	public void logout()
	{
		System.out.println("@AfterMethod");
	}
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("@AfterTest");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("@AfterClass");
	}
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("@AfterSuite");
	}

}
