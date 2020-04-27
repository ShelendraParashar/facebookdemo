package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	@Test
	public void testLogin() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http:www.facebook.com");

		driver.findElement(By.name("email")).sendKeys("tester5@selenium.com");

		driver.findElement(By.id("pass")).sendKeys("asdfgh");

		driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).click();

		AssertJUnit.assertEquals(driver.getCurrentUrl(), "http://facebook.com");

	}

}
