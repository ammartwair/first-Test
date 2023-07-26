package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	public static WebElement txtbx_UserName(WebDriver driver) {
			return driver.findElement(By.cssSelector("input#username"));
	}

	public static WebElement txtbx_Password(WebDriver driver) {
		return driver.findElement(By.cssSelector("input#password"));
	}
	public static WebElement btn_LogIN(WebDriver driver) {
		return driver.findElement(By.cssSelector("button#submit"));
	}

}
