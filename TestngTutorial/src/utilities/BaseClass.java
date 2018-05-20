package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static void main(String[] args) {
String baseDir = System.getProperty("user.dir");
		
		System.setProperty("webdiver.gecko.driver", "baseDir+//geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.bankofamerica.com/");
		
		driver.manage().window().maximize();
		

	}

}
