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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.*;

import javax.lang.model.element.Element;
import javax.sound.midi.Sequence.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement.*;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Point.*;
import org.openqa.selenium.StaleElementReferenceException;

import java.awt.Point.*;
import org.openqa.selenium.interactions.*;

import io.appium.java_client.AppiumBy;
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


public class OwnerCreationInvite {

	
		
		public static  URL  serverUrl;

	    public static AndroidDriver driver;

	    
		    
		
		@SuppressWarnings({ "deprecation", "rawtypes", "static-access" })
		public static void main(String args[]) throws MalformedURLException, URISyntaxException, InterruptedException, ClassCastException{
		 
			   
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
					Actions action = new Actions(driver);
				      
				
		     
		
						
	    
		WebElement loginPersonal= driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
		loginPersonal.click();
		Thread.sleep(200);
		action.sendKeys("nexus14@gmail.com").perform();
		Thread.sleep(200);
		
		
		WebElement passwordPersonal = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
		passwordPersonal.click();
		action.sendKeys("Test@12345").perform();
		Thread.sleep(100);
		
		WebElement loginbutton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"LOGIN\"]"));
		loginbutton.click();
		
		Thread.sleep(5000);
   //  	WebElement AdminTab = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Student Tab 2 of 3\"]"));
	//	@SuppressWarnings(value={"deprecation", "unused"})
	//	WebDriverWait wait=(WebDriverWait) new WebDriverWait(driver,Duration.ofMillis(3000)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='2']")));
	//	WebElement AdminTab = driver.findElement(By.xpath("//android.view.View[@index='2']"));
	//	Thread.sleep(1000);
	//	AdminTap.click();
		
	//	Thread.sleep(1000);
	
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("Before finding locators");
		WebElement AdminTab = driver.findElement(By.xpath("//android.view.View[@index='0']"));
        AdminTab.click();
        WebElement AdminTab1 = driver.findElement(By.xpath("//android.view.View[@index='3']"));
        System.out.println(AdminTab.isEnabled());
		
	 //   System.out.println(""+AdminTab.getRect());
		// System.out.println(""+AdminTab.getText()); 
	     Admintap(driver,AdminTab1);
	    
	    
	//	action.moveToElement(AdminTab, 599, 242);
//	WebElement AdminTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@index='2']")));
	     
	//	if (AdminTab.isDisplayed() && AdminTab.isEnabled()) {
	//		Admintap(driver,AdminTab);	
	//	}	
     	
  //      action.click(AdminTab);
  //  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
  //  	Admintap(driver,AdminTab);	
//		if (AdminTab.isDisplayed() && AdminTab.isEnabled()) {
//			Admintap(driver,AdminTab);	
//		}	
			
	//	Admintap(driver,AdminTab);	
			
		         
	 
		
		

		
				
		WebElement InviteButton = driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
		InviteTap(driver,InviteButton);
				
		Thread.sleep(1000);
		WebElement EnterFirstName = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[1]"));
		EnterFirstName.click();
		action.sendKeys("Session19").perform();				
		
		Thread.sleep(1000);
		WebElement EnterLastName = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[2]"));
		EnterLastName.click();
		action.sendKeys("Clara19").perform();	
		
		Thread.sleep(1000);
		WebElement EnterEmail = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[3]"));
		EnterEmail.click();
		action.sendKeys("session100@gmail.com").perform();
		
		Thread.sleep(1000);
		WebElement RetypeEmail = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View/android.widget.ImageView[4]"));
		RetypeEmail.click();
		action.sendKeys("session100@gmail.com").perform();
		

		Thread.sleep(200);
		WebElement PermissionLevel = driver.findElement(By.xpath("//android.widget.RadioButton[@index='7']"));
		PermissionLevel.click();
		
		
		Thread.sleep(2000);
		driver.hideKeyboard();
		
		WebElement GenerateVerificationCode = driver.findElement(By.xpath("//android.view.View[@content-desc=\'Generate Verification Code\']"));
		GenerateVerificationCodeTap(driver,GenerateVerificationCode);
		Thread.sleep(4000);
		action.perform();
		
		
		WebElement CopyGenerateVerificationCode = driver.findElement(By.xpath("//android.view.View[@index='17']"));
		CopyGenerateVerificationCodeTap(driver,CopyGenerateVerificationCode);
		Thread.sleep(3000);
//		System.out.println("Back");
  //      driver.findElement(By.AndroidUIAutomator(
   //             "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"WebView\"));"
   //         ));

		
		
/*		WebElement BackArrow = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\'Back\']"));
		BackArrow.click();*/
		
		Thread.sleep(4000);
	    driver.navigate().back();  
		WebElement Adminbar = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView"));
	    Adminbar.click();
  	//	action.click().perform();
	       
	       
			Thread.sleep(2000);
	    	WebElement logout = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Log Out\"]"));
			logout.click();
			
	        Thread.sleep(2000);
			WebElement Yes = driver.findElement(By.xpath("//android.view.View[@content-desc=\"YES\"]"));
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
		
		
		
		
	
}

    






	
				
				
				
				
				
				
		
		
		

	


