package pageLibraries;

import igenericLib.IdCommonWaits;
import igenericLib.IdDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
	
	@FindBy(xpath="//a[contains(text(),'User Groups')]")
	private WebElement usersGroupTab;
	
	@FindBy(xpath="//li[@role='presentation']/a[contains(text(),'Users')]")
	private WebElement usersTab;
	
	@FindBy(xpath="//a[contains(text(),' User Requests')]")
	private WebElement userRequestTab;
	
	@FindBy(xpath="//a[@href='/organization/request_transactions']")
	private WebElement transactionRequestTab;
	
	@FindBy(xpath="//a[@href='/organization/user_classes/new']")
	private WebElement addUserGroup;
	
	
public GroupList navigateToGroupList(){
		
	usersGroupTab.click();
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, GroupList.class);
		
	}
	
	public UsersList navigateToUsersList(){
		
		usersTab.click();
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, UsersList.class);
		
	}
	
	
	public UserRequests navigateToUserRequests()
	{
		userRequestTab.click();
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, UserRequests.class);
		
	}
	
	public TransactionRequest navigateToTransactionRequest()
	{
		transactionRequestTab.click();
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, TransactionRequest.class);
		
	}
	
	
	
	
	
}
