package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("safari");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		
		
		WebElement userNameField = driver.findElement(By.name("username"));
		
		Thread.sleep(3000);
		
		userNameField.sendKeys("admin");
		
		Thread.sleep(3000);
		
		
		WebElement passwordField = driver.findElement(By.name("password"));
		
	
		
		Thread.sleep(3000);
		
		passwordField.sendKeys("admin123");
		
		Thread.sleep(3000); 
		
		WebElement logInButton = driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		Thread.sleep(3000);
		
		logInButton.click();
		
		tearDown();
		
		
		
		
		
		
		
	}

}
