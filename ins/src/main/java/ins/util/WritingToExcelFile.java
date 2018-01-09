package ins.util;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingToExcelFile {

	public static void main(String[] args) {
		
		String url="d:\\write.xlsx";
		writeExcel(url);
	}
	
	public static void writeExcel(String url)
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("datatypes in java");
		
		 Object[][] datatypes = {
	                {"Datatype", "Type", "Size(in bytes)"},
	                {"int", "Primitive", 2},
	                {"float", "Primitive", 4},
	                {"double", "Primitive", 8},
	                {"char", "Primitive", 1},
	                {"String", "Non-Primitive", "No fixed size"}
	        };
		 	int rowNum = 0;
	        System.out.println("Creating excel");
	        
	        for(Object[] datatype:datatypes){
	        	Row row=sheet.createRow(rowNum++);
	        	int colNum=0;
	        	for(Object data:datatype){
	        		Cell cell=row.createCell(colNum++);
	        		if(data instanceof String){
	        			cell.setCellValue((String)data);
	        		}
	        		if(data instanceof Integer){
	        			cell.setCellValue((Integer)data);
	        		}
	        	}
	        }
	        
	        try {
				FileOutputStream fos=new FileOutputStream(new File(url));
				workbook.write(fos);
				workbook.close();
				
				
			} catch ( IOException e) {	e.printStackTrace();}
	        
	}
}
