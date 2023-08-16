package admin_module;

import org.testng.annotations.Test;

public class UserTest {
	@Test(groups="smoke")
	public void userCreate() {
		System.out.println("TestScript Passed");
	}
@Test(groups="regression")
	public void userModify() {
		System.out.println("TestScript Failed");
	}
@Test(groups="smoke")
	public void userDelete() {
		System.out.println("TestScript Skipped");
	}
	
}
