package testNgAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	public void adminPostedit() {
		System.out.println("This is Admin test case for post edit");
	}
	
	
	@Test
	public void adminPostDelete() {
		System.out.println("This is Admin test case for post delete");
	}
	
	
}
