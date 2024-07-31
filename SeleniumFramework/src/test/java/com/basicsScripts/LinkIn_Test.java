package com.basicsScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkIn_Test {
	@Test
	public void executeScript() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		driver.quit();
	}

}
