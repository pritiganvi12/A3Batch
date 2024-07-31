package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MaheshBabu {
	@Test(groups = "TamilFilmIndustry")
	public void executeScript() {
		Reporter.log("mahesh", true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu#/media/File:Mahesh_Babu_in_Spyder_(cropped).jpg");
		driver.quit();
	}

}
