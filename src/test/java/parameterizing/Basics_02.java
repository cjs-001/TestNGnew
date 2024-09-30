package parameterizing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics_02 {

	
	@Test
	void day3() {
		System.out.println("day3");
	}
	
	@Parameters({"URL","username"})
	@Test		
	void parameter(String url,String Username)
	{
		System.out.println(url);
		System.out.println(Username);
	}
}
