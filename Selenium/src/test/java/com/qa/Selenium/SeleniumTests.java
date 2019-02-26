package com.qa.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {

	WebDriver driver;

//	WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));

	
	String url = "https://www.google.com/";

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/ExternalApps/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void methodTest() {
		driver.manage().window().maximize();
		driver.get(url);
	}

}
