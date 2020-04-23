package com.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	
	String text;
	
	String TEST;
    String FROM;
    String TO;
    String DEPARTURE_DATE;
    String ARRIVAL_DATE;
    int ADULTS;
    int CHILDREN;
	
	public ExcelFile(String text){
		this.text = text;
	}

	public String getText() throws FileNotFoundException {
		
		Workbook wBook = null;
		InputStream file = new FileInputStream(PropertyLoader.getProperty(Constants.DATA_FILE));
		
		try {
			wBook = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet wSheet = wBook.getSheetAt(0);
		
		Row wRow = wSheet.getRow(0);
	
		Cell wCell = wRow.getCell(1);
		
		for (int i = 0; i <= wSheet.getLastRowNum(); i++) {
			
			wRow = wSheet.getRow(i);
			
			for (int j = 0; j <= wRow.getLastCellNum(); j++) {
				wCell = wRow.getCell(j);
				System.out.println(wCell);
			}
		}
		return text;
	}

	/*
	public void setText(String TEST, String FROM, String TO, String DEPARTURE_DATE, String ARRIVAL_DATE, int ADULTS, int CHILDREN) {
		this.TEST = TEST;
		this.FROM = FROM;
		this.TO = TO;
		this.DEPARTURE_DATE = DEPARTURE_DATE;
	}*/

	@Override
	public String toString() {
		try {
			return "ExcelReader [text=" + text + ", getText()=" + getText() + "]";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return text;
	}
	
	
	
}
