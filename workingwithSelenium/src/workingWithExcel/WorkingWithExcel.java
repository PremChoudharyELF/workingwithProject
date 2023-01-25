package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(new File("./testData/PracticeWorkSheet.xlsx"));
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet infoSheet=workbook.getSheet("TestData");
		int rows = infoSheet.getPhysicalNumberOfRows();
		int columns = infoSheet.getRow(0).getPhysicalNumberOfCells();
		
		String arr[][]=new String[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=infoSheet.getRow(i).getCell(j).toString();
			}
		}
		for(String srr[]:arr) {
			for(String data:srr) {
				System.out.print(data+",");
			}
			System.out.println();
		}
	}
}
