package pageLibraries;

import igenericLib.IdCommonWaits;
import igenericLib.IdDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscriptions {
	
	@FindBy(xpath="//a[@href='/organization/subscriptions/new']")
	private WebElement addNewSubscriptionBtn;
	
	
	@FindBy(xpath="//a[contains(text(),'Driver License Check')]")
	private WebElement DriverLicensecheckTitle;
	
	
	
	public AddNewSubscription navigateToAddnewSubscription()
	{
		
		addNewSubscriptionBtn.click();
		
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver,AddNewSubscription.class );
		
	}
	
	public DriverLicenseCheck_Details navigateToDriverLicenseCheck(){
		
		DriverLicensecheckTitle.click();
		
		return PageFactory.initElements(IdDriver.driver, DriverLicenseCheck_Details.class);
		
	}
	
	

}
