package com.acxiom.utils;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Setup {
protected WebDriver dr;


@BeforeMethod
@Parameters({"browser"})
public void beforemethod(String browser) throws IOException{
	
		    if (browser.equalsIgnoreCase("Lfirefox")) {
			dr = new FirefoxDriver();
		     }
		    
		    if (browser.equalsIgnoreCase("Lchrome")) {
				System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
				dr = new ChromeDriver();
			}
		
		   if (browser.equalsIgnoreCase("firefox")) {
				DesiredCapabilities caps = DesiredCapabilities.firefox();
				caps.setBrowserName(browser);
				caps.setPlatform(Platform.WINDOWS);
				dr = new RemoteWebDriver(new URL("http://10.0.0.9:4444/wd/hub"), caps);
			}
				
			if (browser.equalsIgnoreCase("chrome")) {
			    DesiredCapabilities caps = DesiredCapabilities.chrome();
					caps.setBrowserName(browser);
					caps.setPlatform(Platform.WINDOWS);
					dr = new RemoteWebDriver(new URL("http://10.0.0.9:4444/wd/hub"), caps);
				}	
	}
	
	}
	
