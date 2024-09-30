package after_before_class;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	void webhome()
	{
		System.out.println("webhome");
	}
	
	@Test
	void webhomeSignin()
	{
		System.out.println("webhomeSignin");
	}
	
	@Test
	void webhomeLogin()
	{
		System.out.println("webhomeLogin");
	}
	
	@Test
	void apiHome()
	{
		System.out.println("apiHome");
	}
	
	@Test
	void apiumHome()
	{
		System.out.println("apiumHome");
	}
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("<<<<<<<<<<<<beforeSuite>>>>>>>>>>>>>");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("<<<<<<<<<<<<aftersuite>>>>>>>>>>>>>");
	}
	
}
