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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Point.*;
import java.awt.Point.*;
import java.io.IOException;

import org.openqa.selenium.interactions.*;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsActions;


import io.appium.java_client.touch.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.lang.Deprecated;
import com.aventstack.extentreports.ExtentTest;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.*;






public class OrgnisationCreation_test {

	
	   
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
	    public void OrganisationCreation() throws MalformedURLException, URISyntaxException {
	    	
	    	
	    	
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
	    		 extentTest = extentReports.createTest("OrganisationCreation") 
			             .log(Status.PASS, "This is a logging event for OrganisationCreation, and it passed!");
	             extentReports.flush();
	            
	    		 Actions action = new Actions(driver);
	    		
	    		
	    	
	    		 WebElement clickhere = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@index='6']")));
	    		 		

	    		
	    	
				    clickhere.click();
	    					

	             extentTest.info("Clicked on 'Click Here' button");
				 extentTest.pass("this test has passed");	
			   
				
				    WebElement Educator = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc=\'An Educator\nThis option is for educators at school,\ncolleges , Universities, and other institutions\']")));
				   
				    Educator.click();
				    extentTest.info("Clicked on 'Educator' button");
			     	extentTest.pass("this test has passed");
			     	
			     	
				
				    WebElement CreateOrg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\'Create Organisation\']")));
				    CreateOrg.click();
				    extentTest.info("Clicked on 'create Organisation' button");
					extentTest.pass("this test has passed");
					
					
			   
				    WebElement organisationType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\'Organisation Type*\']")));
				    
				    organisationType.click();
				    extentTest.info("Clicked on 'OrganisationType' button");
					extentTest.pass("this test has passed");	
				    
				    
				    
				   
					WebElement drop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\'Primary School\']")));
				    drop.click();
				    extentTest.info("Clicked on 'dropdownvalue' button");
					extentTest.pass("this test has passed");
					
					
			    
					WebElement OrganisationName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='2']")));
				    OrganisationName.click();
				    action.sendKeys("Seattle7").perform();
				    extentTest.info("Clicked on OrganisationName ");
					extentTest.pass("this test has passed");
				    
				    
				    
				    
				    
		   
					WebElement OrganisationAddress = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='3']")));
				    OrganisationAddress.click();
				    action.sendKeys("uk").perform();
				    extentTest.info("Clicked on OrganisationAddress ");
					extentTest.pass("this test has passed");
				    
			        driver.hideKeyboard();
				    
				
			        
			    
			     
			      WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Country*']")));
			      country.click();
			      extentTest.info("Clicked on country ");
				  extentTest.pass("this test has passed");
				  
				  
			    
			      WebElement UKSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='UK']")));
			      UKSelect.click();
			      extentTest.info("Clicked on UK selected ");
				  extentTest.pass("this test has passed");
				    
		
				    
				  
			
				   
				    WebElement ZipCode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='5']")));
				    ZipCode.click();
				    action.sendKeys("AL11AB").perform();
				    extentTest.info("Entered ZipCode ");
					extentTest.pass("this test has passed");
				        
				    
				    driver.hideKeyboard();
				    
				    WebElement NextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\' Next\']")));
				    NextButton.click();
				    extentTest.info("Clicked on Next Button ");
					extentTest.pass("this test has passed");
				    
				    
				    
	
				    
				    
	
					WebElement Title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='0']")));
				    Title.click();
				    action.sendKeys("Mr").perform();
				    extentTest.info("Entered the Title ");
					extentTest.pass("this test has passed");
				    
				    
				    
	
					WebElement FirstName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='1']")));
				    FirstName.click();
				    action.sendKeys("Pedru").perform();
				    extentTest.info("Entered the FirstName ");
					extentTest.pass("this test has passed");
				    
				    
	
					WebElement LastName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='2']")));
				    LastName.click();
				    action.sendKeys("Disilva").perform();
				    extentTest.info("Entered the LastName ");
					extentTest.pass("this test has passed");
				    
				    
				    
				    
	
					WebElement Email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='3']")));
				    Email.click();
				    action.sendKeys("nexus31@gmail.com").perform();
				    extentTest.info("Entered the Email ");
					extentTest.pass("this test has passed");
				    
				    
	
					WebElement MobileNumber = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='4']")));
				    MobileNumber.click();
				    action.sendKeys("9234674341").perform();
				    extentTest.info("Entered the MobileNumber ");
					extentTest.pass("this test has passed");
				    
				    

					WebElement EnterAddress = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='5']")));
				    EnterAddress.click();
				    action.sendKeys("St.Asure2 Church").perform();
				    extentTest.info("Entered the Address ");
					extentTest.pass("this test has passed");
				    
				    
				    

					WebElement PersonalDetailsNextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='2']")));
				    PersonalDetailsNextButton.click();
				    extentTest.info("clicked on PersonalDetailsNextButton ");
					extentTest.pass("this test has passed");
				    
				    

					WebElement CreatePasswordOrg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='0']")));
					CreatePasswordOrg.click();
					action.sendKeys("Test@12345").perform();
					extentTest.info("Entered CreatePasswordOrg ");
					extentTest.pass("this test has passed");
					
					
					

	
					WebElement RetypePasswordOrg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='1']")));
					RetypePasswordOrg.click();
					action.sendKeys("Test@12345").perform();
					extentTest.info("Entered RetypePasswordOrg  ");
					extentTest.pass("this test has passed");
					
					
					
					
	
					WebElement PenUnlockPinOrg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@index='2']")));
					PenUnlockPinOrg.click();
					action.sendKeys("141974").perform();
					extentTest.info("Entered PenUnlockPinOrg ");
					extentTest.pass("this test has passed");
					
					
					
					
					
					driver.hideKeyboard();

					WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckBox[@index='5']")));
					checkBox.click();
				    tap(driver,checkBox);
				    extentTest.info("clicked on checkbox ");
					extentTest.pass("this test has passed");
				    
				    
				    
				    
	
					WebElement SubmitButtonCreateOrg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@index='2']")));
					SubmitButtonCreateOrg.click();
				 	tap1(driver,SubmitButtonCreateOrg);
				 	extentTest.info("clicked on SubmitButtonCreateOrg ");
					extentTest.pass("this test has passed");
				 	
				 	
				    
				    
				  
	    	 } catch (Exception e) {
	             extentTest.fail("Test failed: " + e.getMessage());
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
		 private static void initializeExtentReports() {
		        if (extentReports == null) {
		            sparkReporter = new ExtentSparkReporter("target/ExtentReportOrganisationCreation.html");
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
    






	
				
				
				
				
				
				
		
		
		

	


