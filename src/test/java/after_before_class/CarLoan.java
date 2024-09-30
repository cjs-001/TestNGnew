package after_before_class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarLoan {

	
	@Test(groups= {"api"})
	void webCar()
	{
		System.out.println("webCar");
	}
	
	@Test
	void apiCar()
	{
		System.out.println("apiCar");
	}
	
	@Test
	void apiumCar()
	{
		System.out.println("apiumCar");
	}
	
	@BeforeMethod
	void beforeMehod()
	{
		System.out.println("||||||||||||BeforeMethod||||||||||||||");
	}
	
	@AfterMethod
	void AfterMehod()
	{
		System.out.println("||||||||||||AfterMethod||||||||||||||");
	}
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("\\\\\\\\\\\\\\\\beforeClass/////////////");
	}
	
	@AfterClass
	void AfterClass()
	{
		System.out.println("\\\\\\\\\\\\AfterClass/////////////");
	}
}
