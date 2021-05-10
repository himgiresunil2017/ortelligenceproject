package com.ortelligence.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignPage {
	//public static WebDriver driver;
	
	
	public SignPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement uName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement uPass;
	
	
	@FindBy(xpath = "//button")
	public WebElement signButton;
	
	 
	
	
	public void enterUsername(String Name) {
		
		uName.sendKeys(Name);

	}
	
	public void enterPassword(String pass) {
		uPass.sendKeys(pass);

	}
	
	
	
	public void clickOnSignButton() {
		signButton.click();

	}
	
	public boolean validateTitle(WebDriver driver, String usnmae,String passName){
		
		enterUsername(usnmae);
		enterPassword(passName);
		clickOnSignButton();
		
		if(driver.getTitle().equals("ortelligence")){
			System.out.println("True");
			return true;
			
			}
		else {
			return false;
		}		
	}



}
