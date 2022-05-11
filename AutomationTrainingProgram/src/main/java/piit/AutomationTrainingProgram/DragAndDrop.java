package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.jqueryui.com/");
		driver.manage().window().maximize();
		//maximize Browser
		
		WebElement droppable=driver.findElement(By.linkText("Droppable"));
		droppable.click();
		driver.switchTo().frame(0);
		//Index # always starts with 0 therefore switch to frame is 0 
		
		//iFrame "inline Frame": html that loads ANOTHER html page WITHIN the document basically creating Parent and Child frame
		WebElement ElementToDrag=driver.findElement(By.id("draggable"));
		WebElement DropToHere=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(ElementToDrag, DropToHere).build().perform();
		
		//have to tell selenium to switch back & forth between parent/main & child frame to sort
		driver.switchTo().parentFrame();
		WebElement Sorting=driver.findElement(By.linkText("Sortable"));
		Sorting.click();
	}

}
