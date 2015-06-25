package igenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IDExcelLib {
	
	String path = Iconstant.filepath;
	
	public String getExcelData(String sheetName, int rowNum, int colNum) throws InvalidFormatException, IOException
	{
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet(sheetName);
		
		Row rw = sh.getRow(rowNum);
		
		String data = rw.getCell(colNum).getStringCellValue();
		
		return data;
		
		
	}

	public void setExcelData(String sheetName, int rowNum,int colNum,String data) throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet(sheetName);
		
		Row rw = sh.getRow(rowNum);
		
		Cell cell = rw.createCell(colNum);
		
		cell.setCellType(Cell.CELL_TYPE_STRING);
		
		FileOutputStream fos = new FileOutputStream(path);
		
		cell.setCellValue(data);
		wb.write(fos);
		wb.close();
		
	
	}
}