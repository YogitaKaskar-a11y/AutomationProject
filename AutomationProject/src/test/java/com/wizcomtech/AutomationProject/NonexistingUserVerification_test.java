package com.wizcomtech.AutomationProject;



import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;



@SuppressWarnings("unchecked")
public class NonexistingUserVerification_test {

	public static  URL  serverUrl;

	 

	private static ExtentReports extentReports;
    private static ExtentSparkReporter sparkReporter;
    private static ExtentTest extentTest;
    private static AndroidDriver driver;
    private static WebDriverWait wait;

    @BeforeSuite
    public static void setup() throws MalformedURLException, IOException, URISyntaxException {
    	System.out.println("Setting up...");
    	initializeExtentReports();
    
	}  
    
	    
	@Test
	public static void NonExistingUser() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		    	
		System.out.println("Test started...");   
		UiAutomator2Options options = new UiAutomator2Options();
		options.setApp(System.getProperty("user.dir")+ "\\v0.2.2.1.apk");
		options.setDeviceName("moto G23");
		options.setPlatformName("Android");
		options.setAppActivity("com.example.admin_fe.MainActivity");
		options.setAppPackage("com.example.admin_fe");
				
		var urlString = "http://127.0.0.1:4723/wd/hub";
		@SuppressWarnings({"deprecation","unused" })
		var appiumServerUrl = new URI(urlString).toURL();
		
    	
    	@SuppressWarnings({"deprecation","unused" })
    	driver = new AndroidDriver(appiumServerUrl,options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
    	
        	
        	
    	 try {
    		 extentTest = extentReports.createTest("NonexistingUser") 
		             .log(Status.PASS, "This is a logging event for NonExistingUser, and it passed!");
             extentReports.flush();
            
    		 Actions action = new Actions(driver);
			
			
		
			
			WebElement login= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
			login.click();
			action.sendKeys("pre@tag.com").perform();
			
			WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")));
			password.click();
			action.sendKeys("@123").perform();
			
			
			
			WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"LOGIN\"]")));
			loginbutton.click();
			
		
		    
			WebElement InvalidMessage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='0']")));
			Thread.sleep(3000);
	        String actualText = InvalidMessage.getText();
			
			
			
			
			String expectedText = "Invalid Credentials";
		
		   
		    try {
		    	 Assert.assertEquals(actualText, expectedText, "Strings do not match!");
		    } catch (NoSuchElementException e) {
		        extentTest.fail("Element not found: " + e.getMessage());
		        e.printStackTrace();
		    } catch (TimeoutException e) {
		        extentTest.fail("Element interaction timed out: " + e.getMessage());
		        e.printStackTrace();
		    } catch (Exception e) {
		        extentTest.fail("Test failed: " + e.getMessage());
		        e.printStackTrace();
		    }
			
    	 } catch (Exception e) {
             extentTest.fail("Test failed: " + e.getMessage());
             e.printStackTrace();
         }
     }
				
		
	
				   
		 private static void initializeExtentReports() {
		        if (extentReports == null) {
		            sparkReporter = new ExtentSparkReporter("target/ExtentReportNonExistingUser.html");
		            extentReports = new ExtentReports();
		            extentReports.attachReporter(sparkReporter);
		        }
		    }
		
		 @AfterSuite
		 public static void tearDown() {
			    if (extentReports != null) {
			        extentReports.flush();
			    } else {
			        System.out.println("ExtentReports is not initialized.");
			    }
			}
		
	    }


