package process;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import utility.Helper;

public class LoginProcess extends Helper {
	
	String username;
	String Password;
	

	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	LoginPage lp = new LoginPage(driver);
	
	public void LoginWithValidCredential() throws IOException
	{
		for(int i =1 ; i<=3 ; i++)
		{
		 username = DataExcel("Sheet1", i, 0);
		 Password = DataExcel("Sheet1", i, 1);
		 lp.UserName().clear();
		 lp.UserName().sendKeys(username);
		 lp.Password().sendKeys(Password);
			lp.Signin().click();
		}
		
		
	}
	
	public void LoginWithInValidCredential() throws IOException
	{
		username = DataExcel("Sheet1", 2, 0);
		 Password = DataExcel("Sheet1", 2, 1);
		 
		lp.UserName().sendKeys(username);
		lp.Password().sendKeys(Password);
		lp.Signin().click();
	}

}
