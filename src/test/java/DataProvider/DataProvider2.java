package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider2 
{

	/*
	 * Dataprovider is mandatory return type like Twodemensional arry  like Object[][]----ANS:NO
	 * Data provider having the diffrent return types like:
	 * Single Demnsional Array Object[]
	 * Multiple Demnsional Arry Object[][]
	 * Iterator<Object[]>
	 * Itrerarior<Object>
	 * 
	 * we can user other data types also insted of the object but Object is Super Class for all so We will use it for the better understand.
	 * 
	 */
	
	@Test(dataProvider="LoginData")
	public void TestLogin(String username)
	{
		System.out.println(username);
	}
	/*
	//Way 1 Declearation.. of Single Demnsional Array...
	@DataProvider()
	public String[] LoginData()
	{
		String[] s = new String[2];
		s[0]="Srinu";
		s[1]="Srinivasaarao";
		return s;
	}*/
	
	//Way 2 Declearation..
		@DataProvider()
		public String[] LoginData()
		{
			String[] s = new String[] 
					{
			"Srinu",
			"Srinivasaarao"};
			return s;
		}
		
}
