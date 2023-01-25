package workingWithListners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListnerClass.class)
public class TestClass {

	@Test
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2");
	
	}
	@Test
	public void test3() {
		System.out.println("test 3");
	}
}
