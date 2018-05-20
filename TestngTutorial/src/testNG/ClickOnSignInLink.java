package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnSignInLink {

	
		
       
		
		@Test
		
		driver.findElement(By.id("onlineId1")).sendKeys("sak@gmail.com");
		driver.findElement(By.id("passcode1")).sendKeys("1234");
		WebElement SignIn=driver.findElement(By.id("signIn"));
		SignIn.click();


	}

}
