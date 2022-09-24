package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	//@FindBy(xpath = " Log in")
	//WebElement LoginLink;

	//@FindBy(name = "user_login")
	//WebElement UserName;

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
		//a[@class="login"]
		WebElement LoginLink = driver.findElement(By.xpath("//a[@class='login']"));
		LoginLink.click();

		// Step2: Enter Username
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(userNameVal);

		// Step3: Enter Password
		Password.sendKeys(passwordVal);

		// Step4 Click Remember Me checkbox
		Checkbox.click();

		// Step5: Click pn Login Button
		LoginBtn.click();
	}

}
