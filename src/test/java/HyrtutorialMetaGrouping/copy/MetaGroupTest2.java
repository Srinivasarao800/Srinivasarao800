package HyrtutorialMetaGrouping.copy;

import org.testng.annotations.Test;
public class MetaGroupTest2 {
	
	@Test(groups= {"Sanity"})
	public void Login1()
	{
		
		System.out.println("Login to the application1..");
				
	}
	@Test(groups= {"Sanity","Smoke"})
	public void AddItemToCat1()
	{
		
		System.out.println("AddItemToCart1..");
				
	}
	@Test(groups= {"Functional"})
	public void MakePayment1()
	{
		
		System.out.println("MakePayment1..");
				
	}
	@Test(groups= {"Regression"})
	public void Logout1()
	{
		
		System.out.println("Logut1 from Application..");
				
	}

	@Test
	public void Run()
	{
		
		System.out.println("Run Application..");
				
	}

}
