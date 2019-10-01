package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");

		// locators 8
		// id, name, linktext, partialLinkText, tagname, classname, xpath, cssSelector

		// Checkbox
		WebElement chk1 = driver.findElement(By.name("email_to[]"));
		chk1.click();
		System.out.println(chk1.isSelected());
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='1']")).click();
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='2']")).click();

		// Text box
		driver.findElement(By.id("subject")).sendKeys("Selenium");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("q1")).sendKeys("java");

		// Dropdown
		Select dd1 = new Select(driver.findElement(By.id("q3")));
		dd1.selectByIndex(1);
		dd1.selectByVisibleText("Third Option");
		dd1.selectByValue("Fourth Option");

		// Radio button
		driver.findElement(By.xpath("//input[@value='Third Option']")).click();

		// Calendar
		driver.findElement(By.name("q7")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='17']")).click();

		driver.findElement(By.name("visver_code")).sendKeys("ABCD");
		driver.findElement(By.name("submit")).click();

		driver.navigate().back();
		int numLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(numLinks);

		driver.findElement(By.linkText("Basic Contact Form")).click();
		driver.findElement(By.partialLinkText("Basic Contact ")).click();

		driver.findElement(By.tagName("a")).click();

		// Git - getting latest code, pushing your local changes to remote repo
		// Handling group of elemnts

	}

}
