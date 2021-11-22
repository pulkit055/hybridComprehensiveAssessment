package com.Comp.reusablecomponents;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public WebDriver BaseSettings() {
		try {

			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					"C:\\Users\\pulki\\Downloads\\HybridComp1\\src\\resources\\prop.properties");

			prop.load(fis);

			String browserName = prop.getProperty("Browser");

			
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pulki\\OneDrive\\Documents\\chromedriver.exe");
						driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("Edge")) {
				// initialize here edge browser
			}

			else {
				// initialize browser of your choice
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

}




