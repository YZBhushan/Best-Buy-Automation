package resonancia.bestbuy.customeutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import resonancia.bestbuy.pages.products.homefurnitureandoffice.home.VacuumCleanersAndFloorCare;

public class DataPrviderClass {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static DataFormatter formatter = new DataFormatter();
	static Object Data[][];

	@DataProvider(name="VacuumCleanersAndFloorCare_DataProvider")
	public static Object[][] VacuumCleanersAndFloorCare_DataProvider_Method() {
		
		try {
			File file= new File("D:\\Selenium\\BBA Products.xlsx");
			FileInputStream fs = new FileInputStream(file);
			ExcelWBook=new XSSFWorkbook(fs);
			ExcelWSheet= ExcelWBook.getSheet("Sheet1");
			int rowcount=ExcelWSheet.getPhysicalNumberOfRows();
			Row=ExcelWSheet.getRow(0);
			Data = new Object[rowcount][Row.getLastCellNum()];
			
			for(int i=0;i<rowcount;i++)
		    {
		    	Row=ExcelWSheet.getRow(i);
		    	for(int j=0;j<Row.getLastCellNum();j++)
		    	{
		    		if(Row==null)
                        Data[i][j]= "";
                    else
                    {
                        Cell= Row.getCell(j);
                        if(Cell==null)
                            Data[i][j]=""; //if it get Null value it pass no data 
                        else
                        {
                            String value=formatter.formatCellValue(Cell);
                            Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
                        }
		    		}
		      	}
		    }	
			} catch (FileNotFoundException e) {
			System.out.println("Unable to find BBA Products file");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Data;	
	}		
	
}


