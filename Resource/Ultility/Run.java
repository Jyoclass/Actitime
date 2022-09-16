package Ultility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Run {

	public static void main(String[] args) throws IOException
	{
	  FileInputStream fi=new FileInputStream(".\\Testdata\\customer.xlsx");
	  Workbook wb=new XSSFWorkbook(fi);
	  Sheet sh=wb.getSheet("custinfo");	  
	  System.out.println(sh.getRow(0).getLastCellNum());
	
	}

}
