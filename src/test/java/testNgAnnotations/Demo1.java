package testNgAnnotations;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	@Parameters({"URL"})
	@Test(groups= {"create"})
	public void webAppPostcreation(String urlName) {
		System.out.println("This is Web App test case for Post Creation");
		System.out.println(urlName);
		System.out.println("Git hub code change from 3rd person");
	}
	
	@Test(dependsOnMethods="webAppPostcreation")
	public void webAppPostedit() {
		System.out.println("This is web app test case for post edit function");
	}
	
	@Test(dependsOnMethods="webAppPostedit")
	public void webAppPostDelete() {
		System.out.println("This is web App test case for post delete function");
	}
	
	

	
//	@AfterMethod
//	public void testAfterMethod() {
//		System.out.println("This is After method testing in Web App section");
//	}
}
