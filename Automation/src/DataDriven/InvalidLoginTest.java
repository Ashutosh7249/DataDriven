package DataDriven;

import org.openqa.selenium.By;

public class InvalidLoginTest extends BaseTest{
      public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();
		
		FileLib flib=new FileLib();
		int rc = flib.getRowCount(".\\data\\inputData.xlsx", "invaliddata");
		for(int i=1;i<=rc;i++)
		{
		String un = flib.getcellData(".\\data\\inputData.xlsx", "invaliddata", i, 0);
		System.out.println(un);	
		String pwd = flib.getcellData(".\\data\\inputData.xlsx", "invaliddata", i, 1);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
	}
      }
}
