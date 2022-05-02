package org.Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TT1 {
public static void main(String[] args) throws IOException {
	// locate a file
	File f = new File("F:\\Maven\\DATADRIVEN\\External\\TT1.xlsx");
	// read a file
	FileInputStream fi = new FileInputStream(f);
	// workbook 
	Workbook book = new XSSFWorkbook(fi);
	//get a sheet
	Sheet sh = book.getSheet("course");
	// get total no of rows
	int row = sh.getPhysicalNumberOfRows();
	System.out.println("total no of rows "+ row);
	// get a total no of cells
	 Row r = sh.getRow(1);
	 int cells = r.getPhysicalNumberOfCells();
	 System.out.println("total no of cells "+cells);
	 // insert a row and cell
	 Row createRow = sh.createRow(11);
	 Cell c = createRow.createCell(0);
	 Cell c1 = createRow.createCell(1);
	 c.setCellValue("priyanka");
	 c1.setCellValue("ms Structural Engineering");
	 
	 FileOutputStream fo = new FileOutputStream(f);
	 book.write(fo); 
	 
	 
	
}

}
