package DataDriver;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class PracticeDataprovider1 {

	@DataProvider
	public String[][] registerData() throws Exception
	{
		
		//create the File Instance to Check File Exist in Location or not.
		File f = new File(".//src\\\\test\\\\resources\\\\TestDataExcelRead.xlsx");
		System.out.println(f.exists());
		
		//Reding data from Excel for this we have to user the FileInputStream.
		FileInputStream Ip = new FileInputStream(f);
		XSSFWorkbook Wb = new XSSFWorkbook(Ip);
		XSSFSheet St = Wb.getSheet("Sheet1");
		
		//Read the nuber of Rows and Cells.
		int RowNum = St.getLastRowNum(); 
		int ColumnNum = St.getRow(0).getLastCellNum();
		
		String[][] data  = new String[RowNum-1][ColumnNum];
		
		for(int i=0;i<RowNum-1; i++)
		{
			for(int j=0;j<ColumnNum; j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j]=df.formatCellValue(St.getRow(i).getCell(j));
			}
			
		}
		
		
		return data;
		
	}
}
