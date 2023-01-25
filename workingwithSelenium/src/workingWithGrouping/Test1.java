package workingWithGrouping;

import org.testng.annotations.Test;
@Test(groups = {"all"})
public class Test1 {

	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test(groups = {"smoke","regression"})
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("test 3");
	}
}
