package Advanced_selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class working_with_cnfiguration_annotation {
	@Test
	public void demo() {
		System.out.println("executing demo1");
	}
	@Test
	public void sample() {
		System.out.println("executing sample");
	}
	@BeforeSuite
	public void beforesuit() {
		System.out.println("execute beforesuit");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("execute beforetest");
	}
		@BeforeClass
		public void beforeclass() {
			System.out.println("execute beforeclass ");
		}
		@BeforeMethod
		public void beforemethods() {
			System.out.println("execute beforemethods");
		}
		@AfterMethod
		public void aftermethods() {
			System.out.println("execute aftermethods");
		}
		@AfterClass
		public void afterclass() {
			System.out.println("afterclass");
		}
		@AfterTest
		public void AfterTest() {
			System.out.println("@AfterTest");
		}
		@AfterSuite
		public void AfterSuite() {
			System.out.println("AfterSuite");
		}
	
	}
 

