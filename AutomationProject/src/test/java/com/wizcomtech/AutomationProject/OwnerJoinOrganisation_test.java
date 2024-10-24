package com.wizcomtech.AutomationProject;


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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.*;



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
import org.openqa.selenium.TimeoutException;

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




public class OwnerJoinOrganisation_test {

	public static  URL  serverUrl;
	private static ExtentReports extentReports;
    private static ExtentSparkReporter sparkReporter;
    private static ExtentTest extentTest;
    private static AndroidDriver driver;
    private static WebDriverWait wait;
	    
		    
		
    @BeforeSuite
    public static void setup() throws MalformedURLException,  URISyntaxException {
    	System.out.println("Setting up...");
    	initializeExtentReports();
    
	} 
    
    @Test
    public void OwnerJoinOrganisation() throws MalformedURLException,  IOException, URISyntaxException {
		 
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
		AndroidDriver driver = new AndroidDriver(appiumServerUrl,options);
		FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(90))
			    .pollingEvery(Duration.ofMillis(500));	
	
        	
        	
    	 try {
    		 extentTest = extentReports.createTest("OwnerJoinOrganisation") 
		             .log(Status.PASS, "This is a logging event for OwnerJoinOrganisation, and it passed!");
             extentReports.flush();
            
    		 Actions action = new Actions(driver);
		      
    		
				WebElement clickhere= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@index='6']")));
			    clickhere.click();
			    extentTest.info("Clicked on 'Click here' ");
				extentTest.pass("this test has passed");	
    		 
    		 
				WebElement Educator= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='1']")));
				Educator.click();
				extentTest.info("Clicked on 'Educator' ");
				extentTest.pass("this test has passed");	
				
				
			
				WebElement JoinOrganisation= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\'Join Organisation\']")));
				JoinOrganisation.click();
				extentTest.info("Clicked on Join Organisation ");
				extentTest.pass("this test has passed");	
				
				
				
	
				
				
			
				WebElement EmailOwner= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='1']")));
				EmailOwner.click();
				action.sendKeys("session109@gmail.com").perform();
				extentTest.info("Entered EmailOwner");
				extentTest.pass("this test has passed");	
				
				
		    
		     	 try {
		             
		     		
		     		 
		     		 // Locate multiple elements
		             List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.EditText")));
		            
		             char[] array = {'S','U','t','X','H','9'};
		             // Iterate over the elements using their indexes
		             if (elements.size() == array.length) {
		            	    // Iterate over the array and elements, sending each character to the respective element
		            	    for (int i = 0; i < elements.size(); i++) {
		            	        WebElement element = elements.get(i);
		            	        char c = array[i]; // Get the character at the current index in the array
		            	        
		            	        System.out.println("Filling element index " + i + " with character: " + c);
		            	        wait.until(ExpectedConditions.elementToBeClickable(element));
		            	        element.click(); // Focus on the input field
		            	        element.clear(); // Clear any existing text (optional)
		            	        element.sendKeys(Character.toString(c)); // Send the character to the input field
		            	        
		            	        // Optional: Add a small delay to ensure each action is processed
		            	        // Thread.sleep(100); // (uncomment if needed)
		            	    }
		            	} else {
		            	    System.out.println("Number of input fields does not match the number of characters in the array.");
		            	}

		           	 
		     	        }catch (TimeoutException e) {
		            	    extentTest.fail("Timeout occurred while waiting for elements: " + e.getMessage());
		            	} catch (NoSuchElementException e) {
		            	    extentTest.fail("Element not found: " + e.getMessage());
		            	} catch (Exception e) {
		            	    extentTest.fail("An unexpected error occurred: " + e.getMessage());
		            	}
		      	
	
		     
			
			
				
			   
				WebElement SubmitButtonClick= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='10']")));
				
				SubmitButtonClick.click();
				extentTest.info("Clicked on 'Submit Button' ");
				extentTest.pass("this test has passed");	
				
				
				
				WebElement CreateAccountPanel= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")));
				WebElement PasswordDetails= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='3']")));
				PasswordDetails.click();
				extentTest.info("Clicked on 'CreateAccountPanel' ");
				extentTest.info("Clicked on 'PasswordDetails' ");
				extentTest.pass("this test has passed");	
				
				
				
				
				WebElement CreatePassword= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='1']")));
				CreatePassword.click();
				action.sendKeys("Dugies13@12345").perform();
				extentTest.info("Entered CreatePassword ");
				extentTest.pass("this test has passed");

				
				WebElement RetypePassword=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='2']")));
				RetypePassword.click();
				action.sendKeys("Dugies13@12345").perform();
				extentTest.info("Entered RetypePassword ");
				extentTest.pass("this test has passed");
			
				
				WebElement PenUnlockPin= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='3']")));
				PenUnlockPin.click();
				action.sendKeys("141974").perform();
				extentTest.info("Entered PenUnlockPin");
				extentTest.pass("this test has passed");
				
				try {
				    if (driver.isKeyboardShown()) {
				        driver.hideKeyboard();
				    } else {
				        System.out.println("Keyboard is not visible.");
				    }
				} catch (Exception e) {
				    System.out.println("Error hiding keyboard: " + e.getMessage());
				}
				
				WebElement PasswordPolicy= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckBox[@index='6']")));
				PasswordPolicy.click();
				PasswordPolicyTap(driver,PasswordPolicy);
				extentTest.info("clicked on PasswordPolicy");
				extentTest.pass("this test has passed");
				
				
		
				
				
				
				       
					WebElement SubmitChange = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\'Submit\']")));
				    SubmitChange.click();
					
					SubmitChange =(WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\'Submit\']")));
					
					PasswordSubmit(driver,SubmitChange);
					extentTest.info("clicked on SubmitChange");
					extentTest.pass("this test has passed");
				
				
				
				
				
			
				
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

		 private static void initializeExtentReports() {
		        if (extentReports == null) {
		            sparkReporter = new ExtentSparkReporter("target/ExtentReportOwnerJoinOrganisation.html");
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
	


    






	
				
				
				
				
				
				
		
		
		

	


