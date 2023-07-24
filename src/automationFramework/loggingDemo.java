package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class loggingDemo {

	public static void main(String[] args) {
		
final String baseUrl = "https://itgsoftware.com/quality-assurance";
String driverPath = "C:\\\\\\\\Program Files\\\\\\\\Google\\\\\\\\Chrome\\\\\\\\Application\\\\\\\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", driverPath);
WebDriver driver = new ChromeDriver();
Logger log = Logger.getLogger("logs");
driver.get(baseUrl);
log.debug("opening website");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
String expectedTitle = "Quality Assurance";
String actualTitle = driver.findElement(By.cssSelector(".quality-assurance-header>h3")).getText().toString();
log.debug("validating the header");
Assert.assertEquals(actualTitle,expectedTitle,"Actual: " + actualTitle);
log.debug("close the browser");
driver.quit();
	}
}
