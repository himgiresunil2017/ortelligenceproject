package com.ortelligence.baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class TestBaseClass {
	
	WebDriver driver;
	
	 
	 
	
	
	
	@DataProvider(name = "testData")
	public Object [][] getData(){
		
		String signInData[][] = {
									{"QAHcpSurgeonOAFacilityOASystemOA@mailinator.com","ORT@3322"},
									{"QASpdOAFacilityOASystemOA@mailinator.com","ORT@3322"}
				
		
		};
		return signInData;
	}

}
