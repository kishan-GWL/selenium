package pageLibraries;

import igenericLib.IdDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Logout {
	
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement dropdown;
	
	public void logoutApp()
	{
		
		
		dropdown.click();
		
		Actions act = new  Actions(IdDriver.driver);
		
		WebElement logoutBtn= IdDriver.driver.findElement(By.xpath("//a[text()='Logout']"));
		act.moveToElement(logoutBtn).perform();
		
		
		
	}

}
