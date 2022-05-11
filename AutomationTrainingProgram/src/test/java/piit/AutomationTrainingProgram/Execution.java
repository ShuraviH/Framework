package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
  @Test	//5th execution flow
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod	//4th
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }

  @AfterMethod	//6th
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

  @Test		//added new
  public void Test2() {
	  System.out.println("This is test2");
  }
  
  @BeforeClass	//3rd
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass	//7th
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  @BeforeTest	//2nd
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest 	//8th
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite	//1st
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }

  @AfterSuite	//9th
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
