package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public String readData(int row,int column ) throws IOException
	{
 
		String path ="C:\\Users\\Admin\\Desktop\\HRMS_excel.xlsx";
        
		File read = new File(path);
 
		FileInputStream fis = new FileInputStream(read);
 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
 
		XSSFSheet sheet = wb.getSheet("HRMS_EMP_DATA_SHEET");
 
		DataFormatter df = new DataFormatter();
 
		String reading = df.formatCellValue(sheet.getRow(row).getCell(column));
 
		return reading;
 
 
	}

}
