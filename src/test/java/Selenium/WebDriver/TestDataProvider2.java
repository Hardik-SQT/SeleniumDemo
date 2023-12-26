package Selenium.WebDriver;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider2 {

	@Test
	public void getData() throws IOException {
	
		//Object[][] data = {{"test123", "123"},{"test123456", "123456"}, {"test111", "111"}};
		FileInputStream fis = new FileInputStream("C:\\Users\\Hardik Kalavadiya\\Downloads\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int totalColumn = row.getLastCellNum();
		
		Object[][] data = new Object[rowCount-1][totalColumn];
		
		for(int i = 1; i < rowCount; i++ ) {
			row = sheet.getRow(i);
			for(int j = 0; j< totalColumn; j++) {
				
				System.out.print(row.getCell(j));
				//data[i][j] = row.getCell(j);
			}
			System.out.println();
		}
		
	}
	

}

