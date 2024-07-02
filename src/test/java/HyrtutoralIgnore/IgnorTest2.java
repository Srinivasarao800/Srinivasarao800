package HyrtutoralIgnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore   //if we decleared it in class level it wont executed any test method inside in class..
public class IgnorTest2 {
	
	@Test
	public void Login1()
	{
		
		System.out.println("Login to the application1..");
				
	}
	@Test
	public void AddItemToCat1()
	{
		
		System.out.println("AddItemToCart1..");
				
	}
	@Test
	public void MakePayment1()
	{
		
		System.out.println("MakePayment1..");
				
	}
	@Test
	public void Logout1()
	{
		
		System.out.println("Logut1 from Application..");
				
	}


}
