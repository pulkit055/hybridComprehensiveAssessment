package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.HeaderlinkUI;

public class HeaderLink extends HeaderlinkUI{
	
	public WebDriver driver;
	
	public HeaderLink(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getHeaderlink() {
		return driver.findElement(clickHeaderl);
	}
	
	public WebElement getFproduct() {
		return driver.findElement(clickFpro);
	}
	
	public WebElement getText() {
		return driver.findElement(clickTex);
	}								
	
}
