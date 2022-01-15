package com.progressive.pages;

import com.progressive.base.Page;

public class HomePage extends Page {

	
	public ExploreProductPage goToExploreProducts() {
		
		click("exploreproduct_XPATH");
		
		return new ExploreProductPage();
	}
	
}
