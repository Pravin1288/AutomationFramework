package Regression;

import java.io.IOException;

import org.testng.annotations.Test;

import process.LoginProcess;

public class LoginTest extends SetUp {
	
	LoginProcess lp ;
	
	@Test
	public void ValidateWithCorrectUN_PW() throws IOException
	{
		lp = new LoginProcess(driver);
		lp.LoginWithValidCredential();
	}

}
