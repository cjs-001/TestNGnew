package after_before_suite;

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
}
