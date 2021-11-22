package com.Comp.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Comp.UIstored.LoginPageUI;

public class LoginPage extends LoginPageUI{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
		
	public WebElement getClickSignin() {
		return driver.findElement(clickSign);
	}
	
	public WebElement getClickEm() {
		return driver.findElement(clickEmail);
	}
	
	public WebElement getClickPas() {
		return driver.findElement(clickPass);
	}
	
	public WebElement getClickButt() {
		return driver.findElement(clickButton);
	}

}
