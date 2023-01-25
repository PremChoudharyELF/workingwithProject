package basics;

import org.testng.annotations.Test;

public class Test2 {

	@Test(groups= {"sanity"})
	public void test4() {
		System.out.println("test 4");
	}
	@Test(groups = {"regression"})
	public void test5() {
		System.out.println("test 5");
	}
	@Test(groups= {"sanity","smoke"})
	public void test6() {
		System.out.println("test 6");
	}
}
