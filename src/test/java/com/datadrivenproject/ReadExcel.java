package com.datadrivenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\DEVI\\eclipse-workspace\\Writeexcel.xlsx");
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetread=wb.getSheetAt(0);
	Row row=sheetread.getRow(0);
	Cell c1=row.getCell(0);
	CellType ctype=c1.getCellType();
	
	if(ctype.equals(ctype.STRING)) {
		String stringCellValue=c1.getStringCellValue();
		System.out.println("String Value: "+stringCellValue);
	}
	else if(ctype.equals(ctype.NUMERIC)) {
		double numericCellValue=c1.getNumericCellValue();
		System.out.println("Numeric Value: "+numericCellValue);
	}
	int rowno=sheetread.getPhysicalNumberOfRows();
	System.out.println("Number of Rows:"+rowno);
	
	for (int i = 0; i < rowno; i++) {
		Row row1=sheetread.getRow(i);
		int cell_count=row1.getPhysicalNumberOfCells();
		for (int j = 0; j < cell_count;j++) {
			Cell cell1=row1.getCell(j);
			String stringCellValue=cell1.getStringCellValue();
			System.out.print(stringCellValue+"    ");
			
		}
		System.out.println();
	}
} 
}
