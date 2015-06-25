package igenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdCommonWaits {
	
	
	public static void waitForPageToLoad()
	{
	IdDriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void waitElementXpathPresent(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(IdDriver.driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	
	public void waitElementIDpresent(String id)
	{
		WebDriverWait wait = new WebDriverWait(IdDriver.driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	
	boolean flag = false;
	
	public boolean verifyTest(WebElement wb,String expectedPage)
	{
		if(wb.getText().equals(expectedPage))
		{
			flag = true;
			System.out.println(expectedPage+"Expected page is verified" );
			
		}
		else
		{
			System.out.println(expectedPage+"Expected page is not verified");
		}
		return flag;
	}
	

}
