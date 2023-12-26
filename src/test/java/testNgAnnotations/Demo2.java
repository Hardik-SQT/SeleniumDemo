package testNgAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {

	@Test (dataProvider="getData", groups= {"create"})
	public void iosPostcreation(String userName, String password) {
		System.out.println("This is iOS test case for Post Creation");
		System.out.println(userName+"    "+password);
	}
	
	@Test(dataProvider="getData")
	public void iosAppPostedit(String userName, String password) {
		System.out.println("This is iOS test case for post edit function");
		
	}
	
	@Test
	public void iosPostDelete() {
		System.out.println("This is iOS test case for post delete function");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] arr = new Object[3][2];
		arr[0][0] = "TestUserone";
		arr[0][1] = "Test@123";
		
		arr[1][0] = "TestUserTwo";
		arr[1][1] = "Test@1234";
		
		arr[2][0] = "TestUserThree";
		arr[2][1] = "Test@12345";
		
		return arr;
	}
//	@BeforeMethod
//	public void testBeforeMethod() {
//		System.out.println("This is testing Before Method in ios section");
//	}
}
