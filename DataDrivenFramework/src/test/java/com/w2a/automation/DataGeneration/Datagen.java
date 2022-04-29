package com.w2a.automation.DataGeneration;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.w2a.automation.excel.Utilities.Xls_Reader;
import com.w2automation.base.Base;

public class Datagen extends Base {

	
		
		

	@DataProvider(name="dp1")
	public static Object[][] getData(Method m)
	{
		
		String SheetName = m.getName();
		//String SheetName="login";
		int rows=excel.getRowCount(SheetName);
		int cols=excel.getColumnCount(SheetName);
		
		
		Object[][] data=new Object[rows-1][1];
		Hashtable<String,String> table=null;
		 for(int rowNum=2;rowNum<=rows;rowNum++)
		 {
			 table=new Hashtable<String, String>();
			 for(int colNum=0;colNum<cols;colNum++)
			 {
				 //data[rowNum-2][colNum]=excel.getCellData(SheetName, colNum, rowNum);
				 table.put(excel.getCellData(SheetName, colNum, 1), excel.getCellData(SheetName, colNum, rowNum));
				 data[rowNum-2][0]=table;
			 }
		 }
		
		
	return data;		
		
	
	}

	
	
	
}
