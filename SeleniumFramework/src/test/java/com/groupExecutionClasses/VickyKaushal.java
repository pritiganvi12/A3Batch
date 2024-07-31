package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VickyKaushal {
	@Test(groups = "Bollywood")
	public void executeScript() {
		Reporter.log("vicky", true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.instagram.com/p/C9Z2Xx5o81F/?img_index=1");
		driver.quit();
	}

}
