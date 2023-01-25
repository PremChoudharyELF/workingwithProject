package workingWithDataProvider;
import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="dataprovider")
	public Iterator<String[]> dataProvider() {
		LinkedList<String[]> data=new LinkedList<>();
		data.add(new String[] {"Prem","Choudhary","prem123@gmail.com","prem123","prem123"});
		data.add(new String[] {"Sourav","Choudhary","sourav123@gmail.com","Sourav123","Sourav123"});
		data.add(new String[] {"Suman","Choudhary","suman123@gmail.com","Suman123","Suman123"});
		data.add(new String[] {"Nikhil","Choudhary","nikhil123@gmail.com","Nikhil123","Nikhil123"});
		return data.iterator();
	}
}