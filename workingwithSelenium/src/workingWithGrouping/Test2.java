package workingWithGrouping;

import java.security.acl.Group;

import org.testng.annotations.Test;

public class Test2 {

	@Test(groups = {"sanity"})
	public void test4() {
		System.out.println("test 4");
	}
	
	@Test(groups = {"smoke","functional"})
	public void test5() {
		System.out.println("test 5");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void test6() {
		System.out.println("test 6");
	}
	@Test(groups = {"regression"})
	public void test7() {
		System.out.println("test 7");
	}
}
