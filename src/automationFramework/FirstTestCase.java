package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lancome-usa.com/");
		try {
			driver.findElement(By.cssSelector("button.c-modal__close")).click();
		}
		catch (Exception e) {
			System.out.println("Continue");
		}
		System.out.println("Successfully opened the website");
		try {
			driver.findElement(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[1]/a/img[1]"));
			System.out.println("The logo is displayed");
		}
		catch (Exception e) {
			System.out.println("The logo isn't displayed");
		}    
	
		try {
			driver.findElement(By.xpath("//*[@id=\'email-011935\']"));
			System.out.println("The Signup link is displayed");
		} 
		catch (Exception e) {
			System.out.println("The Signup link isn't displayed");
		}
		try {
		    driver.findElement(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[4]/div[1]/div[3]/div/div/div/button/i"));
			System.out.println("My cart link is displayed");
		} 
		catch (Exception e) {
			System.out.println("My cart link isn't displayed");
		}
		try {
		    driver.findElement(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div/a"));
			System.out.println("My account link is displayed");
		} 
		catch (Exception e) {
			System.out.println("My account link isn't displayed");
		}
		try {
		driver.findElement(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div/a")).click();
		}
		catch(Exception e){
			driver.findElement(By.xpath("/html/body/div[10]/header/div[1]/div[3]/div[1]/div[6]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"hamburger-navigation\"]/div[4]/div/a")).click();
		}
		String title = driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[2]/div[2]/div[1]/div/div/h2[1]")).getText().toString();
		String orgTitle = "Registered Members";
		if(title!=orgTitle) {
			System.out.println("The title does not eqaul Registered Members");
		}
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("twairammar@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ammar@123");
		driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[2]/div[2]/div[1]/div/div/form/div[10]/button")).click();		
        Thread.sleep(2000);
		try {
        String verify = driver.findElement(By.xpath("/html/body/section/div[1]/div/h1")).getText().toString();
        if(verify.equals("Please verify you are a human")) {
        	System.out.println("All is good !");
        }else {
        	System.out.println("There is a problem !");
        }
		}
		catch(Exception e){
			System.out.println("Someting went wrong !");
		}
        
	}
}
