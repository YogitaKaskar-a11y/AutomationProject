package com.wizcomtech.AutomationProject;

import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.Selector;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
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

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

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


public class OwnerJoinOrganisation {

	
		
		public static  URL  serverUrl;

	    public static AndroidDriver driver;

	    
		    
		
		@SuppressWarnings({ "deprecation", "rawtypes", "static-access" })
		public static void main(String args[]) throws MalformedURLException, URISyntaxException, InterruptedException, ClassCastException,StaleElementReferenceException {
		 
			   
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
					WebElement clickhere= driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
				    clickhere.click();

					
				Thread.sleep(2000);
				WebElement Educator= driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
				Educator.click();
				
				
				
				Thread.sleep(2000);
				WebElement JoinOrganisation= driver.findElement(By.xpath("//android.view.View[@content-desc=\'Join Organisation\']"));
				JoinOrganisation.click();
			
				Thread.sleep(4000);
				
	
				
				
			
				WebElement EmailOwner= driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
				EmailOwner.click();
				action.sendKeys("session100@gmail.com").perform();
				
				
		    
		     	 try {
		             // Locate multiple elements
		             List<WebElement> elements = driver.findElements(By.className("android.widget.EditText"));
		            // String text ="XoWxp7";
		             char[] array = {'g','N','5','3','K','x'};
		             // Iterate over the elements using their indexes
		             if (elements.size() == array.length) {
		            	    // Iterate over the array and elements, sending each character to the respective element
		            	    for (int i = 0; i < elements.size(); i++) {
		            	        WebElement element = elements.get(i);
		            	        char c = array[i]; // Get the character at the current index in the array
		            	        
		            	        System.out.println("Filling element index " + i + " with character: " + c);
		            	        
		            	        element.click(); // Focus on the input field
		            	        element.clear(); // Clear any existing text (optional)
		            	        element.sendKeys(Character.toString(c)); // Send the character to the input field
		            	        
		            	        // Optional: Add a small delay to ensure each action is processed
		            	        // Thread.sleep(100); // (uncomment if needed)
		            	    }
		            	} else {
		            	    System.out.println("Number of input fields does not match the number of characters in the array.");
		            	}

		           	 
		             }catch (Exception e) {
		                 e.printStackTrace();
		             }
		      	
	
		     
			
			
				
			    Thread.sleep(2000);
				WebElement SubmitButtonClick= driver.findElement(By.xpath("//android.view.View[@index='10']"));
				Thread.sleep(5000);
				SubmitButtonClick.click();
				
				
				Thread.sleep(2000);
				WebElement CreateAccountPanel= driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
				WebElement PasswordDetails= driver.findElement(By.xpath("//android.view.View[@index='3']"));
				PasswordDetails.click();
				
				Thread.sleep(2000);
				WebElement CreatePassword= driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
				CreatePassword.click();
				action.sendKeys("Dugi@12345").perform();
				

				Thread.sleep(2000);
				WebElement RetypePassword= driver.findElement(By.xpath("//android.widget.ImageView[@index='2']"));
				RetypePassword.click();
				Thread.sleep(2000);
				action.sendKeys("Dugi@12345").perform();
				
				Thread.sleep(2000);
				WebElement PenUnlockPin= driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));
				PenUnlockPin.click();
				action.sendKeys("141974").perform();
				
				
				driver.hideKeyboard();
				Thread.sleep(5000);
				WebElement PasswordPolicy= driver.findElement(By.xpath("//android.widget.CheckBox[@index='6']"));
				PasswordPolicy.click();
				PasswordPolicyTap(driver,PasswordPolicy);
				
				
				
		/*		Thread.sleep(3000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement SubmitChange= driver.findElement(By.xpath("//android.view.View[@content-desc=\'Submit\']"));
				SubmitChange.click();
				Thread.sleep(6000);
				PasswordSubmit(driver,SubmitChange);
				Thread.sleep(2000);*/
	            
			//	Thread.sleep(5000);
				
				
				FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
					    .withTimeout(Duration.ofSeconds(90))
					    .pollingEvery(Duration.ofMillis(500));
				       
					WebElement SubmitChange = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\'Submit\']")));
				    SubmitChange.click();
					
					SubmitChange =(WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\'Submit\']")));
					
					PasswordSubmit(driver,SubmitChange);
				
				
				
				
				
				
			/*	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				
				
				    // Handle the exception or retry finding the element
				
				
				
			//	WebElement SubmitChange =(WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Submit']")));
				
		//		SubmitChange.click();
		//		SubmitChange =(WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Submit']")));
				
		//		PasswordSubmit(driver,SubmitChange);
		//		Thread.sleep(6000); */
				
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}              
	
		}					
			
		private static void PasswordPolicyTap(AndroidDriver driver, WebElement PasswordPolicy) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = PasswordPolicy.getLocation();
			    Dimension size = PasswordPolicy.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   	Sequence sequence = new Sequence(finger1, 0);
				        
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),75,1076));
			           
			   		     sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),75,1076));
			   		     sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			        
			             
			          driver.perform(ImmutableList.of(sequence));   
			             
			             
			             
			             
			           
		}

		private static void PasswordSubmit(AndroidDriver driver, WebElement SubmitChange) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = SubmitChange.getLocation();
			    Dimension size = SubmitChange.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
			   	Sequence sequence = new Sequence(finger2, 0);
				        
			   		     sequence.addAction(finger2.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),593,1440));
			           
			   		     sequence.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger2.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),593,1440));
			   		     sequence.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			         
			          driver.perform(ImmutableList.of(sequence));   
			             
			             
			           
		}

			
		
	
}

    






	
				
				
				
				
				
				
		
		
		

	


