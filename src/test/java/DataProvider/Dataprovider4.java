package DataProvider;

import org.testng.annotations.Test;

public class Dataprovider4 {

	
	/*
	 * can we saparate the dataprovider  in Saparate Class and can we use it?
	 * ANS:YES We can.
	 */
	@Test(dataProvider="LoData",dataProviderClass=LoDataProviderClass.class)
	public void  Ldata(String LName)
	{
		System.out.println(LName);
	}
}
