package com.util;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.data.Constants;
import com.data.FlightDescriptionSingleton;
import com.data.PropertyLoader;
import com.vo.FlightDescription;

public class BaseTest {

	protected WebDriver driver;
	public HashMap<String, FlightDescription> testData = FlightDescriptionSingleton.getFlightDescriptionSingleton();
	
	
	public BaseTest() {
		
		
		switch (getDefaultBrowser()) {
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",PropertyLoader.getProperty(Constants.CHROME));
			driver = new ChromeDriver();
			break;
		
		case "Firefox":
			System.setProperty("webdriver.gecko.driver",PropertyLoader.getProperty(Constants.FIREFOX));
			driver = new FirefoxDriver();
			break;
			
		default:
		}
		

	}
	
	private String getDefaultBrowser() {
		return PropertyLoader.getProperty(Constants.DEFAULT_BROWSER);
	}
	
	@BeforeMethod
	public void initialize() {
		System.out.println(">>>>>Initializing driver from BaseTest<<<<<");
	}

	
	
}
