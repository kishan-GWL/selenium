package mainClass;

import java.io.IOException;



import igenericLib.IdDriver;
import igenericLib.IreportLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageLibraries.DashBoard;
import pageLibraries.ILogin;

public class IDTrigger {
	
	WebDriver driver = IdDriver.getDriver();
	
	@Test
	public void mainCode()
	{
		
		
		/*ILogin log1= PageFactory.initElements(driver, ILogin.class);
		
		DashBoard dashb = log1.loginAction(driver,"admin@icicibank.com","password");
		dashb.checkText();
		dashb.subscriptionTest();*/
		
	}
	
	@Test 
	public void Subscrion_1Test()
	{
		//Subscriptions_1 sub = new Subscriptions_1();
	}
	
	@AfterMethod
	
	public void configAfteMtd(ITestResult t) throws IOException
	{
		boolean status1 = t.isSuccess();
		if(status1)
		{
			System.out.println("Test Pass");
		}
		else
		{
			String testName = t.getMethod().getMethodName();
			IreportLib rLib = new IreportLib();
			rLib.getScreenShot(testName);
		}
		
	}
	
	
}
