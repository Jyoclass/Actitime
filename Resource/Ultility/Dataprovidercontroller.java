package Ultility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataprovidercontroller
{
	static  FileInputStream fi;
	static  Workbook wb;
	static  Sheet sh;
	static  Row  rw;
	static Cell c;
	
public static	Object[][] Customer_DC() throws IOException
	{
		fi=new FileInputStream(".\\Testdata\\customer.xlsx");
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet("custinfo");
		DataFormatter df=new DataFormatter();
		Object[][] obj=new Object[sh.getLastRowNum()-1][sh.getRow(0).getLastCellNum()];
		for(int i=1;i<=obj.length;i++) //1-3
		{
			for(int j=0;j<=obj[0].length-1;j++) //0-1 
			{
				obj[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
						
			}	       
		}
		
		return obj;
	}
		
public static	Object[][] deletecustomer_DC() throws IOException
{
	fi=new FileInputStream(".\\Testdata\\customer.xlsx");
	wb=new XSSFWorkbook(fi);
	sh=wb.getSheet("deletecust");
	DataFormatter df=new DataFormatter();
	Object[][] obj=new Object[sh.getLastRowNum()-1][sh.getRow(0).getLastCellNum()];
	for(int i=1;i<=obj.length;i++) //1-3
	{
		for(int j=0;j<=obj[0].length-1;j++) //0-1 
		{
			obj[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
					
		}	       
	}
	
	return obj;
}






		
		
	}
	
	

