package TestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {

		String ExcelFilePath = "src/test/resources/testData/Shafkat.xlsx";

		FileInputStream fs = new FileInputStream(ExcelFilePath);

		Workbook wb = new XSSFWorkbook(fs);

		fs.close();

		Sheet sheet1 = wb.getSheetAt(0);

		int lastRow = sheet1.getLastRowNum();

		System.out.println("last Row Number == " + lastRow);

		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet1.getRow(i);
			Cell cell = row.createCell(3);

			cell.setCellValue("Hello World");

		}

		FileOutputStream fos = new FileOutputStream(ExcelFilePath);
		wb.write(fos);
		wb.close();
		fos.close();

	}

}
