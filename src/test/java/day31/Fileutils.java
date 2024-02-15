package day31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fileutils {

	public static FileInputStream file;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		
	
	}
	
	public static int rowcount(String xlfile, String xlsheet) throws IOException {
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		sheet=wb.getSheet(xlsheet);
		int rowcount=sheet.getLastRowNum();
		wb.close();
		file.close();
		return rowcount;	
		
		
	}
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		sheet=wb.getSheet(xlsheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
		wb.close();
		file.close();
		fo.close();
				
	}


	public static String getdata(String xlfile,String xlsheet, int xlrow,int cellv ) throws IOException {
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(xlfile);
		sheet=wb.getSheet(xlsheet);
		row=sheet.getRow(xlrow);
		cell=row.getCell(cellv);
		
		String data;
		
		try {
			DataFormatter formatter = new DataFormatter();
			data=formatter.formatCellValue(cell);
			return data;
		} catch (Exception e) {
			data="";
		}
	wb.close();
	file.close();
	return data;
		
	}
	
}
