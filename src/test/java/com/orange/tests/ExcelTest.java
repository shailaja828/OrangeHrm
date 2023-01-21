package com.orange.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ExcelTest {
	
	@DataProvider()
	public String[][] getDataFromExcel() throws IOException {

		File excelFilePath = new File("./leave/data.xlsx");
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColoumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noOfRows - 1][noOfColoumns];
		for (int i = 0; i < noOfRows - 1; i++) {
			for (int j = 0; j < noOfColoumns; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		workbook.close();
		inputstream.close();
		for (String[] dataArr : data) {
			System.out.println(Arrays.toString(dataArr));
		}
		return data;
	}
}
