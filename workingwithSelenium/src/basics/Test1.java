package basics;

import org.testng.annotations.Test;

public class Test1 {

	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("test 1");
	}
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("test 2");
	}
	@Test(groups= {"functional","smoke"})
	public void test3() {
		System.out.println("test 3");
	}
}
