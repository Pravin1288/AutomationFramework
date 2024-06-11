package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Helper {
	
	
	
	
	
	public static WebDriver driver;
	public static Wait<WebDriver> wait ;
	
	public Helper(WebDriver driver)
	{
		this.driver = driver;
		
		wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(6))
				.ignoring(NoSuchElementException.class);
	}
	
	public static WebElement  getElementId(String locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}
	
	public static WebElement  getElementName(String locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
	}
	
	public static WebElement  getElementXpath(String locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	public static WebElement  getElementCss(String locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
	}
	public static WebElement  getElementClassName(String locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
	}
	
	public static String DataExcel(String sheetname , int row , int col) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Data\\LoginDetailsExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		
		
		XSSFRow r = sheet.getRow(row);
		
		XSSFCell c = r.getCell(col);
		
		return c.toString();
		
		
		
		
		}
	
	
	
	

}



//Withtimeout --- 30 Sec
//pollingEvery---5- 
//ignore--Nosuchelel
//untill