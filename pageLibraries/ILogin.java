package pageLibraries;

import igenericLib.Iconstant;
import igenericLib.IdCommonWaits;
import igenericLib.IdDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ILogin {
	
	@FindBy(xpath="//input[@id='user_email']")
	private WebElement eml;
	
	@FindBy(xpath="//input[@id='user_password']")
	private WebElement psw;
	
	@FindBy(xpath="//div/button[text()='Login']")
	private WebElement lgn;
	
	public DashBoard loginToApp(String userName,String password)
	{
		
		
		//Loading ID verify link
		IdDriver.driver.get(Iconstant.path);
		
		IdCommonWaits.waitForPageToLoad();
		
		//Entering credentials
		eml.sendKeys(userName);
		psw.sendKeys(password);
	    lgn.click();
	    
	    IdCommonWaits.waitForPageToLoad();
	    
	    return PageFactory.initElements(IdDriver.driver, DashBoard.class);
		
	    
	
	}
	
	

}
