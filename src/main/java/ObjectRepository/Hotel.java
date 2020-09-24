package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotel {
	WebDriver driver;

	public Hotel(WebDriver driver) {
		this.driver = driver;

	}
	
	By addroom=By.xpath("div[@class='sc-pbzVk FXGUv']//div[2]//div[2]//div[2]//div[2]//div[3]//div[2]//select[1]");
	
	public void addRoom() {
		driver.findElement(addroom);
	}
}
