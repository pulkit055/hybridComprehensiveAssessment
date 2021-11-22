package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.GiftCardUI;

public class GiftCard extends GiftCardUI{
	
	public  WebDriver driver;
	
	public GiftCard(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getClickGift() {
		return driver.findElement(clickGift);
	}
	
	public WebElement getClickMoney() {
		return driver.findElement(clickM);
	}
	
	public WebElement getClickAddtoBag() {
		return driver.findElement(clickAdd);
	}

}
