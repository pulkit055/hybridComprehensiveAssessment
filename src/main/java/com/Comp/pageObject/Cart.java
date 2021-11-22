package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.CartUI;

public class Cart extends CartUI {
	
	public WebDriver driver;

	public Cart(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getCart() {
		return driver.findElement(clickC);
	}
			
}
