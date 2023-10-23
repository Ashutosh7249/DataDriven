package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String getcellData(String exceldata,String sheet,int row , int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(exceldata);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}
	public int getRowCount(String exceldata,String sheet) throws Throwable, IOException
	{
	 FileInputStream fis = new FileInputStream(exceldata);
	 Workbook wb=WorkbookFactory.create(fis);
	 int rc=wb.getSheet(sheet).getLastRowNum();
	 return rc;
	 
	}
	public void setCellData(String path ,String sheetName ,int row ,int cell ,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
	}
	

}
