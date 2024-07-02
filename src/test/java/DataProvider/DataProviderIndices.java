package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIndices {

	@Test(dataProvider="LoginTeestData")
	public void LoginTest(String Logindata)
	{
		System.out.println(Logindata);
	}
	
	@DataProvider(indices= {0})
	public String[] LoginTeestData()
	{
		String[] s = new String[5];
		s[0]="Srinivasarao";
		s[1]="Manikanta";
		s[2]="Rangarao";
		s[3]="Ramarao";
		s[4]="Ravikumar";
		return s;
		
	}
}
