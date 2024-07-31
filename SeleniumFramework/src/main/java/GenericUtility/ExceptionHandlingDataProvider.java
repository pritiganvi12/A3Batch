package GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionHandlingDataProvider {
	public static String [ ][ ] main(String[] args) throws EncryptedDocumentException, IOException {
		File f=new File(".\\Test Data\\DataProvider.xlsx");
		Workbook workbook=null;
			try {
				FileInputStream fis=new FileInputStream(f);
			workbook =WorkbookFactory.create(fis);
			}
			catch (Exception e) {
			
			}
			Sheet sheet = workbook.getSheet("Sheet1"); 
			int rowCount = sheet.getPhysicalNumberOfRows();
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//create a 2D array
			String [ ] [ ] result= new  String[rowCount-1][cellCount];
			
			for(int i=1;i<rowCount;i++){
				for(int  j=0; j<cellCount;j++) {
					String data=sheet.getRow(i).getCell(j).toString();
					result[i-1][j]=data;
				}
			}
			return   result;
				}
}		
			
		
	





