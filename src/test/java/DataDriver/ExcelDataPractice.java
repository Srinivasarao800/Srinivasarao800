package DataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataPractice {
	@DataProvider
	public void DataExcel() throws IOException
	{
		//Create the File instance for the Cheking purpose file is Exist or not..
		File f = new File("C:\\Users\\user\\Downloads\\Book1.xlxs");
		f.exists();
		
		//create the instance for the File Reading purpose
		FileInputStream Fip = new FileInputStream(f);
		
		
		//Create the Excel Workbook Instance..
		XSSFWorkbook Wb= new XSSFWorkbook(Fip);
		//Create the Object for the Sheet..
		XSSFSheet sh = Wb.getSheet("Sheet1");
		
		//Get the Number of Rows Count.
		int RowCount = sh.getLastRowNum();
		int ColCount = sh.getRow(0).getLastCellNum();
		
		String[][] data = new String[RowCount-1][ColCount];
		
		for(int k=0;k<RowCount-1;k++)
		{
			for(int m=0; m<ColCount;m++)
			{
				DataFormatter d = new DataFormatter();
				data[k][m]= d.formatCellValue(sh.getRow(k).getCell(m));
			}
		}
		
	}

}
