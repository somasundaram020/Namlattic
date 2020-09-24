package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

	By loginpopup = By.xpath("//div[@class='sc-fznMAR kqgoJS']");
	By email = By.xpath("//input[@type='text']");
	By password = By.xpath("//input[@type='password']");
	By loginbutton = By.xpath("//div[@class='sc-fznMAR gOkecm'][contains(text(),'Login')]");
	By userprofile = By.xpath("//span[text()='SR']");
	By signout = By.xpath("//li[text()='Sign Out']");
	By city = By.xpath("//input[contains(@placeholder,'Search by city')]");
	By date = By.xpath("//div[@class='sc-pRTZB fHVWoT']");
	By dropdown=By.xpath("//div[contains(text(),'1 guest(s)')]");
	By guest=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/*[local-name()='svg'][2]");
	By search=By.xpath("//div[text()='Search']");
	By result=By.xpath("//div[@class='sc-pjGMk jrwOpx']");
	By viewdetails=By.xpath("//div[text()='View Details']");
	By singleroom=By.xpath("//div[@class='sc-pbzVk FXGUv']//div[2]//div[2]//div[2]//div[1]//div[3]//div[2]//select[1]");
	By booknow=By.xpath("//div[@class='sc-pByHo gmSliK']//div[@class='sc-fznMAR gOkecm'][contains(text(),'Book Now')]");
	By viewprofile=By.xpath("//li[text()='View Profile']");
	By gettext=By.xpath("//div[text()='My Profile']");
			
	public WebElement loginPopup() {
		return driver.findElement(loginpopup);
	}

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement loginButton() {
		return driver.findElement(loginbutton);
	}

	public WebElement userProfile() {
		return driver.findElement(userprofile);
	}

	public WebElement signOut() {
		return driver.findElement(signout);
	}

	public WebElement city() {
		return driver.findElement(city);
	}

	public WebElement date() {
		return driver.findElement(date);
	}
	
	public WebElement dropDown() {
		return driver.findElement(dropdown);
	}
	
	public WebElement guest() {
		return driver.findElement(guest);
	}
	
	public WebElement search() {
		return driver.findElement(search);
	}
	public WebElement result() {
		return driver.findElement(result);
	}
	
	public WebElement viewDetails() {
		return driver.findElement(viewdetails);
	}
	

	public WebElement singleRoom() {
		// TODO Auto-generated method stub
		return driver.findElement(singleroom);
	}
	
	public WebElement Booknow() {
		return driver.findElement(booknow);
	}
	
	public WebElement viewProfile() {
		return driver.findElement(viewprofile);
	}

	public WebElement getText() {
		return driver.findElement(gettext);
	}	
	
	
}
