package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//print column
public class PrintColomn {
public static void main(String[] args) throws Throwable {
		File f = new File(
				"C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\src\\com\\Helper\\com\\New Office Document 2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook x = new XSSFWorkbook(fis);
		Sheet shO = x.getSheet("Sheet1");
		int rows = shO.getPhysicalNumberOfRows();		
		for (int i = 0; i < rows; i++) {
			Row row = shO.getRow(i);
			Cell cell = row.getCell(1);
			CellType ct = cell.getCellType();			
			if (ct.equals(ct.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (ct.equals(ct.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();				
				int value= (int) numericCellValue;
				
				System.out.println(value);

			}
			
		}

	}
}
