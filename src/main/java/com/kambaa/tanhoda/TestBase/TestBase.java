package com.kambaa.tanhoda.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public Properties loadproperties() throws IOException  {	
			FileInputStream loading = new FileInputStream(
					"C:\\Users\\kavya\\Desktop\\TANHODA\\tanhodafarmer.web\\src\\main\\java\\com\\kambaa\\tanhoda\\config\\property\\config.properties1");		
			prop = new Properties();			
				prop.load(loading);
				return prop;			
			}
	@BeforeSuite
	public void initialize() throws IOException  {					
		loadproperties();						
	String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String location = prop.getProperty("driverlocation");		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", location);		
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("Webdriver.gecko.driver", location);
			driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.navigate().to(url);		
	}
	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
