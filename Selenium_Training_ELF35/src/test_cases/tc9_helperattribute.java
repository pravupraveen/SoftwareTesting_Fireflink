package test_cases;

import org.testng.annotations.Test;

public class tc9_helperattribute {
	@Test(dependsOnMethods = "bob")
	public void bindu()  {
		System.out.println("Dummy");
	}
	@Test(dependsOnMethods = "bindu")
	public void ammu() {
		System.out.println("ammu");
	}
	@Test
	public void bob() {
		System.out.println("bob");
	}

}
