package com.ortelligence.testpages;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ortelligence.baseclass.TestBaseClass;
import com.ortelligence.pages.SignPage;
import com.ortelligence.utility.ReadPropertiesFile;
import com.ortelligence.utility.StartBrowser;

public class TestSignPage extends TestBaseClass {
	WebDriver driver;
	SignPage sp;
	ReadPropertiesFile rp = new ReadPropertiesFile(); 
	
	 
	
	
	@Test(dataProvider="testData")
	public void testSignPage(String urname,String urpass){
		driver = StartBrowser.startApplication(driver ,rp.getbrowserName(),rp.getAppUrl());
		sp  = new SignPage(driver);
		Assert.assertTrue(sp.validateTitle(driver,urname, urpass));
		StartBrowser.closeBrowser(driver);
		
		
	}
	
	 

}
