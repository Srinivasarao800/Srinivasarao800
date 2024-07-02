package DataDriver;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception 
	{
		//check the file is Existing in path or not.. by creating the File Instance.
		File excelfile = new File(".//src\\test\\resources\\TestDataExcelRead.xlsx");
		System.out.println(excelfile.exists());
		
		//Reading Data from the Exce File by using the File inputStream.
		FileInputStream file = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());
		
		//Reading Data using forloop..
		int n = sheet.getLastRowNum();
		int m = sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=n; i++)
		{
			for(int k=0;k<m;k++)
			{
				DataFormatter df = new DataFormatter();
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(k)));
				//System.out.println(sheet.getRow(i).getCell(k).getStringCellValue());
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	
		
		
	}
}
