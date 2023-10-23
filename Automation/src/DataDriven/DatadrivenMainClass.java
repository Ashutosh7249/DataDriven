package DataDriven;
public class DatadrivenMainClass {

	public static void main(String[] args) throws Throwable {
               FileLib flib = new FileLib();
//          flib.setCellData(".\\data\\inputData.xlsx", "sheet1",6 , 2,"Succes");
//         
         
                  int rc = flib.getRowCount(".\\data\\inputData.xlsx", "sheet1");
         System.out.println(rc);
         for(int i=0;i<=rc;i++)
         {
        String value = flib.getcellData(".\\data\\inputData.xlsx", "sheet1",i , 0);
        System.out.println(value);
         }
	}
}
