package alwayson;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Alwaysrun {



		
		@Test(groups = "something")
		void webhome()
		{
			System.out.println("webhome");
		}
		
		@Test(groups = "something")
		void webhomeSignin()
		{
			System.out.println("webhomeSignin");
		}
		
		//for better understanding try running without alwaysrun=true
		@AfterMethod(alwaysRun = true)
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
	

}
