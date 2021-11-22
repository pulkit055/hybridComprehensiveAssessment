package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.HomeDecorUI;

public class ClickHomeDecor extends HomeDecorUI{
	
public  WebDriver driver;
	
	public ClickHomeDecor(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getHomeDecor() {
		return driver.findElement(clickHomeD);
	}
	
	public WebElement getFirstPro() {
		return driver.findElement(clickFpro);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(clickAdd);
	}
	
	

}
