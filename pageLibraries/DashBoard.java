package pageLibraries;

import igenericLib.IdCommonWaits;
import igenericLib.IdDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	
	
	@FindBy(linkText="Subscriptions")
	private WebElement subscriptionTab;
	
	@FindBy(linkText="Users")
	private WebElement userTab;
	
	@FindBy(linkText="Credits")
	private WebElement creditsTab;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement dropdown;
	
	@FindBy(id="flash_notice")
	private WebElement loginSucessText;
	
	@FindBy(xpath= "//div[@class='col-md-12']/h2[contains(text(),'Subscription Usage')]")
	private WebElement SubscriptionUsageHeader;
	
	@FindBy(xpath = "//div[@class='col-md-6 userPanInner']/h4/a[@href='/organization/subscriptions/1']")
	private WebElement DriverLicenseCheckDetails;
	
	@FindBy(xpath="//div[@class='col-md-6 userPanInner']/h4/a[@href='/organization/subscriptions/2']")
	private WebElement HealthCardDetails;
	
	@FindBy (xpath="//div[@class='col-md-6 userPanInner']/h4/a[@href='/organization/subscriptions/3']")
	private WebElement standardIdCheck;
	
	@FindBy (xpath="//h2[contains(text(),'User Requests')]")
	private WebElement userRequests;
	
	
	
	@FindBy(xpath="//div[text()='Signed in successfully.']")
	private WebElement veralert;
	
	@FindBy(xpath="//div[@class='col-md-6 userPanInner']/h4/a[@href='/organization/subscriptions/1']")
	private WebElement subscriptionUsage;  																
	
	Boolean flag;
	
	public Subscriptions navigateToSubscriptions()
	{
		subscriptionTab.click();
		
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, Subscriptions.class);
		
	}
	
	public Users navigateToUsers ()
	{
		userTab.click();
		
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, Users.class);
		
	}
	
	public Credits navigateToCredits()
	{
		creditsTab.click();
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, Credits.class);
		
	}
	public EditAccount dropDownTab()
	{
		dropdown.click();
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, EditAccount.class);
		
	}
	
	public WebElement successText(){
		
		
		return loginSucessText;	
		
	}
	
	public WebElement subscriptionUsage(){
		
		return SubscriptionUsageHeader;
	}
	
	public DriverLicenseCheck_Details navigateToDriverLicenseDetails()
	{
		DriverLicenseCheckDetails.click();
		
		return PageFactory.initElements(IdDriver.driver, DriverLicenseCheck_Details.class);
		
	}
	
	public HealthCardDetails navigateToHealthcardDetails()
	{
		HealthCardDetails.click();
		
		return PageFactory.initElements(IdDriver.driver, HealthCardDetails.class);
	}
	
	public StandardIDCheck navigateToStandardIddCheck()
	{

		standardIdCheck.click();
		
		return PageFactory.initElements(IdDriver.driver, StandardIDCheck.class);
	}
	
	
	

}
