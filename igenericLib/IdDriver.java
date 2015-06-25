package igenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IdDriver {
	
	public static WebDriver driver ;
	
	public static WebDriver getDriver()
	{
		if(Iconstant.browser.equals("firefox"))              // For Firefox driver
			driver = new FirefoxDriver();
		
		else if (Iconstant.browser.equals("ie"))
				{
			System.setProperty("WebDriver.ie.driver", "C:\\Users\\Kishan\\Desktop\\Softwares\\Selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
				}
		else if (Iconstant.browser.equals("chrome"))
			
		{
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\Kishan\\Desktop\\Softwares\\Selenium\\Webdrivers for Selenium\\chromedriver.exe ");
			driver = new ChromeDriver();
		}
		else 
		{
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
	

}
