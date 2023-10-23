package DataDriven;

import org.openqa.selenium.By;

public class ValidLoginTest extends BaseTest{
	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();
		
		FileLib flib=new FileLib();
		String un = flib.getcellData(".\\data\\inputData.xlsx", "ValidTest", 1, 0);
		String pwd = flib.getcellData(".\\data\\inputData.xlsx", "ValidTest", 1, 1);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submit")).click();
		
		bt.CloseBrowser();
	    
	}

}
