package DataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExcelDataprovider 
{

	public static void main(String[] args) throws Exception 
	{
		//check the file is Existing in path or not.. by creating the File Instance.
		File excelfile = new File(".//src\\test\\resources\\TestDataExcelRead.xlsx");
		System.out.println(excelfile.exists());
		
		//Reading Data from the Exce File by using the File inputStream.
		FileInputStream file = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows());//including header line
		System.out.println(sheet.getLastRowNum());//Ex-cluding header line
		
		//Reading Data using forloop..
		int n = sheet.getLastRowNum();
		int m = sheet.getRow(0).getLastCellNum();
		
		String [][] data = new String[n][m];
		for(int i=0;i<=n-1; i++)
		{
			for(int k=0;k<m;k++)
			{
				DataFormatter df = new DataFormatter();
				//System.out.print(df.formatCellValue(sheet.getRow(i).getCell(k))+"\t");
				//System.out.println(sheet.getRow(i).getCell(k).getStringCellValue());
				data[i][k]=df.formatCellValue(sheet.getRow(i+1).getCell(k));
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	
		for(String[] dataArray:data)
		{
			System.out.println(Arrays.toString(dataArray));
		}
		
		
	}
}
