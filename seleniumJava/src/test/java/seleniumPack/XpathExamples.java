package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");

		// Absolute Xpath - html/body/div[1]/h1
		// Relative Xpath - html//h1 or //h1

		// / - child only
		// // - child and grant-child

		// parent::tagname - child to parent - //h1/parent::div
		// ancestor::tagname - child to grant-parent - //h1/ancestor::html

		// following-sibling::tagname -
		// //a[text()='29']/parent::td/following-sibling::td[1]/a
		// preceding-sigling::tagname -
		// //a[text()='29']/parent::td/preceding-sibling::td[1]/a

		// text() - based on visible text
		// starts-with - matching starting content -
		// //a[starts-with(text(),'2')]
		// contains - matching content anywhere - //a[contains(text(),'2')]

		// label[text()='User Name']/following-siblings::input

		driver.findElement(By.xpath("//label[text()='User Name:']/following-sibling::input")).sendKeys("manikandan");
		driver.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("mypassword");

	}

}
