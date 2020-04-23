package com.regression;

import com.util.BaseTest;

import org.testng.annotations.Test;


public class Test_1 extends BaseTest{

	@Test
	public void BaseTest() {
		
		driver.get("http://www.google.com");
		
	}
}
