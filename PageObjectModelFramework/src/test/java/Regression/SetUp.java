package Regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {
	
	WebDriver driver;
	Properties prop = new Properties();
	
	
	@BeforeClass
	public void Initalization() throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
		
		prop.load(fis);
		
		driver = new ChromeDriver();
		
		driver.get(prop.getProperty("QA_Url"));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
	}
	
	@AfterClass
	
	public void CleanuP()
	{
		driver.quit();
	}

}
