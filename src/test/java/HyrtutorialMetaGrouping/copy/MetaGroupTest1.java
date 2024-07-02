package HyrtutorialMetaGrouping.copy;

import org.testng.annotations.Test;


public class MetaGroupTest1 {

	@Test(groups= {"Smoke"})   
	public void Login()
	{
		
		System.out.println("Login to the application..");
				
	}
	@Test(groups= {"UnitTest"}) 
	public void AddItemToCat()
	{
		
		System.out.println("AddItemToCart..");
				
	}
	@Test(groups= {"Smoke"})
	public void MakePayment()
	{
		
		System.out.println("MakePayment..");
				
	}

	@Test(groups= {"Smoke","UnitTest"})
	public void Logout()
	{
		
		System.out.println("Logut from Application..");
				
	}


}
