package ins.util;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFile {

	public static void main(String[] args) {
		String url="d:\\write.xlsx";
		try {
			
			readFile(url);
			
		} catch (IOException e) {e.printStackTrace();}
	}

	public static void readFile(String url) throws IOException
	{
		
		FileInputStream excelFile=new FileInputStream(new File(url));
		@SuppressWarnings("resource")
		Workbook workbook=new XSSFWorkbook(excelFile);
		Sheet datatypesheet=workbook.getSheetAt(0);
		Iterator<Row> iterator=datatypesheet.iterator();
		while(iterator.hasNext())
		{
			Row currentRow=iterator.next();
			Iterator<Cell> currentCell=currentRow.iterator();
			while(currentCell.hasNext()){
			Cell cell=currentCell.next();			
				System.out.println(cell);
			}
		}
		
	}
}
