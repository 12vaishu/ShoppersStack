package com.ShoppersStack.GenericUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class file_utility {
	FileInputStream fis;
	public String readDataFromPropertyFile(String key) throws IOException {
		fis=new FileInputStream(FrameWorkConstants.propertyPath);
		Properties pro=new Properties();
		pro.load(fis);
		
		String value = pro.getProperty(key);
		return value;
		
	}
	
	public String readDataFromExcelFile(String sheetName,int row,int cell) throws IOException {
		fis=new FileInputStream(FrameWorkConstants.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}

}



