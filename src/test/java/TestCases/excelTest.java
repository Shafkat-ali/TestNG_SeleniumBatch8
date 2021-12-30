package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.util.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.ConstantPaths;

public class excelTest {

	public static void main(String[] args) throws IOException {

		
		// Path of the excel file
		FileInputStream fs = new FileInputStream(ConstantPaths.Path_TestData);
		// Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("1 - " + sheet.getRow(0).getCell(0)); //Name
		System.out.println("2 - " + sheet.getRow(0).getCell(1)); // Username
		System.out.println("2 - " + sheet.getRow(1).getCell(0)); // Ali
		System.out.println("4 - " + sheet.getRow(1).getCell(1)); //Shafkat

		 String cellval = cell.getStringCellValue();
		 System.out.println("5 - " + cellval);
		 

		 
			DataFormatter objDefaultFormat = new DataFormatter();


		 System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
			
	        for (Row row1: sheet) {
	            for(Cell cell1: row1) {
	                String cellValue = objDefaultFormat.formatCellValue(cell1);
	                System.out.print(cellValue + "\t");
	            }
	            System.out.println(" ");
	        }
	        
		 
		 

	}
}
