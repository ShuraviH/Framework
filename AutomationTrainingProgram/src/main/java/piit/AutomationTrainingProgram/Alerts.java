package piit.AutomationTrainingProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				//set up chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				
				//to maximize the browser
				driver.manage().window().maximize();
				
				//find alert and pick accept
				WebElement Alert=driver.findElement(By.name("alert"));
				Alert.click();
				Thread.sleep(6000);
				driver.switchTo().alert().accept();
				
				//Prompt tested and then it is dismissed
				WebElement prompting=driver.findElement(By.name("prompt"));
				prompting.click();
				Thread.sleep(6000);
				driver.switchTo().alert().sendKeys("tested");
				driver.switchTo().alert().dismiss();
				
				

	}

}
