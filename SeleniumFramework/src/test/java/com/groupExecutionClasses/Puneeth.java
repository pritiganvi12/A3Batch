package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puneeth {
	@Test(groups = "KannadFilmIndustry")
			public void executeScript() {
				Reporter.log("puneeth", true);
				WebDriver driver=new ChromeDriver();
				driver.manage().window();
				driver.get("https://en.wikipedia.org/wiki/Puneeth_Rajkumar#/media/File:Puneeth_Rajkumar_(1).jpg");
				driver.quit();
			}

}
