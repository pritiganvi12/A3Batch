package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash {
	@Test(groups = {"KannadFilmIndustry", "PanIndia"})
	public void executeScript() {
		Reporter.log("Yash", true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://en.wikipedia.org/wiki/Yash_Gowda#/media/File:Yash_at_the_%E2%80%98KGF%E2%80%99_Press_Meet_In_Chennai_(cropped).jpg");
		driver.quit();
	}

}
