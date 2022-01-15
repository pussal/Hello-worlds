     package com.testcases;

import org.testng.annotations.Test;

import com.progressive.pages.ExploreProductPage;
import com.progressive.pages.HomePage;


public class AutoQuoteTest {

	@Test()
	public void AutoQuoteTest() {
		
		HomePage hp=new HomePage();
		ExploreProductPage epp=hp.goToExploreProducts();
		epp.goToAuto();
	}
}
