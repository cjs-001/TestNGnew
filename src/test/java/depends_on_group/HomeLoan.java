package depends_on_group;

import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	void webhome()
	{
		System.out.println("webhome");
	}
	
	@Test
	void webhomeSignin()
	{
		System.out.println("webhomeSignin");
	}
	
	@Test
	void webhomeLogin()
	{
		System.out.println("webhomeLogin");
	}
	
	@Test(groups= {"api"})
	void apiHome()
	{
		System.out.println("apiHome");
	}
	
	@Test(groups= {"api"})
	void apiumHome()
	{
		System.out.println("apiumHome");
	}
	
}
