package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderRegiste {

		@Test(dataProvider="dataProviderMethod", dataProviderClass=dataProviderClass)
		public void test(String First name,  String Last name, String Email, String Password ) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Register")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys(First name);
			driver.findElement(By.id("FirstName")).sendKeys(Last name);
			driver.findElement(By.id("FirstName")).sendKeys(Email);
			driver.findElement(By.id("FirstName")).sendKeys(Password);
			driver.findElement(By.id("ConfirmPassword"")).sendKeys(Password)
		}
		
	}

}
