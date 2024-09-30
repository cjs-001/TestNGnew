package depends;



import org.testng.annotations.Test;

public class Basics_01 {

	@Test(dependsOnMethods = { "zzz","depends"})
	void day1() {
		System.out.println("day1");
	}
	
	@Test
	void day2() {
		System.out.println("day2");
	}
	
	@Test
	void zzz ()
	{
		System.out.println("zzzz depends method");
	}
	
}
