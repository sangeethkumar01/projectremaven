package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

public class Excelupdate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\sange\\workspace sangeeth\\ProjectRetest\\target\\New Microsoft Excel write.xlsx");
		
		FileInputStream f1 = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(f1);
		
		Sheet s = w.getSheet("Data");
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(0);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(0);
				
				int cellType = c.getCellType();
				
				if(cellType==1)
				{
					String value = c.getStringCellValue();
					System.out.println(value);
					if(value.equals("sangeeth"))
					{
						c.setCellValue("kumar");
					}
				}
				FileOutputStream o = new FileOutputStream(f);
				w.write(o);
				System.out.println("done");
			}
			
		}
		
	}

}
