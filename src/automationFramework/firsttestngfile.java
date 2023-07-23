package automationFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class firsttestngfile {
	public String baseUrl = "https://itgsoftware.com/quality-assurance";
	String driverPath = "C:\\\\Program Files\\\\Google\\\\Chrome\\\\Application\\\\chromedriver.exe";
	public WebDriver driver;
	@Test
	public void verifyHomepageTitle() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle = "Quality Assurance";
		WebElement title = driver.findElement(By.cssSelector(".quality-assurance-header>h3"));
		String actualTitle = title.getText();
		Assert.assertEquals(actualTitle, expectedTitle ,"Actual: " + actualTitle );
		driver.close();
	}
}
