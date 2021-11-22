package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.SearchbarUI;

public class SearchBar extends SearchbarUI{

	public WebDriver driver;
		
	public SearchBar(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getSearchBar() {
		return driver.findElement(clickSearch);
	}
	
	public WebElement getProduct() {
		return driver.findElement(clickPro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(clickAdd);
	}
	
	public WebElement getCheckout() {
		return driver.findElement(clickCheck);
	}
}
