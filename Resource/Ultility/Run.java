package Ultility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Run {

	public static void main(String[] args) throws IOException
	{
	  FileInputStream fi=new FileInputStream(".\\Testdata\\sample.xlsx");
	  //Apache POI API Based On OPC and OOXML Schemas » 5.2.2
	  Workbook wb=new XSSFWorkbook(fi);
	  Sheet sh=wb.getSheet("cities");
	  Row  rw= sh.getRow(1);
	  Cell c1=rw.getCell(0);
	  System.out.println(c1.getStringCellValue());

	}

}
