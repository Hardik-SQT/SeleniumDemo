package testNgAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo3 {

	@Test(groups= {"create"})
	public void androidPostcreation() {
		System.out.println("This is android test case for Post Creation");
	}
	
	@Test(dependsOnMethods="androidPostcreation")
	public void androidPostedit() {
		System.out.println("This is android test case for post edit function");
	}
	
	@Test(dependsOnMethods="androidPostedit")
	public void androidPostDelete() {
		System.out.println("This is android test case for post delete function");
	}
	
	
}
