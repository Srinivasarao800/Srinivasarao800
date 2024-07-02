package Hytutorial;

import org.testng.annotations.Test;

public class PrioritizationOrder {
	/*
	 * without prioritizaion  output islike this
	 * 	AddItemToCat..
		Login to the application..
		Logout from Application..
		MakePayment..
	 * 
	 * 
	 * without prioritizaion  output islike this
	 * Login to the application..
		AddItemToCat..
		MakePayment..
		Logut from Application..
	 * */
	
	@Test(priority=-1)
	public void Login()
	{
		
		System.out.println("Login to the application..");
				
	}
	@Test
	public void AddItemToCat()
	{
		
		System.out.println("AddItemToCat..");
				
	}
	@Test(priority=2)
	public void MakePayment()
	{
		
		System.out.println("MakePayment..");
				
	}
	@Test(priority=3)
	public void Logout()
	{
		
		System.out.println("Logut from Application..");
				
	}

}
