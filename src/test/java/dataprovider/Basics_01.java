package dataprovider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basics_01 {

	
	
	@Test(dataProvider = "getData")
	void datas(String uname,String password) {
		
		System.out.println(uname +" and "+ password);
	}
	
	@DataProvider
	Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		        
		        // 1st set
		        data[0][0]="firstusername";
				data[0][1]="firstpassword";	
				//2nd set
				data[1][0]="Secondusername";
				data[1][1]="secondpassword";
				//3rd set
				data[2][0]="thirdusername";
				data[2][1]="thirdpassword";
				
				return data;
	}
	
	
	
	
}
