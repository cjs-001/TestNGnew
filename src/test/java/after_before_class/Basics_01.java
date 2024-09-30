package after_before_class;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics_01 {

	@Test
	void day1() {
		System.out.println("day1");
	}
	
	@Test
	void day2() {
		System.out.println("day2");
	}
	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("--------------beforeTest-----------");
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("--------------afterTest-----------");
	}
}
