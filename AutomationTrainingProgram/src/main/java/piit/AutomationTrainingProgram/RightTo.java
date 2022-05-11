package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightTo {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
			driver.manage().window().maximize();
			Thread.sleep(6000);
	
	//Since none of the locators found that's supported by Selenium, therefore used xpath
	WebElement Picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
	Actions ob=new Actions(driver);
	ob.contextClick(Picture);
	
	}

}
