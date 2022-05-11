package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsToPointer {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open amazon.com on Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		//maximize Browser
		
		Actions ob=new Actions(driver);
		WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(hovers).build().perform();
		//opens up drop down menu of sign-in when mouse hovers over it without clicking
		//ACTION CLASS-ability provided by Selenium for handling keyboard and mouse
	}

}
