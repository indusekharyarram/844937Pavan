package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelData {
	public String Username(int a) throws InterruptedException, IOException
	{
		FileInputStream file=new FileInputStream(new File("Excel\\Exceldata.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
	    String un=sheet.getRow(a).getCell(0).getStringCellValue();
	    workbook.close();
		return un;
		}

		public String Password(int b) throws InterruptedException, IOException
	{
			FileInputStream file=new FileInputStream(new File("Excel\\Exceldata.xlsx"));
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheetAt(0);
		    String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
		    workbook.close();
		    return pwd;
	}
	

}
