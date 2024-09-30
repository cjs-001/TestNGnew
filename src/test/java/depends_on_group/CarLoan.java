package depends_on_group;

import org.testng.annotations.Test;

public class CarLoan {

	
	@Test
	void webCar()
	{
		System.out.println("webCar");
	}
	
	@Test(groups= {"api"})
	
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
