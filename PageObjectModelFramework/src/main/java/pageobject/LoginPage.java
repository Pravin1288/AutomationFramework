package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class LoginPage extends Helper {
	public static final String EmailBox = "email";
	public static final String PasswordBox = "pass";
	public static final String SignIn ="//button[@name='login']";
	
	//****************************
	
	WebElement elements ;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement UserName()
	{
		elements = getElementId(EmailBox);
		return elements;
	}
	
	public WebElement Password()
	{
		elements = getElementName(PasswordBox);
		return elements;
	}
	
	public WebElement Signin()
	{
		elements = getElementXpath(SignIn);
		return elements;
	}

}
