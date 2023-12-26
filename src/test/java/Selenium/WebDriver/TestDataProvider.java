package Selenium.WebDriver;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider {


	
	@Test(dataProvider="TestData")
	public void testcaseData(String testcase, String data1, String data2, String data3) {
		System.out.println(testcase + data1 +data2 +data3 );
	}
	
	@DataProvider(name="TestData")
	public Object[][] getData() throws IOException {
	
		//Object[][] data = {{"test123", "123"},{"test123456", "123456"}, {"test111", "111"}};
		FileInputStream fis = new FileInputStream("C:\\Users\\Hardik Kalavadiya\\Downloads\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int totalColumn = row.getLastCellNum();
		
		Object[][] data = new Object[rowCount-1][totalColumn];
		
		for(int i = 0; i < rowCount-1; i++ ) {
			row = sheet.getRow(i+1);
			for(int j = 0; j< totalColumn; j++) {
				
				data[i][j] = row.getCell(j).getStringCellValue();
			}
		}
		
		return data;
	}
	

}

