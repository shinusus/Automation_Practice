package com.Automationpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) {
		
	}
	public static void alldata() throws IOException {
		File f=new File("C:\\Users\\Windows\\eclipse-workspace\\Automationpractice\\TestBook1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j <physicalNumberOfCells ; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int l=(int)numericCellValue;
					System.out.println(l);
				}
				
					alldata();
				}
				
				
				
			}
			
		}

	}



