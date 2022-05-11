package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
static WebDriver driver;
private static WebElement searchtofield;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		//maximize Browser
		
		//Relative xpath to search flower in web browser
		WebElement searchtofield=driver.findElement(By.xpath("//input[@aria-label='Search']"));
		searchtofield.sendKeys("flower");
		
	/*	//Clears the search field but still shows flowers options. When it's OFF then shows the word "flower" on the search field
		searchtofield.clear();	*/
		
		//Absolute xpath
		WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		Thread.sleep(6000);
		searchtoclick.click();
		//waits 6 seconds before opening
	}

}
