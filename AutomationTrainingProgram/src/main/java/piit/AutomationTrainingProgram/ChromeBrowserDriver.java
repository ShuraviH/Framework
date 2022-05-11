package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//calling the web-driver as a global variable

public class ChromeBrowserDriver {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set up chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shura\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		//above to maximize the browser
		
		driver.navigate().back();
		//to go back
		
		Thread.sleep(6000);
		//6000= 6 seconds wait before moving forward (6000 is in millisecond)
		
		driver.navigate().forward();
		driver.navigate().refresh();
		//to refresh the page
		
		driver.getCurrentUrl();
		String ur=driver.getCurrentUrl();
		System.out.println(ur);
		//will open current url. Use string variable letters numbers etc. 
		//Shows url in console as https://www.amazon.com/
		
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		//shows the window handle unique session ID CDwindow-1AE84BC33717BD47D9B53B89ACBAEA20
		driver.close();
		//closes the window automatically after it opens
		
	}

}
 