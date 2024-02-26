package test_cases;

import org.testng.annotations.Test;

public class tc9_groupshelperattribute {
	@Test (groups = "smoketest")
	public void bindu()  {
		System.out.println("Dummy");
	}
	@Test
	public void ammu() {
		System.out.println("ammu");
	}
	@Test (groups = "smoketest")
	public void bob() {
		System.out.println("bob");
	}

}
