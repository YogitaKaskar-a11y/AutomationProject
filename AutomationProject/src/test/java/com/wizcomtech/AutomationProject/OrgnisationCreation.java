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

import com.aventstack.extentreports.ExtentTest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.*;

import javax.lang.model.element.Element;
import javax.sound.midi.Sequence.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Point.*;
import java.awt.Point.*;
import org.openqa.selenium.interactions.*;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsActions;


import io.appium.java_client.touch.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.lang.Deprecated;
import com.aventstack.extentreports.ExtentTest;

public class OrgnisationCreation {

	
	   
		public static  URL  serverUrl;

	    public static AndroidDriver driver;

		@SuppressWarnings({ "deprecation", "rawtypes", "static-access" })
		public static void main(String args[]) throws MalformedURLException, URISyntaxException, InterruptedException{
			   
			   
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
					WebElement clickhere= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\'Here\']"));
				    clickhere.click();

					
			   
				    Thread.sleep(2000);
				    WebElement Educator= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'An Educator\nThis option is for educators at school,\ncolleges , Universities, and other institutions\']"));
				    Educator.click();
				    
				    Thread.sleep(2000);
				    WebElement CreateOrg= driver.findElement(By.xpath("//android.view.View[@content-desc=\'Create Organisation\']"));
				    CreateOrg.click();
				    
				    Thread.sleep(1000);
				    WebElement organisationType=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Organisation Type*\"]"));
				    organisationType.click();
				    Thread.sleep(200);
				    WebElement drop=driver.findElement(By.xpath("//android.view.View[@content-desc=\"University\"]"));
				    drop.click();
				    
				    Thread.sleep(1000);
				    WebElement OrganisationName= driver.findElement(By.xpath("//android.widget.ImageView[@index='2']"));
				    OrganisationName.click();
				    action.sendKeys("NewJersey").perform();
				    
				    Thread.sleep(2000);
				    WebElement OrganisationAddress= driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));
				    OrganisationAddress.click();
				    action.sendKeys("uk").perform();
			        driver.hideKeyboard();
				    
				
			        
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set the timeout as per your need

			     // Find and click the "Country" button
			      WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Country*']")));
			      country.click();

			     // Wait until the UK option is clickable
			      WebElement UKSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='UK']")));
			      UKSelect.click();
				    
				    
		
				    
				  
				    Thread.sleep(2000);
				    WebElement ZipCode= driver.findElement(By.xpath("//android.widget.ImageView[@index='5']"));
				    ZipCode.click();
				    action.sendKeys("BD11AA ").perform();
				   
				    
				    
				    driver.hideKeyboard();
				    
				    WebElement NextButton= driver.findElement(By.xpath("//android.view.View[@content-desc=\" Next\"]"));
				    NextButton.click();
			//	    NextTap(driver,NextButton);
				    
				    
				    
				    
				    
				    
				    
				    
				    
			       Thread.sleep(100);
				    WebElement Title= driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
				    Title.click();
				    action.sendKeys("Ms").perform();
				    
				    Thread.sleep(2000);
				    WebElement FirstName= driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
				    FirstName.click();
				    action.sendKeys("Austine").perform();
				    
				    
				    Thread.sleep(2000);
				    WebElement LastName= driver.findElement(By.xpath("//android.widget.ImageView[@index='2']"));
				    LastName.click();
				    action.sendKeys("Dcosta").perform();
				    
				    
				    
				    Thread.sleep(2000);
				    WebElement Email= driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));
				    Email.click();
				    action.sendKeys("nexus14@gmail.com").perform();
				    
				    
				    Thread.sleep(2000);
				    WebElement MobileNumber= driver.findElement(By.xpath("//android.widget.ImageView[@index='4']"));
				    MobileNumber.click();
				    action.sendKeys("9245791237").perform();
				    
				    Thread.sleep(2000);
				    WebElement EnterAddress= driver.findElement(By.xpath("//android.widget.ImageView[@index='5']"));
				    EnterAddress.click();
				    action.sendKeys("St.Boot Church").perform();
				    
				    Thread.sleep(2000);
				    WebElement PersonalDetailsNextButton= driver.findElement(By.xpath("//android.view.View[@index='2']"));
				    PersonalDetailsNextButton.click();
				    
				    
				    Thread.sleep(2000);
					WebElement CreatePasswordOrg= driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
					CreatePasswordOrg.click();
					action.sendKeys("Test@12345").perform();
					

					Thread.sleep(2000);
					WebElement RetypePasswordOrg= driver.findElement(By.xpath("//android.widget.ImageView[@index='1']"));
					RetypePasswordOrg.click();
					Thread.sleep(2000);
					action.sendKeys("Test@12345").perform();
					
					Thread.sleep(2000);
					WebElement PenUnlockPinOrg= driver.findElement(By.xpath("//android.widget.ImageView[@index='2']"));
					PenUnlockPinOrg.click();
					action.sendKeys("141974").perform();
					
					
					driver.hideKeyboard();
					Thread.sleep(2000);
					WebElement checkBox= driver.findElement(By.xpath("//android.widget.CheckBox[@index='5']"));
					checkBox.click();
				    tap(driver,checkBox);
				    
				    
				    Thread.sleep(2000);
					WebElement SubmitButtonCreateOrg= driver.findElement(By.xpath("//android.view.View[@index='2']"));
					SubmitButtonCreateOrg.click();
				 	tap1(driver,SubmitButtonCreateOrg);
				    
				    
				  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}              
	
		}				
			

		private static void tap(AndroidDriver driver, WebElement checkBox) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = checkBox.getLocation();
			    Dimension size = checkBox.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   	Sequence sequence = new Sequence(finger1, 0);
				        
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),75,873));
			           
			   		     sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),75,873));
			   		     sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			        
			             
			          driver.perform(ImmutableList.of(sequence));   
			             
			             
			             
			             
			           
		}

		private static void tap1(AndroidDriver driver, WebElement SubmitButtonCreateOrg) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = SubmitButtonCreateOrg.getLocation();
			    Dimension size = SubmitButtonCreateOrg.getSize();
			    @SuppressWarnings("unused")
			//	org.openqa.selenium.Point centreOfElement = getCenterOfElement(location,size);
			    
			    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			   	Sequence sequence = new Sequence(finger1, 0);
				        
			   		     sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),593,1440));
			           
			   		     sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),593,1440));
			   		     sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			         
			          driver.perform(ImmutableList.of(sequence));   
			             
			             
			           
		}

		
		private static void NextTap(AndroidDriver driver, WebElement NextButton) {
			// TODO Auto-generated method stub
			 org.openqa.selenium.Point location = NextButton.getLocation();
			    Dimension size = NextButton.getSize();
			    @SuppressWarnings("unused")
			
			    
			    PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
			   	Sequence sequence = new Sequence(finger2, 0);
				        
			   		     sequence.addAction(finger2.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),607,1442));
			           
			   		     sequence.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			   		
			   		  sequence.addAction(finger2.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),607,1442));
			   		     sequence.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			        
			             
			          driver.perform(ImmutableList.of(sequence)); 
		
		
	
          }

}    






	
				
				
				
				
				
				
		
		
		

	


