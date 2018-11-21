package com.crm.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.helper.LoggerHelper;
import com.crm.utils.EventListener;
import com.crm.utils.Utils;

public class TestBase {

	public static Logger log=LoggerHelper.getLogger(TestBase.class);
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver edriver;
	public static EventListener listener;

	public TestBase() {
		log=LoggerHelper.getLogger(TestBase.class);
		FileInputStream fis;
		try {
			fis = new FileInputStream(".\\src\\main\\java\\com\\crm\\config\\config.properties");
			prop = new Properties();
			prop.load(fis);
			log.info("Properties file loaded");
		} catch (FileNotFoundException e) {
			log.error("Properties file not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization()
	{
		String browserName=prop.getProperty("browser");
		if(System.getProperty("os.name").contains("Window"))
		{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();	
			log.info("Chrome Browser opened");
		}
		else if(browserName.equals("firefox"))
		{
			  System.setProperty("webdriver.firefox.marionette", ".\\src\\main\\resources\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  log.info("Firefox Browser opened");
		}
		}
		else if(System.getProperty("os.name").contains("Mac"))
		{
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver");
				driver=new ChromeDriver();	
				log.info("Chrome Browser opened");
			}
			else if(browserName.equals("firefox"))
			{
				  System.setProperty("webdriver.firefox.marionette", ".\\src\\main\\resources\\geckodriver");
				  driver=new FirefoxDriver();
				  log.info("Firefox Browser opened");
		}
		}
//		edriver =new EventFiringWebDriver(driver);
//		listener=new EventListener();
//		edriver.register(listener);
//		driver=edriver;
//		log.info("Listener initialized");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Utils.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	public static void enterUrl()
	{
		driver.get(prop.getProperty("url"));
		log.info("Opening URL");
	}
}
