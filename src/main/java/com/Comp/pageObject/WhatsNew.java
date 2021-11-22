package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.HomeWhatsNewUI;

public class WhatsNew extends HomeWhatsNewUI{
	
	public WebDriver driver;
   
    public WhatsNew(WebDriver driver) {
		this.driver=driver;
		
	}
    
    public WebElement getWhatsNew() {
    	return driver.findElement(clickWhats);
    }
    
    public WebElement getFProduct() {
    	return driver.findElement(clickFpro);
    }
    
    public WebElement getSelectMonica() {
    	return driver.findElement(selectM);
    }
    public WebElement getClickAddtobag() {
    	return driver.findElement(clickAdd);
    }
}
