package activities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String excelPath="resources/Excel1.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DataTypes in Java");
		Object[] [] datatypes= {
				{"DataType","Type","Size(in bytes"},
				{"Int","Primitive",2},
				{"Float","Primitive",4},
				{"String","Non-Primitive","No fixed size"}
			};
		
		int rowNum=0;
				
		for (Object[] datatype:datatypes)
		{
			Row row=sheet.createRow(rowNum++);
			int colNum=0;
			for (Object field:datatype) {
			Cell cell=row.createCell(colNum++);
			if (field instanceof String)
				cell.setCellValue((String)field);
			else if (field instanceof Integer)
				cell.setCellValue((Integer)field);
		
			}
				
		}
		try {
			FileOutputStream outStream=new FileOutputStream(excelPath);
			try {
				workbook.write(outStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		workbook.close();		

	}

}
