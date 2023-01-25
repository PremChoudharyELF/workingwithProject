package workingWithGrouping;

import org.testng.annotations.Test;

public class Test3 {

	@Test(groups={"adhoc"})
	public void test7() {
		System.out.println("test 7");
	}
	
	@Test(groups= {"adhoc","smoke"})
	public void test8() {
		System.out.println("test 8");
	}
	@Test(groups= {"sanity","smoke"})
	public void test9() {
		System.out.println("test 9");
	}
}
