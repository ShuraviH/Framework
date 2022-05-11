package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;			//instead of typing in "driver.findElement(By.linkText("Droppable"));" use a shortcut "@FindBy" locates annotation and save it
	@FindBy(name= "email") WebElement Ids;						//"@FindBy" locates annotation and save it as "Ids"
	@FindBy(name= "pass") WebElement Psswords;
	@FindBy(linkText= "Forgot password?") WebElement Forgot;	//"1" Locate the element from the page
	
	public Home(WebDriver driver) {								//"2" Constructor = name of class. Local driver. Line 10 is Global driver
		this.driver=driver; 									//"this" keyword is referring to Global variable 
		PageFactory.initElements(driver, this);
		
	}
	public void Email() {
		Ids.sendKeys("John");					//"3" create a method for each element. Enter email.
			
	}
	public void PasswordFieldsEnters() {		//method for each element. Enter password.
		Psswords.sendKeys("Silver");
		
	}
	public void ForgotLinkClik() {				//method for each element. Click on Forgot password.
		Forgot.click();	
	}
}

//*PAGE OBJECT MODEL: Create separate class for each page of the application
//1. Locate the element from the webpage
//2. Page Factory Constructor for each class
//3. Methods according to the action for each element