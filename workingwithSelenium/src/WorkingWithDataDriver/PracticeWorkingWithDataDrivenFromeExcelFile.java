package WorkingWithDataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWorkingWithDataDrivenFromeExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./testData/practiceTestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		String key = workbook.getSheetAt(0).getRow(2).getCell(1).getStringCellValue();
		System.out.println(key);
		String value=workbook.getSheetAt(0).getRow(5).getCell(2).getStringCellValue();
		System.out.println(value);
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(workbook.getSheetAt(0).getRow(9).getCell(3).getStringCellValue());
		
	}
}
