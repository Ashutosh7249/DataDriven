package DataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("F:\\ocsm12workspace\\Automation\\data\\inputData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.getRow(5);
		Cell c = r.getCell(1);
		String value = c.getStringCellValue();
		System.out.println(value);
	
	}

}
