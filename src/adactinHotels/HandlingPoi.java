package adactinHotels;


public class HandlingPoi {

	public static void main(String[] args) {
		
		//Xls_Reader read=new Xls_Reader("C:\\webdriverkit\\workspace2\\optproject\\src\\excelfiles\\faxl.xlsx");
		Xls_Reader read=new Xls_Reader("C:\\webdriverkit\\workspace2\\optproject\\src\\excelfiles\\faxl.xlsx");
		String p1=read.getCellData("Consolidated", "Program Name(Naga List)", 2);
		System.out.println(p1);
		
		System.out.println("Rajani boddu"+read.getRowCount("Consolidated"));
		for(int i=2;i<read.getRowCount("Consolidated");i++)
		{
			System.out.println(read.getCellData("Consolidated","Program Name(Naga List)",i));
			
		}
		}
	}


