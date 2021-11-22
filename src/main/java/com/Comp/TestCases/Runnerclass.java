package com.Comp.TestCases;

import java.io.IOException;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Comp.Utilities.ExtentReport;
import com.Comp.pageObject.Cart;
import com.Comp.pageObject.ClickDC;
import com.Comp.pageObject.ClickHomeDecor;
import com.Comp.pageObject.GiftCard;
import com.Comp.pageObject.HeaderLink;
import com.Comp.pageObject.Headerhover;
import com.Comp.pageObject.LoginPage;
import com.Comp.pageObject.SearchBar;
import com.Comp.pageObject.WhatsNew;
import com.Comp.pageObject.Wishlist;
import com.Comp.reusablecomponents.Base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Runnerclass extends Base{
	
	static ExtentTest test;
	static ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\reports\\" + "ExtentReportResults-"	+ System.currentTimeMillis() + "-.html");
	
	public static Logger log=Logger.getLogger(Base.class.getName());
	
	@BeforeMethod
	public void Driverinitialize() {
		driver=BaseSettings();
		log.info(driver.getTitle());
		driver.get(prop.getProperty("url"));
	}
	
	@Test(dataProvider="getvalue", priority=1)
	public void Clickforlogin(String Email, String Pass) throws InterruptedException, IOException {
		test = report.startTest("Login Page");
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		LoginPage lp = new LoginPage(driver);
		lp.getClickSignin().click();
		log.info("Click Signin Button");
		lp.getClickEm().sendKeys(Email);
		lp.getClickPas().sendKeys(Pass);
		lp.getClickButt().click();
		report.endTest(test);
		report.flush();
		
	}
	
	@DataProvider
	public Object[][] getvalue() {
		String path=System.getProperty("user.dir");
		ExcelreadData exc=new ExcelreadData(path+"\\ExcelData\\Comprehensive.xlsx","Sheet1");
		Object[][] ob=new Object[1][2];
		ob[0][0]=exc.getData(0, 0);
		ob[0][1]=exc.getData(1, 0);
		System.out.println(Arrays.toString(ob));
		return ob;
	}
	
	
	@Test(dataProvider="getvalue1", priority=2)
	public void ClickSearchBar(String product) throws InterruptedException, IOException {
		test = report.startTest("Search bar");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		SearchBar sb = new SearchBar(driver);
		sb.getSearchBar().sendKeys(product, Keys.ENTER);
		log.info("Click on search bar");
		sb.getProduct().click();
		sb.getAddtoBag().click();
		sb.getCheckout().click();
		report.endTest(test);
		report.flush();
		
		
		
	}
	
	@DataProvider
	public Object[] getvalue1() {
		String path=System.getProperty("user.dir");
		ExcelreadData exc=new ExcelreadData(path+"\\ExcelData\\Comprehensive.xlsx","Sheet1");
		Object[] ob=new Object[1];
		ob[0]=exc.getData(2, 0);
		System.out.println(Arrays.toString(ob));
		return ob;
	}
	
	@Test(priority=3)
	public void Headerlink() throws InterruptedException, IOException {
		test = report.startTest("Header Link");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		HeaderLink hl = new HeaderLink(driver);
		hl.getHeaderlink().click();
		log.info("Click Header link");
		Thread.sleep(3000L);
		hl.getFproduct().click();
		report.endTest(test);
		report.flush();
		
		
	}
	

	@Test(priority=4)
	public void Headerhover() throws InterruptedException, IOException {
		test = report.startTest("Header hover link");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		Headerhover hh = new Headerhover(driver);
		Actions a = new Actions(driver);
		WebElement ele = hh.getHovergifts();
		a.moveToElement(ele).perform();
		Thread.sleep(3000L);
		hh.getFirstHoverPr().click();
		log.info("Click on Header Hover link");
		hh.getFirstProduct().click();
		hh.getAddtoBag().click();
		report.endTest(test);
		report.flush();
		
		
		
	}
	
	@Test(priority=5)
	public void ClickHomeWhats() throws InterruptedException, IOException {
		test = report.startTest("Home Page Whats New Section");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		WhatsNew wn = new WhatsNew(driver);
		wn.getWhatsNew().click();
		log.info("Click on Home Page Whats New");
		wn.getFProduct().click();
		wn.getSelectMonica().click();
		wn.getClickAddtobag().click();
		report.endTest(test);
		report.flush();
		
		
	}
	
	@Test(priority=6)
	public void ClickWishlists() throws InterruptedException, IOException {
		test = report.startTest("WishList");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		Wishlist wl = new Wishlist(driver);
		wl.getClickwishlist().click();
		log.info("Click On Wishlist");
	 	report.endTest(test);
		report.flush();
	   
	  
	}
	
	@Test(priority=7)
	public void ClickGiftCard() throws InterruptedException, IOException {
		test = report.startTest("Gift Card");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		GiftCard gc = new GiftCard(driver);
		gc.getClickGift().click();
		log.info("Click on GiftCard");
		gc.getClickMoney().click();
		gc.getClickAddtoBag().click();
	 	report.endTest(test);
		report.flush();
		
		
	}
	
	@Test(priority=8)
	public void ClickCart() throws InterruptedException, IOException {
		test = report.startTest("cart");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		Cart c = new Cart(driver);
		c.getCart().click();
		log.info("Click on Cart");
		//c.getCheckout().click();
		report.endTest(test);
		report.flush();
		
		
	}
	
	@Test(priority=9)
	public void ClickHomeDecor() throws InterruptedException, IOException {
		test = report.startTest("Home Page Home Decor Section");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		ClickHomeDecor hd = new ClickHomeDecor(driver);
		hd.getHomeDecor().click();
		log.info("Click on Home page in Home Decor");
	    hd.getFirstPro().click();
	    hd.getClickAddtoBag().click();
	    report.endTest(test);
		report.flush();
		
	   
	}
	
	@Test(priority=10)
	public void ClickDCHome() throws InterruptedException, IOException {	
		test = report.startTest("Home Page DC Page");
		Thread.sleep(3000L);
		ExtentReport.pass(driver, test, "URL Opened", log);
		log.info(driver.getTitle());
		ClickDC dc = new ClickDC(driver);
		dc.getClickDc().sendKeys(Keys.ENTER);
		log.info("Click on Home Page in DC Symbol");
		dc.getSecondP().click();
		dc.getAddtoBag().click();
		report.endTest(test);
		report.flush();	
	}
	
	@AfterMethod
	public void Dclose() {
		driver.close();
	}

}
