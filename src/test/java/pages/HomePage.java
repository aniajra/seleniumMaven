package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public void Login(String userNameVal, String passwordVal) {

		// Step1. Click on the Login Link
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

		// Step2: Enter Username
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(userNameVal);

		// Step3: Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(passwordVal);

		// Step4 Click Remember Me checkbox
		WebElement Checkbox = driver.findElement(By.className("rememberMe"));
		Checkbox.click();

		// Step5: Click pn Login Button
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

}
