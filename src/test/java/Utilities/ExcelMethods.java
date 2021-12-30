package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;

public class ExcelMethods extends PageInitializer {

	private static XSSFWorkbook excelWBook; // Excel WorkBook
	private static XSSFSheet excelWSheet; // Excel Sheet
	private static XSSFCell cell; // Excel cell
	private static XSSFRow row; // Excel row

	public static int rowNumber; // Row Number
	public static int columnNumber; // Column Number

//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			excelWBook = new XSSFWorkbook(ExcelFile);

			excelWSheet = excelWBook.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}

//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			cell = excelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "nothing";

		}

	}

	// This method is to set the File path and to open the Excel file, Pass
	// Sheetname as Argument to this method

	public static void setExcelFileSheet(String sheetName) throws IOException {

		// MAC or Windows Selection for excel path
		if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
			ConstantPaths.testDataExcelPath = ConstantPaths.currentDir + "/src/test/resources/testData/";
		} else if (Platform.getCurrent().toString().contains("WIN")) {
			ConstantPaths.testDataExcelPath = ConstantPaths.currentDir + "\\src\\test\\resources\\testData";
		}

		// Open the Excel file
		FileInputStream ExcelFile = new FileInputStream(
				ConstantPaths.testDataExcelPath + ConstantPaths.QA_ENV_TestData);
		excelWBook = new XSSFWorkbook(ExcelFile);
		excelWSheet = excelWBook.getSheet(sheetName);
	}
	
	

	// This method reads the test data from the Excel cell.
	// We are passing row number and column number as parameters.
	public static String getCellData2(int RowNum, int ColNum) {
		cell = excelWSheet.getRow(RowNum).getCell(ColNum);
		DataFormatter formatter = new DataFormatter();
		return formatter.formatCellValue(cell);
	}

	// This method takes row number as a parameter and returns the data of given row
	// number.
	public static XSSFRow getRowData(int RowNum) {
		row = excelWSheet.getRow(RowNum);
		return row;
	}

	
	
	//this methods depends
	public static void getWholeRowData(int RowNum) {

		int rowNumber = getRowData(RowNum).getPhysicalNumberOfCells();

		for (int i = 0; i < rowNumber; i++) {

			System.out.println(getRowData(RowNum).getCell(i));

		}

	}
	
	

	// This method gets excel file, row and column number and set a value to the
	// that cell.
	public static void setCellData(String value, int RowNum, int ColNum) throws IOException {
		
		
		
		row = excelWSheet.getRow(RowNum);
		cell = row.getCell(ColNum);
		
		
		System.out.println(cell.equals(null));
		
		
		
		
		if (cell == null) {
			cell = row.createCell(ColNum);
			cell.setCellValue(value);
		} else {
			cell.setCellValue(value);
		}
		
		// Constant variables Test Data path and Test Data file name
		

		FileOutputStream fileOut = new FileOutputStream(
				ConstantPaths.testDataExcelPath + ConstantPaths.QA_ENV_TestData);
		excelWBook.write(fileOut);
		

		fileOut.flush();
		fileOut.close();
	}
	
	
	
	
	
	
	
	
	

}
