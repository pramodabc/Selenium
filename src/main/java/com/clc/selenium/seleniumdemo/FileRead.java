package com.clc.selenium.seleniumdemo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead 
{
	XSSFWorkbook wbb;
	XSSFSheet sh;
	public FileRead(String Excelpath)
	{
		try {
		File file=new File(Excelpath);
		
		FileInputStream fip=new FileInputStream(file);
		 
		 wbb=new XSSFWorkbook(fip);
		
		
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}
	
	public String getdata(int sheetindex,int row,int coloum)
	{
	     sh=wbb.getSheetAt(sheetindex);
	   String totaldata=sh.getRow(row).getCell(coloum).getStringCellValue();
	     
		return totaldata;
		
	}
	
	
	public int getrowcount(int index)
	{
		
	int row=wbb.getSheetAt(index).getLastRowNum();
	
	  row= row+1;
	  
	  return row;
		
	}
	
	
	
	
	
	
}
