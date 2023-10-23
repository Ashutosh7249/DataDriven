package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("F:\\ocsm12workspace\\Automation\\data\\inputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("sheet1").getRow(0).createCell(2).setCellValue("Go Corona");
		
		FileOutputStream fos = new FileOutputStream("F:\\ocsm12workspace\\Automation\\data\\inputData.xlsx");
		wb.write(fos);
		System.out.println("Wrtten Succesfully");
	}

}
