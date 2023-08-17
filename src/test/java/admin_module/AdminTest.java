package admin_module;

import org.testng.annotations.Test;

public class AdminTest {
@Test(groups="smoke")
	public void adminCreate() {
		System.out.println("TestScript Passed");
	}
@Test(groups="regression")
	public void adminModify() {
		System.out.println("TestScript Failed");
	}
@Test(groups="smoke")
	public void adminDelete() {
		System.out.println("TestScript Skipped");
		System.out.println("TestScript Skipped");
	}
	
	
	
	
}