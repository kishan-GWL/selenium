package pageLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthCardDetails {
	
@FindBy(css="h2:contains(Health Card Check)")
private WebElement healthCardTitle;

@FindBy(xpath="//h2[contains(text(),'Related Services')]")
private WebElement relatedTitle;

@FindBy(xpath="//h3[contains(text(),'Name,Address')]")
private WebElement titleName_address;



}
