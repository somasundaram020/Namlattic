package Automation.namlatic;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.Homepage;
import Resource.Browser;

public class Searchtestcase extends Browser {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initailizeDriver();
		driver.get("https://test.namlatic.com/?language=english&currency=USD");
	}

	@Test
	public void search() throws InterruptedException {
		Homepage hp = new Homepage(driver);
		hp.loginPopup().click();
		hp.email().sendKeys("somaz1994@gmail.com");
		hp.password().sendKeys("Test@123");
		hp.loginButton().click();
		Thread.sleep(3000);
		hp.city().sendKeys("Algeria");
		hp.city().sendKeys(Keys.ARROW_DOWN);
		hp.city().sendKeys(Keys.ENTER);
		hp.dropDown().click();
		hp.guest().click();
		Thread.sleep(4000);
		hp.search().click();
		Thread.sleep(3000);
		String result = hp.result().getText();
		assertEquals(result, "Results for Algeria");
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
