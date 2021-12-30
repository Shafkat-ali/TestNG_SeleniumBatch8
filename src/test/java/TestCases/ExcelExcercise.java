package TestCases;

import Utilities.ConstantPaths;
import Utilities.ExcelMethods;

public class ExcelExcercise {

	public static void main(String[] args) throws Exception {

		ExcelMethods.setExcelFileSheet("Sheet2");

		// System.out.println(ExcelMethods.getCellData(0, 0));
//		ExcelMethods.getRowData(0);
		ExcelMethods.getWholeRowData(2);
		
		
		ExcelMethods.setCellData("Hello TechCircle Cohort", 0, 1);

	}
}