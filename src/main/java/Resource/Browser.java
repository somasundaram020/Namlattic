package Resource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public WebDriver driver;
    
	public WebDriver initailizeDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\Chrome 85\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
