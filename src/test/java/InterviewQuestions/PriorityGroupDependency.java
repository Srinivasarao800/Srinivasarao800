package InterviewQuestions;

import org.testng.annotations.Test;

public class PriorityGroupDependency {
	
	@Test
	public void LaunchBrowser()
	{
		int n = 7/0;
		System.out.println("Browser Launched Successfully, proceed withe the Login.");
		
	}
	
	@Test(priority=1,dependsOnMethods= {"LaunchBrowser"})
	public void Login()
	{
		System.out.println("Login to the Application Successfully, prooced the Item added to "
				+ "Cart");
		
	}

	@Test(priority=2,groups= {"Smoke1111"})
	public void Cart()
	{
		System.out.println("Items Added Successfully, proceed payment..");
	}
	
	@Test(priority=3,dependsOnGroups= {"Smoke1111"})
	public void payment()
	{
		System.out.println("Paid Successfully..");
	}
}

