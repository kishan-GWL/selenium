package pageLibraries;

import igenericLib.IdCommonWaits;
import igenericLib.IdDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Credits {
	
	@FindBy(xpath="//a[contains(text(),'Buy More Credits')]")
	private WebElement buyMoreCreditsCardUsingCreditCardBtn;
	
	@FindBy(xpath="//a[contains(text(),'Create Purchase ')]")
	private WebElement createPurchaseOrderbtn;
	
	@FindBy(id="usage-tab")
	private WebElement ccreditsUsageTab;
	
	@FindBy(id="purchase-tab")
	private WebElement creditsPurchasesTab;
	
	
	public ByMoreCredits navigateToBuyMoreCredits(){
		
		
		buyMoreCreditsCardUsingCreditCardBtn.click();
		
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, ByMoreCredits.class);
		
	}
	
	public CreatePurchaseOrder navigateToCreatePurchaseOrder()
	{
		createPurchaseOrderbtn.click();
		
		IdCommonWaits.waitForPageToLoad();
		
		return PageFactory.initElements(IdDriver.driver, CreatePurchaseOrder.class);
	}

}
