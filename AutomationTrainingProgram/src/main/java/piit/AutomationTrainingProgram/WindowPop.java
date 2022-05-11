package piit.AutomationTrainingProgram;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowPop {	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		
	//Open separate new window for "New Releases" from the initial amazon.com
	//Manually have to use shift key "Keys SHIFT Key down & up to release the key
	Actions ob=new Actions(driver);
	WebElement newreleaseslinks=driver.findElement(By.linkText("New Releases"));
	ob.keyDown(Keys.SHIFT).build().perform();
	newreleaseslinks.click();
	ob.keyUp(Keys.SHIFT).build().perform();
	driver.getWindowHandle();	
	
	//Windowhandle saves multiple values. string only saves single value. 
	//Iterator is Array or Looping to display each items as we want to open separate page for "Camera & Photo"
	Set<String> windowhandles= driver.getWindowHandles();
	Iterator<String> iterators=windowhandles.iterator();  	//syntax for Itrator
	String Parent= iterators.next(); 						//first value
	String secondwindow= iterators.next();					//second value
	
//sysout tells us the code of info of the parent and second window on the console
System.out.println("This is Parent Window = "+Parent);
System.out.println("This is Second Window = "+secondwindow);
driver.switchTo().window(secondwindow);
WebElement Products=driver.findElement(By.linkText("Camera & Photo Products"));
Thread.sleep(6000);
Products.click();
	}

}
