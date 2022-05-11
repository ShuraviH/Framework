package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browsersd extends Utility {
	WebDriver driver;
  @Test		//2nd excuted
  public void f() {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("Silem@piit");
	  WebElement pssword=driver.findElement(By.name("pass"));
	  pssword.sendKeys("johnsilver");
	  WebElement loginbutton=driver.findElement(By.name("login"));
	  loginbutton.click();
	  //opens facebook page, then inserts email and password. login error as email and PW is incorrect
  }
  @BeforeClass	//1st executed
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		//maximize Browser once FB is open
  }

  @AfterClass	//3rd executed
  public void afterClass() {
	  driver.close();
	  //closes the browser completely
  }

}
