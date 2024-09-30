package after_before_method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarLoan {

	
	@Test
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
}
