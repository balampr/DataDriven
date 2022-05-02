package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DATA {
public static void main(String[] args) throws IOException {
	// to locate a file
	File f = new File("F:\\Maven\\DATADRIVEN\\External\\TESTDATA.xlsx");
	// to read a file
	FileInputStream fin = new FileInputStream(f);
	// workbook- interface
	Workbook book = new XSSFWorkbook(fin);
	// to fetch a sheet
	Sheet sh = book.getSheet("information");
	// to fetch a total no of rows
	int rows = sh.getPhysicalNumberOfRows();
	System.out.println("total no of rows "+rows);
	// to fetch a total no of cells
	Row r = sh.getRow(1);
	int cells = r.getPhysicalNumberOfCells();
	System.out.println("total no of cells "+cells);
	// to fetch particular cell
	Row ro = sh.getRow(0);
	Cell c = ro.getCell(0);
	Cell c1 = ro.getCell(1);
	System.out.println(c+" "+c1);
	// to fetch all data
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row row = sh.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.err.println(cell);
			
		}
		
	}
	
	
	
	
}
}

