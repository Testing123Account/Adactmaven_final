package com.datadrivenproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excel {
public static void main(String args[]) throws Throwable {
	File f=new File("C:\\DEVI\\eclipse-workspace\\Writeexcel.xlsx");
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb=new XSSFWorkbook();
	Sheet newsheet=wb.createSheet("Excelentry");
	Row createRow=newsheet.createRow(0);
Cell createCell=createRow.createCell(0);
Cell createCell1=createRow.createCell(1);
	
	wb.getSheet("Excelentry").createRow(1);
	wb.getSheet("Excelentry").createRow(2);
	wb.getSheet("Excelentry").createRow(3);
	wb.getSheet("Excelentry").createRow(4);

	createCell.setCellValue("Emp Name");
	
	
	wb.getSheet("Excelentry").getRow(1).createCell(0).setCellValue("Reena");
	wb.getSheet("Excelentry").getRow(2).createCell(0).setCellValue("Rohit");
	wb.getSheet("Excelentry").getRow(3).createCell(0).setCellValue("Rohan");
	wb.getSheet("Excelentry").getRow(4).createCell(0).setCellValue("Riya");
	

	createCell1.setCellValue("Emp ID");
	wb.getSheet("Excelentry").getRow(1).createCell(1).setCellValue("1000");
	wb.getSheet("Excelentry").getRow(2).createCell(1).setCellValue("1001");
	wb.getSheet("Excelentry").getRow(3).createCell(1).setCellValue("1002");
	wb.getSheet("Excelentry").getRow(4).createCell(1).setCellValue("1003");

	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
}	}
