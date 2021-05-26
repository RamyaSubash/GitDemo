package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectRepository.RediffLoginPage;

public class LoginToRediff {
	@Test
	public void logintest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd=new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.Pwd().sendKeys("hello");
		System.out.println("Success");
		rd.signin().click();
	
	}
	}
