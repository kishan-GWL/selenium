package igenericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class IreportLib {
	
	public void getScreenShot(String fileName) throws IOException
	{
		EventFiringWebDriver eDriver = new EventFiringWebDriver(IdDriver.driver);
		
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		
		File dstFile =  new File("C:\\Users\\Kishan\\Desktop\\GWL\\Selenium Projects\\IDVerify\\DefectScreenShots\\"+fileName+".png");
		
		FileUtils.copyFile(srcFile,dstFile);
	}
	
	

}
