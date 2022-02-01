package selenium_Practice_SmokeAndReg;

import org.testng.annotations.Test;

public class SmokeAndRegressionTest {
	
	@Test(groups = "smokeTesting")
	public void smokeTestingTest() {
		
		System.out.println("Run the smoke testing in jenkings after build");
	}
	
	@Test(priority = 1)
	public void regressionTestingTest() {
		
		System.out.println("Run the regression testing in jenkins after smoke testing");
	}
}
