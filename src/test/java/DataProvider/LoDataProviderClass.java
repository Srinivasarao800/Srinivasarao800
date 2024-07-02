package DataProvider;

import org.testng.annotations.DataProvider;

public class LoDataProviderClass {

	@DataProvider(indices= {0})
	public String[] LoData()
	{
		String[] a = new String[2];
		a[0]="RRR";
		a[1]="ASVR";
		return a;
		
	}
}
