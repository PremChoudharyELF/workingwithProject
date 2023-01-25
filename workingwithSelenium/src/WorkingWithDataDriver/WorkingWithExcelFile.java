package WorkingWithDataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithExcelFile {

	public static void main(String[] args) throws IOException {
		File file= new File("./testData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fis);
		String value = workbook.getSheet("Test").getRow(10).getCell(2).getStringCellValue();
		System.out.println(value);
		System.out.println(workbook.getSheet("Test").getRow(10).getCell(3).getStringCellValue());
	}
}
