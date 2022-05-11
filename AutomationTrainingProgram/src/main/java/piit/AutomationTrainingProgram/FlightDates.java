package piit.AutomationTrainingProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FlightDates {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		
		//select a departure date from expedia.com
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement Departuretodate=driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
		Departuretodate.click();
		Thread.sleep(6000);
		
		//select return date
		WebElement arrival=driver.findElement(By.id("d2-btn"));
		arrival.click();
		WebElement Arrivaltodate=driver.findElement(By.xpath("//*[@aria-label='Jun 20, 2022']"));
		Arrivaltodate.click();
		Thread.sleep(6000);
		
		//Click on DONE button
		WebElement Donebutton=driver.findElement(By.xpath("//*[@type='button']"));
		Donebutton.click();
		ob.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP);
		Thread.sleep(6000);
		}

}
