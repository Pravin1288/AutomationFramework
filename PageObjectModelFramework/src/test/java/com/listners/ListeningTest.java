package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListeningTest implements ITestListener {
	
	
	public  void onTestStart(ITestResult result) {
		
		System.out.println("Running Test Method"+ result.getMethod().getMethodName());
	    
	  }

	  
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
		  
		  System.out.println("Test Executed Pass "+result.getMethod().getMethodName());
	  }

	  
	  public  void onTestFailure(ITestResult result) {
	    // not implemented
		  
		  System.out.println("Test Executed Failed "+result.getMethod().getMethodName());

	  }

	  
	  public  void onTestSkipped(ITestResult result) {
	    // not implemented
		  
		  System.out.println("Test Skipped "+result.getMethod().getMethodName());

	  }

	 
	 
	  public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	 
	  public  void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	  public void onStart(ITestContext context) {
	    // not implemented
		  
		  System.out.println("Test Suite"+ context.getName()+"Started");
	  }

	  
	  public  void onFinish(ITestContext context) {
	    // not implemented
		  System.out.println("Test Finish Suite"+context.getName()+"Finish");
	  }
	
	
	
	
	

}
