package com.ortelligence.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl){
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./AllDrivers/chrome/chromedriver.exe");
			  driver = new ChromeDriver();	
		}
		else if(browserName.equals("Firefox")){	
		}
		else if(browserName.equals("IE")){	
			}
			
			else{
				
				System.out.println("Sorry this browser is not supported");
				
			}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver){
		
		driver.close();
	}

}
