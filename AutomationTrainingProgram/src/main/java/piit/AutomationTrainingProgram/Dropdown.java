package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		//maximize Browser
		
		//DROP-DOWN MENU:
		
		//Create object of SELECT from drop-down menu
		WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(6000); //allows to slow down to 6 seconds so it doesn't show error on console
		
		//Select the month: value='6' for June; it changes from automated April to June
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByValue("6");
		
		//Select the day from the drop down menu; chose '6' to become June 6th
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select ob6=new Select(day);
		ob6.selectByVisibleText("6");
		
		//Select birth year
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ob2006=new Select(year);
		ob2006.selectByVisibleText("2006");
	}

}
