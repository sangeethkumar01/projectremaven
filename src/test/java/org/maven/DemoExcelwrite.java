package org.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcelwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File f = new File("C:\\Users\\sange\\workspace sangeeth\\ProjectRetest\\target\\New Microsoft Excel write.xlsx");
	
	Workbook w = new XSSFWorkbook();
	
	Sheet s = w.createSheet("Data");
	
	Row r = s.createRow(0);
	
	Cell c = r.createCell(0);
	
	c.setCellValue("sangeeth");
	
	FileOutputStream o = new FileOutputStream(f);
	w.write(o);
	
	System.out.println("done");
	
	}

}
