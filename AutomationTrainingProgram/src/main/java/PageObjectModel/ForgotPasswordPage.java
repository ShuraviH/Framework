package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
WebDriver driver;
@FindBy(xpath = "(//*[@name=\"email\"])[2]") WebElement Id;	//located element
@FindBy(name = "did_submit") WebElement SearchbuttonClick;	//located element
@FindBy(xpath = "//*[contains(text(),'Please enter your email')]") WebElement Question;	//Text telling user to enter phone or email
public ForgotPasswordPage(WebDriver driver) {				//Constructor = name of class. Local driver. Line 10 is Global driver
	this.driver=driver; 									//"this" keyword is referring to Global variable 
	PageFactory.initElements(driver, this);
}

public void IdsSendKeys() {					//completed 1st class
	Id.sendKeys("Ali@gmail.com");
}
public void SearchButtonClick() {			//completed 2nd class
	SearchbuttonClick.click();
}
public String QuestionOfText() {				//will give entire text "Please enter your email or mobile number to search for your account"
	String Questions=Question.getText();	//Store the variable using string data type
	return Questions;
}
}