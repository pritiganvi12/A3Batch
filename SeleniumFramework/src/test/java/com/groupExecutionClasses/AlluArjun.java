package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun {
	@Test(groups = {"TamilFilmIndustry", "PanIndia"})
	public void executeScript() {
		Reporter.log("Allu", true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun#/media/File:Allu_Arjun_at_69th_NFA.jpg");
		driver.quit();
	}

}



