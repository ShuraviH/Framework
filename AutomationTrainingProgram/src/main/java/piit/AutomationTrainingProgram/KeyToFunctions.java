package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyToFunctions {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement searchtofield=driver.findElement(By.id("twotabsearchtextbox"));
		searchtofield.sendKeys("Computer");
		Actions ob=new Actions(driver);
		
		//KeyDown = press down key to select a value
		//KeyUp= release key to un-select the value
		//"a" is to select all from the search text box
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		
		//"c" to copy the word in search and clear the search text box
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); 
		searchtofield.clear();
		Thread.sleep(6000);
		searchtofield.click();
		
		//"v" is to paste the word computer again after selecting and copying from the search text box
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
}
