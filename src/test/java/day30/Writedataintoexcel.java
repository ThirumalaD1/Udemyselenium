package day30;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedataintoexcel {
public static void main(String[] args) throws IOException  {
	FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshot\\opl3.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet();
	XSSFRow row = sheet.createRow(0);

	row.createCell(0).setCellValue("Thiru");
	row.createCell(1).setCellValue("Dhana");
	row.createCell(2).setCellValue("Lakshmi");
	
	XSSFRow row1 = sheet.createRow(1);
	row1.createCell(0).setCellValue("pencil");
	row1.createCell(1).setCellValue("Eraser");
	row1.createCell(2).setCellValue("Boomer");
	
	
/*	for (int r = 0; r <=2; r++) {
		XSSFRow currentrow = sheet.createRow(r);
		for (int c = 0; c<3; c++) {
		currentrow.createCell(c).setCellValue("Welcome");	
		}
		
		
	}
	
*/	
	
	
	wb.write(file);
	wb.close();
	file.close();
	
	
}
}
