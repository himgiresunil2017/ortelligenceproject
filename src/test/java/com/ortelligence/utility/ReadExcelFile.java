package com.ortelligence.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcelFile {
	File file ;
	FileInputStream fis;
	Workbook wb ;
	
	public ReadExcelFile (){
		
		 file = new File("./test/resources/testdata.xls");
		
		try {
			  fis = new FileInputStream(file);
			   wb = Workbook.getWorkbook(fis);
		} 
		
		catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}
	
	public Object [][] excelData() throws Exception{
		Sheet excelSheet =wb.getSheet("Sheet1");
		int rows =excelSheet.getRows();
		int col = excelSheet.getColumns();
		
		String TestData[][] = new String[rows-1][col];
		
		int count = 0;
		
		for(int i =1;i<rows ; i++){
			for(int j = 0;j<col;j++ ){
				
				Cell excecell = excelSheet.getCell(j, i);
				
				TestData[count][j]= excecell.getContents();
			}
			count ++;
			
			
		}
			fis.close();
			
		
		return TestData;
		
	}
		
		
	}
	


