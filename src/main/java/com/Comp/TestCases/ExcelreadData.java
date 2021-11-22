package com.Comp.TestCases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelreadData {
	static XSSFWorkbook work;
	static XSSFSheet sheet;

	public static void main(String[] args) {
	}

	public ExcelreadData(String excelPath, String Sheetname) {
		try {
			work = new XSSFWorkbook(new FileInputStream(excelPath));
			sheet = work.getSheet(Sheetname);
		} catch (Exception exp) {
			exp.getStackTrace();
		}
	}

	public static Object getData(int rowNum, int colNum) {
		String searchValue = "";
		try {
			searchValue = sheet.getRow(rowNum).getCell(colNum).toString();
			System.out.println(searchValue);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return searchValue;
	}

}
