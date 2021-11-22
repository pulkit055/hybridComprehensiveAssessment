package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.WishListUI;

public class Wishlist extends WishListUI{
	
	public WebDriver driver;
	
	public Wishlist(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickwishlist() {
		return driver.findElement(clickwish);
	}
	
	//public WebElement getWordA() {
	//	return driver.findElement(word);
//	}
	

}
