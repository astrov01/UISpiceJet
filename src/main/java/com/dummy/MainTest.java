package com.dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.apache.poi.ss.usermodel.Sheet;

import com.data.Constants;
import com.data.PropertyLoader;
import com.data.excel.ExcelReader;
import com.data.util.DataParser;
import com.vo.FlightDescription;
import com.data.ExcelFile;

public class MainTest {
	public static void main(String [] args) throws IOException {
		
		/*
		ExcelFile excelfile = new ExcelFile(null);
		
		//excelfile.getText();
		
		excelfile.toString();
		
		*/
		
		/*
		JSONArray array = new JSONArray();
		JSONObject object = new JSONObject();
		JSONObject object2 = new JSONObject();
		
		object.put("Llave", "Value");
		object.put("Llave 2", "Value 2");
		
		object2.put("Llave Object 2", "Valor Object 2");
		
		array.put(object2);
		
		array.put(object);
		
		System.out.println(array.toString(1));
		
		*/
		
		Workbook wBook = null;
		InputStream file = new FileInputStream(PropertyLoader.getProperty(Constants.DATA_FILE));
			wBook = new XSSFWorkbook(file);
			
			Sheet wSheet = wBook.getSheetAt(0);
			
			for (int i = 0; i < wSheet.getLastRowNum(); i++) {
				String json = ExcelReader.getDataInJsonFormat(wSheet);
				
				List<FlightDescription> lista = DataParser.parseJson(json, FlightDescription.class);
			
				System.out.println(lista.get(i).toString());
			}
			
			
		
		
	}
}
