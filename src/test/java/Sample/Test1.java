package Sample;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups="smoke")
	public void test1() {
		System.out.println("test1 method excuted");
	}
	
	
	@Test(groups="regression")
	public void test2() {
		System.out.println("test2 method is excuted");
		System.out.println("merging purpose");
	}

}
