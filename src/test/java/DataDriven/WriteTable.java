package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTable {public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\SureshPrasanth\\eclipse-workspace\\Selenium\\src\\com\\Helper\\com\\New Office Document 2.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook x = new XSSFWorkbook(fis);
	Sheet sheet = x.getSheet("IPL");
	Row createRow = sheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Date");
	x.getSheet("IPL").getRow(0).createCell(1).setCellValue("Team1");
	x.getSheet("IPL").getRow(0).createCell(2).setCellValue("Team2");
	
	x.getSheet("IPL").createRow(1).createCell(0).setCellValue("23/09/21");
	x.getSheet("IPL").getRow(1).createCell(1).setCellValue("MI");
	x.getSheet("IPL").getRow(1).createCell(2).setCellValue("KKR");
	
	x.getSheet("IPL").createRow(2).createCell(0).setCellValue("24/09/21");
	x.getSheet("IPL").getRow(2).createCell(1).setCellValue("RCB");
	x.getSheet("IPL").getRow(2).createCell(2).setCellValue("CSK");
	
	x.getSheet("IPL").createRow(3).createCell(0).setCellValue("25/09/21");
	x.getSheet("IPL").getRow(3).createCell(1).setCellValue("DC");
	x.getSheet("IPL").getRow(3).createCell(2).setCellValue("RR");
	
	x.getSheet("IPL").createRow(4).createCell(0).setCellValue("25/09/21");
	x.getSheet("IPL").getRow(4).createCell(1).setCellValue("SRH");
	x.getSheet("IPL").getRow(4).createCell(2).setCellValue("PBKS");
	
	x.getSheet("IPL").createRow(5).createCell(0).setCellValue("26/09/21");
	x.getSheet("IPL").getRow(5).createCell(1).setCellValue("CSK");
	x.getSheet("IPL").getRow(5).createCell(2).setCellValue("KKR");	
	FileOutputStream fos = new FileOutputStream(f);
	x.write(fos);
	x.close();	
	System.out.println("Table Entered Successfuly");

}
}