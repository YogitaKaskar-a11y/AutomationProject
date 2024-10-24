package com.wizcomtech.AutomationProject;

import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.Selector;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.*;

import javax.lang.model.element.Element;
import javax.sound.midi.Sequence.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement.*;
import org.openqa.selenium.Point.*;
import org.openqa.selenium.StaleElementReferenceException;

import java.awt.Point.*;
import java.io.IOException;

import org.openqa.selenium.interactions.*;


import io.appium.java_client.AppiumBy.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsActions;


import io.appium.java_client.touch.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.lang.Deprecated;
import org.testng.annotations.*;

public class OwnerCreationInvite_test {
	
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
    public void OwnerCreationInvite() throws MalformedURLException, URISyntaxException {
		 
    			System.out.println("Test started...");
				UiAutomator2Options options = new UiAutomator2Options();
				options.setApp(System.getProperty("user.dir")+ "\\v0.2.2 1.apk");
				options.setDeviceName("moto G23");
				options.setPlatformName("Android");
				options.setAppActivity("com.example.admin_fe.MainActivity");
				options.setAppPackage("com.example.admin_fe");
						
				var urlString = "http://127.0.0.1:4723/wd/hub";
				@SuppressWarnings({"deprecation","unused" })
				var appiumServerUrl = new URI(urlString).toURL();
				
		    	
		    	@SuppressWarnings({"deprecation","unused" })
				AndroidDriver driver = new AndroidDriver(appiumServerUrl,options);
				wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		    	
		        	
		        	
		    	 try {
		    		 extentTest = extentReports.createTest("OwnerCreationInvite") 
				             .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		             extentReports.flush();
		            
		    		 Actions action = new Actions(driver);
				      
				
		     
		
						
	    
		WebElement loginPersonal = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")));
		loginPersonal.click();
		action.sendKeys("nexus30@gmail.com").perform();
		extentTest.info("Clicked on 'LoginPersonal' ");
		extentTest.pass("this test has passed");	
		
		
		WebElement passwordPersonal = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")));
		passwordPersonal.click();
		action.sendKeys("Test@12345").perform();
		extentTest.info("Clicked on 'PasswordPersonal' ");
		extentTest.pass("this test has passed");	
		
		
	
		
		WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"LOGIN\"]")));
		loginbutton.click();
		extentTest.info("Clicked on Login button ");
		extentTest.pass("this test has passed");	
		
		
		Thread.sleep(5000);
		System.out.println("Before finding locators");
		WebElement AdminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='0']")));
        AdminTab.click();
        WebElement AdminTab1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='3']")));
        Admintap(driver,AdminTab1);
        extentTest.info("Clicked on Admin tab button ");
		extentTest.pass("this test has passed");	
	    

				
		WebElement InviteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='1']")));
		InviteTap(driver,InviteButton);
		 extentTest.info("Clicked on Invite button ");
	     extentTest.pass("this test has passed");	
		    		
		
		WebElement EnterFirstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[1]")));
		EnterFirstName.click();
		action.sendKeys("Session29").perform();
		extentTest.info("Entered FirstName ");
	    extentTest.pass("this test has passed");	
		
		
	    WebElement EnterLastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[2]")));
		EnterLastName.click();
		action.sendKeys("Clara29").perform();
		extentTest.info("Entered LastName ");
	    extentTest.pass("this test has passed");
		
		
		
	    WebElement EnterEmail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[3]")));
		EnterEmail.click();
		action.sendKeys("session111@gmail.com").perform();
		extentTest.info("Entered Email  ");
	    extentTest.pass("this test has passed");
		
		
		
	    WebElement RetypeEmail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[4]")));
		RetypeEmail.click();
		action.sendKeys("session111@gmail.com").perform();
		extentTest.info("Retype Email  ");
	    extentTest.pass("this test has passed");
		
		
	    WebElement PermissionLevel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@index='7']")));
		PermissionLevel.click();
		extentTest.info("Entered PermissionLevel  ");
	    extentTest.pass("this test has passed");
		
		driver.hideKeyboard();
		
		WebElement GenerateVerificationCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\'Generate Verification Code\']")));
		GenerateVerificationCodeTap(driver,GenerateVerificationCode);
		Thread.sleep(4000);
		action.perform();
		extentTest.info("GenerateVerificationCode ");
	    extentTest.pass("this test has passed");
		
		
	    WebElement CopyGenerateVerificationCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='17']")));
		CopyGenerateVerificationCodeTap(driver,CopyGenerateVerificationCode);
		extentTest.info("CopyGenerateVerificationCode ");
	    extentTest.pass("this test has passed");


	    driver.navigate().back();  
	    WebElement Adminbar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView")));
	    Adminbar.click();
  	
	       
	       
		
	    WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc=\"Log Out\"]")));
		logout.click();
			
	       
		WebElement Yes  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"YES\"]")));
		Yes.click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}              
	
		}				
			
		private static void Admintap(AndroidDriver driver, WebElement AdminTab) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = AdminTab.getLocation();
			    Dimension size = AdminTab.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   	Sequence sequence = new Sequence(finger1, 0);
				        
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),599,242));
			           
			   		     sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),599,242));
			   		     sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			        
			             
			          driver.perform(ImmutableList.of(sequence));   
			             
			             
			             
			             
			           
		}
	

	

		private static void InviteTap(AndroidDriver driver, WebElement InviteButton) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = InviteButton.getLocation();
			    Dimension size = InviteButton.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   	Sequence sequence = new Sequence(finger1, 0);
				        
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),173,1453));
			           
			   		     sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),173,1453));
			   		     sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			        
			             
			          driver.perform(ImmutableList.of(sequence));   
			         // action.sendKeys("George@gmail.com").perform();  
			             
			             
			             
			           
		}
      
		private static void GenerateVerificationCodeTap(AndroidDriver driver, WebElement GenerateVerificationCode) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = GenerateVerificationCode.getLocation();
			    Dimension size = GenerateVerificationCode.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   	Sequence sequence = new Sequence(finger1, 0);
				        
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),314,954));
			           
			   		     sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),314,954));
			   		     sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			        
			             
			          driver.perform(ImmutableList.of(sequence));   
			         // action.sendKeys("George@gmail.com").perform();  
			             
			             
			             
			           
		}
      
		private static void CopyGenerateVerificationCodeTap(AndroidDriver driver, WebElement CopyGenerateVerificationCode) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = CopyGenerateVerificationCode.getLocation();
			    Dimension size = CopyGenerateVerificationCode.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   	Sequence sequence = new Sequence(finger1, 0);
				        
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),402,964));
			           
			   		     sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),402,964));
			   		     sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			        
			             
			          driver.perform(ImmutableList.of(sequence));   
			        
			             
			             
			             
			           
		}
		
		 private static void initializeExtentReports() {
		        if (extentReports == null) {
		            sparkReporter = new ExtentSparkReporter("target/ExtentReportOwnerCreationInvite.html");
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
	


    






	
				
				
				
				
				
				
		
		
		

	


