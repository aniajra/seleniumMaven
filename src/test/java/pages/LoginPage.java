package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(className = "rememberMe")
	WebElement Checkbox;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;

	public LoginPage(WebDriver baseDriver) {

		this.driver = baseDriver;
		PageFactory.initElements(baseDriver, this);
	}

	public void Login(String userNameVal, String passwordVal) {

		// Step1. Click on the Login Link
		LoginLink.click();

		// Step2: Enter Username
		UserName.sendKeys(userNameVal);

		// Step3: Enter Password
		Password.sendKeys(passwordVal);

		// Step4 Click Remember Me checkbox
		Checkbox.click();

		// Step5: Click pn Login Button
		LoginBtn.click();
	}

}
