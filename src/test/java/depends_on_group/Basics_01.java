package depends_on_group;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics_01 {

	@Test(dependsOnGroups = "api")
	void day1() {
		System.out.println("day1");
	}
	
	@Test
	void day2() {
		System.out.println("day2");
	}
	
	
	
	
}
