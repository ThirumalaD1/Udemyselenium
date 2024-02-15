package day30;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata {
public static void main(String[] args) throws IOException {
	
FileInputStream file = new FileInputStream("C:\\Users\\justi\\eclipse-workspace\\Udemyselenium\\src\\test\\resources\\screenshot\\Testdata.xlsx");
XSSFWorkbook book = new XSSFWorkbook(file);
XSSFSheet sheet = book.getSheet("Sheet1");
int rowco = sheet.getLastRowNum();
short col = sheet.getRow(0).getLastCellNum();

for (int r = 0; r <= rowco; r++) {
	for (int c = 0; c < col; c++) {
		XSSFCell value = sheet.getRow(r).getCell(c);
		System.out.print(value+"  ");
	}
	System.out.println();
}

}
}
