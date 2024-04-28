package pageobjectmodel_without_using_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script for login page test case without using page factory
public class TestCase_For_LoginPage_Without_PageFactory {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Page_Class_For_LoginPage_Without_PageFactory lp = new Page_Class_For_LoginPage_Without_PageFactory(driver);

		lp.username("Admin");
		lp.password("admin123");
		lp.login();
		lp.userid();
		lp.logout();

		driver.quit();

	}

}
