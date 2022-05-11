package M.common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utility {
	public WebDriver driver;
	@Parameters({"browsers"})
	
	 @BeforeClass
	 public void Browsers (String window) {
			if (window.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.navigate().to("http://facebook.com");
					driver.manage().window().maximize();
					
			} else if (window.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
				driver.navigate().to("https://www.facebook.com");
					driver.manage().window().maximize();
					
			} else if (window.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.geko.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\gekodriver.exe");
				driver=new FirefoxDriver();
				driver.navigate().to("https://facebook.com");
				driver.manage().window().maximize();
			}

	 }
	 
	 @AfterClass
	  public void afterClass() {
		  driver.close();
	 }	
	 public void Pictures() throws IOException {
		 Date dt=new Date();
		String sk= dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(sk);
		System.out.println(dt);
				File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(screenshots, new File("C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Pictures\\"+sk+"Shot of homepage.jpg\\"));
	 }
	}

  
