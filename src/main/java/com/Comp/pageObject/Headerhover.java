package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.HeaderhoverUI;

public class Headerhover extends HeaderhoverUI {
	
     public WebDriver driver;
	
	public Headerhover(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHovergifts() {
		return driver.findElement(hover);
	}
	
	public WebElement getFirstHoverPr() {
		return driver.findElement(clickfhoverPr);
	}
	
	public WebElement getFirstProduct() {
		return driver.findElement(clickFpro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(clickAdd);
	}
	

}
