package com.qa.Selenium;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {

	WebDriver driver;
	
	String X = "Sanchez";

	String url = "http://thedemosite.co.uk/addauser.php";

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

	@Test
	public void addUserTest() {

		driver.get(url);
		WebElement checkElementUsername = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		checkElementUsername.sendKeys("Sanchez");
		WebElement checkElementPassword = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		checkElementPassword.sendKeys("Sanchez");
		WebElement checkElementSave = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		checkElementSave.click();
		WebElement checkElementBody = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote"));
		
		assertEquals("sanchez not found", true, checkElementBody.getText().contains(X));
		
		/*System.out.println(checkElementBody.getText());*/
	}

}
