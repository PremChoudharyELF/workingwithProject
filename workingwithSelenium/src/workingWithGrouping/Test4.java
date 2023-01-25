package workingWithGrouping;

import org.testng.annotations.Test;

public class Test4 {

	@Test(groups= {"functional","smoke"})
	public void test10() {
		System.out.println("test 10");
	}
	@Test(groups= {"sanity","functional"})
	public void test11() {
		System.out.println("test 11");
	}
}
