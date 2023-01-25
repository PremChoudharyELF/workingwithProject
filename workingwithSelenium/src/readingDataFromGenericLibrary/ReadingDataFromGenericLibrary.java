package readingDataFromGenericLibrary;
import genericLibrary.*;

public class ReadingDataFromGenericLibrary {

	public static void main(String[] args) {
	System.out.println(ReadData.fromExcel("Test",10, 2));
	System.out.println(ReadData.fromExcel("Test", 10, 3));
	System.out.println(ReadData.fromPropertyFile("userName"));
	System.out.println(ReadData.fromPropertyFile("password"));
	}
}
