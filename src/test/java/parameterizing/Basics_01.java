package parameterizing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Basics_01 {

	@Test(timeOut = 5000)
	void day1() {
		System.out.println("day1");
	}
	
	@Test
	void day2() {
		System.out.println("day2");
	}
	
	@Parameters({"URL","username"})
	@Test
	void parameter(String url,String uname) {
		System.out.println(url);
		System.out.println(uname);
	}
	
	
}
