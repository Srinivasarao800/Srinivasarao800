package InterviewQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDatapractise {
	
	WebDriver driver;
	
	@Test
	public void  ExcelData() throws IOException
	{
		/*
		 * WebDriverManager.chromiumdriver().setup();
		 * 
		 * driver = new ChromeDriver();
		 */
		//Check file is Exist in pathe or not.
		
		File F = new File("C:\\Users\\user\\Downloads\\ExcelData.xlsx");
		System.out.println(F.exists());
		
		
		FileInputStream Ipf = new FileInputStream(F);
		
		XSSFWorkbook Wb = new XSSFWorkbook(Ipf);
		XSSFSheet Ws  = Wb.getSheet("Sheet1");
		int RowCount = Ws.getPhysicalNumberOfRows();
		int ClomunCount = Ws.getRow(0).getLastCellNum();
		System.out.println(RowCount +" " +" "+ ClomunCount);
		
		//Reading data from Excel.
		int R = Ws.getLastRowNum();
		int C = Ws.getRow(0).getLastCellNum();
		
		String[][] d = new String[R][C];
		for(int i=0 ; i<=R-1; i++)
		{
			for(int k=0;k<C;k++)
			{
				DataFormatter df = new DataFormatter();
				
				System.out.println(df.formatCellValue(Ws.getRow(i).getCell(k))+"\t");
			}
			
		}
		
	}
}
