package com.ortelligence.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {
	FileInputStream fis;
	Properties pro ;
	File file ; 
	public ReadPropertiesFile(){
		 file = new File("./src/main/resources/Config.properties");
		try {
			 fis = new FileInputStream(file);
			 pro = new Properties();
			 pro.load(fis);
		} 
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	
		
	}
	
	public String getbrowserName(){
		
	 return pro.getProperty("browser");
	}
	
	public String getAppUrl(){
		
		 return pro.getProperty("url");
		}
	
	/*public static void main(String[] args) {
		System.out.println(getbrowserName());
	}*/	
		

}
