package com.testcases;

import org.testng.annotations.AfterSuite;

import com.progressive.base.Page;


public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}
