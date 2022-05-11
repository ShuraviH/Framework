package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
	/*	WebElement searchfieldtxt=  driver.findElement(By.name("field-keywords"));
		searchfieldtxt.sendKeys("computer"); //writes computer in search button and brings up computers
	WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
	WebElement linktx= driver.findElement(By.linkText("Registry")); //opens up computer page and then registry page
	linktx.click();
	//LINK TEXT
	driver.findElement(By.partialLinkText(null));		*/
		
		WebElement outerto=driver.findElement(By.partialLinkText("Outer Range"));
		outerto.click();	
	}

}
