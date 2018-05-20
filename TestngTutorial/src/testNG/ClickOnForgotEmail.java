package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnForgotEmail {

	public static void main(String[] args) throws InterruptedException {
		 String baseDir = System.getProperty("user.dir");
			
			System.setProperty("webdiver.gecko.driver", "baseDir+//geckodriver.exe");
			 
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.bankofamerica.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			
			WebElement ForgotOnlineId =driver.findElement(By.id("forgot-oid"));
			ForgotOnlineId.click();
			
			
			//something

	}

}
