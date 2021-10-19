package com.selenium.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataProv {
	
	public static Object[][] testData(String sheetName) throws IOException{


		String path="./Test_Data/TestData1.xlsx";

		File file=new File(path);

		FileInputStream fis=new FileInputStream(file);
		Workbook book =new XSSFWorkbook(fis);

		Sheet sheet=book.getSheet(sheetName);
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(1).getPhysicalNumberOfCells();

		Object[][] data=new Object[row_count-1][col_count];
		for(int row=1;row<=row_count-1;row++){

			for(int col=0;col<=col_count-1;col++) {
				data[row-1][col]=(sheet.getRow(row).getCell(col).getStringCellValue());
			}

		}

		book.close();
       
		return data;
	}

}
