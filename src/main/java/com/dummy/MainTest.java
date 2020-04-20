package com.dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import com.data.Constants;
import com.data.PropertyLoader;

public class MainTest {
	public static void main(String [] args) throws FileNotFoundException {
		
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
		
		System.out.println(wBook);
		
		
	}
}
