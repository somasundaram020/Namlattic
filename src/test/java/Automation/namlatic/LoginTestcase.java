package Automation.namlatic;

import java.io.IOException;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.Homepage;
import Resource.Browser;

public class LoginTestcase extends Browser {
	

	@BeforeTest
	public void initialize() throws IOException {
		driver = initailizeDriver();
		driver.get("https://test.namlatic.com/?language=english&currency=USD");
	}

	@Test
	public void login() {
		Homepage hp = new Homepage(driver);
		hp.loginPopup().click();
		hp.email().sendKeys("somaz1994@gmail.com");
		hp.password().sendKeys("Test@123");
		hp.loginButton().click();
	}
	
	@AfterTest
	public void signOut() throws InterruptedException {
		Homepage hp = new Homepage(driver);
		Thread.sleep(5000);
		hp.userProfile().click();
		hp.signOut().click();
		driver.quit();
	}

}
