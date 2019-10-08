package testngPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestngBasicsWithSelenium {

	WebDriver driver;

	@Test(dataProvider = "dp")
	public void verifyLoginIsSuccess(String un, String pwd) {
		driver.findElement(By.name("user")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("btnSubmit")).click();
		
		boolean isDisp = driver.findElement(By.name("btnSubmit")).isDisplayed();
		
		Assert.assertFalse(isDisp,"Login button is displayed and failing your test");
		System.out.println("Adding new account");
		Assert.assertTrue(true);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "adminuser", "password1" }, new Object[] { "agentuser", "password2" }, };
	}

	@BeforeMethod
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
	}

	@AfterMethod
	public void afterClass() {
		driver.close();
	}

}
