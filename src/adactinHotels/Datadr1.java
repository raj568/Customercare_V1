package adactinHotels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadr1 {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
FileInputStream fi=new FileInputStream("C:\\Users\\Nitu_Diku\\Desktop\\faxl.xlsx");
           Workbook wb=Workbook.getWorkbook(fi);
           Sheet s=wb.getSheet(0);
          System.out.println(s.getCell(0,0).getContents()  );
          
		for(int i=1;i<s.getRows();i++) {
		 String p1;
		p1= s.getCell(1,i).getContents();
		System.out.println(p1);
		}
          
           
	

}
}
