package listeners;

import java.io.Console;

import org.openqa.selenium.bidi.script.ExceptionDetails;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_ex implements ITestListener {

	
	@Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("fail");
    	System.out.println(arg0.getName());	
    	System.out.println(arg0.getThrowable());
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        System.out.println("success");		
    }
}
