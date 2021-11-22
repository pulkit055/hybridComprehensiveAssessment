package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.HomeDCUI;

public class ClickDC extends HomeDCUI{

	public WebDriver driver;

	public ClickDC(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickDc() {
		return driver.findElement(clickDc);
	}
	
	public WebElement getSecondP() {
		return driver.findElement(clickSecpro);
	}
	
	public WebElement getAddtoBag() {
		return driver.findElement(clickAdd);
	}
}
