package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	public static WebElement Ink_LogOut(WebDriver driver) {
	return driver.findElement(By.cssSelector("a.wp-block-button__link"));
	}
}
