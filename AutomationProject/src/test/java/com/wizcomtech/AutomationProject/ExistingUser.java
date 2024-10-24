package com.wizcomtech.AutomationProject;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;


@SuppressWarnings("unchecked")

public class ExistingUser {

	public static  URL  serverUrl;

    public static AndroidDriver driver;

    
	    
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws MalformedURLException, URISyntaxException, InterruptedException {
	   
		UiAutomator2Options options = new UiAutomator2Options();
		options.setApp(System.getProperty("user.dir")+ "\\v0.2.2 1.apk");
		options.setDeviceName("moto G23");
		options.setPlatformName("Android");
		options.setAppActivity("com.example.admin_fe.MainActivity");
		options.setAppPackage("com.example.admin_fe");
				
		try {
			var urlString = "http://127.0.0.1:4723/wd/hub/";
			@SuppressWarnings("unused")
			var appiumServerUrl = new URI(urlString).toURL();
			@SuppressWarnings({"deprecation","unused" })
			AndroidDriver driver = new AndroidDriver(appiumServerUrl,options);
			
			
			
		//	driver.findElement(By.xpath("//div[android.view.View[@content-desc=""]))[1];
		//	driver.findElementByClassName("android.view.View").sendKeys("p@c.com")
		//	driver.findElement(By.className(“android.view.View”)).sendKeys("p@c.com");
//driver.findElement(By.xpath("//[android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[0]]")).sendKeys("p@c.com");
		//	WebElement element = (WebElement) driver.findElement(By.className("android.view.View"));
			Thread.sleep(3000);
		//	element.sendKeys("p@c.com");
			Actions action = new Actions(driver);
			WebElement login= driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
			login.click();
			action.sendKeys("p@c.com").perform();
			
			WebElement password = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
			password.click();
			action.sendKeys("Test@123").perform();
			
			WebElement loginbutton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"LOGIN\"]"));
			loginbutton.click();
			
		//    WebElement Adminapp = driver.findElement(By.xpath("//android.view.View[@content-desc="Admin app"]"));
	     //   Adminapp.click();
			
		//	driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View"));
			
		   Thread.sleep(5000);
	       WebElement Adminbar = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView"));
	       Adminbar.click();
     //		action.click().perform();
	       
	       
			Thread.sleep(2000);
	    	WebElement logout = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Log Out\"]"));
			logout.click();
			
	        Thread.sleep(2000);
			WebElement Yes = driver.findElement(By.xpath("//android.view.View[@content-desc=\"YES\"]"));
			Yes.click();
			
		}catch (MalformedURLException e) {
            e.printStackTrace();
        }
		
		
		
	/*	DesiredCapabilities dc = new DesiredCapabilities();
		        		           
				dc.setCapability("platformName", "Android");
				dc.setCapability("platformVersion", "13");
				dc.setCapability("udid", "ZY22HSNGXQ");
				dc.setCapability("deviceName", "moto G23");	
				dc.setCapability("appPackage", "com.example.admin_fe");
				dc.setCapability("appActivity", "com.example.admin_fe.MainActivity");
				dc.setCapability("app", "C:\\v0.2.2 1.apk");
				
			    @SuppressWarnings({ "deprecated", "deprecation" })
			
				try {
					var urlString = "http://127.0.0.1:4723/wd/hub/";
					var appiumServerUrl = new URI(urlString).toURL();
				}catch (MalformedURLException e) {
	                e.printStackTrace();
	            }
	            @SuppressWarnings("unused")
				AppiumDriver driver = new AppiumDriver(appiumServerUrl, dc);8/ 
	            
				   
				    
			/*	try {
	                serverUrl = new URI("https://127.0.0.1:4723/wd/hub").toURL();
	            } catch (MalformedURLException e) {
	                e.printStackTrace();
	            }
				
				
				//AndroidDriver driver = new AndroidDriver(serverUrl,dc); */
		
			
	}

}
