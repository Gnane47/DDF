package com.pom.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDF 
{
	public static void specific_data() throws IOException 
	{
		File f = new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\test cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("testdata");
		Row rowdata = sheet.getRow(23);
		Cell celldata = rowdata.getCell(5);
		CellType cellformat = celldata.getCellType();
		if(cellformat.equals(CellType.STRING))
		{
			String value = celldata.getStringCellValue();
			System.out.println("Username : " +value);
		}
		else if(cellformat.equals(CellType.NUMERIC))
		{
			double numericvalue = celldata.getNumericCellValue();
			int value = (int) numericvalue;
			System.out.println(value);
		}
	}
	public static void alldata() throws IOException 
	{
		File f = new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\test cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int rows_count = sheet.getPhysicalNumberOfRows();
		for (int i=0; i<rows_count; i++)
		{
			Row row = sheet.getRow(i);
			int col_count = row.getPhysicalNumberOfCells();
			for(int j=0; i<col_count; j++)
			{
				Cell celldata = row.getCell(j);
				CellType cellformat = celldata.getCellType();
				if(cellformat.equals(CellType.STRING))
				{
					String value = celldata.getStringCellValue();
					System.out.println(value);
				}
				else if(cellformat.equals(CellType.NUMERIC))
				{
					double numericvalue = celldata.getNumericCellValue();
					int value = (int) numericvalue;
					System.out.println(value);
				}
			}			
		}
	}
	public static void specific_row() throws IOException
	{
		File f = new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\test cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetname = wb.getSheet("testdata");
		int rows = sheetname.getPhysicalNumberOfRows();
		for(int i=0; i<rows; i++)
		{
			Row row = sheetname.getRow(5);
			Cell cell = row.getCell(i);
			CellType celltype = cell.getCellType();
			if(celltype.equals(CellType.STRING))
			{
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if(celltype.equals(CellType.NUMERIC))
			{
				double numericvalue = cell.getNumericCellValue();
				int value = (int) numericvalue;
				System.out.println(value);
			}
		}
	}
	public static void specific_col() throws IOException
	{
		File f = new File("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\test cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetname = wb.getSheet("testdata");
		int rows = sheetname.getPhysicalNumberOfRows();
		for(int i=0; i<rows; i++)
		{
			Row row = sheetname.getRow(i);
			Cell cell = row.getCell(6);
			CellType celltype = cell.getCellType();
			if(celltype.equals(CellType.STRING))
			{
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if(celltype.equals(CellType.NUMERIC))
			{
				double numericvalue = cell.getNumericCellValue();
				int value = (int) numericvalue;
				System.out.println(value);
			}
		}
	}
	public static void main(String[] args) throws IOException 
	{
//		specific_data();
		alldata();
//		specific_row();
//		specific_col();
	}
}
