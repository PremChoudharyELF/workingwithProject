package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	/**
	 * This method read the data from the Excel Sheet
	 * 
	 * @param Enter   sheet Name of WorkBook
	 * @param rowNum  Enter row Number of Sheet
	 * @param cellNum Enter cell Number of the Sheet
	 * @return This method return the value of Cell in String Format
	 */
	public static String fromExcel(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("./testData/TestData.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	/**
	 * 
	 * @param key Enter the Key from properties file 
	 * @return Returns the Value of Given Key
	 */
	
	public static String fromPropertyFile(String key) {
		FileInputStream fis=null;
		Properties properties=null;
		 
		try {
			fis=new FileInputStream(new File("./testData/Configuration.properties"));
			 properties=new Properties();
			 properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.get(key).toString();
		
	}
	

}
