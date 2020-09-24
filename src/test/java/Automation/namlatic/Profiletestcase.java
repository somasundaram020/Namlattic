package Automation.namlatic;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.Homepage;
import Resource.Browser;

public class Profiletestcase extends Browser{
	

	@BeforeTest
	public void initialize() throws IOException {
		driver = initailizeDriver();
		driver.get("https://test.namlatic.com/?language=english&currency=USD");
	}

	@Test
	public void profile() throws InterruptedException {
		Homepage hp = new Homepage(driver);
		hp.loginPopup().click();
		hp.email().sendKeys("somaz1994@gmail.com");
		hp.password().sendKeys("Test@123");
		hp.loginButton().click();
		Thread.sleep(3000);
		hp.userProfile().click();
		hp.viewProfile().click();
		String text=hp.getText().getText();
		assertEquals(text, "My Profile");
	}
	
	@AfterTest
	public void signOut() throws InterruptedException {
		Homepage hp = new Homepage(driver);
		Thread.sleep(3000);
		hp.userProfile().click();
		hp.signOut().click();
		driver.quit();
	}

}
