package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.data.Constants;
import com.data.PropertyLoader;

public class BaseTest {

	public WebDriver driver;
	
	public BaseTest() {
		
		driver = new ChromeDriver();
		
		switch (getDefaultBrowser()) {
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", PropertyLoader.getProperty(Constants.CHROME));
			driver = new ChromeDriver();
			break;
		
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", PropertyLoader.getProperty(Constants.FIREFOX));
			driver = new FirefoxDriver();
			break;
			
		default:
		}
	}
	
	
	private String getDefaultBrowser() {
		return PropertyLoader.getProperty(Constants.DEFAUKT_BROWSER);
	}
	
	
}
