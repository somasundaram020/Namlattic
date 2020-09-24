package Automation.namlatic;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ObjectRepository.Homepage;
import ObjectRepository.Hotel;
import Resource.Browser;

public class Selecthoteltestcase extends Browser {

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
		Thread.sleep(3000);
		hp.search().click();
		Thread.sleep(3000);
		hp.viewDetails().click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> wd = id.iterator();
		String parent = wd.next();
		String child = wd.next();
		driver.switchTo().window(child);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2000)");
		Select a = new Select(hp.singleRoom());
		a.selectByIndex(2);
		String book=hp.Booknow().getText();
		assertEquals(book,"Book Now");
		driver.switchTo().window(parent);
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
