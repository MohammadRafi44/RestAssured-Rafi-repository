package webPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	private static WebDriver driver;
	
	@BeforeTest
	public void testSetup() {
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.chromedriver().version("2.36")setup();
			driver= new ChromeDriver();
			}
	@AfterTest
	public void testTearDown() {
			driver.close();
			driver.quit();
			}

	//	************* Test Cases *******************************
	//	Test Case 1
				
			@Test(priority = 1, description = "this is a application login test")
				public void bapplogin() throws InterruptedException {
					driver.get("https://en.wikipedia.org/wiki/Software_testing");
					driver.manage().window().maximize();
					Thread.sleep(3000);
					System.out.println("Hi Rafi, Application - logged in ");
				}
	//	Test Case 2
			@Test(priority = 2, description = "this is a application logout test")
			public void appLogout() {
				driver.findElement(By.xpath("(//span[text()='Exploratory approach'])[1]")).click();
				System.out.println("Application is Logged out");
			}
}
