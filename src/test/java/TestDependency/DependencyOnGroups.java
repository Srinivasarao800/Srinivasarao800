package TestDependency;

import org.testng.annotations.Test;

public class DependencyOnGroups {

	
	@Test(groups= "Smokee")
	public void Test1()
	{
		System.out.println("Smoke Group Test1");
	}
	@Test(groups= "Smokee")
	public void Test2()
	{
		System.out.println("Smoke Group Test2");
	}
	@Test(groups= "Smokee")
	public void Test3()
	{
		System.out.println("Smoke Group Test3");
	}
	@Test(groups= "Sanityy")
	public void Test4()
	{
		System.out.println("Sanity Group Test4");
	}
	
	@Test(dependsOnGroups= "Smokee")
	public void Test()
	{
		System.out.println("Smoke Group Test0");
	}
}
