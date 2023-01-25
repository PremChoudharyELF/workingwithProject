package workingWithDataProviderFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class WorkingWithDataProviderWithExcel {

	@DataProvider(parallel = true)
	public String[][] datadetails() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(new File("./testData/practiceDataProvider.xlsx"));
		Workbook workbook=WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheetAt(0);
	    int rows=sheet.getPhysicalNumberOfRows();
	    int column=sheet.getRow(0).getPhysicalNumberOfCells();
	    String data[][]=new String[rows][column];
	    
	    for(int i=0;i<rows;i++) {
	    	for(int j=0;j<column;j++) {
	    		DataFormatter format=new DataFormatter();
	    	data[i][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
	    		
	    	}
	    }
	    return data;
		
	}
}
