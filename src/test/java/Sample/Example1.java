package Sample;

import org.testng.annotations.Test;

public class Example1 {
	
	
	@Test(groups="regression")
	public void ex() {
		System.out.println("Example1 class of ex method excuted ");
		System.out.println("hh");
	}
	
	@Test(groups="regression")
	public void exa() {
		System.out.println("Example1 class of exa method excuted");
		System.out.println("branch created");
		
	}

}
