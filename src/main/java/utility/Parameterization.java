package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
public static String getExcelData (String name, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("E:\\Automation\\hashtag.com\\src\\main\\resources\\ExcelData\\Excel_Data");
		String data =WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	

}
