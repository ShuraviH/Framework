package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;

public class SignINSignOUT {
	WebDriver driver;
  @Test(priority=1)			//Test Annotation (Priority 1, 2, 3... to run the prog in sequence
  public void f() throws InterruptedException {
	  Home ob=new Home(driver);
	  ob.Email();					//enter email
	  ob.PasswordFieldsEnters();	//enter password
	  Thread.sleep(6000);
	  ob.ForgotLinkClik();			//click forgot password button
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClick();
	  Thread.sleep(6000);
  }
  @Test(priority=2,dependsOnMethods = "f")			//this test case is dependent on test case priority 1. if Priority 1 fails then this will be skipped
  public void TextVerificationMethod() throws InterruptedException  {
	  driver.navigate().back();
	  Thread.sleep(6000);
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  String Questions=id.QuestionOfText();
	  SoftAssert softit=new SoftAssert();		//Assert class verifies different things (Hard or Simple Assert)
	  softit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
	  System.out.println("This is after assertion");
	  softit.assertAll();     					//tells us how many passed or failed. 
	   
	  //Soft Assert runs the program completely regardless of pass/ fail & provides results at the end
	  //Hard Assert when Fails stops running the program immediately
  }
  @BeforeClass
  public void beforeClass() {
	  Browsers("Edge");			//Type in Edge, Firefox, Chrome to open that search engine
	  
	  //THESE NO LONGER NEEDED AS IT WAS PLACED IN else if else method:
	 //Below is CHROME:
	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
	 //driver=new ChromeDriver();
	  
	  //Below is EDGE:
	  //System.setProperty("webdriver.edge.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
	  //driver=new EdgeDriver();
	  
	  //Below is FIREFOX:
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
	 // 	driver=new FirefoxDriver();
	//	driver.navigate().to("https://www.facebook.com");
	//	driver.manage().window().maximize();
		//maximize Browser once FB page is open
}

  @AfterClass
  public void afterClass() {
	  driver.close();
	  //closes the browser completely
  }
  public void Browsers(String window) {
	  if(window.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");  
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
	  }else if(window.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();  
		  driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
	  }else if(window.equalsIgnoreCase("Firefox")) {
		  	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
		  	driver=new FirefoxDriver();
			driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
	  }
  }

}
