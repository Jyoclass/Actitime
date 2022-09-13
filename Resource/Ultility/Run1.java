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

class Run1
{
    public static void main(String args[]) throws IOException
	{
    	  FileInputStream fi=new FileInputStream(".\\Testdata\\sample.xlsx");
    	  Workbook wb=new XSSFWorkbook(fi);
    	Sheet sh=wb.getSheet("cities");	  
  	  Row  rw= sh.getRow(0);
  	  Cell c1=rw.createCell(0);
  	  c1.setCellType(CellType.STRING);
  	  c1.setCellValue("INDIA");
  	  FileOutputStream fo=new FileOutputStream(".\\Testdata\\sample.xlsx");
  	  wb.write(fo);
  	  fo.flush();
  	  wb.close();
  	  fo.close();
  	  fi.close();
	}

}
/*
 
	 
 
 */


