package Property;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.sl.usermodel.TextParagraph;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipuleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream fis=new FileInputStream("./testScriptdata/testscriptdata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
              org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
       int rowshow=sh.getLastRowNum();
             
             for(int i=1;i<=rowshow;i++) {
            	 
                 Row row=sh.getRow(i);
                 
                 
                 String column1data=row.getCell(0).toString();
                 String column2data=row.getCell(1).toString();
                 System.out.println(column1data  +"\t"+ column2data);
            	 
            	 
             }
             
            
  
         
             
              

	}

}

