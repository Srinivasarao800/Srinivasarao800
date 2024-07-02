package HyrtutoralIgnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class IgnorTest1 {
	@Ignore
	@Test(enabled=true)   //if declared like this it wont executed because ignore annotation is hving more priority.
	public void Login()
	{
		
		System.out.println("Login to the application..");
				
	}
	@Test
	public void AddItemToCat()
	{
		
		System.out.println("AddItemToCart..");
				
	}
	@Test
	public void MakePayment()
	{
		
		System.out.println("MakePayment..");
				
	}
	@Ignore
	@Test
	public void Logout()
	{
		
		System.out.println("Logut from Application..");
				
	}


}
