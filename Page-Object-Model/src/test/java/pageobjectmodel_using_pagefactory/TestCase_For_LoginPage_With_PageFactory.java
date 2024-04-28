package pageobjectmodel_using_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script for login page test case with page factory
public class TestCase_For_LoginPage_With_PageFactory {

	public static void main(String[] args)   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Page_Class_For_LoginPage_With_PageFactory login_page = new Page_Class_For_LoginPage_With_PageFactory(driver);

		login_page.username("Admin");
		login_page.password("admin123");
		login_page.login();
		login_page.userid();
		login_page.logout();
		
		driver.quit();

	}

}
